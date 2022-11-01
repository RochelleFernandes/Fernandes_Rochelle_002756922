/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author roche
 */
public class Community extends javax.swing.JFrame {
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null; 

    /**
     * Creates new form Community
     */
    public Community() {
        initComponents();
        con=Connect.ConnectDB();
        Community_table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDoctorEmail = new javax.swing.JLabel();
        txtCommFirstName = new javax.swing.JTextField();
        txtCommLName = new javax.swing.JTextField();
        txtCommZip = new javax.swing.JTextField();
        txtCommContact = new javax.swing.JTextField();
        txtCommemail = new javax.swing.JTextField();
        lblDoctorZip = new javax.swing.JLabel();
        txtCommCity = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        lblDoctorCity = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        txtCommAdd = new javax.swing.JTextField();
        lblDoctorAddress = new javax.swing.JLabel();
        lblDoctorContact = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCommusername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCommPassword = new javax.swing.JTextField();
        buttonSave = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCommunity = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1600, 800));

        lblDoctorEmail.setText("Email-id");

        txtCommemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommemailActionPerformed(evt);
            }
        });

        lblDoctorZip.setText("Zip");

        txtCommCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommCityActionPerformed(evt);
            }
        });

        lblFirstName.setText("First Name");

        lblDoctorCity.setText("City");

        lblLastName.setText("Last Name");

        txtCommAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommAddActionPerformed(evt);
            }
        });

        lblDoctorAddress.setText("Address Line1");

        lblDoctorContact.setText("Contact No.");

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        buttonSave.setText("Save");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tableCommunity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Firrst Name", "Last Name", "Address Line1", "City", "Zip", "Contact No.", "Emailid"
            }
        ));
        tableCommunity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCommunityMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCommunity);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFirstName)
                            .addComponent(lblDoctorAddress)
                            .addComponent(lblDoctorContact)
                            .addComponent(lblDoctorEmail)
                            .addComponent(lblDoctorZip)
                            .addComponent(lblLastName)
                            .addComponent(lblDoctorCity))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCommFirstName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(txtCommLName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCommAdd, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCommCity, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCommZip, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCommContact, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCommemail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCommusername)
                    .addComponent(txtCommPassword))
                .addGap(1189, 1189, 1189))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(buttonSave)
                        .addGap(30, 30, 30)
                        .addComponent(jButton2)
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton1)))
                .addContainerGap(337, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCommFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFirstName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCommLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLastName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCommAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblDoctorAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDoctorCity)
                            .addComponent(txtCommCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDoctorZip)
                            .addComponent(txtCommZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCommContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDoctorContact))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCommemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDoctorEmail))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCommusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCommPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonSave)
                            .addComponent(jButton2))
                        .addGap(67, 67, 67))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButton1)
                .addGap(170, 170, 170))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCommemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommemailActionPerformed

    private void txtCommCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommCityActionPerformed

    private void txtCommAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommAddActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        // TODO add your handling code here:
        
        
        String firstname = txtCommFirstName.getText();
        String lastname = txtCommLName.getText();
        String address = txtCommAdd.getText();
        String city = txtCommCity.getText();
        String zip = txtCommZip.getText();
        String contact = txtCommContact.getText();
        String email = txtCommemail.getText();
        String user = txtCommusername.getText();
        String password = txtCommPassword.getText();
        
        try{
            
            if (txtCommFirstName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Doctor's first name","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtCommLName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Doctor's last name","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtCommAdd.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Doctor's address","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtCommCity.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter city","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtCommZip.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Zip code","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtCommContact.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Contact no","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
           if (txtCommemail.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Email id","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
           if (txtCommusername.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Specialization","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         
            if (txtCommPassword.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Doctor's username","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
       Statement stmt;
       stmt= con.createStatement();
       String sql1="Select username from communityadmin where username= '" + txtCommusername.getText() + "'";
       rs=stmt.executeQuery(sql1);
       if(rs.next()){
        JOptionPane.showMessageDialog( this, "Username already exists","Error", JOptionPane.ERROR_MESSAGE);
        txtCommusername.setText("");
        txtCommusername.requestDefaultFocus();
       return;
      }
            String sql= "Insert into communityadmin (first_name, last_name, address, city, zip, contact, email, username, password) value(?,?,?,?,?,?,?,?,?)";

            pst=con.prepareStatement(sql);
            pst.setString(1,firstname);
            pst.setString(2, lastname);
            pst.setString(3, address);
            pst.setString(4, city);
            pst.setString(5, zip);
            pst.setString(6, contact);
            pst.setString(7, email);
            pst.setString(8, user);
            pst.setString(9, password);
           
            
            
            
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully Registered","Doctor",JOptionPane.INFORMATION_MESSAGE);
            buttonSave.setEnabled(false);
            
            Reset();
            

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableCommunityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCommunityMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tableCommunity.getModel();
        int SelectIndex = tableCommunity.getSelectedRow();
        
        txtCommFirstName.setText(model.getValueAt(SelectIndex, 0).toString());
        txtCommLName.setText(model.getValueAt(SelectIndex, 1).toString());
        txtCommAdd.setText(model.getValueAt(SelectIndex, 2).toString());
        txtCommCity.setText(model.getValueAt(SelectIndex, 3).toString());
        txtCommZip.setText(model.getValueAt(SelectIndex, 4).toString());
        txtCommContact.setText(model.getValueAt(SelectIndex, 5).toString());
        txtCommemail.setText(model.getValueAt(SelectIndex, 6).toString());
        
        buttonSave.setVisible(false);
    }//GEN-LAST:event_tableCommunityMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        String firstname = txtCommFirstName.getText();
        String lastname = txtCommLName.getText();
        String address = txtCommAdd.getText();
        String city = txtCommCity.getText();
        String zip = txtCommZip.getText();
        String contact = txtCommContact.getText();
        String email = txtCommemail.getText();
        
        try{
            
            if (txtCommFirstName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter first name","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtCommLName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter last name","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtCommAdd.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter address","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtCommCity.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter city","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtCommZip.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Zip code","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtCommContact.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Contact no","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
           if (txtCommemail.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Email id","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
           
         
       Statement stmt;
       stmt= con.createStatement();
         if(rs.next()){
        
       
      }
       
            String sql= "Update communityadmin set  first_name =?,last_name =?, address= ?, city = ?, zip = ?, contact = ?, email = ?";        
            
            pst=con.prepareStatement(sql);
            
            pst.setString(1, firstname);
            pst.setString(2, lastname);
            pst.setString(3, address);
            pst.setString(4, city);
            pst.setString(5, zip);
            pst.setString(6, contact);
            pst.setString(7, email);
            
            
            
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Successfully Updated","Community",JOptionPane.INFORMATION_MESSAGE);
            buttonSave.setEnabled(false);
            
            txtCommFirstName.setText("");
            txtCommLName.setText("");
            txtCommAdd.setText("");
            txtCommCity.setText("");
            txtCommZip.setText("");
            txtCommContact.setText("");
            txtCommemail.setText("");
            
            
            Community_table();
            
            buttonSave.setEnabled(true);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
                                              

    }//GEN-LAST:event_jButton2ActionPerformed

    private void Reset()
{
    txtCommFirstName.setText("");
    txtCommLName.setText("");
    txtCommAdd.setText("");
    txtCommCity.setText("");
    txtCommZip.setText("");
    txtCommContact.setText("");
    txtCommemail.setText("");
    txtCommusername.setText("");
    txtCommPassword.setText("");
        
    
    buttonSave.setEnabled(true);
   
}

private void Community_table(){
    try{
        pst = con.prepareCall("Select * from communityadmin");
        rs = pst.executeQuery();
        ResultSetMetaData result = (ResultSetMetaData) rs.getMetaData();
        int c;
        c=result.getColumnCount();
        
        DefaultTableModel model = (DefaultTableModel)tableCommunity.getModel();
        model.setRowCount(0);
        
        while(rs.next()){
            Vector vector = new Vector();
            for(int i =1; i<=c ;i++){
                vector.add(rs.getString("first_name"));
                vector.add(rs.getString("last_name"));
                vector.add(rs.getString("address"));
                vector.add(rs.getString("city"));
                vector.add(rs.getString("zip"));
                vector.add(rs.getString("contact"));
                vector.add(rs.getString("email"));
                
            }
            model.addRow(vector);
        }
        
    }   catch (SQLException ex) {
            Logger.getLogger(Community.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(Community.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Community.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Community.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Community.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Community().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDoctorAddress;
    private javax.swing.JLabel lblDoctorCity;
    private javax.swing.JLabel lblDoctorContact;
    private javax.swing.JLabel lblDoctorEmail;
    private javax.swing.JLabel lblDoctorZip;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JTable tableCommunity;
    public javax.swing.JTextField txtCommAdd;
    public javax.swing.JTextField txtCommCity;
    public javax.swing.JTextField txtCommContact;
    public javax.swing.JTextField txtCommFirstName;
    public javax.swing.JTextField txtCommLName;
    private javax.swing.JTextField txtCommPassword;
    public javax.swing.JTextField txtCommZip;
    public javax.swing.JTextField txtCommemail;
    private javax.swing.JTextField txtCommusername;
    // End of variables declaration//GEN-END:variables
}