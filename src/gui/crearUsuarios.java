/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controlador.ControladorUsuarios;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logica.Usuario;

/**
 *
 * @author Alexandra
 */
public class crearUsuarios extends javax.swing.JFrame {

    ControladorUsuarios controladorUsuarios;
    interfazAdministrador interfazAdmin;

    /**
     * Creates new form crearUsuarios
     */
    public crearUsuarios() {
        initComponents();
        controladorUsuarios = new ControladorUsuarios();
        interfazAdmin = new interfazAdministrador();
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

        radioUsuarios = new javax.swing.ButtonGroup();
        radioEstados = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        radioActivo = new javax.swing.JRadioButton();
        radioInactivo = new javax.swing.JRadioButton();
        apellidos = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        radioGerente = new javax.swing.JRadioButton();
        contrasenaNuevoUsuario = new javax.swing.JTextField();
        verificarContrasena = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        radioOperario = new javax.swing.JRadioButton();
        nombreUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tipo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        identificadorUsuario = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(490, 440));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Apellido Completos");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Verificar Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/xc.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 380, 60, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));
        getContentPane().add(nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 139, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Nombre completos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        estado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        estado.setText("Estados");
        getContentPane().add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Telefono");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        radioEstados.add(radioActivo);
        radioActivo.setText("Activo");
        getContentPane().add(radioActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, -1, -1));

        radioEstados.add(radioInactivo);
        radioInactivo.setText("Inactivo");
        radioInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioInactivoActionPerformed(evt);
            }
        });
        getContentPane().add(radioInactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, -1, -1));
        getContentPane().add(apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 138, -1));
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 138, -1));

        radioUsuarios.add(radioGerente);
        radioGerente.setText("Gerente");
        radioGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioGerenteActionPerformed(evt);
            }
        });
        getContentPane().add(radioGerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        contrasenaNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaNuevoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(contrasenaNuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 139, -1));
        getContentPane().add(verificarContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 139, -1));

        jButton1.setText("Crear Usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 120, -1));

        radioUsuarios.add(radioOperario);
        radioOperario.setText("Operario");
        radioOperario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioOperarioActionPerformed(evt);
            }
        });
        getContentPane().add(radioOperario, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 72, -1));
        getContentPane().add(nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 139, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Nombre de Usuario");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 130, -1));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 60, 60));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/xf.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 60, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/polaroid (1).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 120, 140));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/xd.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 60, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/xg.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 60, 70));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/xe.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 70, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/xh.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 60, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/xb.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 60, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/xxa.png"))); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 60, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/xc.png"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 60, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/xt.png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 60, 70));

        tipo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tipo.setText("Tipo de Usuario");
        getContentPane().add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Foto");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/xb.png"))); // NOI18N
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 60, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 204, 255));

        identificadorUsuario.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText(" Creacion de Usuario");

        jButton2.setBackground(new java.awt.Color(255, 255, 102));
        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(identificadorUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 71, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(identificadorUsuario)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jButton2))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/blueee.jpg"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 470, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioInactivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioInactivoActionPerformed

    private void radioGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioGerenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioGerenteActionPerformed

    private void radioOperarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioOperarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioOperarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Usuario u = new Usuario();

        // Validamos los datos
        if (validarDatos()) {
            u.setLogin(nombreUsuario.getText());
            if (radioGerente.isSelected()) {
                u.setTipo("gerente");
            } else if (radioOperario.isSelected()) {
                u.setTipo("operario");
            }
            u.setPassword(contrasenaNuevoUsuario.getText());
            u.setNombre(nombres.getText());
            u.setApellido(apellidos.getText());
            u.setTelefono(Long.parseLong(telefono.getText()));
            if (radioActivo.isSelected()) {
                u.setEstado("activo");
            } else if (radioInactivo.isSelected()) {
                u.setEstado("inactivo");
            }

            boolean seAgrego = controladorUsuarios.agregarUsuario(u);

            if (seAgrego) {
                Icon m = new ImageIcon(getClass().getResource("/gui/images/adduser.png"));
                JOptionPane.showMessageDialog(this, "Se agrego el usuario a la base de datos", "", JOptionPane.INFORMATION_MESSAGE, m);
                 limpiar();

            } else {
                JOptionPane.showMessageDialog(this, "Hubo un error al agregar", "", JOptionPane.ERROR_MESSAGE);
            }
        }
        //limpiardatos();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        interfazAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void contrasenaNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaNuevoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenaNuevoUsuarioActionPerformed
    private boolean isNumeric(String cadena) {
        try {
            Long.parseLong(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private boolean validarDatos() {

        boolean rest = true;
        
        if (nombreUsuario.getText().equals("")) {
            nombreUsuario.setBackground(Color.RED);
            rest = false;
        }
        if ((this.sololetras(nombreUsuario.getText())) || (this.sololetras(contrasenaNuevoUsuario.getText()))
                || (this.sololetras(nombres.getText())) || (this.sololetras(apellidos.getText()))) {
            Icon p = new ImageIcon(getClass().getResource("/gui/images/x.png"));
            JOptionPane.showMessageDialog(this, "Los campos no pueden tener caracteres especiales", "", JOptionPane.INFORMATION_MESSAGE, p);
           limpiar();
           
            rest = false;
            return rest;
        }
        
        if (!(radioGerente.isSelected() || radioOperario.isSelected())) {
            tipo.setForeground(Color.red);
            rest = false;
        }
        if (contrasenaNuevoUsuario.getText().equals("")) {
            contrasenaNuevoUsuario.setBackground(Color.RED);
            rest = false;
        }
        if (verificarContrasena.getText().equals("")) {
            verificarContrasena.setBackground(Color.RED);
            rest = false;
        }
        if(!(contrasenaNuevoUsuario.getText().equals(verificarContrasena.getText()))){
            contrasenaNuevoUsuario.setBackground(Color.RED);
            verificarContrasena.setBackground(Color.red);
            rest = false;
        }
        if (nombres.getText().equals("")) {
            nombres.setBackground(Color.RED);
        }
        if (apellidos.getText().equals("")) {
            apellidos.setBackground(Color.RED);
            rest = false;
        }
        if (telefono.getText().equals("")) {
            telefono.setBackground(Color.RED);
        }
        if (!(radioActivo.isSelected() || radioInactivo.isSelected())) {
            estado.setForeground(Color.red);
            rest = false;
        }
        if (controladorUsuarios.existeUsuario(nombreUsuario.getText())) {
            Icon p = new ImageIcon(getClass().getResource("/gui/images/x.png"));
            JOptionPane.showMessageDialog(this, "El usuario ya existe, digite otro por favor", "", JOptionPane.INFORMATION_MESSAGE, p);
               limpiar();
            rest = false;
            return rest;
        }
        
        if (!rest) {
            Icon p = new ImageIcon(getClass().getResource("/gui/images/x.png"));
            JOptionPane.showMessageDialog(this, "Por favor verifique la informacion", "", JOptionPane.INFORMATION_MESSAGE, p);
            contrasenaNuevoUsuario.setBackground(Color.WHITE);
            verificarContrasena.setBackground(Color.WHITE);   
            nombreUsuario.setBackground(Color.WHITE);
            nombres.setBackground(Color.WHITE);
            apellidos.setBackground(Color.WHITE);
            telefono.setBackground(Color.WHITE);
            tipo.setForeground(Color.BLACK);  
            estado.setForeground(Color.BLACK);
            return rest;
        }
        
        if (!isNumeric(telefono.getText())) {
            Icon p = new ImageIcon(getClass().getResource("/gui/images/phone.png"));
            telefono.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this, "El telefono debe ser un dato numerico", "", JOptionPane.INFORMATION_MESSAGE, p);
            rest = false;
            return rest;
        }

        
        return rest;

    }

    public static boolean sololetras(String prueba) {
        boolean result = false;
        String comparacion = "!!#$%&/()=?¡*¨][_:;°¬|@·~½¬{[]}~─µ";
        for (int i = prueba.length() - 1; i >= 0; i--) {
            for (int j = comparacion.length() - 1; j >= 0; j--) {
                if (prueba.charAt(i) == comparacion.charAt(j)) {
                    result = true;
                    return result;
                }
            }
        }
        return result;
    }
    public void limpiar(){
        
            nombreUsuario.setText("");
            contrasenaNuevoUsuario.setText("");
            verificarContrasena.setText("");
            nombres.setText("");
            apellidos.setText("");
            telefono.setText("");
            contrasenaNuevoUsuario.setBackground(Color.WHITE);
            verificarContrasena.setBackground(Color.WHITE);   
            nombreUsuario.setBackground(Color.WHITE);
            nombres.setBackground(Color.WHITE);
            apellidos.setBackground(Color.WHITE);
            telefono.setBackground(Color.WHITE);
            radioEstados.clearSelection();
            radioUsuarios.clearSelection();    
    }

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
            java.util.logging.Logger.getLogger(crearUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crearUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crearUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crearUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crearUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos;
    private javax.swing.JTextField contrasenaNuevoUsuario;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel identificadorUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField nombreUsuario;
    private javax.swing.JTextField nombres;
    private javax.swing.JRadioButton radioActivo;
    private javax.swing.ButtonGroup radioEstados;
    private javax.swing.JRadioButton radioGerente;
    private javax.swing.JRadioButton radioInactivo;
    private javax.swing.JRadioButton radioOperario;
    private javax.swing.ButtonGroup radioUsuarios;
    private javax.swing.JTextField telefono;
    private javax.swing.JLabel tipo;
    private javax.swing.JTextField verificarContrasena;
    // End of variables declaration//GEN-END:variables

}
