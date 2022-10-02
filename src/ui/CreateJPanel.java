/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.EmployeeInfoHistory;
import model.EmployeeInfo;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;

/**
 *
 * @author roche
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    EmployeeInfoHistory history;
    EmployeeInfo info;
    public CreateJPanel(EmployeeInfoHistory history) {
        initComponents();
        
        this.history = history;
        this.info = info;
        
        
    }
    
    public ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon image = new ImageIcon(ImagePath);
        Image img = image.getImage();
        Image newImg = img.getScaledInstance(lblPhoto.getWidth(), lblPhoto.getHeight(), Image.SCALE_SMOOTH      );
        ImageIcon nwimage = new ImageIcon(newImg);
        return nwimage;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitle = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelEmployeeID = new javax.swing.JLabel();
        labelAge = new javax.swing.JLabel();
        labelGender = new javax.swing.JLabel();
        labelStartDate = new javax.swing.JLabel();
        labelLevel = new javax.swing.JLabel();
        labelTeamInfo = new javax.swing.JLabel();
        labelPositionTitle = new javax.swing.JLabel();
        labelContactInfo = new javax.swing.JLabel();
        labelPhoto = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmployeeID = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtTeamInfo = new javax.swing.JTextField();
        txtPositionTitle = new javax.swing.JTextField();
        buttonSave = new javax.swing.JButton();
        labelCellPhoneNumber = new javax.swing.JLabel();
        labelEmailAddress = new javax.swing.JLabel();
        txtCellPhoneNumber = new javax.swing.JTextField();
        txtEmailAddress = new javax.swing.JTextField();
        buttonBrowse = new javax.swing.JButton();
        lblPhoto = new javax.swing.JLabel();

        labelTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("Enter Employee Details");

        labelName.setText("Name:");

        labelEmployeeID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEmployeeID.setText("Employee ID:");

        labelAge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAge.setText("Age:");

        labelGender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGender.setText("Gender:");

        labelStartDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelStartDate.setText("Start Date:");

        labelLevel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLevel.setText("Level:");

        labelTeamInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTeamInfo.setText("Team Info:");

        labelPositionTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPositionTitle.setText("Position Title:");

        labelContactInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelContactInfo.setText("Contact Info:");

        labelPhoto.setText("Photo:");

        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtEmployeeID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtAge.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        txtGender.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtStartDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtLevel.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtTeamInfo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtPositionTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        buttonSave.setText("Save");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        labelCellPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCellPhoneNumber.setText("Cell Phone Number:");

        labelEmailAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEmailAddress.setText("Email Address:");

        txtCellPhoneNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCellPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCellPhoneNumberActionPerformed(evt);
            }
        });

        txtEmailAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        buttonBrowse.setText("Browse");
        buttonBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBrowseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelName)
                    .addComponent(labelEmployeeID)
                    .addComponent(labelAge)
                    .addComponent(labelGender)
                    .addComponent(labelStartDate)
                    .addComponent(labelLevel)
                    .addComponent(labelTeamInfo)
                    .addComponent(labelPositionTitle)
                    .addComponent(labelContactInfo)
                    .addComponent(labelPhoto)
                    .addComponent(labelEmailAddress)
                    .addComponent(labelCellPhoneNumber))
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCellPhoneNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(txtEmployeeID, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPositionTitle, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLevel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGender, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmailAddress)
                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(323, 323, 323))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(328, 328, 328)
                                .addComponent(buttonSave))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(291, 291, 291)
                                .addComponent(buttonBrowse)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(labelTitle)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEmployeeID)
                    .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelGender)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelStartDate)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLevel)
                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTeamInfo)
                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPositionTitle)
                    .addComponent(txtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(labelContactInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelCellPhoneNumber)
                    .addComponent(txtCellPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmailAddress)
                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(labelPhoto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonBrowse)
                .addGap(47, 47, 47)
                .addComponent(buttonSave)
                .addGap(81, 81, 81))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        // TODO add your handling code here:
        
        
        String name = txtName.getText();
        String employeeID = txtEmployeeID.getText();
        int age = Integer.parseInt(txtAge.getText());
        String gender = txtGender.getText();
        String startDate = txtStartDate.getText();
        String level = txtLevel.getText();
        String teamInfo = txtTeamInfo.getText();
        String positionTitle = txtPositionTitle.getText();
        String cellPhoneNumber = txtCellPhoneNumber.getText();
        String emailAddress = txtEmailAddress.getText();
        Icon photo = lblPhoto.getIcon();
                
        EmployeeInfo ei = history.addNewInfo();
        ei.setName(name);
        ei.setEmployeeID(employeeID);
        ei.setAge(age);
        ei.setGender(gender);
        ei.setStartDate(startDate);
        ei.setLevel(level);
        ei.setTeamInfo(teamInfo);
        ei.setPositionTitle(positionTitle);
        ei.setCellPhonenumber(cellPhoneNumber);
        ei.setEmailAddress(emailAddress);
        lblPhoto.setIcon(photo);
        
        
        
        JOptionPane.showMessageDialog(this, "Information saved");
        
        
        txtName.setText("");
        txtEmployeeID.setText("");
        txtAge.setText(String.valueOf(""));
        txtGender.setText("");
        txtStartDate.setText("");
        txtLevel.setText("");
        txtTeamInfo.setText("");
        txtPositionTitle.setText("");
        txtCellPhoneNumber.setText("");
        txtEmailAddress.setText("");
        lblPhoto.setIcon(null);
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void txtCellPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCellPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCellPhoneNumberActionPerformed

    private void buttonBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBrowseActionPerformed
        // TODO add your handling code here:
        
          JFileChooser filechooser = new JFileChooser();
    filechooser.setDialogTitle("Choose Your File");
    filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    // below code selects the file 
    int returnval = filechooser.showOpenDialog(this);
    if (returnval == JFileChooser.APPROVE_OPTION)
    {
        File file = filechooser.getSelectedFile();
        String path =file.getAbsolutePath();
        //BufferedImage path;
        
            // display the image in a Jlabel
            
            lblPhoto.setIcon(ResizeImage(path));
            
        }
            
        
   
    }//GEN-LAST:event_buttonBrowseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBrowse;
    private javax.swing.JButton buttonSave;
    private javax.swing.JLabel labelAge;
    private javax.swing.JLabel labelCellPhoneNumber;
    private javax.swing.JLabel labelContactInfo;
    private javax.swing.JLabel labelEmailAddress;
    private javax.swing.JLabel labelEmployeeID;
    private javax.swing.JLabel labelGender;
    private javax.swing.JLabel labelLevel;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPhoto;
    private javax.swing.JLabel labelPositionTitle;
    private javax.swing.JLabel labelStartDate;
    private javax.swing.JLabel labelTeamInfo;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCellPhoneNumber;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPositionTitle;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables
}
