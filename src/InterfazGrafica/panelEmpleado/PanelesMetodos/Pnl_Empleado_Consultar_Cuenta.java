
package InterfazGrafica.panelEmpleado.PanelesMetodos;

import Banco.ClasesBase.*;
import Banco.GestorPrincipal.Banco;

public class Pnl_Empleado_Consultar_Cuenta extends javax.swing.JPanel {

    private Banco banco;
    private Usuario usuarioActual;


    public Pnl_Empleado_Consultar_Cuenta(Banco banco, Usuario usuarioActual) {
        initComponents();
        this.banco = banco;
        this.usuarioActual = usuarioActual;
        setSize(920, 700);
        contratoCuenta.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        entradaNumCuenta = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        buscar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        avisoCuenta = new javax.swing.JLabel();
        contratoCuenta = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        saldoCuenta = new javax.swing.JLabel();
        numCuenta = new javax.swing.JLabel();
        tipoCuenta = new javax.swing.JLabel();
        fechaApertura = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 0, 0));
        setLayout(null);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Ingresar Datos Solicitados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Leelawadee", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Nroº Cuenta: ");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 120, 30));

        entradaNumCuenta.setBackground(new java.awt.Color(255, 255, 255));
        entradaNumCuenta.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        entradaNumCuenta.setForeground(new java.awt.Color(0, 0, 0));
        entradaNumCuenta.addActionListener(this::entradaNumCuentaActionPerformed);
        jPanel6.add(entradaNumCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 230, -1));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel6.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 230, 10));

        buscar.setBackground(new java.awt.Color(204, 0, 0));
        buscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setText("BUSCAR");
        buscar.addActionListener(this::buscarActionPerformed);
        jPanel6.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 140, 40));

        limpiar.setBackground(new java.awt.Color(204, 0, 0));
        limpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        limpiar.setForeground(new java.awt.Color(255, 255, 255));
        limpiar.setText("LIMPIAR");
        limpiar.addActionListener(this::limpiarActionPerformed);
        jPanel6.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 90, 40));

        avisoCuenta.setBackground(new java.awt.Color(51, 51, 51));
        avisoCuenta.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        avisoCuenta.setForeground(new java.awt.Color(153, 0, 0));
        avisoCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(avisoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 550, 40));

        contratoCuenta.setBackground(new java.awt.Color(255, 255, 255));
        contratoCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 3, true), "Contrato de Apertura de Cuenta", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        contratoCuenta.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                contratoCuentaComponentHidden(evt);
            }
        });
        contratoCuenta.setLayout(null);

        jLabel24.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Numero de Cuenta:");
        contratoCuenta.add(jLabel24);
        jLabel24.setBounds(120, 80, 165, 30);

        jLabel25.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Tipo de Cuenta:");
        contratoCuenta.add(jLabel25);
        jLabel25.setBounds(120, 130, 170, 30);

        jLabel27.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Saldo:");
        contratoCuenta.add(jLabel27);
        jLabel27.setBounds(120, 180, 160, 30);

        jLabel28.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Fecha de Apertura:");
        contratoCuenta.add(jLabel28);
        jLabel28.setBounds(120, 230, 190, 30);

        saldoCuenta.setBackground(new java.awt.Color(0, 153, 153));
        saldoCuenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        saldoCuenta.setForeground(new java.awt.Color(0, 0, 0));
        saldoCuenta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        saldoCuenta.setText(".");
        saldoCuenta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        contratoCuenta.add(saldoCuenta);
        saldoCuenta.setBounds(350, 180, 171, 30);

        numCuenta.setBackground(new java.awt.Color(0, 153, 153));
        numCuenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numCuenta.setForeground(new java.awt.Color(0, 0, 0));
        numCuenta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        numCuenta.setText(".");
        numCuenta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        contratoCuenta.add(numCuenta);
        numCuenta.setBounds(350, 80, 171, 30);

        tipoCuenta.setBackground(new java.awt.Color(0, 153, 153));
        tipoCuenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tipoCuenta.setForeground(new java.awt.Color(0, 0, 0));
        tipoCuenta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tipoCuenta.setText(".");
        tipoCuenta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        contratoCuenta.add(tipoCuenta);
        tipoCuenta.setBounds(350, 130, 171, 30);

        fechaApertura.setBackground(new java.awt.Color(0, 153, 153));
        fechaApertura.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fechaApertura.setForeground(new java.awt.Color(0, 0, 0));
        fechaApertura.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fechaApertura.setText(".");
        fechaApertura.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        contratoCuenta.add(fechaApertura);
        fechaApertura.setBounds(350, 230, 171, 30);

        jPanel6.add(contratoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 630, 340));

        add(jPanel6);
        jPanel6.setBounds(32, 113, 860, 560);

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BUSCAR CUENTA");
        add(jLabel1);
        jLabel1.setBounds(1, 21, 920, 58);
    }// </editor-fold>//GEN-END:initComponents

    private void entradaNumCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNumCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNumCuentaActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        try {
            String numeroCuenta = entradaNumCuenta.getText();
            Cuenta cuenta = banco.getgCuentas().mostrarCuenta(usuarioActual, numeroCuenta);
            numCuenta.setText(String.valueOf(cuenta.getNumeroCuenta()));
            tipoCuenta.setText(cuenta.getTipoCuenta());
            saldoCuenta.setText(String.valueOf(cuenta.getSaldo()));
            fechaApertura.setText(String.valueOf(cuenta.getFechaApertura()));

            entradaNumCuenta.setText("");

            contratoCuenta.setVisible(true);

        } catch (Exception e) {
            avisoCuenta.setText(e.getMessage());
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        numCuenta.setText("");
        tipoCuenta.setText("");
        saldoCuenta.setText("");
        fechaApertura.setText("");
        entradaNumCuenta.setText("");

        avisoCuenta.setText("");

        contratoCuenta.setVisible(false);
    }//GEN-LAST:event_limpiarActionPerformed

    private void contratoCuentaComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_contratoCuentaComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_contratoCuentaComponentHidden


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avisoCuenta;
    private javax.swing.JButton buscar;
    private javax.swing.JPanel contratoCuenta;
    private javax.swing.JTextField entradaNumCuenta;
    private javax.swing.JLabel fechaApertura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JButton limpiar;
    private javax.swing.JLabel numCuenta;
    private javax.swing.JLabel saldoCuenta;
    private javax.swing.JLabel tipoCuenta;
    // End of variables declaration//GEN-END:variables
}
