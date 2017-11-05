
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
public class interfazModificarUsuarios extends javax.swing.JFrame {
    ControladorUsuarios controladorUsuarios;
    interfazAdministrador interfazAdmin;

    /**
     * Creates new form crearUsuarios
     */
    public interfazModificarUsuarios() {
        initComponents();
        this.getContentPane().setBackground(Color.getHSBColor(316, 100, 10));
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

        jRadioButton2 = new javax.swing.JRadioButton();
        radioUsuarios = new javax.swing.ButtonGroup();
        radioEstados = new javax.swing.ButtonGroup();
        jLabel12 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        tipo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JTextField();
        nombres = new javax.swing.JTextField();
        apellidos = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        radioGerente = new javax.swing.JRadioButton();
        radioOperario = new javax.swing.JRadioButton();
        radioActivo = new javax.swing.JRadioButton();
        radioInactivo = new javax.swing.JRadioButton();
        modificar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jRadioButton2.setText("jRadioButton2");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Modificar Usuarios");

        jCheckBox1.setText("jCheckBox1");

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
        setMaximumSize(new java.awt.Dimension(520, 380));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nombre de usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        tipo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tipo.setText("Tipo de usuario:");
        getContentPane().add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Nombres completos:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Apellidos completos:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Telefono:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        estado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        estado.setText("Estado:");
        getContentPane().add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        nombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 150, -1));

        nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombresActionPerformed(evt);
            }
        });
        getContentPane().add(nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 150, -1));
        getContentPane().add(apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 150, -1));
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 150, -1));

        radioUsuarios.add(radioGerente);
        radioGerente.setText("Gerente");
        getContentPane().add(radioGerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        radioUsuarios.add(radioOperario);
        radioOperario.setText("Operario");
        radioOperario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioOperarioActionPerformed(evt);
            }
        });
        getContentPane().add(radioOperario, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        radioEstados.add(radioActivo);
        radioActivo.setText("Activo");
        getContentPane().add(radioActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        radioEstados.add(radioInactivo);
        radioInactivo.setText("Inactivo");
        radioInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioInactivoActionPerformed(evt);
            }
        });
        getContentPane().add(radioInactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, -1, -1));

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        getContentPane().add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 90, -1));

        jButton2.setText("buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/user.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/user (7).png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/user (4).png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/user (1).png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, 73));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/user (5).png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 108, 70));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/user (2).png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 70, 80));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/colorful.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel14.setMinimumSize(new java.awt.Dimension(520, 380));
        jLabel14.setPreferredSize(new java.awt.Dimension(520, 380));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 520, 350));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("Modificar Usuario");

        jButton1.setBackground(new java.awt.Color(255, 255, 102));
        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 303, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombresActionPerformed

    private void radioOperarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioOperarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioOperarioActionPerformed

    private void radioInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioInactivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioInactivoActionPerformed

    private void nombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreUsuarioActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
       Usuario u = new Usuario();
       
       // Validamos que exista el usuario
        if (controladorUsuarios.existeUsuario(nombreUsuario.getText())){
            
            if(validarDatos()){
                 u.setLogin(nombreUsuario.getText());
                 if(radioGerente.isSelected())
                      u.setTipo("gerente");
                 else if (radioOperario.isSelected())
                     u.setTipo("operario");
                 u.setNombre(nombres.getText());
                 u.setApellido(apellidos.getText());
                 u.setTelefono( Long.parseLong(telefono.getText()));
                 if(radioActivo.isSelected())
                      u.setEstado("activo");
                 else if (radioInactivo.isSelected())
                     u.setEstado("inactivo");

                 boolean seModifico = controladorUsuarios.modificarUsuario(u);

                 if(seModifico){
                     JOptionPane.showMessageDialog(this, "Se modifico  la base de datos");
                      limpiar();

                 }else{
                      Icon p = new ImageIcon(getClass().getResource("/gui/images/x.png"));
                     JOptionPane.showMessageDialog(this, "Hubo un error al modificar","",JOptionPane.INFORMATION_MESSAGE,p);
                 }
            }

        }else{
            Icon p = new ImageIcon(getClass().getResource("/gui/images/wrongUser.png"));
            JOptionPane.showMessageDialog(this, "El usuario no existe, digite otro por favor","",JOptionPane.INFORMATION_MESSAGE,p);
              limpiar();
              
        }

    }//GEN-LAST:event_modificarActionPerformed
  private  boolean isNumeric(String cadena){
	try {
		Long.parseLong(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
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
    private boolean validarDatos() {
        boolean rest=true;
        if(nombreUsuario.getText().equals("")){
            nombreUsuario.setBackground(Color.RED);
            rest=false;
        }
        if(nombreUsuario.getText().equals(("admin"))){
            JOptionPane.showMessageDialog(this, "No se puede inactivar","",JOptionPane.INFORMATION_MESSAGE);
            rest=false;
            return rest;
        }
        if(!(radioGerente.isSelected() || radioOperario.isSelected())){
            tipo.setBackground(Color.red);
            rest=false;
        }
         if ((this.sololetras(nombres.getText())) || (this.sololetras(apellidos.getText())))
                {
            Icon p = new ImageIcon(getClass().getResource("/gui/images/x.png"));
            JOptionPane.showMessageDialog(this, "Los espacios no deben tener caracteres especiales", "", JOptionPane.INFORMATION_MESSAGE, p);
            limpiar();
            rest = false;
            return rest;
        }

        if(nombres.getText().equals("")){
            nombres.setBackground(Color.RED);
            rest=false;
        }
        if(apellidos.getText().equals("")){
            apellidos.setBackground(Color.RED);
            rest=false;
        }
        if(telefono.getText().equals("")){
            telefono.setBackground(Color.RED);
            rest=false;
        }
        if(!(radioActivo.isSelected() || radioInactivo.isSelected())){
            estado.setBackground(Color.red);
            rest=false;
        }
        if(!rest){
             Icon p = new ImageIcon(getClass().getResource("/gui/images/x.png"));
             JOptionPane.showMessageDialog(this, "Por favor verifique la informacion","",JOptionPane.INFORMATION_MESSAGE,p);
             nombreUsuario.setBackground(Color.WHITE);
              tipo.setForeground(Color.BLACK);
             nombres.setBackground(Color.WHITE);
             apellidos.setBackground(Color.WHITE);
             estado.setForeground(Color.BLACK);
             telefono.setBackground(Color.WHITE); 
             return rest;
        }
        if(!isNumeric(telefono.getText())){
            Icon p = new ImageIcon(getClass().getResource("/gui/images/phone.png"));
            JOptionPane.showMessageDialog(this, "El telefono debe ser un dato numerico y no estar en blanco","",JOptionPane.INFORMATION_MESSAGE,p);
            rest=false;
            return rest;
        }
      
        
        return rest;
        
        
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String nombre = nombreUsuario.getText();

       if(controladorUsuarios.existeUsuario(nombre)){
              Usuario u = new Usuario();
        
        u = controladorUsuarios.consultarUsuario(nombre);  
        nombres.setText(u.getNombre());
        apellidos.setText(u.getApellido());
        telefono.setText(Long.toString(u.getTelefono()));
        if(u.getEstado().equals("activo"))
            radioActivo.setSelected(true);
        else if(u.getEstado().equals("inactivo"))
            radioInactivo.setSelected(true);
         if (u.getTipo().equals("gerente"))
             radioGerente.setSelected(true);
         else if(u.getTipo().equals("operario"))
             radioOperario.setSelected(true);
         
       }
      else {
            Icon p = new ImageIcon(getClass().getResource("/gui/images/wrongUser.png"));
            JOptionPane.showMessageDialog(this, "El usuario no existe, digite otro por favor","",JOptionPane.INFORMATION_MESSAGE,p);
            limpiar();  
      }
            


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    interfazAdmin.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    public void limpiar(){
        nombreUsuario.setText("");
        nombres.setText("");           
        apellidos.setText("");
        telefono.setText("");
        radioEstados.clearSelection();
        radioUsuarios.clearSelection();
        nombreUsuario.setBackground(Color.WHITE);
        tipo.setForeground(Color.BLACK);
        nombres.setBackground(Color.WHITE);
        apellidos.setBackground(Color.WHITE);
        estado.setForeground(Color.BLACK);
        telefono.setBackground(Color.WHITE); 
                       
        
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
            java.util.logging.Logger.getLogger(interfazModificarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazModificarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazModificarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazModificarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazModificarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos;
    private javax.swing.JLabel estado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JButton modificar;
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
    // End of variables declaration//GEN-END:variables

   
}
