/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.presentacion;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *Esta clase define todos los elementos contenidos dentro de la ventana principal
 * @author Alfa-Omega
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    ControlPrincipal controlPrincipal1= new ControlPrincipal();
    /**
     * constructor que crea una relacion bilateral entre ventana principal y control
     * principal
     */
    public VentanaPrincipal(ControlPrincipal controlPrincipal) {
         controlPrincipal1=controlPrincipal;
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

        jDialog1 = new javax.swing.JDialog();
        JButtonConsultar = new javax.swing.JButton();
        JButtonAgregar = new javax.swing.JButton();
        JButtonModificar = new javax.swing.JButton();
        JButtonFinanzas = new javax.swing.JButton();
        JButtonVenta = new javax.swing.JButton();
        JButtonProveedor = new javax.swing.JButton();
        JButtonInventario = new javax.swing.JButton();
        JButtonRecarga = new javax.swing.JButton();
        JButtonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonCliente = new javax.swing.JButton();
        cerrarSesion = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Administrador de Abarrotes Lalo");
        setForeground(java.awt.Color.white);
        setSize(new java.awt.Dimension(724, 325));

        JButtonConsultar.setIcon(new javax.swing.ImageIcon("/media/jorge/Archivos/Proyectos/netbeans/SAAL/src/Imagen/coin-of-dollar.png")); // NOI18N
        JButtonConsultar.setText("Consulta de precios");
        JButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonConsultarActionPerformed(evt);
            }
        });

        JButtonAgregar.setIcon(new javax.swing.ImageIcon("/media/jorge/Archivos/Proyectos/netbeans/SAAL/src/Imagen/agregar.png")); // NOI18N
        JButtonAgregar.setText("Agregar producto");
        JButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAgregarActionPerformed(evt);
            }
        });

        JButtonModificar.setIcon(new javax.swing.ImageIcon("/media/jorge/Archivos/Proyectos/netbeans/SAAL/src/Imagen/modificar.png")); // NOI18N
        JButtonModificar.setText("Modificar datos del producto");
        JButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonModificarActionPerformed(evt);
            }
        });

        JButtonFinanzas.setIcon(new javax.swing.ImageIcon("/media/jorge/Archivos/Proyectos/netbeans/SAAL/src/Imagen/finanzas.png")); // NOI18N
        JButtonFinanzas.setText("Finanzas");
        JButtonFinanzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonFinanzasActionPerformed(evt);
            }
        });

        JButtonVenta.setBackground(new java.awt.Color(255, 0, 0));
        JButtonVenta.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        JButtonVenta.setIcon(new javax.swing.ImageIcon("/media/jorge/Archivos/Proyectos/netbeans/SAAL/src/Imagen/venta.png")); // NOI18N
        JButtonVenta.setText("Ventas");
        JButtonVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonVentaActionPerformed(evt);
            }
        });

        JButtonProveedor.setIcon(new javax.swing.ImageIcon("/media/jorge/Archivos/Proyectos/netbeans/SAAL/src/Imagen/proveedor.png")); // NOI18N
        JButtonProveedor.setText("Lista de proveedores");
        JButtonProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonProveedorActionPerformed(evt);
            }
        });

        JButtonInventario.setIcon(new javax.swing.ImageIcon("/media/jorge/Archivos/Proyectos/netbeans/SAAL/src/Imagen/inventario.png")); // NOI18N
        JButtonInventario.setText("Inventario");
        JButtonInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonInventarioActionPerformed(evt);
            }
        });

        JButtonRecarga.setIcon(new javax.swing.ImageIcon("/media/jorge/Archivos/Proyectos/netbeans/SAAL/src/Imagen/smartphone-call.png")); // NOI18N
        JButtonRecarga.setText("Recargas telefónicas");
        JButtonRecarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonRecargaActionPerformed(evt);
            }
        });

        JButtonSalir.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        JButtonSalir.setIcon(new javax.swing.ImageIcon("/media/jorge/Archivos/Proyectos/netbeans/SAAL/src/Imagen/cancel.png")); // NOI18N
        JButtonSalir.setText("Salir");
        JButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 2, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("S.A.A.L");

        jLabel3.setIcon(new javax.swing.ImageIcon("/media/jorge/Archivos/Proyectos/netbeans/SAAL/src/Imagen/Tiendaonline.png")); // NOI18N

        jButtonCliente.setText("Cliente");
        jButtonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClienteActionPerformed(evt);
            }
        });

        cerrarSesion.setText("Cambiar de Usuario");
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(483, 483, 483)
                .addComponent(JButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(483, 483, 483)
                .addComponent(JButtonProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(JButtonInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(JButtonVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(JButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(JButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(JButtonFinanzas, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(JButtonRecarga, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(483, 483, 483)
                .addComponent(JButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cerrarSesion))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(JButtonVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(JButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(JButtonRecarga, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(JButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cerrarSesion)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(JButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(JButtonProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(JButtonInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(JButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(JButtonFinanzas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void JButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonConsultarActionPerformed
        dispose();      
       controlPrincipal1.cosultarPrecios();
    }//GEN-LAST:event_JButtonConsultarActionPerformed

    private void JButtonFinanzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonFinanzasActionPerformed
        dispose();      
       controlPrincipal1.consultarVenta();
    }//GEN-LAST:event_JButtonFinanzasActionPerformed

    private void JButtonInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonInventarioActionPerformed
       dispose();          
        try {
            controlPrincipal1.revisarInventario();
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JButtonInventarioActionPerformed

    private void JButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAgregarActionPerformed
         dispose();
        controlPrincipal1.agregarProducto();
              
    }//GEN-LAST:event_JButtonAgregarActionPerformed
 
    private void JButtonVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonVentaActionPerformed
      dispose();          
      controlPrincipal1.realizarVenta();
    }//GEN-LAST:event_JButtonVentaActionPerformed

    private void JButtonRecargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonRecargaActionPerformed
       dispose();         
       controlPrincipal1.realizarRecarga();
    }//GEN-LAST:event_JButtonRecargaActionPerformed

    private void JButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonModificarActionPerformed
        dispose();          
        try {
            controlPrincipal1.modificarProducto();
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JButtonModificarActionPerformed

    private void JButtonProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonProveedorActionPerformed
       dispose();      
       controlPrincipal1.revisarProveedor();
    }//GEN-LAST:event_JButtonProveedorActionPerformed

    private void JButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JButtonSalirActionPerformed

    private void jButtonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClienteActionPerformed
      dispose();        
      controlPrincipal1.revisarCliente();
    }//GEN-LAST:event_jButtonClienteActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        // TODO add your handling code here:
        dispose();
        controlPrincipal1.cerrarSesion();
    }//GEN-LAST:event_cerrarSesionActionPerformed

    
   
    
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        new VentanaPrincipal().setVisible(true);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        new VentanaPrincipal().setVisible(true);
        }
        });*/
    }
    /*void inicia() {
    setVisible(true);
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonAgregar;
    private javax.swing.JButton JButtonConsultar;
    private javax.swing.JButton JButtonFinanzas;
    private javax.swing.JButton JButtonInventario;
    private javax.swing.JButton JButtonModificar;
    private javax.swing.JButton JButtonProveedor;
    private javax.swing.JButton JButtonRecarga;
    private javax.swing.JButton JButtonSalir;
    private javax.swing.JButton JButtonVenta;
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JButton jButtonCliente;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    
}
class listener implements WindowListener{

    @Override
    public void windowOpened(WindowEvent we) {
        System.out.print("");  
    }

    @Override
    public void windowClosing(WindowEvent we) {
        ControlPrincipal controlPrincipal1=new ControlPrincipal();
        controlPrincipal1.iniciaControl();
    }

    @Override
    public void windowClosed(WindowEvent we) {
      System.out.print(""); 
    }

    @Override
    public void windowIconified(WindowEvent we) {
     System.out.print("");   
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
     System.out.print("");   
    }

    @Override
    public void windowActivated(WindowEvent we) {
    System.out.print("");   
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
       System.out.print(""); 
    }
    
}