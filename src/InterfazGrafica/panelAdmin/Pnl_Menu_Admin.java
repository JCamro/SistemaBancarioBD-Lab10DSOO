package InterfazGrafica.panelAdmin;

import Banco.ClasesBase.*;
import Banco.GestorPrincipal.Banco;
import InterfazGrafica.panelAdmin.PanelesMetodos.*;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


public class Pnl_Menu_Admin extends javax.swing.JPanel {
    
    private Banco banco;
    private Usuario usuarioActual;
    
    private Pnl_Admin_Consultar_Cliente buscarCliente;
    private Pnl_Admin_Eliminar_Cliente eliminarCliente;
    private Pnl_Admin_Registrar_Cliente registrarCliente;
    private Pnl_Admin_Buscar_Empleado buscarEmpleado;
    private Pnl_Admin_Eliminar_Empleado eliminarEmpleado;
    private Pnl_Admin_Registrar_Empleado registrarEmpleado;
    private Pnl_Admin_Abrir_Cuenta abrirCuenta;
    private Pnl_Admin_Retiro retiro;
    private Pnl_Admin_Deposito deposito;
    private Pnl_Admin_Consultar_Cuenta consultarCuenta;
            
    private CardLayout vista;
    
    public Pnl_Menu_Admin(Banco banco, Usuario usuarioActual) {
        initComponents();
        this.banco = banco;
        this.usuarioActual = usuarioActual;
        vista = new CardLayout();
        vista = (CardLayout) Pnl_Vista_Principal.getLayout();
        inicializarPaneles();
        setVisible(true);
        
        nombreAdmin.setText("Usuario: " + usuarioActual.getNombres().toUpperCase());
    }
    
    private void inicializarPaneles() {
        buscarCliente = new Pnl_Admin_Consultar_Cliente(banco, usuarioActual);
        eliminarCliente = new Pnl_Admin_Eliminar_Cliente(banco, usuarioActual);
        registrarCliente = new Pnl_Admin_Registrar_Cliente(banco, usuarioActual);
        eliminarEmpleado = new Pnl_Admin_Eliminar_Empleado(banco, usuarioActual);
        registrarEmpleado = new Pnl_Admin_Registrar_Empleado(banco, usuarioActual);
        buscarEmpleado = new Pnl_Admin_Buscar_Empleado(banco, usuarioActual);
        abrirCuenta = new Pnl_Admin_Abrir_Cuenta(banco, usuarioActual);
        retiro = new Pnl_Admin_Retiro(banco, usuarioActual);
        deposito = new Pnl_Admin_Deposito(banco, usuarioActual);
        consultarCuenta = new Pnl_Admin_Consultar_Cuenta(banco, usuarioActual);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnBuscarCliente = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        iconoCliente = new javax.swing.JLabel();
        btnBuscarEmpleado = new javax.swing.JButton();
        btnRegistrarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        btnRegistrarEmpleado = new javax.swing.JButton();
        btnEliminarEmpleado = new javax.swing.JButton();
        btnAbrirCuenta = new javax.swing.JButton();
        nombreAdmin = new javax.swing.JLabel();
        btnDeposito = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();
        btnAbrirCuenta1 = new javax.swing.JButton();
        Pnl_Vista_Principal = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnBuscarCliente.setBackground(new java.awt.Color(204, 0, 0));
        btnBuscarCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCliente.setText("Buscar Cliente");
        btnBuscarCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarCliente.setBorderPainted(false);
        btnBuscarCliente.addActionListener(this::btnBuscarClienteActionPerformed);

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

        btnBuscarEmpleado.setBackground(new java.awt.Color(204, 0, 0));
        btnBuscarEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarEmpleado.setText("Buscar Empleado");
        btnBuscarEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarEmpleado.setBorderPainted(false);
        btnBuscarEmpleado.addActionListener(this::btnBuscarEmpleadoActionPerformed);

        btnRegistrarCliente.setBackground(new java.awt.Color(204, 0, 0));
        btnRegistrarCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarCliente.setText("Registrar Cliente");
        btnRegistrarCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarCliente.setBorderPainted(false);
        btnRegistrarCliente.addActionListener(this::btnRegistrarClienteActionPerformed);

        btnEliminarCliente.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminarCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCliente.setText("Eliminar Cliente");
        btnEliminarCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminarCliente.setBorderPainted(false);
        btnEliminarCliente.addActionListener(this::btnEliminarClienteActionPerformed);

        btnRegistrarEmpleado.setBackground(new java.awt.Color(204, 0, 0));
        btnRegistrarEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarEmpleado.setText("Registrar Empleado");
        btnRegistrarEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarEmpleado.setBorderPainted(false);
        btnRegistrarEmpleado.addActionListener(this::btnRegistrarEmpleadoActionPerformed);

        btnEliminarEmpleado.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminarEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarEmpleado.setText("Eliminar Empleado");
        btnEliminarEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminarEmpleado.setBorderPainted(false);
        btnEliminarEmpleado.addActionListener(this::btnEliminarEmpleadoActionPerformed);

        btnAbrirCuenta.setBackground(new java.awt.Color(204, 0, 0));
        btnAbrirCuenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAbrirCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrirCuenta.setText("Abrir Cuenta");
        btnAbrirCuenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAbrirCuenta.setBorderPainted(false);
        btnAbrirCuenta.addActionListener(this::btnAbrirCuentaActionPerformed);

        nombreAdmin.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        nombreAdmin.setForeground(new java.awt.Color(0, 0, 0));
        nombreAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnDeposito.setBackground(new java.awt.Color(204, 0, 0));
        btnDeposito.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDeposito.setForeground(new java.awt.Color(255, 255, 255));
        btnDeposito.setText("Depositar");
        btnDeposito.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeposito.setBorderPainted(false);
        btnDeposito.addActionListener(this::btnDepositoActionPerformed);

        btnRetirar.setBackground(new java.awt.Color(204, 0, 0));
        btnRetirar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRetirar.setForeground(new java.awt.Color(255, 255, 255));
        btnRetirar.setText("Retirar");
        btnRetirar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRetirar.setBorderPainted(false);
        btnRetirar.addActionListener(this::btnRetirarActionPerformed);

        btnAbrirCuenta1.setBackground(new java.awt.Color(204, 0, 0));
        btnAbrirCuenta1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAbrirCuenta1.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrirCuenta1.setText("Consultar Cuenta");
        btnAbrirCuenta1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAbrirCuenta1.setBorderPainted(false);
        btnAbrirCuenta1.addActionListener(this::btnAbrirCuenta1ActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(btnEliminarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(btnRegistrarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(btnEliminarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(btnAbrirCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(btnDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(btnRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAbrirCuenta1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(nombreAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(iconoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(iconoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarCliente)
                .addGap(27, 27, 27)
                .addComponent(btnBuscarEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarEmpleado)
                .addGap(27, 27, 27)
                .addComponent(btnAbrirCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAbrirCuenta1)
                .addGap(26, 26, 26)
                .addComponent(btnDeposito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRetirar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Pnl_Vista_Principal.setBackground(new java.awt.Color(204, 0, 0));
        Pnl_Vista_Principal.setForeground(new java.awt.Color(204, 0, 0));
        Pnl_Vista_Principal.setLayout(new java.awt.CardLayout());
        add(Pnl_Vista_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 0, 930, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        // TODO add your handling code here:
        Pnl_Vista_Principal.add(buscarCliente, "buscarCliente");
        vista.show(Pnl_Vista_Principal, "buscarCliente");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    
    
    
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

    
    
    private void btnBuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEmpleadoActionPerformed
        // TODO add your handling code here:
        Pnl_Vista_Principal.add(buscarEmpleado, "buscarEmpleado");
        vista.show(Pnl_Vista_Principal, "buscarEmpleado");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
        
    }//GEN-LAST:event_btnBuscarEmpleadoActionPerformed

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        // TODO add your handling code here:Pnl_Vista_Principal.add(buscarCliente, "buscarCliente");
        Pnl_Vista_Principal.add(registrarCliente, "registrarCliente");
        vista.show(Pnl_Vista_Principal, "registrarCliente");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    
    
    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        // TODO add your handling code here:
        Pnl_Vista_Principal.add(eliminarCliente, "eliminarCliente");
        vista.show(Pnl_Vista_Principal, "eliminarCliente");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEmpleadoActionPerformed
        // TODO add your handling code here:
        Pnl_Vista_Principal.add(registrarEmpleado, "registrarEmpleado");
        vista.show(Pnl_Vista_Principal, "registrarEmpleado");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btnRegistrarEmpleadoActionPerformed

    private void btnEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadoActionPerformed
        // TODO add your handling code here:
        Pnl_Vista_Principal.add(eliminarEmpleado, "eliminarEmpleado");
        vista.show(Pnl_Vista_Principal, "eliminarEmpleado");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btnEliminarEmpleadoActionPerformed

    private void btnAbrirCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirCuentaActionPerformed
        // TODO add your handling code here:
        Pnl_Vista_Principal.add(abrirCuenta, "abrirCuenta");
        vista.show(Pnl_Vista_Principal, "abrirCuenta");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btnAbrirCuentaActionPerformed

    private void btnDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositoActionPerformed
        // TODO add your handling code here:
        Pnl_Vista_Principal.add(deposito, "deposito");
        vista.show(Pnl_Vista_Principal, "deposito");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
        
    }//GEN-LAST:event_btnDepositoActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        // TODO add your handling code here:
        Pnl_Vista_Principal.add(retiro, "retiro");
        vista.show(Pnl_Vista_Principal, "retiro");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void btnAbrirCuenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirCuenta1ActionPerformed
        // TODO add your handling code here:
        Pnl_Vista_Principal.add(consultarCuenta, "consultarCuenta");
        vista.show(Pnl_Vista_Principal, "consultarCuenta");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btnAbrirCuenta1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pnl_Vista_Principal;
    private javax.swing.JButton btnAbrirCuenta;
    private javax.swing.JButton btnAbrirCuenta1;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarEmpleado;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnDeposito;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarEmpleado;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnRegistrarEmpleado;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JLabel iconoCliente;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nombreAdmin;
    // End of variables declaration//GEN-END:variables
 
}