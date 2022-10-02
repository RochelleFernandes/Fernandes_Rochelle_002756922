/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;



import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.EmployeeInfo;
import model.EmployeeInfoHistory;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author roche
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    EmployeeInfoHistory history;
    
    

    
    
    public ViewJPanel(EmployeeInfoHistory history) {
        initComponents();
        
        this.history = history;
        
        
        populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInfo = new javax.swing.JTable();
        buttonView = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        labelPhoto = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmployeeID = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtTeamInfo = new javax.swing.JTextField();
        txtPositionTitle = new javax.swing.JTextField();
        labelCellPhoneNumber = new javax.swing.JLabel();
        labelEmailAddress = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        txtCellPhoneNumber = new javax.swing.JTextField();
        labelEmployeeID = new javax.swing.JLabel();
        txtEmailAddress = new javax.swing.JTextField();
        labelAge = new javax.swing.JLabel();
        labelGender = new javax.swing.JLabel();
        labelStartDate = new javax.swing.JLabel();
        labelLevel = new javax.swing.JLabel();
        labelTeamInfo = new javax.swing.JLabel();
        labelPositionTitle = new javax.swing.JLabel();
        labelContactInfo = new javax.swing.JLabel();
        buttonUpdate = new javax.swing.JButton();
        lblPhoto = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        lblPhoto1 = new javax.swing.JLabel();
        lblPhoto2 = new javax.swing.JLabel();
        buttonSearch = new javax.swing.JButton();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        labelTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("View Employee Details");

        tableInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Employee ID", "Age", "Gender", "Start Date", "Level", "Team Info", "Position Title", "Cell Phone", "Email address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableInfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableInfo);

        buttonView.setText("View");
        buttonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewActionPerformed(evt);
            }
        });

        buttonDelete.setText("Delete");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        labelPhoto.setText("Photo:");

        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNameMouseClicked(evt);
            }
        });
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

        labelCellPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCellPhoneNumber.setText("Cell Phone Number:");

        labelEmailAddress.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelEmailAddress.setText("Email Address:");

        labelName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelName.setText("Name:");

        txtCellPhoneNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCellPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCellPhoneNumberActionPerformed(evt);
            }
        });

        labelEmployeeID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelEmployeeID.setText("Employee ID:");

        txtEmailAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelAge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelAge.setText("Age:");

        labelGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelGender.setText("Gender:");

        labelStartDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelStartDate.setText("Start Date:");

        labelLevel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelLevel.setText("Level:");

        labelTeamInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTeamInfo.setText("Team Info:");

        labelPositionTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPositionTitle.setText("Position Title:");

        labelContactInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelContactInfo.setText("Contact Info:");

        buttonUpdate.setText("Update");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        buttonSearch.setText("Search");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCellPhoneNumber)
                                    .addComponent(txtPositionTitle)
                                    .addComponent(txtTeamInfo)
                                    .addComponent(txtLevel)
                                    .addComponent(txtStartDate)
                                    .addComponent(txtGender)
                                    .addComponent(txtAge)
                                    .addComponent(txtEmployeeID)
                                    .addComponent(txtName)
                                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPhoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonSearch)
                                .addGap(26, 26, 26)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(75, 75, 75)
                        .addComponent(buttonView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonDelete)))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(444, 444, 444)
                    .addComponent(lblPhoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(500, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(labelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonView)
                    .addComponent(buttonDelete)
                    .addComponent(buttonUpdate)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSearch))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmployeeID))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelCellPhoneNumber)
                    .addComponent(txtCellPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmailAddress)
                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelPhoto)
                                .addGap(127, 127, 127))
                            .addComponent(lblPhoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addComponent(lblPhoto1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(370, 370, 370)
                    .addComponent(lblPhoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(377, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tableInfo.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please enter Employee Information");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tableInfo.getModel();
        EmployeeInfo selectedInfo = (EmployeeInfo) model.getValueAt(selectedRowIndex, 0);
        txtName.setText(selectedInfo.getName());
        txtEmployeeID.setText(selectedInfo.getEmployeeID());
        txtAge.setText(String.valueOf(selectedInfo.getAge()));
        txtGender.setText(selectedInfo.getGender());
        txtStartDate.setText(selectedInfo.getStartDate());
        txtLevel.setText(selectedInfo.getLevel());
        txtTeamInfo.setText(selectedInfo.getTeamInfo());
        txtPositionTitle.setText(selectedInfo.getPositionTitle());
        txtCellPhoneNumber.setText(selectedInfo.getCellPhoneNumber());
        txtEmailAddress.setText(selectedInfo.getEmailAddress());
        lblPhoto.setText(ConvertByteToString(selectedInfo.getPhoto()));
        //lblPhoto.setIcon(lblPhoto.getIcon());
    }//GEN-LAST:event_buttonViewActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtCellPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCellPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCellPhoneNumberActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tableInfo.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tableInfo.getModel();
        EmployeeInfo selectedInfo = (EmployeeInfo) model.getValueAt(selectedRowIndex, 0);
        
        history.deleteInfo(selectedInfo);  
        JOptionPane.showMessageDialog(this, "Information deleted");
        populateTable();
        
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        // TODO add your handling code here:
                        
       DefaultTableModel model = (DefaultTableModel) tableInfo.getModel();
       if(tableInfo.getSelectedRowCount ()==1){
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
            
            model.setValueAt(name, tableInfo.getSelectedRow(), 0);
            model.setValueAt(employeeID, tableInfo.getSelectedRow(), 1);
            model.setValueAt(age, tableInfo.getSelectedRow(), 2);
            model.setValueAt(gender, tableInfo.getSelectedRow(), 3);
            model.setValueAt(startDate, tableInfo.getSelectedRow(), 4);
            model.setValueAt(level, tableInfo.getSelectedRow(), 5);
            model.setValueAt(teamInfo, tableInfo.getSelectedRow(), 6);
            model.setValueAt(positionTitle, tableInfo.getSelectedRow(), 7);
            model.setValueAt(cellPhoneNumber, tableInfo.getSelectedRow(), 8);
            model.setValueAt(emailAddress, tableInfo.getSelectedRow(), 9);
            
            JOptionPane.showMessageDialog(this, "Details updated successfully");
           
       
       }else{
           if(tableInfo.getRowCount()==0){
               JOptionPane.showMessageDialog(this, "Please enter details");
           }
           else{
               JOptionPane.showMessageDialog(this, "Please select a row");
           }  
       }
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void txtNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtNameMouseClicked

    private void tableInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableInfoMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tableInfo.getModel();
        
        String updatedName = model.getValueAt(tableInfo.getSelectedRow(), 0).toString();
        String updatedEmployeeID = model.getValueAt(tableInfo.getSelectedRow(), 1).toString();
        int updatedAge = (int) model.getValueAt(tableInfo.getSelectedRow(), 2);
        String updatedGender = model.getValueAt(tableInfo.getSelectedRow(), 3).toString();
        String updatedStartDate = model.getValueAt(tableInfo.getSelectedRow(), 4).toString();
        String updatedLevel = model.getValueAt(tableInfo.getSelectedRow(), 5).toString();
        String updatedTeamInfo = model.getValueAt(tableInfo.getSelectedRow(), 6).toString();
        String updatedPositionTitle = model.getValueAt(tableInfo.getSelectedRow(), 7).toString();
        String updatedCellPhone = model.getValueAt(tableInfo.getSelectedRow(), 8).toString();
        String updatedEmailAddress = model.getValueAt(tableInfo.getSelectedRow(), 9).toString();
        
        
        txtName.setText(updatedName);
        txtEmployeeID.setText(updatedEmployeeID);
        txtAge.setText(String.valueOf(updatedAge));
        txtGender.setText(updatedGender);
        txtStartDate.setText(updatedStartDate);
        txtLevel.setText(updatedLevel);
        txtTeamInfo.setText(updatedTeamInfo);
        txtPositionTitle.setText(updatedPositionTitle);
        txtCellPhoneNumber.setText(updatedCellPhone);
        txtEmailAddress.setText(updatedEmailAddress);
        
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
        
    }//GEN-LAST:event_tableInfoMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txtSearchKeyReleased

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        // TODO add your handling code here:
        String search =txtSearch.getText();
        filter(search);
    }
        
        private void filter(String query){
        
        DefaultTableModel model = (DefaultTableModel) tableInfo.getModel();
        TableRowSorter<DefaultTableModel> sort = new TableRowSorter<DefaultTableModel>();
        tableInfo.setRowSorter(sort);
        
        sort.setRowFilter(RowFilter.regexFilter(query));
        
    
        
    }//GEN-LAST:event_buttonSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JButton buttonView;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JLabel lblPhoto1;
    private javax.swing.JLabel lblPhoto2;
    private javax.swing.JTable tableInfo;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCellPhoneNumber;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPositionTitle;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tableInfo.getModel();
        model.setRowCount(0);
        
        for (EmployeeInfo ei : history.getHistory()){
            
            Object[] row = new Object[11];
            row[0] = ei;
            row[1] = ei.getEmployeeID();
            row[2] = ei.getAge();
            row[3] = ei.getGender();
            row[4] = ei.getStartDate();
            row[5] = ei.getLevel();
            row[6] = ei.getTeamInfo();
            row[7] = ei.getPositionTitle();
            row[8] = ei.getCellPhoneNumber();
            row[9] = ei.getEmailAddress();
            row[10]=ei.getPhoto();
            
            model.addRow(row);
        }
        }
    
    

    private String ConvertByteToString(Byte photo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
         
    
}
