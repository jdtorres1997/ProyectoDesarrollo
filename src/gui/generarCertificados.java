/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.itextpdf.text.DocumentException;
import controlador.ControladorCliente;
import controlador.ControladorEventos;
import controlador.ControladorReportes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author tovar
 */
public class generarCertificados extends javax.swing.JFrame {

    /**
     * Creates new form generarCertificados
     */
    ControladorCliente controladorCliente;
    ControladorEventos controladorEvento;
    String textoRutaInicial;
    public generarCertificados() {
        initComponents();
        controladorCliente = new ControladorCliente();
        controladorEvento = new ControladorEventos();
        actualizarCombo();
        textoRutaInicial = "Por favor seleccione una ruta para su archivo";
        ruta.setText(textoRutaInicial);
        limpiar();


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        idCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        botonActualizarEventos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        botonBuscarRuta = new javax.swing.JButton();
        ruta = new javax.swing.JLabel();
        comboEventos = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        nombreArchivo = new javax.swing.JTextField();
        botonGenerarCertificado = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        botonBuscarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Identificación Cliente:");

        jLabel2.setText("Identificación Evento:");

        botonActualizarEventos.setText("Actualizar Eventos");
        botonActualizarEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarEventosActionPerformed(evt);
            }
        });

        jLabel3.setText("Ruta del certificado:");

        botonBuscarRuta.setText("Buscar Ruta");
        botonBuscarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarRutaActionPerformed(evt);
            }
        });

        ruta.setText("Aqui se escribe la ruta");

        jLabel5.setText("Nombre del archivo:");

        nombreArchivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreArchivoKeyReleased(evt);
            }
        });

        botonGenerarCertificado.setText("Generar Certificado");
        botonGenerarCertificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerarCertificadoActionPerformed(evt);
            }
        });

        botonLimpiar.setText("LImpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        botonBuscarCliente.setText("Buscar Cliente");
        botonBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonLimpiar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ruta)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonGenerarCertificado)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(idCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(botonBuscarRuta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboEventos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nombreArchivo)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonActualizarEventos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(botonActualizarEventos)
                    .addComponent(comboEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(botonBuscarRuta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ruta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGenerarCertificado)
                    .addComponent(botonLimpiar))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActualizarEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarEventosActionPerformed
        // TODO add your handling code here:
        actualizarCombo();
    }//GEN-LAST:event_botonActualizarEventosActionPerformed

    private void botonBuscarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarRutaActionPerformed
        // TODO add your handling code here:
        JFileChooser filechooser = new JFileChooser();
        filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); //solo carpetas
        filechooser.setAcceptAllFileFilterUsed(false);
        if (filechooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            ruta.setText(filechooser.getSelectedFile().toString());
            nombreArchivo.setEditable(true);
            nombreArchivo.setEnabled(true);
            System.out.println("getCurrentDirectory(): " +  filechooser.getCurrentDirectory());
            System.out.println("getSelectedFile() : " +  filechooser.getSelectedFile());
        }else{
            System.out.println("No Selection ");
        }
    }//GEN-LAST:event_botonBuscarRutaActionPerformed

    private void nombreArchivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreArchivoKeyReleased
        // TODO add your handling code here:
        //validar nombre archivo aqui
        if(!nombreArchivo.getText().equals("")){
            botonGenerarCertificado.setEnabled(true);
        }else{
           botonGenerarCertificado.setEnabled(false);
        }
    }//GEN-LAST:event_nombreArchivoKeyReleased

    private void botonBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarClienteActionPerformed
        // TODO add your handling code here:
        if (!controladorCliente.existeCliente(idCliente.getText())) {
            JOptionPane.showMessageDialog(this, "El cliente no existe", "", JOptionPane.INFORMATION_MESSAGE);
        }else{
            idCliente.setEditable(false);
            idCliente.setEnabled(false);
            botonBuscarCliente.setEnabled(false);
            botonBuscarRuta.setEnabled(true);
            
        }
    }//GEN-LAST:event_botonBuscarClienteActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonGenerarCertificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerarCertificadoActionPerformed
        // TODO add your handling code here:
        ControladorReportes controladorReportes = new ControladorReportes();
        try {
            boolean res = controladorReportes.generarCertificado(idCliente.getText(),
                    comboEventos.getSelectedItem().toString(),
                    ruta.getText(),
                    nombreArchivo.getText());
            if(res==true){
                JOptionPane.showMessageDialog(this, "Se guardo correctamente el certificado", "", JOptionPane.INFORMATION_MESSAGE);
                
            }else{
                JOptionPane.showMessageDialog(this, "Hubo un error al crear el archivo, por favor comuniquese con los desarrolladores", "", JOptionPane.ERROR);
            }
            limpiar();
        } catch (IOException ex) {
            Logger.getLogger(generarCertificados.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Hubo un error al crear el archivo, por favor comuniquese con los desarrolladores", "", JOptionPane.ERROR);

        } catch (DocumentException ex) {
            Logger.getLogger(generarCertificados.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Hubo un error al crear el archivo, por favor comuniquese con los desarrolladores", "", JOptionPane.ERROR);
       
        }
    }//GEN-LAST:event_botonGenerarCertificadoActionPerformed

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
            java.util.logging.Logger.getLogger(generarCertificados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(generarCertificados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(generarCertificados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(generarCertificados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new generarCertificados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizarEventos;
    private javax.swing.JButton botonBuscarCliente;
    private javax.swing.JButton botonBuscarRuta;
    private javax.swing.JButton botonGenerarCertificado;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JComboBox<String> comboEventos;
    private javax.swing.JTextField idCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nombreArchivo;
    private javax.swing.JLabel ruta;
    // End of variables declaration//GEN-END:variables

    private void actualizarCombo() {
        comboEventos.removeAllItems();
        ArrayList<String> ve = new ArrayList<String>();
        ve = controladorEvento.retornar();

        for (int i = 0; i < ve.size(); i++) {

            String item;
            item = ve.get(i);
            comboEventos.addItem(item);
            item = "";
        }
    }

    private void limpiar() {
        
        botonBuscarRuta.setEnabled(false);
        ruta.setText(textoRutaInicial);
        nombreArchivo.setEditable(false);
        nombreArchivo.setEnabled(false);
        botonGenerarCertificado.setEnabled(false);
        botonBuscarCliente.setEnabled(true);
        idCliente.setText("");
        nombreArchivo.setText("");
        idCliente.setEditable(true);
        idCliente.setEnabled(true);
    }
}
