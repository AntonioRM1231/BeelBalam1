/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beelbalam1;

import java.awt.event.ItemEvent;
import javax.swing.*;

/**
 *
 * @author Anahi SC
 */
public class PanelCompras2 extends javax.swing.JPanel {

    ComboBoxModel EnumS;
    ComboBoxModel EnumF;
    
    public PanelCompras2() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbEstIni = new javax.swing.JComboBox<>();
        cbEstFin = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtNombrePasaj = new javax.swing.JTextField();
        txtPaternoPasaj = new javax.swing.JTextField();
        txtMaternoPasaj = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEdadPasaj = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbNacionalidad = new javax.swing.JComboBox<>();
        btnRealizarCompra = new javax.swing.JButton();
        cbTramo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setText("TRAMO:");

        jLabel2.setText("ESTACIÓN INICIAL:");

        jLabel3.setText("ESTACIÓN FINAL:");

        cbEstFin.setToolTipText("");

        jLabel4.setText("NOMBRE PASAJERO:");

        jLabel5.setText("             NOMBRE/S                             AP. PATERNO                                         AP. MATERNO");

        jLabel6.setText("EDAD:");

        jLabel7.setText("NACIONALIDAD:");

        cbNacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALEMANA", "CHINA", "MEXICANA", " " }));
        cbNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNacionalidadActionPerformed(evt);
            }
        });

        btnRealizarCompra.setText("REALIZAR COMPRA");

        cbTramo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "SELVA 1", "SELVA 2", "GOLFO 1", "GOLFO 2", "CARIBE 1", "CARIBE 2" }));
        cbTramo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTramoItemStateChanged(evt);
            }
        });
        cbTramo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTramoActionPerformed(evt);
            }
        });

        jLabel8.setText("BIENVENIDO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(249, 249, 249))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(cbTramo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbEstIni, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbEstFin, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEdadPasaj, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombrePasaj, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPaternoPasaj, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMaternoPasaj, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109)
                                .addComponent(btnRealizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTramo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEstIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEstFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombrePasaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPaternoPasaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaternoPasaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdadPasaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRealizarCompra))
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void cbLlenarV(String datos){
        if(datos.equalsIgnoreCase("SELVA 1")){
            this.EnumS = new DefaultComboBoxModel(TSelva1.values());
            this.EnumF = new DefaultComboBoxModel(TSelva1.values());
        }else if (datos.equalsIgnoreCase("SELVA 2")){
            this.EnumS = new DefaultComboBoxModel(TSelva2.values());
            this.EnumF = new DefaultComboBoxModel(TSelva2.values());
        }else if(datos.equalsIgnoreCase("GOLFO 1")){
            this.EnumS = new DefaultComboBoxModel(TGolfo1.values());
            this.EnumF = new DefaultComboBoxModel(TGolfo1.values());
        }else if(datos.equalsIgnoreCase("GOLFO 2")){
            this.EnumS = new DefaultComboBoxModel(TGolfo2.values());
            this.EnumF = new DefaultComboBoxModel(TGolfo2.values());
        }else if(datos.equalsIgnoreCase("CARIBE 1")){
            this.EnumS = new DefaultComboBoxModel(TCaribe1.values());
            this.EnumF = new DefaultComboBoxModel(TCaribe1.values());
        }else if(datos.equalsIgnoreCase("CARIBE 2")){
            this.EnumS = new DefaultComboBoxModel(TCaribe2.values());
            this.EnumF = new DefaultComboBoxModel(TCaribe2.values());
        }
    }
    
    
    private void cbNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNacionalidadActionPerformed
        
    }//GEN-LAST:event_cbNacionalidadActionPerformed
    
    private void cbTramoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTramoActionPerformed
      
    }//GEN-LAST:event_cbTramoActionPerformed

    private void cbTramoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTramoItemStateChanged
        if(evt.getStateChange()==ItemEvent.SELECTED){
            if(this.cbTramo.getSelectedIndex()>0){
                cbLlenarV(this.cbTramo.getSelectedItem().toString());
                this.cbEstIni.setModel(this.EnumS);
                this.cbEstFin.setModel(this.EnumF);
            }
        }
    }//GEN-LAST:event_cbTramoItemStateChanged
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRealizarCompra;
    private javax.swing.JComboBox<String> cbEstFin;
    private javax.swing.JComboBox<String> cbEstIni;
    private javax.swing.JComboBox<String> cbNacionalidad;
    private javax.swing.JComboBox<String> cbTramo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtEdadPasaj;
    private javax.swing.JTextField txtMaternoPasaj;
    private javax.swing.JTextField txtNombrePasaj;
    private javax.swing.JTextField txtPaternoPasaj;
    // End of variables declaration//GEN-END:variables
}
