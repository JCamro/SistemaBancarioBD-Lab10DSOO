package Banco.BD.ClasesDAO;

import java.sql.*;
import Banco.BD.ConexionBD;
import Banco.ClasesBase.*;
import java.util.ArrayList;

public class TransaccionesDAO {
    
    public void procederTransaccion(Transaccion transaccion) throws Exception {
        // 1. Definimos la SQL del historial
        String sqlHistorial = "INSERT INTO transacciones (dni_cliente, dni_empleado, numero_cuenta, numero_cuenta_destino, monto, fecha_registro, tipo_transaccion) VALUES (?, ?, ?, ?, ?, ?, ?)";

        Connection con = null;
        PreparedStatement psHistorial = null;

        try {
            // 2. ABRIMOS LA CONEXIÓN AQUÍ (Una sola vez)
            con = ConexionBD.conectar();
            con.setAutoCommit(false); // ¡Inicio de la Transacción!

            // --- PASO A: INSERTAR EN HISTORIAL ---
            psHistorial = con.prepareStatement(sqlHistorial);

            // Lógica común para setear valores
            psHistorial.setInt(1, transaccion.getCliente().getDni());

            // Manejo de empleado nulo
            if (transaccion.getEmpleado() != null) {
                psHistorial.setInt(2, transaccion.getEmpleado().getDni());
            } else {
                psHistorial.setNull(2, Types.INTEGER);
            }

            psHistorial.setInt(3, transaccion.getCuenta().getNumeroCuenta());
            psHistorial.setDouble(5, transaccion.getMonto());
            psHistorial.setString(6, transaccion.getFecha());

            // Lógica específica por tipo
            if (transaccion instanceof Deposito) {
                psHistorial.setNull(4, Types.INTEGER); // No hay destino
                psHistorial.setString(7, "DEPOSITO");
                psHistorial.executeUpdate();

                // IMPORTANTE: Le pasamos la conexión 'con' al hijo
                procesarDeposito((Deposito) transaccion, con); 
            } 
            else if (transaccion instanceof Retiro) {
                psHistorial.setNull(4, Types.INTEGER);
                psHistorial.setString(7, "RETIRO");
                psHistorial.executeUpdate();

                // Pasamos la conexión
                procesarRetiro((Retiro) transaccion, con);
            } 
            else if (transaccion instanceof Transferencia) {
                Transferencia transf = (Transferencia) transaccion;
                psHistorial.setInt(4, transf.getCuentaDestino().getNumeroCuenta());
                psHistorial.setString(7, "TRANSFERENCIA");
                psHistorial.executeUpdate();

                // Pasamos la conexión
                procesarTransferencia(transf, con);
            }

            // --- PASO FINAL: SI TODO SALIÓ BIEN, GUARDAMOS ---
            con.commit();
            System.out.println("Transacción completada exitosamente.");

        } catch (Exception e) {
            // ERROR: DESHACEMOS TODO (Historial y Saldos)
            if (con != null) {
                try {
                    con.rollback();
                    System.err.println("Rollback ejecutado.");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
            throw e;
        } finally {
            // LIMPIEZA
            if (psHistorial != null) psHistorial.close();
            if (con != null) {
                con.setAutoCommit(true);
                con.close();
            }
        }
    }
    
    // Recibe 'Connection con' como parámetro
    private void procesarDeposito(Deposito deposito, Connection con) throws SQLException {
        String sql = "UPDATE cuenta SET saldo = saldo + ? WHERE numero_cuenta = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setDouble(1, deposito.getMonto());
            ps.setInt(2, deposito.getCuenta().getNumeroCuenta());

            int filas = ps.executeUpdate();
            if (filas == 0) throw new SQLException("Cuenta no encontrada para depósito");
        }
        // Nota: NO hay catch aquí, dejamos que el error suba al padre para que haga Rollback
    }

    private void procesarRetiro(Retiro retiro, Connection con) throws SQLException {
        String sql = "UPDATE cuenta SET saldo = saldo - ? WHERE numero_cuenta = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setDouble(1, retiro.getMonto());
            ps.setInt(2, retiro.getCuenta().getNumeroCuenta());

            int filas = ps.executeUpdate();
            if (filas == 0) throw new SQLException("Cuenta no encontrada para retiro");
        }
    }

    private void procesarTransferencia(Transferencia transferencia, Connection con) throws SQLException {
        String sqlResta = "UPDATE cuenta SET saldo = saldo - ? WHERE numero_cuenta = ?";
        String sqlSuma  = "UPDATE cuenta SET saldo = saldo + ? WHERE numero_cuenta = ?";

        // Paso 1: Restar (Usamos la conexión recibida)
        try (PreparedStatement psResta = con.prepareStatement(sqlResta)) {
            psResta.setDouble(1, transferencia.getMonto());
            psResta.setInt(2, transferencia.getCuenta().getNumeroCuenta());
            if (psResta.executeUpdate() == 0) throw new SQLException("Cuenta origen no válida");
        }

        // Paso 2: Sumar (Usamos la misma conexión recibida)
        try (PreparedStatement psSuma = con.prepareStatement(sqlSuma)) {
            psSuma.setDouble(1, transferencia.getMonto());
            psSuma.setInt(2, transferencia.getCuentaDestino().getNumeroCuenta());
            if (psSuma.executeUpdate() == 0) throw new SQLException("Cuenta destino no válida");
        }
    }
    
    public ArrayList<Transaccion> listarTransaccionesPorCliente(int dniCliente) throws Exception {
    ArrayList<Transaccion> lista = new ArrayList<>();

        String sql = "SELECT t.* FROM transacciones t " +
                     "INNER JOIN titularidad tit ON t.numero_cuenta = tit.numero_cuenta " +
                     "WHERE tit.dni_cliente = ? " +
                     "ORDER BY t.id_transaccion DESC";

        try (Connection con = ConexionBD.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, dniCliente);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id_transaccion");
                    double monto = rs.getDouble("monto");
                    String fecha = rs.getString("fecha_registro");
                    String tipo = rs.getString("tipo_transaccion");
                    int numCuenta = rs.getInt("numero_cuenta");
                    int dniEmp = rs.getInt("dni_empleado");

                    Cliente cliente = new Cliente(dniCliente);

                    Cuenta cuenta = new Cuenta(numCuenta);

                    Empleado empleado = null;
                    if (dniEmp != 0) {
                        empleado = new Empleado(dniEmp);
                    }

                    Transaccion trans = null;
                    if ("DEPOSITO".equals(tipo)) {
                        trans = new Deposito(cliente, empleado, cuenta, monto, id, fecha);
                    } else if ("RETIRO".equals(tipo)) {
                        trans = new Retiro(empleado, cliente, cuenta, monto, id, fecha);
                    } else if ("TRANSFERENCIA".equals(tipo)) {
                        int numDestino = rs.getInt("numero_cuenta_destino");
                        Cuenta cuentaDestino = new Cuenta(numDestino);
                        trans = new Transferencia(cliente, empleado, cuenta, cuentaDestino, monto, id, fecha);
                    }

                    if (trans != null) {
                        lista.add(trans);
                    }
                }
            }
        }

        return lista;
    }
    
    // METODO PARA DEVOLVER UN ARRAYLIST DE MOVIMIENTOS
}
