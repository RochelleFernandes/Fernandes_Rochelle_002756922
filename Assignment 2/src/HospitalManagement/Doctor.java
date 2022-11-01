/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HospitalManagement;

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
public class Doctor extends javax.swing.JFrame {
Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null; 
    /**
     * Creates new form Doctor
     */
    public Doctor() {
        initComponents();
        con=Connect.ConnectDB();}
        String id;
        String newid;
        /**public Doctor(String id) {
        initComponents();
        this.id = id;
        newid=id;
        
        JOptionPane.showMessageDialog(this, newid);
        
        
        //ViewAppointment();
    
}*/
    void username(String user){
        jLabel1.setText(user);
        
        
    }
    
      
     
     
     
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableApp = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAppID = new javax.swing.JTextField();
        txtPID = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtBlood = new javax.swing.JTextField();
        txtTemp = new javax.swing.JTextField();
        txtPulse = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        buttonSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1600, 800));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        tableApp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "AppointmentID", "Patientid", "Doctor First Name", "Doctor Last Name", "Date"
            }
        ));
        tableApp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAppMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableApp);

        jLabel3.setText("AppointmentID");

        jLabel4.setText("PatientID");

        jLabel5.setText("Date");

        jLabel6.setText("Blood Pressure");

        jLabel7.setText("Temperature");

        jLabel8.setText("Pulse");

        txtAppID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAppIDActionPerformed(evt);
            }
        });

        txtPID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPIDActionPerformed(evt);
            }
        });

        jLabel11.setText("Enter Vitals Below");

        buttonSave.setText("Save");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonSave)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtAppID, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                .addComponent(txtPID)
                                .addComponent(txtDate)
                                .addComponent(txtBlood)
                                .addComponent(txtTemp)
                                .addComponent(txtPulse)))))
                .addGap(0, 332, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAppID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtPID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBlood, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTemp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(buttonSave)
                .addContainerGap())
        );

        jLabel1.setText("jLabel1");

        jButton1.setText("View Appointment");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        jButton2.setText("LogOut");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jButton1)
                        .addGap(350, 350, 350)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButton2)))
                .addContainerGap(907, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        /**String community = jLabel1.getText();
        
        try{
            
            if (jLabel1.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter name","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            Statement stmt;
       stmt= con.createStatement();
       if(rs.next()){
        
       //return;
      }
            String sql= "Select * from doctor_details where username =?";

            pst=con.prepareStatement(sql);
            pst.setString(1,community);
            pst.execute();
            
            
            
            
            
            

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
        */
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String id= jLabel1.getText();
        try{
            Statement stmt;
       stmt= con.createStatement();
       //String id= jLabel1.getText();
       String sql = "Select * from encounter where doctorid = ?";
       pst=con.prepareStatement(sql);
       //rs = stmt.executeQuery(sql);
       pst.setString(1, id);
       pst.execute();
       Table();
      
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableAppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAppMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tableApp.getModel();
        int SelectIndex = tableApp.getSelectedRow();
        //jLabel3.setText(model.getValueAt(SelectIndex, 0).toString());
        txtAppID.setText(model.getValueAt(SelectIndex, 0).toString());
        txtPID.setText(model.getValueAt(SelectIndex, 1).toString());
        //txtDocfirstname.setText(model.getValueAt(SelectIndex, 2).toString());
        //txtDoclastname.setText(model.getValueAt(SelectIndex, 3).toString());
        txtDate.setText(model.getValueAt(SelectIndex, 4).toString());
        
    }//GEN-LAST:event_tableAppMouseClicked

    private void txtAppIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAppIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAppIDActionPerformed

    private void txtPIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPIDActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        // TODO add your handling code here:
        String Appid = txtAppID.getText();
        String pid = txtPID.getText();
        String date = txtDate.getText();
        String bloodpressure = txtBlood.getText();
        String temp = txtTemp.getText();
        String pulse = txtPulse.getText();
                try{
            
            if (txtAppID.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter patient username","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtPID.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter patient's first name","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtDate.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter patient's last name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtBlood.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter address","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtTemp.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter city","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtPulse.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter zip code","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            
            
       Statement stmt;
       stmt= con.createStatement();
           if(rs.next()){
        
      }
            String sql= "Insert into vitals (appointmentid,patientid,date,bloodpressure,temperature,pulse) value(?,?,?,?,?,?)";

            pst=con.prepareStatement(sql);
            pst.setString(1, Appid);
            pst.setString(2, pid);
            pst.setString(3, date);
            pst.setString(4, bloodpressure);
            pst.setString(5, temp);
            pst.setString(6, pulse);
            
            
            
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully Registered","Patient",JOptionPane.INFORMATION_MESSAGE);
            buttonSave.setEnabled(false);
            
            txtAppID.setText("");
            txtPID.setText("");
            txtDate.setText("");
            txtBlood.setText("");
            txtTemp.setText("");
            txtPulse.setText("");

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        HospitalLoginPage hospital = new HospitalLoginPage();
        hospital.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Table(){
    try{
        pst = con.prepareCall("Select * from encounter");
        rs = pst.executeQuery();
        ResultSetMetaData result = (ResultSetMetaData) rs.getMetaData();
        int c;
        c=result.getColumnCount();
        
        DefaultTableModel model = (DefaultTableModel)tableApp.getModel();
        model.setRowCount(0);
        
        while(rs.next()){
            Vector vector = new Vector();
            for(int i =1; i<=c ;i++){
                vector.add(rs.getString("appointmentid"));
                vector.add(rs.getString("patientid"));
                    vector.add(rs.getString("doctor_firstname"));
                    vector.add(rs.getString("doctor_lastname"));
                    vector.add(rs.getString("date"));

                
            }
            model.addRow(vector);
        }
        
    }   catch (SQLException ex) {
            Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableApp;
    private javax.swing.JTextField txtAppID;
    private javax.swing.JTextField txtBlood;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPID;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtTemp;
    // End of variables declaration//GEN-END:variables
}
