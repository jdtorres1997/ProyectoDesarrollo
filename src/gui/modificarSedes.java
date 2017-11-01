/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controlador.ControladorSedes;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logica.Sede;

/**
 *
 * @author Alexandra
 */
public class modificarSedes extends javax.swing.JFrame {

    ControladorSedes controladorSede;
    interfazGerente interfazGer;
    /**
     * Creates new form modificarSedes
     */
    public modificarSedes() {
        initComponents();
        this.getContentPane().setBackground(Color.getHSBColor(50, 43, 10));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        interfazGer= new interfazGerente();
        controladorSede = new ControladorSedes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        estados = new javax.swing.ButtonGroup();
        nombre = new javax.swing.JTextField();
        informacion = new javax.swing.JTextField();
        ubicacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ide = new javax.swing.JTextField();
        radioActiva = new javax.swing.JRadioButton();
        radioInactiva = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Informacion");

        jLabel3.setText("Ubicacion");

        estado.setText("Estado");

        jButton1.setText("buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ideActionPerformed(evt);
            }
        });

        estados.add(radioActiva);
        radioActiva.setText("Actva");

        estados.add(radioInactiva);
        radioInactiva.setText("inactiva");

        jButton2.setText("Modificar Sede");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Identificacion");

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 204, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Modificar Sede");

        jButton3.setBackground(new java.awt.Color(255, 255, 102));
        jButton3.setText("Atras");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jButton3))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/contract.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/house.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/blueprint.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/check-mark.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(estado))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(ide, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(informacion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radioInactiva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, Short.MAX_VALUE)
                        .addComponent(radioActiva)
                        .addContainerGap(13, Short.MAX_VALUE))))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)
                        .addGap(16, 16, 16)
                        .addComponent(estado))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton1)
                        .addGap(7, 7, 7)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(informacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioInactiva)
                            .addComponent(radioActiva))
                        .addGap(7, 7, 7)
                        .addComponent(jButton2)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ideActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Sede s = new Sede();
      if(controladorSede.existeSede(ide.getText())){
            
            s=controladorSede.consultarSede(ide.getText());
            nombre.setText(s.getNombre());
            informacion.setText(s.getInformacion());
            ubicacion.setText(s.getUbicacion());
            if(s.getEstado().equals("activa"))
                 radioActiva.setSelected(true);
            else if (s.getEstado().equals("inactiva"))
                radioInactiva.setSelected(true);
      }
      else {
            JOptionPane.showMessageDialog(this, "La sede no existe, digite otra por favor");
              
      }
        
        


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    if(validar()){
        Sede s = new Sede();
        s.setIdentificacion(ide.getText());
        s.setNombre(nombre.getText());
        s.setInformacion(informacion.getText());
        s.setUbicacion(ubicacion.getText());
        if(radioActiva.isSelected())
            s.setEstado("activa");
        else if(radioInactiva.isSelected())
            s.setEstado("inactiva");
        
        boolean seModifico = controladorSede.modificarSede(s);
        
        if(seModifico){
            Icon m = new ImageIcon(getClass().getResource("/gui/images/cityscape.png"));
                JOptionPane.showMessageDialog(this, "Se modifico la sede en la base de datos","Mensaje",JOptionPane.INFORMATION_MESSAGE,m);
                ide.setText("");
                nombre.setText("");
                informacion.setText("");
                ubicacion.setText("");
                estados.clearSelection();
       }else{
           JOptionPane.showMessageDialog(this, "Hubo un error al modificarla sede");
        }
       
    }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        interfazGer.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
 public boolean validar(){
        boolean rest=true;
        
        if(!controladorSede.existeSede(ide.getText())){
            Icon p = new ImageIcon(getClass().getResource("/gui/images/x.png"));
            JOptionPane.showMessageDialog(this, "La sede a modificar no existe","",JOptionPane.INFORMATION_MESSAGE,p);
            rest = false;
        }
          if( sololetras(nombre.getText()) || sololetras(informacion.getText())
                 || sololetras(ubicacion.getText() )){
             
               Icon p = new ImageIcon(getClass().getResource("/gui/images/x.png"));
                JOptionPane.showMessageDialog(this, "Los espacios no deben tener caracteres especiales", "", JOptionPane.INFORMATION_MESSAGE, p);
                 ide.setText("");
                 nombre.setText("");
                informacion.setText("");
                ubicacion.setText("");
                 estados.clearSelection();
                rest=false;
                return rest;
            
         }
        if (ide.getText().equals("")){
             ide.setBackground(Color.red);
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
            estado.setBackground(Color.red);
            rest=false;
        }
       
        if(!rest){
             JOptionPane.showMessageDialog(this, "Por favor verifique la informacion");
             ide.setBackground(Color.WHITE);
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
            java.util.logging.Logger.getLogger(modificarSedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modificarSedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modificarSedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modificarSedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modificarSedes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel estado;
    private javax.swing.ButtonGroup estados;
    private javax.swing.JTextField ide;
    private javax.swing.JTextField informacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre;
    private javax.swing.JRadioButton radioActiva;
    private javax.swing.JRadioButton radioInactiva;
    private javax.swing.JTextField ubicacion;
    // End of variables declaration//GEN-END:variables
}
