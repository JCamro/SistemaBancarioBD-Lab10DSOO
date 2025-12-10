
package InterfazGrafica.panelCliente.Paneles;

import Banco.BancoExceptions.BancoException;
import Banco.ClasesBase.Transaccion;
import Banco.ClasesBase.Transferencia;
import Banco.ClasesBase.*;
import Banco.GestorPrincipal.Banco;

public class Pnl_Transferir extends javax.swing.JPanel {

    private Banco banco;
    private Usuario usuarioActual;
    public Pnl_Transferir(Banco banco, Usuario usuarioActual) {
        initComponents();
        this.banco = banco;
        this.usuarioActual = usuarioActual;
        boletaTransferencia.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        origenEntrada = new javax.swing.JTextField();
        destinoEntrada = new javax.swing.JTextField();
        montoEntrada = new javax.swing.JTextField();
        claveEntrada = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        transferir = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        boletaTransferencia = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cuentaDestinoL = new javax.swing.JLabel();
        numTransaccion = new javax.swing.JLabel();
        cuentaOrigenL = new javax.swing.JLabel();
        dniCliente = new javax.swing.JLabel();
        montoL = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        avisoFondo = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TRANSFERENCIA");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 20, 920, 66);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Ingresar Datos Solicitados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Leelawadee", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Clave:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 93, 30));

        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nroº Cuenta Origen: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 200, 30));

        jLabel4.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nroº Cuenta Destino: ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 200, 30));

        jLabel5.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Monto:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 63, 80, 30));

        origenEntrada.setBackground(new java.awt.Color(255, 255, 255));
        origenEntrada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        origenEntrada.setForeground(new java.awt.Color(0, 0, 0));
        origenEntrada.addActionListener(this::origenEntradaActionPerformed);
        jPanel2.add(origenEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 230, -1));

        destinoEntrada.setBackground(new java.awt.Color(255, 255, 255));
        destinoEntrada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        destinoEntrada.setForeground(new java.awt.Color(0, 0, 0));
        destinoEntrada.addActionListener(this::destinoEntradaActionPerformed);
        jPanel2.add(destinoEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 230, -1));

        montoEntrada.setBackground(new java.awt.Color(255, 255, 255));
        montoEntrada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        montoEntrada.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(montoEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 170, -1));

        claveEntrada.setBackground(new java.awt.Color(255, 255, 255));
        claveEntrada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        claveEntrada.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(claveEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 169, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 230, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 170, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 169, 10));

        transferir.setBackground(new java.awt.Color(204, 0, 0));
        transferir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        transferir.setForeground(new java.awt.Color(255, 255, 255));
        transferir.setText("TRANSFERIR");
        transferir.addActionListener(this::transferirActionPerformed);
        jPanel2.add(transferir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 140, 40));

        limpiar.setBackground(new java.awt.Color(204, 0, 0));
        limpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        limpiar.setForeground(new java.awt.Color(255, 255, 255));
        limpiar.setText("LIMPIAR");
        limpiar.addActionListener(this::limpiarActionPerformed);
        jPanel2.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 90, 40));

        boletaTransferencia.setBackground(new java.awt.Color(255, 255, 255));
        boletaTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 3, true), "Transferencia Exitosa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        boletaTransferencia.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                boletaTransferenciaComponentHidden(evt);
            }
        });
        boletaTransferencia.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Num Transaccion:");
        boletaTransferencia.add(jLabel6);
        jLabel6.setBounds(110, 50, 153, 28);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Cuenta Origen:");
        boletaTransferencia.add(jLabel7);
        jLabel7.setBounds(110, 100, 135, 28);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("DNI Cliente:");
        boletaTransferencia.add(jLabel8);
        jLabel8.setBounds(110, 240, 110, 28);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Cuenta Destino:");
        boletaTransferencia.add(jLabel9);
        jLabel9.setBounds(110, 150, 135, 28);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Monto:");
        boletaTransferencia.add(jLabel10);
        jLabel10.setBounds(110, 200, 153, 28);

        cuentaDestinoL.setBackground(new java.awt.Color(0, 153, 153));
        cuentaDestinoL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cuentaDestinoL.setForeground(new java.awt.Color(0, 0, 0));
        cuentaDestinoL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cuentaDestinoL.setText(".");
        cuentaDestinoL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        boletaTransferencia.add(cuentaDestinoL);
        cuentaDestinoL.setBounds(290, 150, 114, 27);

        numTransaccion.setBackground(new java.awt.Color(0, 153, 153));
        numTransaccion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numTransaccion.setForeground(new java.awt.Color(0, 0, 0));
        numTransaccion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        numTransaccion.setText(".");
        numTransaccion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        boletaTransferencia.add(numTransaccion);
        numTransaccion.setBounds(290, 50, 114, 28);

        cuentaOrigenL.setBackground(new java.awt.Color(0, 153, 153));
        cuentaOrigenL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cuentaOrigenL.setForeground(new java.awt.Color(0, 0, 0));
        cuentaOrigenL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cuentaOrigenL.setText(".");
        cuentaOrigenL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        boletaTransferencia.add(cuentaOrigenL);
        cuentaOrigenL.setBounds(290, 100, 114, 27);

        dniCliente.setBackground(new java.awt.Color(0, 153, 153));
        dniCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dniCliente.setForeground(new java.awt.Color(0, 0, 0));
        dniCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dniCliente.setText(".");
        dniCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        boletaTransferencia.add(dniCliente);
        dniCliente.setBounds(290, 240, 116, 27);

        montoL.setBackground(new java.awt.Color(0, 153, 153));
        montoL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        montoL.setForeground(new java.awt.Color(0, 0, 0));
        montoL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        montoL.setText(".");
        montoL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        boletaTransferencia.add(montoL);
        montoL.setBounds(290, 200, 116, 27);

        jPanel2.add(boletaTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 510, 310));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 230, 10));

        avisoFondo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        avisoFondo.setForeground(new java.awt.Color(153, 0, 0));
        jPanel2.add(avisoFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 690, 40));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(31, 103, 860, 569);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void destinoEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinoEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinoEntradaActionPerformed

    private void origenEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_origenEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_origenEntradaActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        limpiar();
        avisoFondo.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void limpiar() {
        claveEntrada.setText("");
        montoEntrada.setText("");
        origenEntrada.setText("");
        destinoEntrada.setText("");
    }
    
    private void boletaTransferenciaComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_boletaTransferenciaComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_boletaTransferenciaComponentHidden

    private void transferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferirActionPerformed
        try {
            String clave = new String(claveEntrada.getPassword());
            String monto = montoEntrada.getText();
            String cuentaOrigen = origenEntrada.getText();
            String cuentaDestino = destinoEntrada.getText();
            
            Transferencia nuevaTransaccion = banco.getgTransacciones().procesarTransferencia(usuarioActual, cuentaOrigen, cuentaDestino, monto, String.valueOf(usuarioActual.getDni()), clave);
            
            numTransaccion.setText(String.valueOf(nuevaTransaccion.getIdTransaccion()));
            cuentaOrigenL.setText(cuentaOrigen);
            cuentaDestinoL.setText(cuentaDestino);
            montoL.setText(monto);
            dniCliente.setText(String.valueOf(usuarioActual.getDni()));
            
        } catch(Exception e) {
            limpiar();
            avisoFondo.setText(e.getMessage());
        }
        
        
    }//GEN-LAST:event_transferirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avisoFondo;
    private javax.swing.JPanel boletaTransferencia;
    private javax.swing.JPasswordField claveEntrada;
    private javax.swing.JLabel cuentaDestinoL;
    private javax.swing.JLabel cuentaOrigenL;
    private javax.swing.JTextField destinoEntrada;
    private javax.swing.JLabel dniCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField montoEntrada;
    private javax.swing.JLabel montoL;
    private javax.swing.JLabel numTransaccion;
    private javax.swing.JTextField origenEntrada;
    private javax.swing.JButton transferir;
    // End of variables declaration//GEN-END:variables
}
