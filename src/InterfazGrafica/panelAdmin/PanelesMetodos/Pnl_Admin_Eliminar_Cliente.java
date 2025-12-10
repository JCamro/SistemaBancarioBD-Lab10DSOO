package InterfazGrafica.panelAdmin.PanelesMetodos;

import Banco.ClasesBase.Cliente;
import Banco.ClasesBase.Usuario;
import Banco.GestorPrincipal.Banco;

public class Pnl_Admin_Eliminar_Cliente extends javax.swing.JPanel {

    private Banco banco;
    private Usuario usuarioActual;

    public Pnl_Admin_Eliminar_Cliente(Banco banco, Usuario usuarioActual) {
        initComponents();
        this.banco = banco;
        this.usuarioActual = usuarioActual;
        contratoEliminacion.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        numDniEntrada = new javax.swing.JTextField();
        limpiarBtn = new javax.swing.JButton();
        contratoEliminacion = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nombreCliente = new javax.swing.JTextField();
        dniCliente = new javax.swing.JTextField();
        correoCliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        edadCliente = new javax.swing.JTextField();
        eliminarBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        avisoError = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 0, 0));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ELIMINAR CLIENTE");
        add(jLabel1);
        jLabel1.setBounds(0, 20, 920, 70);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Ingrese Datos Solicitados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Leelawadee", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Ingrese DNI del Cliente: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 190, 30));

        numDniEntrada.setBackground(new java.awt.Color(255, 255, 255));
        numDniEntrada.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        numDniEntrada.setForeground(new java.awt.Color(0, 0, 0));
        numDniEntrada.addActionListener(this::numDniEntradaActionPerformed);
        jPanel1.add(numDniEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 170, 30));

        limpiarBtn.setBackground(new java.awt.Color(204, 0, 0));
        limpiarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        limpiarBtn.setForeground(new java.awt.Color(255, 255, 255));
        limpiarBtn.setText("Limpiar");
        limpiarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiarBtn.setDefaultCapable(false);
        limpiarBtn.addActionListener(this::limpiarBtnActionPerformed);
        jPanel1.add(limpiarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 120, 40));

        contratoEliminacion.setBackground(new java.awt.Color(255, 255, 255));
        contratoEliminacion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 3), "Cliente Eliminado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        contratoEliminacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nombre:");
        contratoEliminacion.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jLabel10.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("DNI: ");
        contratoEliminacion.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel12.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Correo: ");
        contratoEliminacion.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        nombreCliente.setBackground(new java.awt.Color(255, 255, 255));
        nombreCliente.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        nombreCliente.setForeground(new java.awt.Color(0, 0, 0));
        nombreCliente.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        nombreCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        nombreCliente.addActionListener(this::nombreClienteActionPerformed);
        contratoEliminacion.add(nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 170, 30));

        dniCliente.setBackground(new java.awt.Color(255, 255, 255));
        dniCliente.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        dniCliente.setForeground(new java.awt.Color(0, 0, 0));
        dniCliente.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        dniCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        dniCliente.addActionListener(this::dniClienteActionPerformed);
        contratoEliminacion.add(dniCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 170, 30));

        correoCliente.setBackground(new java.awt.Color(255, 255, 255));
        correoCliente.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        correoCliente.setForeground(new java.awt.Color(0, 0, 0));
        correoCliente.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        correoCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        correoCliente.addActionListener(this::correoClienteActionPerformed);
        contratoEliminacion.add(correoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 170, 30));

        jLabel13.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Edad:");
        contratoEliminacion.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, 30));

        edadCliente.setBackground(new java.awt.Color(255, 255, 255));
        edadCliente.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        edadCliente.setForeground(new java.awt.Color(0, 0, 0));
        edadCliente.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        edadCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        edadCliente.addActionListener(this::edadClienteActionPerformed);
        contratoEliminacion.add(edadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 170, 30));

        jPanel1.add(contratoEliminacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 540, 300));

        eliminarBtn.setBackground(new java.awt.Color(204, 0, 0));
        eliminarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        eliminarBtn.setForeground(new java.awt.Color(255, 255, 255));
        eliminarBtn.setText("Eliminar");
        eliminarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarBtn.setDefaultCapable(false);
        eliminarBtn.addActionListener(this::eliminarBtnActionPerformed);
        jPanel1.add(eliminarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 120, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 170, 20));

        avisoError.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        avisoError.setForeground(new java.awt.Color(153, 0, 0));
        avisoError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(avisoError, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 440, 40));

        add(jPanel1);
        jPanel1.setBounds(30, 104, 860, 570);
    }// </editor-fold>//GEN-END:initComponents

    private void numDniEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numDniEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numDniEntradaActionPerformed

    private void limpiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBtnActionPerformed
        // TODO add your handling code here:
        numDniEntrada.setText("");
        nombreCliente.setText("");
        correoCliente.setText("");
        dniCliente.setText("");
        edadCliente.setText("");
        avisoError.setText("");

        contratoEliminacion.setVisible(false);
    }//GEN-LAST:event_limpiarBtnActionPerformed

    private void nombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreClienteActionPerformed

    private void dniClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniClienteActionPerformed

    private void correoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoClienteActionPerformed

    private void edadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadClienteActionPerformed

    private void eliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBtnActionPerformed
        // TODO add your handling code here:
        String dni = numDniEntrada.getText();

        try {
            Cliente cliente = banco.getgClientes().mostrarClienteDni(dni);

            if (banco.getgClientes().eliminarCliente(dni)) {
                //Colocando en Contrato
                nombreCliente.setText(cliente.getNombres());
                correoCliente.setText(cliente.getCorreo());
                dniCliente.setText(dni);
                edadCliente.setText(String.valueOf(cliente.getEdad()));

                contratoEliminacion.setVisible(true);
                numDniEntrada.setText("");
                
                nombreCliente.setText(cliente.getNombres());
                correoCliente.setText(cliente.getCorreo());
                dniCliente.setText(String.valueOf(cliente.getDni()));
                edadCliente.setText(String.valueOf(cliente.getEdad()));

                avisoError.setText("");

                contratoEliminacion.setVisible(true);
            } else {
                throw new Exception("Error al Eliminar Cliente");
            }

        } catch (Exception e) {
            avisoError.setText(e.getMessage());
        }
    }//GEN-LAST:event_eliminarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avisoError;
    private javax.swing.JPanel contratoEliminacion;
    private javax.swing.JTextField correoCliente;
    private javax.swing.JTextField dniCliente;
    private javax.swing.JTextField edadCliente;
    private javax.swing.JButton eliminarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JTextField nombreCliente;
    private javax.swing.JTextField numDniEntrada;
    // End of variables declaration//GEN-END:variables
}
