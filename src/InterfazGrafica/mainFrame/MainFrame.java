package InterfazGrafica.mainFrame;

import Banco.ClasesBase.*;
import Banco.GestorPrincipal.*;
import InterfazGrafica.panelAdmin.Pnl_Menu_Admin;
import InterfazGrafica.panelCliente.Pnl_Menu_Cliente;
import InterfazGrafica.panelEmpleado.Pnl_Menu_Empleado;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.*;


public class MainFrame extends javax.swing.JFrame {


    // Variables importantes para manejar los paneles
    private CardLayout cardLayout;
    private JPanel contenedorPrincipal;
    private Banco banco;
    private Pnl_Iniciar_Sesion panelLogin;

    public MainFrame(Banco banco) {
        this.banco = banco;
        initComponents();
        configurarVentana();
        inicializarPaneles();
    }

    private void configurarVentana() {
        setTitle("Banco Nacional Cerdita - Sistema de Gestión");
        setSize(1150, 700);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void inicializarPaneles() {
        cardLayout = new CardLayout();
        contenedorPrincipal = new JPanel(cardLayout);

        panelLogin = new Pnl_Iniciar_Sesion(banco);

        // IMPORTANTE: Configurar el callback ANTES de agregar el panel
        panelLogin.setLoginCallback(this::navegarSegunUsuario);

        contenedorPrincipal.add(panelLogin, "inicioSesion");

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(contenedorPrincipal, BorderLayout.CENTER);

        cardLayout.show(contenedorPrincipal, "inicioSesion");

        pack();
        setLocationRelativeTo(null);

        revalidate();
        repaint();
    }

    
    private void navegarSegunUsuario(Usuario usuario) {

        if (usuario instanceof Admin) {
            irAMenuAdmin(usuario);
        }
        
        else if (usuario instanceof Empleado) {
            irAMenuEmpleado(usuario);
        } 
        
        else if (usuario instanceof Cliente) {
            irAMenuCliente(usuario);
        }
        
        else {
            JOptionPane.showMessageDialog(this,
                "Error: Tipo de usuario no reconocido",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }

    }

    
    public void irAMenuCliente(Usuario usuario) {
        // Ir al panel del menú Cliente
        Pnl_Menu_Cliente menuCliente = new Pnl_Menu_Cliente(banco, usuario);
        contenedorPrincipal.add(menuCliente, "menuCliente");
        cardLayout.show(contenedorPrincipal, "menuCliente");
    }


    public void irAMenuEmpleado(Usuario usuario) {
        // Ir al panel del menú empleado
        Pnl_Menu_Empleado menuEmpleado = new Pnl_Menu_Empleado(banco, usuario);
        contenedorPrincipal.add(menuEmpleado, "menuEmpleado");
        cardLayout.show(contenedorPrincipal, "menuEmpleado");

    }

  
    
    public void irAMenuAdmin(Usuario usuario) {
        // Ir al panel del menú Admin
        Pnl_Menu_Admin memuAdmin = new Pnl_Menu_Admin(banco, usuario);
        contenedorPrincipal.add(memuAdmin, "menuAdministrador");
        cardLayout.show(contenedorPrincipal, "menuAdministrador");
        
    }

    
    public void volverALogin() {
        panelLogin = new Pnl_Iniciar_Sesion(banco);
        panelLogin.setLoginCallback(this::navegarSegunUsuario);
        contenedorPrincipal.add(panelLogin, "inicioSesion");
        cardLayout.show(contenedorPrincipal, "inicioSesion");
    }

    /*
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    */
    @SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code">
private void initComponents() {
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    // El layout se configura en inicializarPaneles()
}// </editor-fold>

    public static void main(String args[]) {
        Banco banco = new Banco();

        java.awt.EventQueue.invokeLater(() -> {
            MainFrame frame = new MainFrame(banco);
            frame.setVisible(true);
    });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
