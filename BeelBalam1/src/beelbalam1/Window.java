/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beelbalam1;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Itzel Cabrera
 */
public class Window extends javax.swing.JPanel {

    ProcEditarUsuario editU;
    PanelCompras2 pc2;//temporal
    
    String user; //usuario con el que se inició sesión
    
    
    String oldTarjeta;
    /*String nombre;
    String newNombre;
    String newContraseña;
    String newCorreo;
    String newCel;
    String newNumTarjetaEU;
    int CVC;
    String primerNombre;
    String segundoNombre;
    String primerApellido;
    String segundoApellido;
    int fechaV;*/
    
    Connection conex;
    CallableStatement stm;
    ResultSet rs;
    /**
     * Creates new form Window
     */
    
    public Window() {
        initComponents();
        this.btnSaveChanges.setVisible(false);
        this.txtDNombreUsuario.setEditable(false);
        this.txtDCorreoE.setEditable(false);
        this.txtDNumCel.setEditable(false);
        this.txtDNumTarjeta.setEditable(false);
        this.txtDPtosAcum.setEditable(false);
        this.txtDPassword.setText("**************");
        this.txtDPassword.setEditable(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnAcuerdo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnSaveChanges = new javax.swing.JButton();
        txtDNombreUsuario = new javax.swing.JTextField();
        txtDCorreoE = new javax.swing.JTextField();
        txtDNumCel = new javax.swing.JTextField();
        txtDPtosAcum = new javax.swing.JTextField();
        txtDNumTarjeta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDPassword = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnCerrarSesion = new javax.swing.JButton();

        jPanel5.setBackground(new java.awt.Color(255, 153, 153));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 2, 36)); // NOI18N
        jLabel9.setText("Aviso de privacidad");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("El tratamiento de datos personales se realiza de conformidad con lo dispuesto en los artículos 8 de la Ley \nOrgánica de la Administración Pública Federal, (última reforma publicada en el Diario Oficial de la Federación, \nel diecinueve de mayo de dos mil diecisiete), 28, fracción III, del Reglamento de la Oficina de la Presidencia de\nla República (publicado en Diario Oficial de la Federación el nueve de diciembre de dos mil diecinueve), 117,\nfracción V de la Ley Federal de Transparencia y Acceso a la Información Pública (última reforma publicada en \nel Diario Oficial de la Federación el veintisiete de enero de dos mil diecisiete), 22, fracción II, 24, 28, 66, fracción\nI, 69 y 70, fracción II de la Ley General de Protección de Datos Personales en Posesión de Sujetos Obligados.\n\nLos datos personales que usted proporcione podrán ser susceptibles, en su caso, de ser transferidos al responsa\nble competente, en términos del numeral 13, fracción V, del Reglamento de la Oficina de la Presidencia de la Re\npública, (última reforma publicada el uno de octubre de dos mil quince), en concordancia con el diverso 117,\n fracción V de la Ley Federal de Transparencia y Acceso a la Información Pública (última reforma publicada en\n el Diario Oficial de la Federación el veintisiete de enero de dos mil diecisiete).");
        jScrollPane3.setViewportView(jTextArea1);

        btnAcuerdo.setText("Estoy de acuerdo");
        btnAcuerdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcuerdoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAcuerdo)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(240, 240, 240)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(109, 109, 109)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAcuerdo)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Aviso Privacidad", jPanel5);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DATOS DEL FERFIL");

        jLabel1.setText("NOMBRE USUARIO:");

        jLabel3.setText("CORREO ELECTRÓNICO:");

        jLabel4.setText("NÚMERO DE CELULAR:");

        jLabel5.setText("PUNTOS ACUMULADOS:");

        jLabel6.setText("NÚMERO DE TARJETA: ");

        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSaveChanges.setText("Guardar Cambios");
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });

        txtDNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNombreUsuarioActionPerformed(evt);
            }
        });

        txtDNumTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNumTarjetaActionPerformed(evt);
            }
        });

        jLabel7.setText("Contraseña");

        txtDPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDCorreoE)
                                    .addComponent(txtDNombreUsuario)
                                    .addComponent(txtDNumCel)
                                    .addComponent(txtDPtosAcum)
                                    .addComponent(txtDNumTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                    .addComponent(txtDPassword)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btnSaveChanges)))))
                .addGap(200, 200, 200))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(txtDNombreUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDCorreoE, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDNumCel)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDPtosAcum)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(txtDNumTarjeta))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
        );

        jTabbedPane1.addTab("Ver Perfil", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        jButton1.setText("Vas Toñito");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jButton1)
                .addContainerGap(416, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jButton1)
                .addContainerGap(330, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Comprar Boleto", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setText("Historial de compras");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID_Reserva", "Nombre Cliente", "Fecha ", "Hora", "Tramo", "Estación Final", "Estación Inicial", "Costo Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(286, 286, 286))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ver Historial", jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 0, 204));

        btnCerrarSesion.setText("CerrarSesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(btnCerrarSesion)
                .addContainerGap(352, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(btnCerrarSesion)
                .addContainerGap(283, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cerrar Sesion", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        oldTarjeta = this.txtDNumTarjeta.getText();
        this.btnSaveChanges.setVisible(true);
        this.txtDNombreUsuario.setEditable(true);
        this.txtDCorreoE.setEditable(true);
        this.txtDNumCel.setEditable(true);
        this.txtDNumTarjeta.setEditable(true);
        this.txtDPassword.setEditable(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed
        if(this.txtDNumTarjeta.getText().equals(oldTarjeta)){
            this.editUsuario(false);
        }
        else{
            this.editUsuario(true);
        }
        this.btnSaveChanges.setVisible(false);
        this.txtDNombreUsuario.setEditable(false);
        this.txtDCorreoE.setEditable(false);
        this.txtDNumCel.setEditable(false);
        this.txtDNumTarjeta.setEditable(false);
        this.txtDPassword.setText("**************");
        this.txtDPassword.setEditable(false);
        
    }//GEN-LAST:event_btnSaveChangesActionPerformed
    
    public void setUser(String u){
        this.user = u;
    }
    
    public String getUser(){
        return this.user;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //temporal
        pc2 = new PanelCompras2();
        pc2.setBounds(this.getBounds());
        this.removeAll();
        this.add(pc2);
        this.updateUI();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtDNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNombreUsuarioActionPerformed

    private void txtDPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDPasswordActionPerformed

    private void txtDNumTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNumTarjetaActionPerformed
        
    }//GEN-LAST:event_txtDNumTarjetaActionPerformed

    private void btnAcuerdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcuerdoActionPerformed
        //System.out.println("---" + this.getUser());
        String nombre = null;
        String contra = null;
        String correo = null;
        String numero = null;
        String tarjeta = null;
        int ptos = 0;
        
        try {
            //Conecta
            conex = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-KT6L84G:1433;databaseName=BEEL_BALAM", "sa", "2020640576");
            //Busca el usuario
            stm = conex.prepareCall("{call GET_USERDATA(?)}");
            stm.setString(1, this.getUser());
            rs = stm.executeQuery();
            if(rs.next()){ //si encuentra el usuario, verifica que la contraseña sea correcta
                nombre = rs.getString(1);
                contra = rs.getString(2);
                correo = rs.getString(3);
                numero = rs.getString(4);
                ptos = rs.getInt(5);
                tarjeta = rs.getString(6);
            }else{
                JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            }
            rs.close();
            stm.close();
            this.txtDNombreUsuario.setText(nombre);
            this.txtDCorreoE.setText(correo);
            this.txtDNumCel.setText(numero);
            this.txtDPtosAcum.setText(Integer.toString(ptos));
            this.txtDNumTarjeta.setText(tarjeta);
            
            this.btnAcuerdo.setVisible(false);
            
        } catch (SQLException ex) {
            System.out.println("ERROR");
        }
    }//GEN-LAST:event_btnAcuerdoActionPerformed
    
    public void editUsuario(boolean v){
        if(v){
            System.out.println("Cambio de tarjeta");
        }else{
            System.out.println("No se ha cambiado la tarjeta");
            try {
                String resultado = null;
                //Conecta
                conex = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-KT6L84G:1433;databaseName=BEEL_BALAM", "sa", "2020640576");
                //Busca el usuario
                stm = conex.prepareCall("{call EDIT_U_SIMPLE(?,?,?,?,?)}");
                stm.setString(1, this.user);
                stm.setString(2, this.txtDNombreUsuario.getText());
                stm.setString(3, this.txtDCorreoE.getText());
                stm.setString(4, this.txtDNumCel.getText());
                stm.setString(5, this.txtDPassword.getText());
                stm.executeQuery();
                //if(rs.next()){ //si encuentra el usuario, realiza los cambios
                 //   resultado = rs.getString(1);
                 // System.out.println(resultado);
                //}
            } catch (SQLException ex) {
                System.out.println("ERROR");
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcuerdo;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtDCorreoE;
    private javax.swing.JTextField txtDNombreUsuario;
    private javax.swing.JTextField txtDNumCel;
    private javax.swing.JTextField txtDNumTarjeta;
    private javax.swing.JTextField txtDPassword;
    private javax.swing.JTextField txtDPtosAcum;
    // End of variables declaration//GEN-END:variables
}
