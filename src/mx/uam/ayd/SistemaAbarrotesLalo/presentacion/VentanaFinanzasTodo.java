/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.presentacion;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Reporte;

/**
 *
 * @author alumnocbi
 */
public class VentanaFinanzasTodo extends javax.swing.JFrame {
 ControlVentas controlVenta1=new ControlVentas();
 listener listener1= new listener();
 ControlReporte controlReporte1= new ControlReporte();
    /**
     * Creates new form VentanaFinanzas
     * @param controlVenta1
     */
    public VentanaFinanzasTodo(ControlVentas controlVenta1) {
        this.controlVenta1=controlVenta1;   
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

        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButtonVolverAlMenu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxPeriodoTiempo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldVentas = new javax.swing.JTextField();
        jComboBoxDatos = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNumeroRecargas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCompañiaMax = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldCompañiaMin = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNumeroVentas = new javax.swing.JTextField();
        jLabelMensaje = new javax.swing.JLabel();
        jTextFieldMontoPasado = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldPorcentajeCrecimiento = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel6.setText("Número de ventas");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButtonVolverAlMenu.setText("Volver al menú");
        jButtonVolverAlMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverAlMenuActionPerformed(evt);
            }
        });

        jLabel2.setText("¿Qué datos deseas consultar? ");

        jLabel3.setText("Periodo de tiempo");

        jComboBoxPeriodoTiempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "Mes", "Año" }));
        jComboBoxPeriodoTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPeriodoTiempoActionPerformed(evt);
            }
        });

        jLabel5.setText("M.N");

        jTextFieldVentas.setEditable(false);

        jComboBoxDatos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todo", "Productos", "Recargas" }));
        jComboBoxDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDatosActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 0, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setText("Finanzas");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setText("Número de recargas");

        jTextFieldNumeroRecargas.setEditable(false);

        jLabel1.setText("Compañia con mas ventas");

        jTextFieldCompañiaMax.setEditable(false);

        jLabel9.setText("Compañia con menos ventas");

        jTextFieldCompañiaMin.setEditable(false);
        jTextFieldCompañiaMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCompañiaMinActionPerformed(evt);
            }
        });

        jLabel7.setText("Número de ventas");

        jTextFieldNumeroVentas.setEditable(false);

        jLabelMensaje.setText("Las ganacias de ayer fueron");

        jTextFieldMontoPasado.setEditable(false);

        jLabel13.setText("Las ganacias han aumentado");

        jTextFieldPorcentajeCrecimiento.setEditable(false);

        jLabel14.setText("%");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel9))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldNumeroRecargas)
                                .addComponent(jTextFieldCompañiaMax)
                                .addComponent(jTextFieldCompañiaMin, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldNumeroVentas)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelMensaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldMontoPasado, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPorcentajeCrecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldNumeroRecargas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCompañiaMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldCompañiaMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldNumeroVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMensaje)
                    .addComponent(jTextFieldPorcentajeCrecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldMontoPasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel12.setText("Ganancias");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxPeriodoTiempo, 0, 87, Short.MAX_VALUE)
                                    .addComponent(jComboBoxDatos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonVolverAlMenu)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel8)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxPeriodoTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jButtonVolverAlMenu)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverAlMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverAlMenuActionPerformed
     dispose();
        controlVenta1.finalizaControl();
    }//GEN-LAST:event_jButtonVolverAlMenuActionPerformed

    private void jComboBoxDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDatosActionPerformed
        String seleccion = jComboBoxDatos.getSelectedItem().toString();
        
        if (seleccion.equals("Productos")) {
            dispose();
            try {
                controlVenta1.consultarProductos("Dia");
            } catch (SQLException ex) {
                Logger.getLogger(VentanaFinanzasTodo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (seleccion.equals("Recargas")) {
            dispose();
            try {
                controlVenta1.consultarRecargas("Dia");
            } catch (SQLException ex) {
                Logger.getLogger(VentanaFinanzasTodo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jComboBoxDatosActionPerformed

    private void jComboBoxPeriodoTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPeriodoTiempoActionPerformed
        Reporte reporte1;
        String seleccion=jComboBoxPeriodoTiempo.getSelectedItem().toString();
    try {        
        reporte1= controlReporte1.consultarTodo(seleccion);
        llenaCampos(reporte1);
    } catch (SQLException ex) {
        Logger.getLogger(VentanaFinanzasRecargas.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jComboBoxPeriodoTiempoActionPerformed

    private void jTextFieldCompañiaMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCompañiaMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCompañiaMinActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaFinanzasTodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaFinanzasTodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaFinanzasTodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaFinanzasTodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        new VentanaFinanzasTodo().setVisible(true);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        new VentanaFinanzasTodo().setVisible(true);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        new VentanaFinanzasTodo().setVisible(true);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        new VentanaFinanzasTodo().setVisible(true);
        }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVolverAlMenu;
    private javax.swing.JComboBox<String> jComboBoxDatos;
    private javax.swing.JComboBox<String> jComboBoxPeriodoTiempo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelMensaje;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextFieldCompañiaMax;
    private javax.swing.JTextField jTextFieldCompañiaMin;
    private javax.swing.JTextField jTextFieldMontoPasado;
    private javax.swing.JTextField jTextFieldNumeroRecargas;
    private javax.swing.JTextField jTextFieldNumeroVentas;
    private javax.swing.JTextField jTextFieldPorcentajeCrecimiento;
    private javax.swing.JTextField jTextFieldVentas;
    // End of variables declaration//GEN-END:variables

   /**
     * LLena las celdas de texto de la ventana con la informacion correspondiente
     * @param Reporte
     */
    void llenaCampos(Reporte reporte1) {
         String periodo;  
      double montoP=0, montoA=0, crecimiento=0; 
       double ganancia= reporte1.getGananciaRecargas()+ reporte1.getGananciaProductos();
        jTextFieldVentas.setText(String.valueOf(ganancia));
       jTextFieldNumeroVentas.setText(String.valueOf(reporte1.getNumProductosVendidos()));    
       jTextFieldNumeroRecargas.setText(String.valueOf(reporte1.getNumRecargas()));
       jTextFieldCompañiaMax.setText(String.valueOf(reporte1.getCompañiaMax()));
       jTextFieldCompañiaMin.setText(String.valueOf(reporte1.getCompañiaMin()));
        periodo= jComboBoxPeriodoTiempo.getSelectedItem().toString();   
       if(periodo.equals("Mes")){           
        jLabelMensaje.setText("Las ganacias del mes pasado fueron");
       }
       if(periodo.equals("Año")){           
       jLabelMensaje.setText("Las ganacias del año pasado fueron");   
       }
       montoP=reporte1.getGanaciaPasada()+reporte1.getGananciaPasadaR();
         montoA=ganancia;
        jTextFieldMontoPasado.setText(String.valueOf(montoP));
         if(montoA!=0){            
       crecimiento= ((montoA-montoP)/montoA)*100;  
       }   
        jTextFieldPorcentajeCrecimiento.setText(String.valueOf(String.format("%.2f", crecimiento))); 
    }
}
