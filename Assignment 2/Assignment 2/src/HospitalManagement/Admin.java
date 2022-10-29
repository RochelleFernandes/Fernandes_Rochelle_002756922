/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HospitalManagement;

/**
 *
 * @author roche
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
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

        jMenuItem7 = new javax.swing.JMenuItem();
        buttonLogOut = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAddUsers = new javax.swing.JMenu();
        menuAddPatient = new javax.swing.JMenuItem();
        menuAddDoctor = new javax.swing.JMenuItem();
        menuAddCommunityAdmin = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        menuPatient = new javax.swing.JMenuItem();
        menuDoctor = new javax.swing.JMenuItem();
        menuCommunity = new javax.swing.JMenuItem();
        menuView = new javax.swing.JMenu();
        menuPatientAppointment = new javax.swing.JMenuItem();
        menuPrescription = new javax.swing.JMenuItem();
        menuDoctorSchedule = new javax.swing.JMenuItem();
        menuCreate = new javax.swing.JMenu();
        menuPatientAppt = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuDoctorAppt = new javax.swing.JMenuItem();

        jMenuItem7.setText("jMenuItem7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1400, 800));

        buttonLogOut.setText("Log Out");

        menuAddUsers.setText("Add Users");

        menuAddPatient.setText("Patient");
        menuAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddPatientActionPerformed(evt);
            }
        });
        menuAddUsers.add(menuAddPatient);

        menuAddDoctor.setText("Doctor");
        menuAddDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddDoctorActionPerformed(evt);
            }
        });
        menuAddUsers.add(menuAddDoctor);

        menuAddCommunityAdmin.setText("Community Admin");
        menuAddUsers.add(menuAddCommunityAdmin);

        jMenuBar1.add(menuAddUsers);

        menuEdit.setText("Edit Details");

        menuPatient.setText("Patient Details");
        menuEdit.add(menuPatient);

        menuDoctor.setText("Doctor Details");
        menuEdit.add(menuDoctor);

        menuCommunity.setText("Community Admin");
        menuEdit.add(menuCommunity);

        jMenuBar1.add(menuEdit);

        menuView.setText("View");

        menuPatientAppointment.setText("Patient Appointment");
        menuView.add(menuPatientAppointment);

        menuPrescription.setText("Prescription");
        menuView.add(menuPrescription);

        menuDoctorSchedule.setText("Doctor's Schedule");
        menuView.add(menuDoctorSchedule);

        jMenuBar1.add(menuView);

        menuCreate.setText("Create");

        menuPatientAppt.setText("Patient Appointment");
        menuCreate.add(menuPatientAppt);

        jMenuItem1.setText("Add Hospitals");
        menuCreate.add(jMenuItem1);

        menuDoctorAppt.setText("Doctor's Appointment");
        menuCreate.add(menuDoctorAppt);

        jMenuBar1.add(menuCreate);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(613, 613, 613)
                .addComponent(buttonLogOut)
                .addContainerGap(715, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(buttonLogOut)
                .addGap(0, 754, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddPatientActionPerformed
        // TODO add your handling code here:
        
        PatientRegistration register = new PatientRegistration();
        register.setVisible(true);
    }//GEN-LAST:event_menuAddPatientActionPerformed

    private void menuAddDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddDoctorActionPerformed
        // TODO add your handling code here:
        DoctorDetails doctor = new DoctorDetails();
        doctor.setVisible(true);
       
    }//GEN-LAST:event_menuAddDoctorActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogOut;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem menuAddCommunityAdmin;
    private javax.swing.JMenuItem menuAddDoctor;
    private javax.swing.JMenuItem menuAddPatient;
    private javax.swing.JMenu menuAddUsers;
    private javax.swing.JMenuItem menuCommunity;
    private javax.swing.JMenu menuCreate;
    private javax.swing.JMenuItem menuDoctor;
    private javax.swing.JMenuItem menuDoctorAppt;
    private javax.swing.JMenuItem menuDoctorSchedule;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenuItem menuPatient;
    private javax.swing.JMenuItem menuPatientAppointment;
    private javax.swing.JMenuItem menuPatientAppt;
    private javax.swing.JMenuItem menuPrescription;
    private javax.swing.JMenu menuView;
    // End of variables declaration//GEN-END:variables
}