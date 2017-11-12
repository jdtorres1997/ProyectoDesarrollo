/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controlador.ControladorSedes;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logica.Sede;

/**
 *
 * @author Alexandra
 */
public class crearSedes extends javax.swing.JFrame {

    ControladorSedes controladorSedes;
    interfazGerente interfazGer;
  

    /**
     * Creates new form crearSedes
     */
    public crearSedes() {
        initComponents();
    this.setLocationRelativeTo(null);

        controladorSedes = new ControladorSedes();
        interfazGer= new interfazGerente();
        this.setLocationRelativeTo(null);
    
        //this.setResizable(false);

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioEstados = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jProgressBar1 = new javax.swing.JProgressBar();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel19 = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        radioInactiva = new javax.swing.JRadioButton();
        crearSede = new javax.swing.JButton();
        radioActiva = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        informacion = new javax.swing.JTextField();
        ubicacion = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jFormattedTextField1.setText("jFormattedTextField1");

        jLabel19.setText("jLabel19");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        estado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        estado.setText("Estado");
        getContentPane().add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, 10));

        radioEstados.add(radioInactiva);
        radioInactiva.setText("Inactiva");
        getContentPane().add(radioInactiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, 20));

        crearSede.setText("Crear Sede");
        crearSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearSedeActionPerformed(evt);
            }
        });
        getContentPane().add(crearSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 120, 30));

        radioEstados.add(radioActiva);
        radioActiva.setText("Activa");
        radioActiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioActivaActionPerformed(evt);
            }
        });
        getContentPane().add(radioActiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 60, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/skyline (1).png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/skyline (2).png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 60, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, 10));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/skyline (3).png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 50, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Identificacion");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Informacion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, 10));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/office-block.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 60, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/if_icons-08_799758 (1).png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/condominium.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 70, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Ubicacion");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, 10));

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText(" Creacion de Sede");

        jButton1.setBackground(new java.awt.Color(255, 255, 102));
        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 386, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/skyline (4).png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/b1.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/s1.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/skyline(6).png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 210, 220));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/skyline (2).png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 60, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/c (2).png"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 400, 70, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/appartment.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, -1, -1));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 180, -1));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 180, -1));
        getContentPane().add(informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 180, 60));

        ubicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubicacionActionPerformed(evt);
            }
        });
        getContentPane().add(ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 180, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/alrdededor.jpg"))); // NOI18N
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 580, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearSedeActionPerformed

        if(validar()){
            Sede s = new Sede();
            s.setIdentificacion(id.getText());
            s.setNombre(nombre.getText());
            s.setInformacion(informacion.getText());
            s.setUbicacion(ubicacion.getText());
            if(radioActiva.isSelected())
            s.setEstado("activa");
            else if (radioInactiva.isSelected())
            s.setEstado("inactiva");
            boolean seAgrego = controladorSedes.agregarSede(s);

            if(seAgrego){
                Icon m = new ImageIcon(getClass().getResource("/gui/images/cityscape.png"));
                JOptionPane.showMessageDialog(this, "Se agrego la sede a la base de datos","Mensaje",JOptionPane.INFORMATION_MESSAGE,m);
                limpiar();
            }else{
                Icon p = new ImageIcon(getClass().getResource("/gui/images/x.png"));
                JOptionPane.showMessageDialog(this, "Hubo un error al agregar sede ","",JOptionPane.INFORMATION_MESSAGE,p);
            }

        }
    }//GEN-LAST:event_crearSedeActionPerformed

    private void radioActivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioActivaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioActivaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        interfazGer.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ubicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ubicacionActionPerformed

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
            java.util.logging.Logger.getLogger(crearSedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crearSedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crearSedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crearSedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crearSedes().setVisible(true);
            }
        });
    }
    
    public boolean validar(){
        boolean rest=true;
        
        if (this.sololetras(id.getText())) {
            Icon p = new ImageIcon(getClass().getResource("/gui/images/x.png"));
            JOptionPane.showMessageDialog(this, "Nombre de usuario inválido", "", JOptionPane.INFORMATION_MESSAGE, p);
            rest = false;
            return rest;
        }
         if( sololetras(nombre.getText()) || sololetras(informacion.getText())
                 || sololetras(ubicacion.getText() )){
             
               Icon p = new ImageIcon(getClass().getResource("/gui/images/x.png"));
                JOptionPane.showMessageDialog(this, "Los espacios no deben tener caracteres especiales", "", JOptionPane.INFORMATION_MESSAGE, p);
                limpiar();
                rest=false;
                return rest;
            
         }
        
        if (id.getText().equals("")){
             id.setBackground(Color.red);
             rest=false;
        }
        if(nombre.getText().equals("")){
            nombre.setBackground(Color.red);
            rest=false;
        }
            
        if(informacion.getText().equals("")){
            informacion.setBackground(Color.red);
            rest=false;
        }
        if(ubicacion.getText().equals("")){
            ubicacion.setBackground(Color.red);
            rest=false;
        }
        if(!(radioActiva.isSelected() || radioInactiva.isSelected())){
            estado.setForeground(Color.RED);
            rest=false;
        }
        
        if(controladorSedes.existeSede(id.getText())){
            Icon p = new ImageIcon(getClass().getResource("/gui/images/x.png"));
            JOptionPane.showMessageDialog(this, "La sede ya existe, digite otra por favor","",JOptionPane.INFORMATION_MESSAGE,p);
            limpiar();
            
            rest = false;
            return rest;
        }
        
        if(!rest){
             Icon p = new ImageIcon(getClass().getResource("/gui/images/x.png"));
             JOptionPane.showMessageDialog(this, "Por favor verifique la informacion","",JOptionPane.INFORMATION_MESSAGE,p);
            id.setBackground(Color.WHITE);
            nombre.setBackground(Color.WHITE);
            informacion.setBackground(Color.WHITE);
            ubicacion.setBackground(Color.WHITE);
            estado.setForeground(Color.BLACK); 
        }
        return rest;
        
    }
    
    public static boolean sololetras(String prueba) {
        boolean result = false;
        String comparacion = "!!$%&/()=?¡*¨][_:;°¬|@·~½¬{[]}~µ";
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
             id.setBackground(Color.WHITE);
             nombre.setBackground(Color.WHITE);
             informacion.setBackground(Color.WHITE);
             ubicacion.setBackground(Color.WHITE);
             estado.setForeground(Color.BLACK);
              id.setText("");
              nombre.setText("");
              informacion.setText("");
              ubicacion.setText("");
              radioEstados.clearSelection();
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crearSede;
    private javax.swing.JLabel estado;
    private javax.swing.JTextField id;
    private javax.swing.JTextField informacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField nombre;
    private javax.swing.JRadioButton radioActiva;
    private javax.swing.ButtonGroup radioEstados;
    private javax.swing.JRadioButton radioInactiva;
    private javax.swing.JTextField ubicacion;
    // End of variables declaration//GEN-END:variables
}
