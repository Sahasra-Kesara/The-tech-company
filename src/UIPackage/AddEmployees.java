/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UIPackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class AddEmployees extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployees
     */
    public AddEmployees() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        EmployeeDetailsSubmitBTN = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        inputfullname = new javax.swing.JTextField();
        inputepfnumber = new javax.swing.JTextField();
        selectdepartment = new javax.swing.JComboBox<>();
        selectdesignation = new javax.swing.JComboBox<>();
        EmployeeMgtExitBTN = new javax.swing.JButton();
        EmpMngBackBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Full Name");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("EPF Number");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Department");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Designation");

        EmployeeDetailsSubmitBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EmployeeDetailsSubmitBTN.setText("Submit");
        EmployeeDetailsSubmitBTN.setToolTipText("Submit Employee Details");
        EmployeeDetailsSubmitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeDetailsSubmitBTNActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Employee Management");

        inputfullname.setToolTipText("Enter Full Name");

        inputepfnumber.setToolTipText("Enter EPF Number");

        selectdepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "IT", "Design", "Business", "Development", "Marketing", "Finance", "Research and Development", "Engineering", "Sales and Business Development", "Human Resources", "Finance and Accounting", "Operations", "Customer Support", "IT and Information Systems", "Quality Assurance", "Legal and Cmpliance" }));
        selectdepartment.setToolTipText("Select Department");
        selectdepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectdepartmentActionPerformed(evt);
            }
        });

        selectdesignation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Chief Executive Officer", "Chief Technology Officer", "Chief Financial Officer", "Chief Operating Officer", "Vice President", "Director", "Manager", "Software Engineer", "Product Manager", "Sales Representative", "Marketing Manager", "Quality Assurance Engineer", "Data Scientist", "IT Administrator", "HR Manager", "Legal Counsel" }));
        selectdesignation.setToolTipText("Select Designation");

        EmployeeMgtExitBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EmployeeMgtExitBTN.setText("Exit");
        EmployeeMgtExitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeMgtExitBTNActionPerformed(evt);
            }
        });

        EmpMngBackBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EmpMngBackBTN.setText("Back");
        EmpMngBackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpMngBackBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputfullname)
                            .addComponent(inputepfnumber)
                            .addComponent(selectdepartment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectdesignation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(EmployeeDetailsSubmitBTN)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(EmpMngBackBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EmployeeMgtExitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputfullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputepfnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(selectdepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(selectdesignation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(EmployeeDetailsSubmitBTN)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmployeeMgtExitBTN)
                    .addComponent(EmpMngBackBTN))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void selectdepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectdepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectdepartmentActionPerformed

    private void EmployeeMgtExitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeMgtExitBTNActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_EmployeeMgtExitBTNActionPerformed

    private void EmployeeDetailsSubmitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeDetailsSubmitBTNActionPerformed
        // TODO add your handling code here:
        String fullName = inputfullname.getText();
        String epfNumber = inputepfnumber.getText();
        String department = selectdepartment.getSelectedItem().toString();
        String designation = selectdesignation.getSelectedItem().toString();

        
        // Specify the file path where you want to save the data
        String filePath = "Add Employees.txt";

        try {
            // Create a BufferedWriter to write to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));

            // Write employee details to the file
//            writer.write("Full Name: " + fullName);
//            writer.newLine();
//            writer.write("EPF Number: " + epfNumber);
//            writer.newLine();
//            writer.write("Department: " + department);
//            writer.newLine();
//            writer.write("Designation: " + designation);
//            writer.newLine();
//            writer.newLine(); // Add an empty line between entries

               writer.write("Full Name: " + fullName + "\t" + "EPF Number: " + epfNumber + "\t" + "Department: " + department + "\t" + "Designation: " + designation + "\n");
               writer.newLine();

            // Close the writer to release resources
            writer.close();

            JOptionPane.showMessageDialog(this, "Employee details saved to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "An error occurred while saving the data to the file.");
        }
    }//GEN-LAST:event_EmployeeDetailsSubmitBTNActionPerformed

    private void EmpMngBackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpMngBackBTNActionPerformed
        // TODO add your handling code here:
        HRManagerSection obj = new HRManagerSection();
        obj.show();
        this.dispose();
    }//GEN-LAST:event_EmpMngBackBTNActionPerformed

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
            java.util.logging.Logger.getLogger(AddEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EmpMngBackBTN;
    private javax.swing.JButton EmployeeDetailsSubmitBTN;
    private javax.swing.JButton EmployeeMgtExitBTN;
    private javax.swing.JTextField inputepfnumber;
    private javax.swing.JTextField inputfullname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> selectdepartment;
    private javax.swing.JComboBox<String> selectdesignation;
    // End of variables declaration//GEN-END:variables
}
