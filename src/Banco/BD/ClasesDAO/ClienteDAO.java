package Banco.BD.ClasesDAO;

import java.sql.*;
import Banco.BD.ConexionBD;
import Banco.ClasesBase.*;

public class ClienteDAO {

    public void insertar(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO cliente (dni, nombres, edad, correo, contraseña, fecha_registro) VALUES (?, ?, ?, ?, ?, ?)";

        // TRY PARA MANEJAR EL ERROR
        try {
            Connection conn = ConexionBD.conectar();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, cliente.getDni());
            ps.setString(2, cliente.getNombres());
            ps.setInt(3, cliente.getEdad());
            ps.setString(4, cliente.getCorreo());
            ps.setString(5, cliente.getContraseña());
            ps.setString(6, cliente.getFechaApertura());

            ps.executeUpdate();

        } catch (Exception e) {
            throw new SQLException("Error al registrar Cliente");
        }
    }

    // QUERY CLIENTE POR CORREO
    public Cliente selectPorCorreo(String correo) {
        Cliente clienteEncontrado = null;

        String sql = "SELECT * FROM cliente WHERE correo = ?";

        // TRY PARA MANEJAR EL ERROR
        try {
            // Se establece la conexion

            Connection conn = ConexionBD.conectar();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, correo);

            try {
                ResultSet rs = ps.executeQuery();

                // Se extrae los datos del Query
                if (rs.next()) {

                    int dni = rs.getInt("dni");
                    String nombres = rs.getString("nombres");
                    String correoEntrada = rs.getString("correo");
                    String contraseña = rs.getString("contraseña");
                    int edad = rs.getInt("edad");
                    String fecha = rs.getString("fecha_registro");

                    clienteEncontrado = new Cliente(nombres, dni, edad, correoEntrada, contraseña, fecha);
                    return clienteEncontrado;
                }

            } catch (Exception e) {
                throw e;
            }

        } catch (Exception e) {
            System.out.println("Error SLPC: " + e.getMessage());
        }
        // RETORNARA SIEMPRE CLIENTE NULL O NO
        return clienteEncontrado;
    }

    // QUERY CLIENTE POR DENI
    public Cliente selectPorDni(int dni) {
        Cliente clienteEncontrado = null;

        String sql = "SELECT * FROM cliente WHERE DNI = ?";

        try {
            // Se establece la conexion

            Connection conn = ConexionBD.conectar();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, dni);

            ResultSet rs = ps.executeQuery();

            // Se extrae los datos del Query
            if (rs.next()) {

                int dniEntry = rs.getInt("dni");
                String nombres = rs.getString("nombres");
                String correoEntrada = rs.getString("correo");
                String contraseña = rs.getString("contraseña");
                int edad = rs.getInt("edad");
                String fecha = rs.getString("fecha_registro");

                clienteEncontrado = new Cliente(nombres, dniEntry, edad, correoEntrada, contraseña, fecha);
                return clienteEncontrado;
            }

        } catch (Exception e) {
            System.out.println("Error SLPDNI: " + e.getMessage());
        }

        return clienteEncontrado;
    }
    
    // QUERY PARA DELETE CLIENTE
    public Cliente deleteCliente(int dni) {
        Cliente clienteEncontrado = selectPorDni(dni);

        if (clienteEncontrado == null) {
            return null;
        }

        String sql = "DELETE FROM cliente WHERE DNI = ?";

        try {
            // Se establece la conexion

            Connection conn = ConexionBD.conectar();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, dni);
            // Ejecuta la eliminacion
            ps.executeUpdate();
            return clienteEncontrado;

        } catch (Exception e) {
            System.out.println("Error DL: " + e.getMessage());
            return null;
        }
    }
}
