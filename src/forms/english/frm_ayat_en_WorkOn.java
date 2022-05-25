/*
Work on Form
 */
package forms.english;

import ayat.Tools;
import entity.Ayat_Employee;
//import entity.Ayat_Course;
import entity.Ayat_WorkOn;
import java.awt.Color;
import java.text.MessageFormat;
import javax.swing.JTable;

/**
 *
 * @author hishamls
 */
public class frm_ayat_en_WorkOn extends javax.swing.JFrame {

    /**
     * Creates new form frmWorkOn
     */
    public frm_ayat_en_WorkOn() {
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

        searchGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rdoEmpNo = new javax.swing.JRadioButton();
        rdoEmpName = new javax.swing.JRadioButton();
        rdoProNo = new javax.swing.JRadioButton();
        rdoProName = new javax.swing.JRadioButton();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkOn = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Work On");

        jLabel2.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel2.setText("Course");

        jLabel3.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel3.setText("Teacher");

        jLabel4.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel4.setText("Search By");

        rdoEmpNo.setSelected(true);
        rdoEmpNo.setText("Teacher_ID");

        rdoEmpName.setText("Teacher_Name");

        rdoProNo.setText("Course_ID");

        rdoProName.setText("Course_Name");

        tblWorkOn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teacher_ID", "Teacher_Name", "Course_ID", "Course_Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblWorkOn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblWorkOnMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblWorkOn);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(342, 342, 342)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(235, 235, 235)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoEmpNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoEmpName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoProNo))
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoProName))
                    .addComponent(jScrollPane1))
                .addGap(44, 44, 44))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jLabel3)
                    .addContainerGap(856, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rdoEmpNo)
                    .addComponent(rdoEmpName)
                    .addComponent(rdoProNo)
                    .addComponent(rdoProName))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addComponent(jLabel3)
                    .addContainerGap(304, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        Tools.openForm(new frm_ayat_SignIn());
    }//GEN-LAST:event_btnBackActionPerformed

    private void cbXEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbXEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbXEmpActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//        dp.Go.fillCombo("Ayat_Teacher", "Name", cbXEmp);
//        dp.Go.fillCombo("project", "Project_Name", cbXProj);
        
        searchGroup.add(rdoEmpName);
        searchGroup.add(rdoEmpNo);
        searchGroup.add(rdoProName);
        searchGroup.add(rdoProNo);
        
        //for fixed table header
        tblWorkOn.getTableHeader().setReorderingAllowed(false);
        
        //For color table header
        tblWorkOn.getTableHeader().setBackground(Color.red);
        tblWorkOn.getTableHeader().setForeground(Color.black);
        tblWorkOn.setBackground(Color.pink);
        tblWorkOn.setForeground(Color.red);
        
        
        work.getAllRows(tblWorkOn);
    }//GEN-LAST:event_formWindowOpened

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        setValues();
        work.add();
        work.getAllRows(tblWorkOn);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        boolean isConfirm= Tools.ConfirmMessege("Are you sure to delete?");
        if (isConfirm){
            setValues();
            work.delete();
            work.getAllRows(tblWorkOn);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        String strEmpNo= (String) Tools.inputBox("Enter the employee no.:");
        String strProNo= (String)Tools.inputBox("Enter the project no.:");
        
        Integer empNo= Integer.parseInt(strEmpNo);
        Integer proNo= Integer.parseInt(strProNo);
        
       
        work.setEmpNo(empNo);
        work.setProjectNo(proNo);
        work.getOneRow(tblWorkOn);
        
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllActionPerformed
        work.getAllRows(tblWorkOn);
    }//GEN-LAST:event_btnAllActionPerformed

    private void tblWorkOnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblWorkOnMouseClicked
        try {
            int row= tblWorkOn.getSelectedRow();
            
            String empName= tblWorkOn.getValueAt(row, 1).toString();
            String proName= tblWorkOn.getValueAt(row, 3).toString();
            
//            cbXEmp.setSelectedItem(empName);
//            cbXProj.setSelectedItem(proName);
            
            
        } catch (Exception e) {
            Tools.msgBox(e.getMessage());
        }
    }//GEN-LAST:event_tblWorkOnMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       String strSearch= "SELECT * FROM workOn_view WHERE ";
              if (rdoEmpName.isSelected()) {
            strSearch += "Emp_Name";
        } else if (rdoEmpNo.isSelected()) {
            strSearch += "Emp_No";
        } else if (rdoProName.isSelected()) {
            strSearch += "Project_Name";
        } else {
            strSearch += "Project_No";
        }
        strSearch+= " LIKE '%"+ txtSearch.getText()+"%'";
        // 0. "";
        // 1. LIKE ''
        // 2. %%
        // 3. ""
        // 4. ++
        // 5. txtSearch.getText()
        
        work.getCustomRows(strSearch, tblWorkOn);
               
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try {
            MessageFormat header= new MessageFormat("Work On Report");
            MessageFormat footer= new MessageFormat("Page - {0}");
            tblWorkOn.print(JTable.PrintMode.FIT_WIDTH, header, footer);
            
        } catch (Exception e) {
            Tools.msgBox(e.getMessage());
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    
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
            java.util.logging.Logger.getLogger(frm_ayat_en_WorkOn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_en_WorkOn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_en_WorkOn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_en_WorkOn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_ayat_en_WorkOn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoEmpName;
    private javax.swing.JRadioButton rdoEmpNo;
    private javax.swing.JRadioButton rdoProName;
    private javax.swing.JRadioButton rdoProNo;
    private javax.swing.ButtonGroup searchGroup;
    private javax.swing.JTable tblWorkOn;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    Ayat_Employee emp = new Ayat_Employee();
//    Ayat_Course proj = new Ayat_Course();
    Ayat_WorkOn work= new Ayat_WorkOn();
    
    private void setValues() {
//      String empName= (String) cbXEmp.getSelectedItem();
//      String proName= (String) cbXProj.getSelectedItem();
      
//      String strEmpNo= emp.getValueByName(empName);
//      String strProNo= proj.getValueByName(proName);
      
//      int EmpNo= Integer.parseInt(strEmpNo);
//      int ProNo= Integer.parseInt(strProNo);
      
            
//      work.setEmpNo(EmpNo);
//      work.setProjectNo(ProNo);
    }
}
