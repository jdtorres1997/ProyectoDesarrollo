package gui;

import controlador.ControladorUsuarios;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import logica.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jdtorres
 */
public class interfaz extends javax.swing.JFrame {

    interfazAdministrador ventanaAdministrador;
    interfazGerente ventanaGerente;
    interfazOperario ventanaOperario;

    ControladorUsuarios controladorUsuarios;

    /**
     * Creates new form interfaz
     */
    public interfaz() {
        initComponents();
        panelFondo.setBackground(Color.WHITE);

        controladorUsuarios = new ControladorUsuarios();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        tipos = new javax.swing.ButtonGroup();
        panelFondo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonEntrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        login = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        selectOper = new javax.swing.JRadioButton();
        selectGerente = new javax.swing.JRadioButton();
        selectAdmin = new javax.swing.JRadioButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.red);
        setForeground(java.awt.Color.red);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/if_user_115781.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/if_key_172487.png"))); // NOI18N

        botonEntrar.setBackground(new java.awt.Color(255, 51, 102));
        botonEntrar.setText("Entrar");
        botonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEntrarActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/InterfazFondo.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/A+.png"))); // NOI18N

        login.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Contraseña");

        selectOper.setBackground(new java.awt.Color(229, 228, 227));
        tipos.add(selectOper);
        selectOper.setText("operario");
        selectOper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectOperActionPerformed(evt);
            }
        });

        selectGerente.setBackground(new java.awt.Color(229, 228, 227));
        tipos.add(selectGerente);
        selectGerente.setText("gerente");
        selectGerente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));
        selectGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectGerenteActionPerformed(evt);
            }
        });

        selectAdmin.setBackground(new java.awt.Color(229, 228, 227));
        tipos.add(selectAdmin);
        selectAdmin.setText("administrador");
        selectAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(selectAdmin)
                .addGap(39, 39, 39)
                .addComponent(selectOper))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(selectGerente))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(jLabel5))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel2))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(botonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel7)
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(8, 8, 8)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3))
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectAdmin)
                            .addComponent(selectOper)))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(selectGerente))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jLabel5))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(botonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        botonEntrar.getAccessibleContext().setAccessibleName("botonEntrar");
        botonEntrar.getAccessibleContext().setAccessibleDescription("");
        login.getAccessibleContext().setAccessibleName("nombreTexto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectAdminActionPerformed

    private void selectGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectGerenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectGerenteActionPerformed

    private void selectOperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectOperActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectOperActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void botonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEntrarActionPerformed
        //boton que indica el login

        String nombre = login.getText();
        String contraseña = new String(password.getText());
        String tipoO = selectOper.getText();
        String tipoG = selectGerente.getText();
        String tipoA = selectAdmin.getText();

        Usuario u = new Usuario();

        u = controladorUsuarios.consultarUsuario(nombre);

        String usuarioCorrecto = u.getLogin();
        String contraseñaCorrecta = u.getPassword();

        if (nombre.equals(usuarioCorrecto) && contraseña.equals(contraseñaCorrecta) && (
            u.getTipo().equals(tipoO) && selectOper.isSelected() || u.getTipo().equals(tipoA) && selectAdmin.isSelected() || u.getTipo().equals(tipoG)&& selectGerente.isSelected()) ) { //Valida que el usuario y contraseña sean correctos.
        if (u.getEstado().equals("activo")) { //valida que el usuario ingresado se encuentra activo.
            if (u.getTipo().equals("administrador") ) {

                ventanaAdministrador = new interfazAdministrador(u);
                ventanaAdministrador.setVisible(true);
            } else {
                if (u.getTipo().equals("gerente") ) {
                    ventanaGerente = new interfazGerente(u);
                    ventanaGerente.setVisible(true);
                } else {
                    if (u.getTipo().equals("operario") ) {
                        ventanaOperario = new interfazOperario(u);
                        ventanaOperario.setVisible(true);
                    }
                }
            }
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no activo");
            login.setText(null);

        }

        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
            login.setText(null);
            password.setText(null);

        }
    }//GEN-LAST:event_botonEntrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEntrar;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField login;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPasswordField password;
    private javax.swing.JRadioButton selectAdmin;
    private javax.swing.JRadioButton selectGerente;
    private javax.swing.JRadioButton selectOper;
    private javax.swing.ButtonGroup tipos;
    // End of variables declaration//GEN-END:variables
}
