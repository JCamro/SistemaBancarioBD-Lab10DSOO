package InterfazGrafica.mainFrame;

import Banco.ClasesBase.*;
import Banco.GestorPrincipal.Banco;

public class Pnl_Iniciar_Sesion extends javax.swing.JPanel {

    private Banco banco;
    private Usuario usuarioActual;

    private LoginCallback callback; // NUEVO
    public interface LoginCallback {
        void onLoginExitoso(Usuario usuario);
    }

    public Pnl_Iniciar_Sesion(Banco banco) {
        initComponents();
        this.banco = banco;
        this.usuarioActual = null;
    }

    public void setLoginCallback(LoginCallback callback) {
        this.callback = callback;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        iconoBanco = new javax.swing.JLabel();
        bancoLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        sesionLabel = new javax.swing.JLabel();
        cargoBox = new javax.swing.JComboBox<>();
        userField = new javax.swing.JTextField();
        passLabel = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        avisoError = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setMinimumSize(new java.awt.Dimension(650, 500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconoBanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/iconoBank.png"))); // NOI18N
        iconoBanco.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(iconoBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 70, 70));

        bancoLabel.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        bancoLabel.setForeground(new java.awt.Color(0, 0, 0));
        bancoLabel.setText("Banco Nacional Cerdita");
        jPanel2.add(bancoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        userLabel.setBackground(new java.awt.Color(255, 255, 255));
        userLabel.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        userLabel.setForeground(new java.awt.Color(0, 0, 0));
        userLabel.setText("Correo*");
        jPanel2.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        sesionLabel.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        sesionLabel.setForeground(new java.awt.Color(0, 0, 0));
        sesionLabel.setText("Iniciar Sesion");
        jPanel2.add(sesionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        cargoBox.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        cargoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Usuario", "Administrador", "Empleado", "Cliente" }));
        cargoBox.setBorder(null);
        cargoBox.addActionListener(this::cargoBoxActionPerformed);
        jPanel2.add(cargoBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 150, 30));

        userField.setBackground(new java.awt.Color(255, 255, 255));
        userField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        userField.setForeground(new java.awt.Color(0, 0, 0));
        userField.setBorder(null);
        userField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userFieldMousePressed(evt);
            }
        });
        userField.addActionListener(this::userFieldActionPerformed);
        jPanel2.add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 310, 30));

        passLabel.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        passLabel.setForeground(new java.awt.Color(0, 0, 0));
        passLabel.setText("Contraseña*");
        jPanel2.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        passField.setBackground(new java.awt.Color(255, 255, 255));
        passField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        passField.setForeground(new java.awt.Color(0, 0, 0));
        passField.setBorder(null);
        passField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passFieldMousePressed(evt);
            }
        });
        passField.addActionListener(this::passFieldActionPerformed);
        jPanel2.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 310, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 310, 10));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("INICIAR SESION");
        jButton1.addActionListener(this::jButton1ActionPerformed);
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 170, 40));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 310, 10));

        avisoError.setForeground(new java.awt.Color(153, 0, 0));
        avisoError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(avisoError, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 310, 20));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 510, 700));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/IconoPrincipal.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 390, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/logoNombre.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 390, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void cargoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargoBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargoBoxActionPerformed

    private void userFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userFieldMousePressed

    }//GEN-LAST:event_userFieldMousePressed

    private void userFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFieldActionPerformed

    }//GEN-LAST:event_userFieldActionPerformed

    private void passFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passFieldMousePressed

    }//GEN-LAST:event_passFieldMousePressed

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldActionPerformed

    private void limpiarEntrada() {
        userField.setText("");
        passField.setText("");
    }

    public Usuario getUsuario() {
        return usuarioActual;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        avisoError.setText("");

        String email = userField.getText().trim(); // TRIM para eliminar espacios
        String contraseña = new String(passField.getPassword());
        String cargo = (String) cargoBox.getSelectedItem();


        try {

            switch(cargo.toLowerCase()) { 
                case "administrador" -> {
                    usuarioActual = banco.autenticarAdministrador(email, contraseña);
                }

                case "empleado" -> {
                    usuarioActual = banco.autenticarEmpleado(email, contraseña);
                }

                case "cliente" -> {
                    usuarioActual = banco.autenticarCliente(email, contraseña);
                }

                default -> {
                    throw new Exception("Selecciona un Cargo");
                }
            }


            if (usuarioActual != null && callback != null) {
                callback.onLoginExitoso(usuarioActual);
            } 

        } catch(Exception e) {
            limpiarEntrada();
            avisoError.setText(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avisoError;
    private javax.swing.JLabel bancoLabel;
    private javax.swing.JComboBox<String> cargoBox;
    private javax.swing.JLabel iconoBanco;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel sesionLabel;
    private javax.swing.JTextField userField;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
