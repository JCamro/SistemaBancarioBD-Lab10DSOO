package InterfazGrafica.panelCliente.Paneles;

import Banco.BD.ClasesDAO.TransaccionesDAO;
import Banco.ClasesBase.Transaccion;
import Banco.ClasesBase.Transferencia;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import Banco.ClasesBase.Transaccion;
import Banco.ClasesBase.Transferencia;
import Banco.ClasesBase.Deposito;
import Banco.ClasesBase.Retiro;


public class ConsultarTransacciones extends javax.swing.JPanel {

    public ConsultarTransacciones() {
        initComponents();
    }
    
    public void mostrarTransaccionesDeCliente(int dniCliente) {
    try {
        TransaccionesDAO dao = new TransaccionesDAO();
        ArrayList<Transaccion> lista = dao.listarTransaccionesPorCliente(dniCliente);

        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        modelo.addColumn("ID Transaccion");
        modelo.addColumn("DNI Cliente");
        modelo.addColumn("DNI Empleado");
        modelo.addColumn("Numero Cuenta");
        modelo.addColumn("Cuenta Destino");
        modelo.addColumn("Monto");
        modelo.addColumn("Fecha Registro");
        modelo.addColumn("Tipo Transaccion");

        for (Transaccion t : lista) {
            Object[] fila = new Object[8];
            fila[0] = t.getIdTransaccion();
            fila[1] = t.getCliente().getDni();
            fila[2] = (t.getEmpleado() != null) ? t.getEmpleado().getDni() : "";
            fila[3] = t.getCuenta().getNumeroCuenta();
            fila[4] = (t instanceof Transferencia)
                        ? ((Transferencia) t).getCuentaDestino().getNumeroCuenta()
                        : "";
            fila[5] = t.getMonto();
            fila[6] = t.getFecha();
            String tipo;
            if (t instanceof Deposito) {
                tipo = "DEPOSITO";
            } else if (t instanceof Retiro) {
                tipo = "RETIRO";
            } else if (t instanceof Transferencia) {
                tipo = "TRANSFERENCIA";
            } else {
                tipo = "";
            }

            fila[7] = tipo;

            modelo.addRow(fila);
        }

        TabTransacciones.setModel(modelo);

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al cargar transacciones");
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabTransacciones = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabTransacciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TabTransacciones);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 22, 870, 650));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabTransacciones;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
