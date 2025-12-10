package InterfazGrafica;

import Banco.BD.ConexionBD;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TablaTransacciones {
    
    public void cargarClientesEnTabla(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Transaccion");
        modelo.addColumn("DNI Cliente");
        modelo.addColumn("DNI Empleado");
        modelo.addColumn("Numero Cuenta");
        modelo.addColumn("Cuenta Destino");
        modelo.addColumn("Monto");
        modelo.addColumn("Fecha Registro");
        modelo.addColumn("Tipo Transaccion");

        String sql = "SELECT id_transaccion, dni_cliente, dni_empleado, numero_cuenta, numero_cuenta_destino, monto, fecha_registro, tipo_transaccion FROM transacciones";

        try (Connection cn = ConexionBD.conectar();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                    System.out.println("Fila leída");

                Object[] fila = new Object[8];
                fila[0] = rs.getInt("id_transaccion");
                fila[1] = rs.getString("dni_cliente");
                fila[2] = rs.getString("dni_empleado");
                fila[3] = rs.getString("numero_cuenta");
                fila[4] = rs.getString("numero_cuenta_destino");
                fila[5] = rs.getBigDecimal("monto");      // o getDouble según tipo de dato
                fila[6] = rs.getString("fecha_registro");
                fila[7] = rs.getString("tipo_transaccion");
                modelo.addRow(fila); // añadir fila al modelo[web:1][web:4]
            }


            tabla.setModel(modelo);

        } catch (SQLException e) {
            e.printStackTrace();
        }
       
    }
    DefaultTableModel modelo = new DefaultTableModel() {
    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
};
}
