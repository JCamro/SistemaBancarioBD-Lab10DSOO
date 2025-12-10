package InterfazGrafica.panelAdmin.PanelesMetodos;

import Banco.ClasesBase.*;
import Banco.GestorPrincipal.Banco;

public class Pnl_Admin_Deposito extends javax.swing.JPanel {

    private Banco banco;
    private Usuario usuarioActual;
    
    public Pnl_Admin_Deposito(Banco banco, Usuario usuarioActual) {
        initComponents();
        this.banco = banco;
        this.usuarioActual = usuarioActual;
        boletaDeposito.setVisible(false);     
        setSize(920, 700);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        dniClienteField = new javax.swing.JTextField();
        limpiarBtn = new javax.swing.JButton();
        boletaDeposito = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        idTransaccion = new javax.swing.JTextField();
        numCuenta = new javax.swing.JTextField();
        dniCliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        monto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        dniEmpleado = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        btnRetirar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        avisoError = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        numeroCuentaField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        montoField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        claveField = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(204, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DEPOSITO");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 920, 70));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Ingrese Datos Solicitados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Leelawadee", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("DNI del Cliente: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 150, 30));

        dniClienteField.setBackground(new java.awt.Color(255, 255, 255));
        dniClienteField.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        dniClienteField.setForeground(new java.awt.Color(0, 0, 0));
        dniClienteField.addActionListener(this::dniClienteFieldActionPerformed);
        jPanel1.add(dniClienteField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 170, 30));

        limpiarBtn.setBackground(new java.awt.Color(204, 0, 0));
        limpiarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        limpiarBtn.setForeground(new java.awt.Color(255, 255, 255));
        limpiarBtn.setText("Limpiar");
        limpiarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiarBtn.setDefaultCapable(false);
        limpiarBtn.addActionListener(this::limpiarBtnActionPerformed);
        jPanel1.add(limpiarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 120, 40));

        boletaDeposito.setBackground(new java.awt.Color(255, 255, 255));
        boletaDeposito.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 3), "Boleta Deposito", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Roboto Condensed", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        boletaDeposito.setForeground(new java.awt.Color(0, 0, 0));
        boletaDeposito.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nroº Transaccion:");
        boletaDeposito.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nroº Cuenta:");
        boletaDeposito.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("DNI Cliente:");
        boletaDeposito.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, 30));

        idTransaccion.setBackground(new java.awt.Color(255, 255, 255));
        idTransaccion.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        idTransaccion.setForeground(new java.awt.Color(0, 0, 0));
        idTransaccion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        idTransaccion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        idTransaccion.addActionListener(this::idTransaccionActionPerformed);
        boletaDeposito.add(idTransaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 170, 30));

        numCuenta.setBackground(new java.awt.Color(255, 255, 255));
        numCuenta.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        numCuenta.setForeground(new java.awt.Color(0, 0, 0));
        numCuenta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        numCuenta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        numCuenta.addActionListener(this::numCuentaActionPerformed);
        boletaDeposito.add(numCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 170, 30));

        dniCliente.setBackground(new java.awt.Color(255, 255, 255));
        dniCliente.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        dniCliente.setForeground(new java.awt.Color(0, 0, 0));
        dniCliente.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        dniCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        dniCliente.addActionListener(this::dniClienteActionPerformed);
        boletaDeposito.add(dniCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 170, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Monto:");
        boletaDeposito.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, 30));

        monto.setBackground(new java.awt.Color(255, 255, 255));
        monto.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        monto.setForeground(new java.awt.Color(0, 0, 0));
        monto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        monto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        monto.addActionListener(this::montoActionPerformed);
        boletaDeposito.add(monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 170, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("DNI Empleado:");
        boletaDeposito.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, 30));

        dniEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        dniEmpleado.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        dniEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        dniEmpleado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        dniEmpleado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        dniEmpleado.addActionListener(this::dniEmpleadoActionPerformed);
        boletaDeposito.add(dniEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 170, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Fecha :");
        boletaDeposito.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, 30));

        fecha.setBackground(new java.awt.Color(255, 255, 255));
        fecha.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        fecha.setForeground(new java.awt.Color(0, 0, 0));
        fecha.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        fecha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        fecha.addActionListener(this::fechaActionPerformed);
        boletaDeposito.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 170, 30));

        jPanel1.add(boletaDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 570, 350));

        btnRetirar.setBackground(new java.awt.Color(204, 0, 0));
        btnRetirar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRetirar.setForeground(new java.awt.Color(255, 255, 255));
        btnRetirar.setText("Depositar");
        btnRetirar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRetirar.setDefaultCapable(false);
        btnRetirar.addActionListener(this::btnRetirarActionPerformed);
        jPanel1.add(btnRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 120, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 170, 20));

        avisoError.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        avisoError.setForeground(new java.awt.Color(153, 0, 0));
        avisoError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(avisoError, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 440, 40));

        jLabel8.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Numero de Cuenta:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 150, 30));

        numeroCuentaField.setBackground(new java.awt.Color(255, 255, 255));
        numeroCuentaField.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        numeroCuentaField.setForeground(new java.awt.Color(0, 0, 0));
        numeroCuentaField.addActionListener(this::numeroCuentaFieldActionPerformed);
        jPanel1.add(numeroCuentaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 170, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 170, 20));

        jLabel14.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Monto:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 70, 40));

        montoField.setBackground(new java.awt.Color(255, 255, 255));
        montoField.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        montoField.setForeground(new java.awt.Color(0, 0, 0));
        montoField.addActionListener(this::montoFieldActionPerformed);
        jPanel1.add(montoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 170, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 170, 20));

        jLabel15.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Clave:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 70, 40));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 170, 20));

        claveField.setBackground(new java.awt.Color(255, 255, 255));
        claveField.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        claveField.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(claveField, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 170, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 104, 860, 570));
    }// </editor-fold>//GEN-END:initComponents

    private void dniClienteFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniClienteFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniClienteFieldActionPerformed

    private void limpiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBtnActionPerformed
        // TODO add your handling code here:
        limpiarFields();
        limpiarContrato();
        boletaDeposito.setVisible(false);
    }//GEN-LAST:event_limpiarBtnActionPerformed
    
    private void limpiarFields() {
        dniClienteField.setText("");
        numeroCuentaField.setText("");
        montoField.setText("");
        claveField.setText("");
    }
    
    private void limpiarContrato() {
        idTransaccion.setText("");
        numCuenta.setText("");
        dniCliente.setText("");
        dniEmpleado.setText("");
        monto.setText("");
        fecha.setText("");
        
        avisoError.setText("");
    }
    
    private void idTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTransaccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTransaccionActionPerformed

    private void numCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numCuentaActionPerformed

    private void dniClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniClienteActionPerformed

    private void montoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_montoActionPerformed

    private void dniEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniEmpleadoActionPerformed

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        // TODO add your handling code here:

        String dniEntry = dniClienteField.getText();
        String numCuentaEntry = numeroCuentaField.getText();
        String montoEntry = montoField.getText();
        String claveEntry = new String(claveField.getPassword());

        try {
            Deposito nuevoRetiro = banco.getgTransacciones().procesarDeposito(usuarioActual, numCuentaEntry, montoEntry, dniEntry, claveEntry);

            //Colocando en Contrato
            idTransaccion.setText(String.valueOf(nuevoRetiro.getIdTransaccion()));
            dniCliente.setText(dniEntry);
            numCuenta.setText(numCuentaEntry);
            dniEmpleado.setText(String.valueOf(usuarioActual.getDni()));
            monto.setText(montoEntry);
            fecha.setText(nuevoRetiro.getFecha());

            boletaDeposito.setVisible(true);

            limpiarFields();

            avisoError.setText("");

        } catch (Exception e) {
            avisoError.setText(e.getMessage());
        }
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void numeroCuentaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroCuentaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroCuentaFieldActionPerformed

    private void montoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_montoFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avisoError;
    private javax.swing.JPanel boletaDeposito;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JPasswordField claveField;
    private javax.swing.JTextField dniCliente;
    private javax.swing.JTextField dniClienteField;
    private javax.swing.JTextField dniEmpleado;
    private javax.swing.JTextField fecha;
    private javax.swing.JTextField idTransaccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JTextField monto;
    private javax.swing.JTextField montoField;
    private javax.swing.JTextField numCuenta;
    private javax.swing.JTextField numeroCuentaField;
    // End of variables declaration//GEN-END:variables
}
