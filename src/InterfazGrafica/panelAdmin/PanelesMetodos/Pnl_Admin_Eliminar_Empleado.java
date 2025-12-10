package InterfazGrafica.panelAdmin.PanelesMetodos;

import Banco.ClasesBase.*;
import Banco.GestorPrincipal.Banco;

public class Pnl_Admin_Eliminar_Empleado extends javax.swing.JPanel {

    private Banco banco;
    private Usuario usuarioActual;
    
    public Pnl_Admin_Eliminar_Empleado(Banco banco, Usuario usuarioActual) {
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
        dniField = new javax.swing.JTextField();
        eliminarEmpleadoBtn = new javax.swing.JButton();
        contratoEliminacion = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nombreEmpleado = new javax.swing.JTextField();
        dniEmpleado = new javax.swing.JTextField();
        correoEmpleado = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        edadEmpleado = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        avisoError = new javax.swing.JLabel();
        limpiarBtn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 0, 0));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ELIMINAR EMPLEADO");
        add(jLabel1);
        jLabel1.setBounds(0, 20, 920, 70);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Ingrese Datos Solicitados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Leelawadee", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Ingrese DNI del Empleado: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 210, 30));

        dniField.setBackground(new java.awt.Color(255, 255, 255));
        dniField.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        dniField.addActionListener(this::dniFieldActionPerformed);
        jPanel1.add(dniField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 170, 30));

        eliminarEmpleadoBtn.setBackground(new java.awt.Color(204, 0, 0));
        eliminarEmpleadoBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        eliminarEmpleadoBtn.setForeground(new java.awt.Color(255, 255, 255));
        eliminarEmpleadoBtn.setText("Eliminar");
        eliminarEmpleadoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarEmpleadoBtn.setDefaultCapable(false);
        eliminarEmpleadoBtn.addActionListener(this::eliminarEmpleadoBtnActionPerformed);
        jPanel1.add(eliminarEmpleadoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 120, 40));

        contratoEliminacion.setBackground(new java.awt.Color(255, 255, 255));
        contratoEliminacion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 3), "Empleado Eliminado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Roboto Condensed", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        contratoEliminacion.setForeground(new java.awt.Color(0, 0, 0));
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

        nombreEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        nombreEmpleado.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        nombreEmpleado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        nombreEmpleado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        nombreEmpleado.addActionListener(this::nombreEmpleadoActionPerformed);
        contratoEliminacion.add(nombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 170, 30));

        dniEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        dniEmpleado.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        dniEmpleado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        dniEmpleado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        dniEmpleado.addActionListener(this::dniEmpleadoActionPerformed);
        contratoEliminacion.add(dniEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 170, 30));

        correoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        correoEmpleado.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        correoEmpleado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        correoEmpleado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        correoEmpleado.addActionListener(this::correoEmpleadoActionPerformed);
        contratoEliminacion.add(correoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 170, 30));

        jLabel13.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Edad:");
        contratoEliminacion.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, 30));

        edadEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        edadEmpleado.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        edadEmpleado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        edadEmpleado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        edadEmpleado.addActionListener(this::edadEmpleadoActionPerformed);
        contratoEliminacion.add(edadEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 170, 30));

        jPanel1.add(contratoEliminacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 540, 300));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 170, 20));

        avisoError.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        avisoError.setForeground(new java.awt.Color(153, 0, 0));
        avisoError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(avisoError, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 470, 40));

        limpiarBtn1.setBackground(new java.awt.Color(204, 0, 0));
        limpiarBtn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        limpiarBtn1.setForeground(new java.awt.Color(255, 255, 255));
        limpiarBtn1.setText("Limpiar");
        limpiarBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiarBtn1.setDefaultCapable(false);
        limpiarBtn1.addActionListener(this::limpiarBtn1ActionPerformed);
        jPanel1.add(limpiarBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 120, 40));

        add(jPanel1);
        jPanel1.setBounds(30, 104, 860, 570);
    }// </editor-fold>//GEN-END:initComponents

    private void dniFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniFieldActionPerformed

    private void eliminarEmpleadoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarEmpleadoBtnActionPerformed
        // TODO add your handling code here:
        
        String dni = dniField.getText();
        
        try {
            Empleado cliente = banco.getgEmpleados().mostrarEmpleadoDni(dni);
            banco.getgEmpleados().eliminarEmpleado(usuarioActual, dni);
            
            //Colocando en Contrato
            nombreEmpleado.setText(cliente.getNombres());
            correoEmpleado.setText(cliente.getCorreo());
            dniEmpleado.setText(dni);
            edadEmpleado.setText(String.valueOf(cliente.getEdad()));
            
            contratoEliminacion.setVisible(true);
            dniField.setText("");
            
        } catch (Exception e) {
            avisoError.setText(e.getMessage());
        }
    }//GEN-LAST:event_eliminarEmpleadoBtnActionPerformed

    private void nombreEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreEmpleadoActionPerformed

    private void dniEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniEmpleadoActionPerformed

    private void correoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoEmpleadoActionPerformed

    private void edadEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadEmpleadoActionPerformed

    private void limpiarBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBtn1ActionPerformed
        // TODO add your handling code here:
        dniField.setText("");
        
        nombreEmpleado.setText("");
        correoEmpleado.setText("");
        dniEmpleado.setText("");
        edadEmpleado.setText("");
        avisoError.setText("");
        
        contratoEliminacion.setVisible(false);
    }//GEN-LAST:event_limpiarBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avisoError;
    private javax.swing.JPanel contratoEliminacion;
    private javax.swing.JTextField correoEmpleado;
    private javax.swing.JTextField dniEmpleado;
    private javax.swing.JTextField dniField;
    private javax.swing.JTextField edadEmpleado;
    private javax.swing.JButton eliminarEmpleadoBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton limpiarBtn1;
    private javax.swing.JTextField nombreEmpleado;
    // End of variables declaration//GEN-END:variables
}
