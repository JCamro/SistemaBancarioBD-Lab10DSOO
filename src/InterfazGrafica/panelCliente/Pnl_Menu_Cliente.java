package InterfazGrafica.panelCliente;

import Banco.GestorPrincipal.Banco;
import Banco.ClasesBase.Usuario;

import InterfazGrafica.panelCliente.Paneles.*;
import java.awt.CardLayout;
import javax.swing.*;

public class Pnl_Menu_Cliente extends javax.swing.JPanel {

    private Banco banco;
    private Usuario usuarioActual;

    private Pnl_ConsultarCuenta consultarCuenta;
    private Pnl_Transferir transferencia;

    private CardLayout vista;

    public Pnl_Menu_Cliente(Banco banco, Usuario usuarioActual) {
        initComponents();
        this.banco = banco;
        this.usuarioActual = usuarioActual;
        this.vista = new CardLayout();

        vista = (CardLayout) Pnl_Vista_Principal.getLayout();
        inicializarPaneles();
        setVisible(true);
        nombreCliente.setText("Usuario: " + usuarioActual.getNombres().toUpperCase());
    }

    private void inicializarPaneles() {
        consultarCuenta = new Pnl_ConsultarCuenta(banco, usuarioActual);
        transferencia = new Pnl_Transferir(banco, usuarioActual);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnConsultarCuenta = new javax.swing.JButton();
        btnTransferencia = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        iconoCliente = new javax.swing.JLabel();
        nombreCliente = new javax.swing.JLabel();
        Pnl_Vista_Principal = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnConsultarCuenta.setBackground(new java.awt.Color(204, 0, 0));
        btnConsultarCuenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnConsultarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarCuenta.setText("Consultar Cuenta");
        btnConsultarCuenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultarCuenta.setBorderPainted(false);
        btnConsultarCuenta.addActionListener(this::btnConsultarCuentaActionPerformed);

        btnTransferencia.setBackground(new java.awt.Color(204, 0, 0));
        btnTransferencia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTransferencia.setForeground(new java.awt.Color(255, 255, 255));
        btnTransferencia.setText("Transferir");
        btnTransferencia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTransferencia.setBorderPainted(false);
        btnTransferencia.addActionListener(this::btnTransferenciaActionPerformed);

        btnCerrarSesion.setBackground(new java.awt.Color(204, 0, 0));
        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.addActionListener(this::btnCerrarSesionActionPerformed);

        iconoCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        iconoCliente.setForeground(new java.awt.Color(0, 0, 0));
        iconoCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icono_usuario.png"))); // NOI18N

        nombreCliente.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        nombreCliente.setForeground(new java.awt.Color(0, 0, 0));
        nombreCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsultarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(iconoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(iconoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnConsultarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Pnl_Vista_Principal.setBackground(new java.awt.Color(204, 0, 0));
        Pnl_Vista_Principal.setLayout(new java.awt.CardLayout());
        add(Pnl_Vista_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 920, 700));
    }// </editor-fold>//GEN-END:initComponents

    // Cerrar Sesion Boton
    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
        int respuesta = JOptionPane.showConfirmDialog(
            this,
            "¿Está seguro que desea cerrar sesión?",
            "Confirmar Cierre de Sesión",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        if (respuesta == JOptionPane.YES_OPTION) {
            // Obtener el MainFrame y volver al login
            java.awt.Window ventana = SwingUtilities.getWindowAncestor(this);
            if (ventana instanceof InterfazGrafica.mainFrame.MainFrame) {
                ((InterfazGrafica.mainFrame.MainFrame) ventana).volverALogin();
            }
        }
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    // Transferencia Boton
    private void btnTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferenciaActionPerformed
        // TODO add your handling code here:
        Pnl_Vista_Principal.add(transferencia, "transferencia");
        vista.show(Pnl_Vista_Principal, "transferencia");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btnTransferenciaActionPerformed

    // Consultar Cuenta Boton
    private void btnConsultarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCuentaActionPerformed
        // TODO add your handling code here:
        Pnl_Vista_Principal.add(consultarCuenta, "consultar");
        vista.show(Pnl_Vista_Principal, "consultar");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btnConsultarCuentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pnl_Vista_Principal;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnConsultarCuenta;
    private javax.swing.JButton btnTransferencia;
    private javax.swing.JLabel iconoCliente;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nombreCliente;
    // End of variables declaration//GEN-END:variables
}
