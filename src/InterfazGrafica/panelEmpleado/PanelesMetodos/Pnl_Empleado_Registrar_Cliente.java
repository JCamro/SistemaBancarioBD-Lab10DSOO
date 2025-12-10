
package InterfazGrafica.panelEmpleado.PanelesMetodos;

import Banco.ClasesBase.*;
import Banco.GestorPrincipal.Banco;

public class Pnl_Empleado_Registrar_Cliente extends javax.swing.JPanel {
    
    private Banco banco;
    private Usuario usuarioActual;
    
    public Pnl_Empleado_Registrar_Cliente(Banco banco, Usuario usuarioActual) {
        initComponents();
        this.banco = banco;
        this.usuarioActual = usuarioActual;
        setSize(920, 700);
        contratoCliente.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dniField = new javax.swing.JTextField();
        nombreField = new javax.swing.JTextField();
        correoField = new javax.swing.JTextField();
        limpiarBtn = new javax.swing.JButton();
        registrarBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        edadField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        contraseñaField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        contratoCliente = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        nombreCliente = new javax.swing.JTextField();
        dniCliente = new javax.swing.JTextField();
        correoCliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        fechaRegistroCliente = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        edadCliente = new javax.swing.JTextField();
        avisoError = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR CLIENTE");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 20, 910, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Correo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, 40));

        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DATOS DE ACCESO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, 30));

        jLabel4.setFont(new java.awt.Font("Leelawadee", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("DNI: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("DATOS PERSONALES");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jLabel7.setFont(new java.awt.Font("Leelawadee", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre Completo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        dniField.setBackground(new java.awt.Color(255, 255, 255));
        dniField.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        dniField.setForeground(new java.awt.Color(0, 0, 0));
        dniField.addActionListener(this::dniFieldActionPerformed);
        jPanel1.add(dniField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 210, 30));

        nombreField.setBackground(new java.awt.Color(255, 255, 255));
        nombreField.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        nombreField.setForeground(new java.awt.Color(0, 0, 0));
        nombreField.addActionListener(this::nombreFieldActionPerformed);
        jPanel1.add(nombreField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 210, 30));

        correoField.setBackground(new java.awt.Color(255, 255, 255));
        correoField.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        correoField.setForeground(new java.awt.Color(0, 0, 0));
        correoField.addActionListener(this::correoFieldActionPerformed);
        jPanel1.add(correoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 190, 30));

        limpiarBtn.setBackground(new java.awt.Color(204, 0, 0));
        limpiarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        limpiarBtn.setForeground(new java.awt.Color(255, 255, 255));
        limpiarBtn.setText("Limpiar");
        limpiarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiarBtn.setDefaultCapable(false);
        limpiarBtn.addActionListener(this::limpiarBtnActionPerformed);
        jPanel1.add(limpiarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 120, 40));

        registrarBtn.setBackground(new java.awt.Color(204, 0, 0));
        registrarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        registrarBtn.setText("Registrar");
        registrarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarBtn.setDefaultCapable(false);
        registrarBtn.addActionListener(this::registrarBtnActionPerformed);
        jPanel1.add(registrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 120, 40));

        jLabel5.setFont(new java.awt.Font("Leelawadee", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Edad: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        edadField.setBackground(new java.awt.Color(255, 255, 255));
        edadField.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        edadField.setForeground(new java.awt.Color(0, 0, 0));
        edadField.addActionListener(this::edadFieldActionPerformed);
        jPanel1.add(edadField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 210, 30));

        jLabel10.setFont(new java.awt.Font("Leelawadee", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Contraseña:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));

        contraseñaField.setBackground(new java.awt.Color(255, 255, 255));
        contraseñaField.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        contraseñaField.setForeground(new java.awt.Color(0, 0, 0));
        contraseñaField.addActionListener(this::contraseñaFieldActionPerformed);
        jPanel1.add(contraseñaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 190, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 210, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 210, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 210, 10));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 190, 10));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 190, 10));

        contratoCliente.setBackground(new java.awt.Color(255, 255, 255));
        contratoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 3), "Contrato Registro Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        contratoCliente.setForeground(new java.awt.Color(0, 0, 0));
        contratoCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Nombre:");
        contratoCliente.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        jLabel13.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("DNI: ");
        contratoCliente.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jLabel14.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Correo: ");
        contratoCliente.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        nombreCliente.setBackground(new java.awt.Color(255, 255, 255));
        nombreCliente.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        nombreCliente.setForeground(new java.awt.Color(0, 0, 0));
        nombreCliente.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        nombreCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        nombreCliente.addActionListener(this::nombreClienteActionPerformed);
        contratoCliente.add(nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 170, 30));

        dniCliente.setBackground(new java.awt.Color(255, 255, 255));
        dniCliente.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        dniCliente.setForeground(new java.awt.Color(0, 0, 0));
        dniCliente.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        dniCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        dniCliente.addActionListener(this::dniClienteActionPerformed);
        contratoCliente.add(dniCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 170, 30));

        correoCliente.setBackground(new java.awt.Color(255, 255, 255));
        correoCliente.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        correoCliente.setForeground(new java.awt.Color(0, 0, 0));
        correoCliente.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        correoCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        correoCliente.addActionListener(this::correoClienteActionPerformed);
        contratoCliente.add(correoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 170, 30));

        jLabel11.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Fecha de Registro:");
        contratoCliente.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, 30));

        fechaRegistroCliente.setBackground(new java.awt.Color(255, 255, 255));
        fechaRegistroCliente.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        fechaRegistroCliente.setForeground(new java.awt.Color(0, 0, 0));
        fechaRegistroCliente.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        fechaRegistroCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        fechaRegistroCliente.addActionListener(this::fechaRegistroClienteActionPerformed);
        contratoCliente.add(fechaRegistroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 170, 30));

        jLabel15.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Edad:");
        contratoCliente.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, 30));

        edadCliente.setBackground(new java.awt.Color(255, 255, 255));
        edadCliente.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        edadCliente.setForeground(new java.awt.Color(0, 0, 0));
        edadCliente.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        edadCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        edadCliente.addActionListener(this::edadClienteActionPerformed);
        contratoCliente.add(edadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 170, 30));

        jPanel1.add(contratoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 580, 300));

        avisoError.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        avisoError.setForeground(new java.awt.Color(153, 0, 0));
        avisoError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(avisoError, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 440, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 860, 580));
    }// </editor-fold>//GEN-END:initComponents

    private void dniFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniFieldActionPerformed

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void correoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoFieldActionPerformed

    private void limpiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBtnActionPerformed
        // TODO add your handling code here:
        limpiarFields();
        limpiarContrato();

        contratoCliente.setVisible(false);
    }//GEN-LAST:event_limpiarBtnActionPerformed
    
    private void limpiarFields() {
        nombreField.setText("");
        dniField.setText("");
        edadField.setText("");
        correoField.setText("");
        contraseñaField.setText("");
        dniField.setText("");
    }
    
    private void limpiarContrato() {
        nombreCliente.setText("");
        correoCliente.setText("");
        dniCliente.setText("");
        edadCliente.setText("");
        fechaRegistroCliente.setText("");
        avisoError.setText("");
    }
    
    private void registrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBtnActionPerformed
        // TODO add your handling code here:
        String nombre = nombreField.getText();
        String dni = dniField.getText();
        String edad = edadField.getText();
        String correo = correoField.getText();
        String contraseña = contraseñaField.getText();

        try {
            Cliente cliente = banco.getgClientes().registrarCliente(nombre, dni, edad, correo, contraseña);

            //Colocando en Contrato
            nombreCliente.setText(cliente.getNombres());
            correoCliente.setText(cliente.getCorreo());
            dniCliente.setText(dni);
            edadCliente.setText(String.valueOf(cliente.getEdad()));
            fechaRegistroCliente.setText(cliente.getFechaApertura());
            avisoError.setText("");

            contratoCliente.setVisible(true);
            limpiarFields();

        } catch (Exception e) {
            avisoError.setText(e.getMessage());
        }
    }//GEN-LAST:event_registrarBtnActionPerformed

    private void edadFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadFieldActionPerformed

    private void contraseñaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaFieldActionPerformed

    private void nombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreClienteActionPerformed

    private void dniClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniClienteActionPerformed

    private void correoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoClienteActionPerformed

    private void fechaRegistroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaRegistroClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaRegistroClienteActionPerformed

    private void edadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avisoError;
    private javax.swing.JTextField contraseñaField;
    private javax.swing.JPanel contratoCliente;
    private javax.swing.JTextField correoCliente;
    private javax.swing.JTextField correoField;
    private javax.swing.JTextField dniCliente;
    private javax.swing.JTextField dniField;
    private javax.swing.JTextField edadCliente;
    private javax.swing.JTextField edadField;
    private javax.swing.JTextField fechaRegistroCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JTextField nombreCliente;
    private javax.swing.JTextField nombreField;
    private javax.swing.JButton registrarBtn;
    // End of variables declaration//GEN-END:variables
}
