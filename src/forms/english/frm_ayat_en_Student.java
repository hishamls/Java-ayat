/*
 Second screen...Welcome
 */
package forms.english;

import ayat.Tools;
import entity.Ayat_Student;
import javax.swing.ImageIcon;

/**
 *
 * @author hishamls
 */
public class frm_ayat_en_Student extends javax.swing.JFrame {

    Ayat_Student s = new Ayat_Student();
    int btnFunc = 1;

    public frm_ayat_en_Student() {
        initComponents();
        if (frm_ayat_en_main.sEdit == 2) {
            this.setTitle("Upadte Student"); // I TOOK LOCATION FROM PROBARITIES IMAGE
            btn_EditUsr_.setIcon(new ImageIcon("/home/hishamls/NetBeansProjects/Ayat/src/tools/controls/male-user-edit_128.png"));
            btnFunc = 2;
            txt_sMobile.setEnabled(true);
            txt_sName.setEnabled(true);
            rdo_Female.setEnabled(true);
            rdo_Male.setEnabled(true);
        }
        if (frm_ayat_en_main.sEdit == 3) {
            this.setTitle("Delete Student");
            btn_EditUsr_.setIcon(new ImageIcon("/home/hishamls/NetBeansProjects/Ayat/src/tools/controls/delete_male_user128.png"));
            btnFunc = 3;
            txt_sMobile.setEnabled(false);
            txt_sName.setEnabled(false);
            rdo_Female.setEnabled(false);
            rdo_Male.setEnabled(false);
        }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdG_gender = new javax.swing.ButtonGroup();
        btn_back = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txt_sName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txt_sMobile = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        rdo_Male = new javax.swing.JRadioButton();
        rdo_Female = new javax.swing.JRadioButton();
        btn_EditUsr_ = new javax.swing.JButton();
        lbl_background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnu_Admin = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        mnu_Teacher = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        mnu_Student = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Student");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_back.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 486, 162, 45));

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 72, -1, -1));

        txt_ID.setBackground(new java.awt.Color(0, 0, 0, 1));
        txt_ID.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        txt_ID.setForeground(new java.awt.Color(204, 255, 204));
        txt_ID.setBorder(null);
        getContentPane().add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 63, 240, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 108, 240, 5));

        txt_sName.setBackground(new java.awt.Color(0, 0, 0, 1));
        txt_sName.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        txt_sName.setForeground(new java.awt.Color(204, 255, 204));
        txt_sName.setBorder(null);
        getContentPane().add(txt_sName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 117, 240, 40));

        jLabel2.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mobile");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 189, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 216, 240, 9));

        txt_sMobile.setBackground(new java.awt.Color(0, 0, 0, 1));
        txt_sMobile.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        txt_sMobile.setForeground(new java.awt.Color(204, 255, 204));
        txt_sMobile.setBorder(null);
        getContentPane().add(txt_sMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 171, 240, 40));

        jLabel3.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 126, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 162, 240, 5));

        rdo_Male.setBackground(new java.awt.Color(0, 0, 0, 80));
        rdG_gender.add(rdo_Male);
        rdo_Male.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        rdo_Male.setForeground(new java.awt.Color(153, 255, 153));
        rdo_Male.setSelected(true);
        rdo_Male.setText("Male");
        getContentPane().add(rdo_Male, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 243, -1, -1));

        rdo_Female.setBackground(new java.awt.Color(0, 0, 0, 80));
        rdG_gender.add(rdo_Female);
        rdo_Female.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        rdo_Female.setForeground(new java.awt.Color(153, 255, 153));
        rdo_Female.setText("Female");
        getContentPane().add(rdo_Female, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 243, -1, -1));

        btn_EditUsr_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/controls/Male-user-add-icon-btn.png"))); // NOI18N
        btn_EditUsr_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditUsr_ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_EditUsr_, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 63, -1, 153));

        lbl_background.setBackground(new java.awt.Color(0, 0, 0, 80));
        lbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/quran_ar3.jpg"))); // NOI18N
        getContentPane().add(lbl_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mnu_Admin.setText("Admin");

        jMenu4.setText("Teacher");

        jMenuItem2.setText("Add");
        jMenu4.add(jMenuItem2);

        jMenuItem3.setText("Update");
        jMenu4.add(jMenuItem3);

        jMenuItem1.setText("Delete");
        jMenu4.add(jMenuItem1);

        mnu_Admin.add(jMenu4);

        jMenu5.setText("Student");

        jMenuItem4.setText("Add");
        jMenu5.add(jMenuItem4);

        jMenuItem5.setText("Update");
        jMenu5.add(jMenuItem5);

        jMenuItem6.setText("Delete");
        jMenu5.add(jMenuItem6);

        mnu_Admin.add(jMenu5);

        jMenu6.setText("Course");

        jMenuItem7.setText("Add");
        jMenu6.add(jMenuItem7);

        jMenuItem8.setText("Update");
        jMenu6.add(jMenuItem8);

        jMenuItem9.setText("Delete");
        jMenu6.add(jMenuItem9);

        mnu_Admin.add(jMenu6);

        jMenuBar1.add(mnu_Admin);

        mnu_Teacher.setText("Teacher");

        jMenuItem17.setText("Profile");
        mnu_Teacher.add(jMenuItem17);

        jMenuItem18.setText("Courses");
        mnu_Teacher.add(jMenuItem18);

        jMenuItem19.setText("Students");
        mnu_Teacher.add(jMenuItem19);

        jMenuBar1.add(mnu_Teacher);

        mnu_Student.setText("Student");

        jMenuItem10.setText("Profile");
        mnu_Student.add(jMenuItem10);

        jMenuItem11.setText("Courses");
        mnu_Student.add(jMenuItem11);

        jMenuItem12.setText("Doctors");
        mnu_Student.add(jMenuItem12);

        jMenuItem13.setText("Delete");
        mnu_Student.add(jMenuItem13);

        jMenuItem14.setText("Add");
        mnu_Student.add(jMenuItem14);

        jMenuItem15.setText("Update");
        mnu_Student.add(jMenuItem15);

        jMenuItem16.setText("Delete");
        mnu_Student.add(jMenuItem16);

        jMenuBar1.add(mnu_Student);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        this.dispose();
        Tools.openForm(new frm_ayat_en_main());
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_EditUsr_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditUsr_ActionPerformed

        switch (btnFunc) {
            case 1: {
                boolean isTxtEmpty = dp.Go.isEmpty(txt_sName.getText(), txt_sMobile.getText());
                if (isTxtEmpty) {
                    Tools.msgBox("One or more field is empty!");}
                boolean isFound= dp.Go.chekStudntID(Integer.parseInt(txt_ID.getText()));
                if (isFound){ 
                        Tools.msgBox("This ID is token!");
                    
                }else { 
                    setValues();
                    s.add();
                    clear();
                }
            }
            break;
            case 2: {
                boolean isTxtEmpty = dp.Go.isEmpty(txt_sName.getText(), txt_sMobile.getText());
                if (isTxtEmpty) {
                    Tools.msgBox("One or more field is empty!");
                 }else { 
                    setValues();
                    s.update();
                    clear();
                }
            }
            break;
            case 3: {
                boolean isTxtEmpty = dp.Go.isEmpty( txt_ID.getText());
                if (isTxtEmpty) { 
                    Tools.msgBox("ID is empty!");
                    s.delete();
                 }else { 
                    setValues();
                    s.delete();
                    clear();
                }
            }
            break;
        }


    }//GEN-LAST:event_btn_EditUsr_ActionPerformed

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
            java.util.logging.Logger.getLogger(frm_ayat_en_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_en_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_en_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_en_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_ayat_en_Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_EditUsr_;
    private javax.swing.JButton btn_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbl_background;
    public javax.swing.JMenu mnu_Admin;
    public javax.swing.JMenu mnu_Student;
    public javax.swing.JMenu mnu_Teacher;
    private javax.swing.ButtonGroup rdG_gender;
    private javax.swing.JRadioButton rdo_Female;
    private javax.swing.JRadioButton rdo_Male;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_sMobile;
    private javax.swing.JTextField txt_sName;
    // End of variables declaration//GEN-END:variables
    
    private void setValues() {
        s.setID(Integer.parseInt(txt_ID.getText()));
        s.setFirst_Name(txt_sName.getText());
        s.setPhone(txt_sMobile.getText());
        s.setGender(getGender());
//        s.setGender(rdG_gender.getSelection().getActionCommand()); //NOT WORKING
        
    
    }
    private void clear() {
        Tools.clearTxt(this);
        txt_ID.setText(s.getAutoNumber());
        txt_sName.setRequestFocusEnabled(true);
    }
    private String getGender() {

    if(rdo_Male.isSelected())
    {
        return "Male";
    }
    else if(rdo_Female.isSelected())
    {
        return "Female";
    }
    else
    {
        return null;
    }
}    
}
