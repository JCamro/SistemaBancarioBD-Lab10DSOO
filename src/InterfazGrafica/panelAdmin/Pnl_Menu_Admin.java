package InterfazGrafica.panelAdmin;

import Banco.ClasesBase.*;
import Banco.GestorPrincipal.Banco;
import InterfazGrafica.TablaTransacciones;
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
    private TabTransacciones transacciones;
            
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
        transacciones = new TabTransacciones();

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
        btnMostrarTransacciones = new javax.swing.JButton();
        Pnl_Vista_Principal = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscarCliente.setBackground(new java.awt.Color(204, 0, 0));
        btnBuscarCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCliente.setText("Buscar Cliente");
        btnBuscarCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarCliente.setBorderPainted(false);
        btnBuscarCliente.addActionListener(this::btnBuscarClienteActionPerformed);
        jPanel2.add(btnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 195, -1));

        btnCerrarSesion.setBackground(new java.awt.Color(204, 0, 0));
        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.addActionListener(this::btnCerrarSesionActionPerformed);
        jPanel2.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 633, 195, 45));

        iconoCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        iconoCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icono_usuario.png"))); // NOI18N
        jPanel2.add(iconoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 12, 107, 102));

        btnBuscarEmpleado.setBackground(new java.awt.Color(204, 0, 0));
        btnBuscarEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarEmpleado.setText("Buscar Empleado");
        btnBuscarEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarEmpleado.setBorderPainted(false);
        btnBuscarEmpleado.addActionListener(this::btnBuscarEmpleadoActionPerformed);
        jPanel2.add(btnBuscarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 195, -1));

        btnRegistrarCliente.setBackground(new java.awt.Color(204, 0, 0));
        btnRegistrarCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarCliente.setText("Registrar Cliente");
        btnRegistrarCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarCliente.setBorderPainted(false);
        btnRegistrarCliente.addActionListener(this::btnRegistrarClienteActionPerformed);
        jPanel2.add(btnRegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 195, -1));

        btnEliminarCliente.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminarCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCliente.setText("Eliminar Cliente");
        btnEliminarCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminarCliente.setBorderPainted(false);
        btnEliminarCliente.addActionListener(this::btnEliminarClienteActionPerformed);
        jPanel2.add(btnEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 195, -1));

        btnRegistrarEmpleado.setBackground(new java.awt.Color(204, 0, 0));
        btnRegistrarEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarEmpleado.setText("Registrar Empleado");
        btnRegistrarEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarEmpleado.setBorderPainted(false);
        btnRegistrarEmpleado.addActionListener(this::btnRegistrarEmpleadoActionPerformed);
        jPanel2.add(btnRegistrarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 195, -1));

        btnEliminarEmpleado.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminarEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarEmpleado.setText("Eliminar Empleado");
        btnEliminarEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminarEmpleado.setBorderPainted(false);
        btnEliminarEmpleado.addActionListener(this::btnEliminarEmpleadoActionPerformed);
        jPanel2.add(btnEliminarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 195, -1));

        btnAbrirCuenta.setBackground(new java.awt.Color(204, 0, 0));
        btnAbrirCuenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAbrirCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrirCuenta.setText("Abrir Cuenta");
        btnAbrirCuenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAbrirCuenta.setBorderPainted(false);
        btnAbrirCuenta.addActionListener(this::btnAbrirCuentaActionPerformed);
        jPanel2.add(btnAbrirCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 195, -1));

        nombreAdmin.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        nombreAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(nombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 120, 195, 33));

        btnDeposito.setBackground(new java.awt.Color(204, 0, 0));
        btnDeposito.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDeposito.setForeground(new java.awt.Color(255, 255, 255));
        btnDeposito.setText("Depositar");
        btnDeposito.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeposito.setBorderPainted(false);
        btnDeposito.addActionListener(this::btnDepositoActionPerformed);
        jPanel2.add(btnDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 195, -1));

        btnRetirar.setBackground(new java.awt.Color(204, 0, 0));
        btnRetirar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRetirar.setForeground(new java.awt.Color(255, 255, 255));
        btnRetirar.setText("Retirar");
        btnRetirar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRetirar.setBorderPainted(false);
        btnRetirar.addActionListener(this::btnRetirarActionPerformed);
        jPanel2.add(btnRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 195, -1));

        btnAbrirCuenta1.setBackground(new java.awt.Color(204, 0, 0));
        btnAbrirCuenta1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAbrirCuenta1.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrirCuenta1.setText("Consultar Cuenta");
        btnAbrirCuenta1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAbrirCuenta1.setBorderPainted(false);
        btnAbrirCuenta1.addActionListener(this::btnAbrirCuenta1ActionPerformed);
        jPanel2.add(btnAbrirCuenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 195, -1));

        btnMostrarTransacciones.setBackground(new java.awt.Color(204, 0, 0));
        btnMostrarTransacciones.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnMostrarTransacciones.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarTransacciones.setText("Transacciones");
        btnMostrarTransacciones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMostrarTransacciones.setBorderPainted(false);
        btnMostrarTransacciones.addActionListener(this::btnMostrarTransaccionesActionPerformed);
        jPanel2.add(btnMostrarTransacciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 195, -1));

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

    private void btnMostrarTransaccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTransaccionesActionPerformed
        Pnl_Vista_Principal.add(transacciones, "mostrarTransacciones");
        transacciones.recargarTablaTransacciones();
        vista.show(Pnl_Vista_Principal, "mostrarTransacciones");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btnMostrarTransaccionesActionPerformed


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
    private javax.swing.JButton btnMostrarTransacciones;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnRegistrarEmpleado;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JLabel iconoCliente;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nombreAdmin;
    // End of variables declaration//GEN-END:variables
 
}