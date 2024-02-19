/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UIPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author DELL
 */
public class HRAssistanceSection extends javax.swing.JFrame {

    /**
     * Creates new form HRAssistanceSection
     */
    public HRAssistanceSection() {
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
        SearchEmployeeDetails = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeDetailsSow = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        HRAssiExitBTN = new javax.swing.JButton();
        HRAssiBackBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("HR Assistant Section");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Search Employee Details");

        SearchEmployeeDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchEmployeeDetailsActionPerformed(evt);
            }
        });

        searchbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        EmployeeDetailsSow.setColumns(20);
        EmployeeDetailsSow.setRows(5);
        jScrollPane1.setViewportView(EmployeeDetailsSow);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Employee Details");

        HRAssiExitBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        HRAssiExitBTN.setText("Exit");
        HRAssiExitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HRAssiExitBTNActionPerformed(evt);
            }
        });

        HRAssiBackBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HRAssiBackBTN.setText("Back");
        HRAssiBackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HRAssiBackBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(HRAssiExitBTN)
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(HRAssiBackBTN)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SearchEmployeeDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(searchbtn)))))
                .addContainerGap(231, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchEmployeeDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbtn))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HRAssiExitBTN)
                    .addComponent(HRAssiBackBTN))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HRAssiExitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HRAssiExitBTNActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_HRAssiExitBTNActionPerformed

    private void SearchEmployeeDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchEmployeeDetailsActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_SearchEmployeeDetailsActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
        // Read the search keywords from the SearchEmployeeDetails field
        String searchKeywords = SearchEmployeeDetails.getText().toLowerCase().trim();

        // Read data from "Add Employees.txt" and search for relevant information
        try (BufferedReader br = new BufferedReader(new FileReader("Add Employees.txt"))) {
            String line;
            StringBuilder result = new StringBuilder();

            while ((line = br.readLine()) != null) {
                // Convert the entire line to lowercase for case-insensitive search
                String lineLowerCase = line.toLowerCase();

                // Check if the entire line contains the search keywords
                if (lineLowerCase.contains(searchKeywords)) {
                    result.append(line).append("\n");
                }
            }

            // Display the results in the EmployeeDetailsSow text area
            EmployeeDetailsSow.setText(result.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_searchbtnActionPerformed

    private void HRAssiBackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HRAssiBackBTNActionPerformed
        // TODO add your handling code here:
        MainDashbord obj = new MainDashbord();
        obj.show();
        this.dispose();
    }//GEN-LAST:event_HRAssiBackBTNActionPerformed

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
            java.util.logging.Logger.getLogger(HRAssistanceSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HRAssistanceSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HRAssistanceSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HRAssistanceSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HRAssistanceSection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea EmployeeDetailsSow;
    private javax.swing.JButton HRAssiBackBTN;
    private javax.swing.JButton HRAssiExitBTN;
    private javax.swing.JTextField SearchEmployeeDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchbtn;
    // End of variables declaration//GEN-END:variables
}
