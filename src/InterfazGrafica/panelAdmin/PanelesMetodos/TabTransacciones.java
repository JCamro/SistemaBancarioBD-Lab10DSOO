package InterfazGrafica.panelAdmin.PanelesMetodos;

import InterfazGrafica.TablaTransacciones;
import Tablas.*;

public class TabTransacciones extends javax.swing.JPanel {

    public TabTransacciones() {
        initComponents();
        personalizarTabla();
    }
    
    public void recargarTablaTransacciones() {
        TablaTransacciones dao = new TablaTransacciones();
        dao.cargarClientesEnTabla(transacciones);
        ajustarColumnas();
    }
    private void personalizarTabla() {
        var header = transacciones.getTableHeader();
        header.setBackground(new java.awt.Color(204, 0, 0));
        header.setForeground(java.awt.Color.WHITE);
        header.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));

        javax.swing.table.DefaultTableCellRenderer center = new javax.swing.table.DefaultTableCellRenderer();
        center.setHorizontalAlignment(javax.swing.JLabel.CENTER);
        transacciones.setDefaultRenderer(Object.class, center);

        // Fondo del viewport (zona gris)
        jScrollPane1.getViewport().setBackground(new java.awt.Color(204, 0, 0));
        transacciones.setFillsViewportHeight(true);
    }

    private void ajustarColumnas() {
        transacciones.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        transacciones.getColumnModel().getColumn(0).setPreferredWidth(90);
        transacciones.getColumnModel().getColumn(1).setPreferredWidth(100);
        transacciones.getColumnModel().getColumn(2).setPreferredWidth(110);
        transacciones.getColumnModel().getColumn(3).setPreferredWidth(120);
        transacciones.getColumnModel().getColumn(4).setPreferredWidth(120);
        transacciones.getColumnModel().getColumn(5).setPreferredWidth(80);
        transacciones.getColumnModel().getColumn(6).setPreferredWidth(150);
        transacciones.getColumnModel().getColumn(7).setPreferredWidth(120);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        transacciones = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        transacciones.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        transacciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(transacciones);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 860, 653));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable transacciones;
    // End of variables declaration//GEN-END:variables
}
