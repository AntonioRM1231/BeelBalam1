/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beelbalam1;

import javax.swing.JButton;

/**
 *
 * @author Itzel Cabrera
 */
public class PanelApp extends javax.swing.JPanel {

    /**
     * Creates new form PanelApp
     */
    PanelHistorial panelHistorial;
    PanelVerPerfil panelVerPerfil;
    PanelCompras2 panelCompras;
    
    public PanelApp() {
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

        btnVerPerfil = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        btnVerHistorial = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 153, 255));

        btnVerPerfil.setText("Ver Perfil");
        btnVerPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPerfilActionPerformed(evt);
            }
        });

        btnComprar.setText("Comprar Boleto");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        btnVerHistorial.setText("Ver Historial");
        btnVerHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerHistorialActionPerformed(evt);
            }
        });

        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btnVerPerfil)
                .addGap(46, 46, 46)
                .addComponent(btnComprar)
                .addGap(31, 31, 31)
                .addComponent(btnVerHistorial)
                .addGap(32, 32, 32)
                .addComponent(btnCerrarSesion)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerPerfil)
                    .addComponent(btnComprar)
                    .addComponent(btnVerHistorial)
                    .addComponent(btnCerrarSesion))
                .addContainerGap(151, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerHistorialActionPerformed
        //panelHistorial = new PanelHistorial();
        //panelHistorial.setBounds(this.getBounds());
        //this.removeAll();
        //this.add(panelHistorial);
        //this.updateUI();
    }//GEN-LAST:event_btnVerHistorialActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnVerPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPerfilActionPerformed

       // panelVerPerfil = new PanelVerPerfil();
        //panelVerPerfil.setBounds(this.getBounds());
        //this.removeAll();
        //this.add(panelVerPerfil);
        //this.updateUI();
    }//GEN-LAST:event_btnVerPerfilActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        //panelCompras = new PanelCompras2();
        //panelCompras.setBounds(this.getBounds());
        //this.removeAll();
        //this.add(panelCompras);
        //this.updateUI();
    }//GEN-LAST:event_btnComprarActionPerformed

        // TODO add your handling code here:
    }                                            


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnVerHistorial;
    private javax.swing.JButton btnVerPerfil;
    // End of variables declaration//GEN-END:variables
}
