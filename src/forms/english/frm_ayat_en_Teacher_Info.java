/*
Teacher info
 */
package forms.english;

import ayat.Tools;

/**
 *
 * @author hishamls
 */
public class frm_ayat_en_Teacher_Info extends javax.swing.JFrame {

   
   
    public static int sEdit;
  

    public frm_ayat_en_Teacher_Info()  {
        initComponents();
        int ids = dp.Go.idD;
        dp.Go.info_teacher(ids);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel4 = new javax.swing.JLabel();
        txt_EMail = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txt_LastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        txt_BirthDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txt_Gender = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        txt_UserName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        txt_sPassword = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
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
        mnI_infoUsr_ = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        mnI_addUsr_ = new javax.swing.JMenuItem();
        mnI_updatUsr_ = new javax.swing.JMenuItem();
        mnI_deletUsr = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_back.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 486, 135, 45));

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 72, -1, -1));

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
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 234, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 261, 240, 9));

        txt_sMobile.setBackground(new java.awt.Color(0, 0, 0, 1));
        txt_sMobile.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        txt_sMobile.setForeground(new java.awt.Color(204, 255, 204));
        txt_sMobile.setBorder(null);
        getContentPane().add(txt_sMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 216, 240, 40));

        jLabel3.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 126, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 162, 240, 5));

        jLabel4.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("E Mail");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 279, -1, -1));

        txt_EMail.setBackground(new java.awt.Color(0, 0, 0, 1));
        txt_EMail.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        txt_EMail.setForeground(new java.awt.Color(204, 255, 204));
        txt_EMail.setBorder(null);
        getContentPane().add(txt_EMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 240, 40));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 315, 240, 5));

        txt_LastName.setBackground(new java.awt.Color(0, 0, 0, 1));
        txt_LastName.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        txt_LastName.setForeground(new java.awt.Color(204, 255, 204));
        txt_LastName.setBorder(null);
        getContentPane().add(txt_LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 171, 240, 40));

        jLabel5.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Birth Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 351, -1, -1));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 378, 240, 9));

        txt_BirthDate.setBackground(new java.awt.Color(0, 0, 0, 1));
        txt_BirthDate.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        txt_BirthDate.setForeground(new java.awt.Color(204, 255, 204));
        txt_BirthDate.setBorder(null);
        getContentPane().add(txt_BirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 333, 240, 40));

        jLabel6.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Last Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 180, -1, -1));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 216, 240, 5));

        jLabel7.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gender");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 387, -1, -1));

        txt_Gender.setBackground(new java.awt.Color(0, 0, 0, 1));
        txt_Gender.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        txt_Gender.setForeground(new java.awt.Color(204, 255, 204));
        txt_Gender.setBorder(null);
        getContentPane().add(txt_Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 378, 240, 40));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 423, 240, 5));

        txt_UserName.setBackground(new java.awt.Color(0, 0, 0, 1));
        txt_UserName.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        txt_UserName.setForeground(new java.awt.Color(204, 255, 204));
        txt_UserName.setBorder(null);
        getContentPane().add(txt_UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 432, 240, 40));

        jLabel8.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 504, -1, -1));
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 531, 240, 9));

        txt_sPassword.setBackground(new java.awt.Color(0, 0, 0, 1));
        txt_sPassword.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        txt_sPassword.setForeground(new java.awt.Color(204, 255, 204));
        txt_sPassword.setBorder(null);
        getContentPane().add(txt_sPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 486, 240, 40));

        jLabel9.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("User Name");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 441, -1, -1));
        getContentPane().add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 477, 240, 5));

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

        mnI_infoUsr_.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        mnI_infoUsr_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/controls/male-user-info_32.png"))); // NOI18N
        mnI_infoUsr_.setText("Profile");
        mnI_infoUsr_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnI_infoUsr_ActionPerformed(evt);
            }
        });
        mnu_Student.add(mnI_infoUsr_);

        jMenuItem11.setText("Courses");
        mnu_Student.add(jMenuItem11);

        jMenuItem12.setText("Doctors");
        mnu_Student.add(jMenuItem12);

        jMenuItem13.setText("Delete");
        mnu_Student.add(jMenuItem13);

        mnI_addUsr_.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        mnI_addUsr_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/controls/user-add-icon.png"))); // NOI18N
        mnI_addUsr_.setText("Add");
        mnI_addUsr_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnI_addUsr_ActionPerformed(evt);
            }
        });
        mnu_Student.add(mnI_addUsr_);

        mnI_updatUsr_.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        mnI_updatUsr_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/controls/user-edit-icon16.png"))); // NOI18N
        mnI_updatUsr_.setText("Update");
        mnI_updatUsr_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnI_updatUsr_ActionPerformed(evt);
            }
        });
        mnu_Student.add(mnI_updatUsr_);

        mnI_deletUsr.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        mnI_deletUsr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/controls/user-delete-icon16.png"))); // NOI18N
        mnI_deletUsr.setText("Delete");
        mnI_deletUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnI_deletUsrActionPerformed(evt);
            }
        });
        mnu_Student.add(mnI_deletUsr);

        jMenuBar1.add(mnu_Student);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
         this.dispose(); 
        frm_ayat_en_main main =new frm_ayat_en_main();
        Tools.openForm(main);
        main.mnu_Admin.setEnabled(false);
        main.mnu_Student.setEnabled(false);
    }//GEN-LAST:event_btn_backActionPerformed

    private void mnI_addUsr_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnI_addUsr_ActionPerformed
        sEdit = 1;
        Tools.openForm(new frm_ayat_en_Student());

    }//GEN-LAST:event_mnI_addUsr_ActionPerformed

    private void mnI_updatUsr_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnI_updatUsr_ActionPerformed
        sEdit = 2;
        Tools.openForm(new frm_ayat_en_Student());

    }//GEN-LAST:event_mnI_updatUsr_ActionPerformed

    private void mnI_deletUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnI_deletUsrActionPerformed
        sEdit = 3;
        Tools.openForm(new frm_ayat_en_Student());

    }//GEN-LAST:event_mnI_deletUsrActionPerformed

    private void mnI_infoUsr_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnI_infoUsr_ActionPerformed
        
            Tools.openForm(new frm_ayat_en_Teacher_Info());
        
    }//GEN-LAST:event_mnI_infoUsr_ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(frm_ayat_en_Teacher_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_en_Teacher_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_en_Teacher_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_en_Teacher_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             
                    new frm_ayat_en_Teacher_Info().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
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
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JMenuItem mnI_addUsr_;
    private javax.swing.JMenuItem mnI_deletUsr;
    private javax.swing.JMenuItem mnI_infoUsr_;
    private javax.swing.JMenuItem mnI_updatUsr_;
    public javax.swing.JMenu mnu_Admin;
    public javax.swing.JMenu mnu_Student;
    public javax.swing.JMenu mnu_Teacher;
    public static javax.swing.JTextField txt_BirthDate;
    public static javax.swing.JTextField txt_EMail;
    public static javax.swing.JTextField txt_Gender;
    public static javax.swing.JTextField txt_ID;
    public static javax.swing.JTextField txt_LastName;
    public static javax.swing.JTextField txt_UserName;
    public static javax.swing.JTextField txt_sMobile;
    public static javax.swing.JTextField txt_sName;
    public static javax.swing.JTextField txt_sPassword;
    // End of variables declaration//GEN-END:variables


   


}
