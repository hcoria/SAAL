/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.presentacion;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Byakuya
 */
public class VentanaModifcarCompañia extends javax.swing.JFrame {
    ControlRecargas controlRecargas1 = new ControlRecargas();
    listener listener1 = new listener();
    /**
     * Creates new form VentanaModifcarCompañia
     */
    public VentanaModifcarCompañia(ControlRecargas controlRecargas) {
        this.controlRecargas1=controlRecargas;
        addWindowListener(listener1);
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxNom = new javax.swing.JComboBox<>();
        jButtonVolver = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("Modificar compañia");

        jLabel3.setText("Nombre de la compañia");

        jComboBoxNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNomActionPerformed(evt);
            }
        });

        jButtonVolver.setText("Volver ");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonBuscar.setText("Aceptar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(28, 28, 28)
                                .addComponent(jComboBoxNom, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 9, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVolver)
                    .addComponent(jButtonBuscar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxNomActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        dispose();
        controlRecargas1.finalizaControlSecundario();

    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        String nom = (String) jComboBoxNom.getSelectedItem(); 
        controlRecargas1.modificarDatoscompañia(nom);
        dispose();
        
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
   /* public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaModifcarCompañia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaModifcarCompañia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaModifcarCompañia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaModifcarCompañia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaModifcarCompañia().setVisible(true);
            }
        });
    }*/
    public void cargaComboBox() throws SQLException{
        ArrayList<String> listacompañia=new ArrayList<String>();
        listacompañia=controlRecargas1.llenaComboBox();
        for(int j=0;j<listacompañia.size();j++){
            jComboBoxNom.addItem(listacompañia.get(j));
        System.out.println("La lista es: "+listacompañia);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox<String> jComboBoxNom;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
