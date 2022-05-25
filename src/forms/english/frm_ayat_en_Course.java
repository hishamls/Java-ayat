/*
 Course
 */
package forms.english;

import ayat.Tools;
import entity.Ayat_Courses;

/**
 *
 * @author hishamls
 */
public class frm_ayat_en_Course extends javax.swing.JFrame {

    public static int sEdit;
    int sem = dp.Go.sem;

    public frm_ayat_en_Course() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_back = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_course = new javax.swing.JTable();
        btn_cancel = new javax.swing.JButton();
        btn_add_course = new javax.swing.JButton();
        btn_update_course_ = new javax.swing.JButton();
        btn_delete_course_ = new javax.swing.JButton();
        btn_print = new javax.swing.JButton();
        btn_confirm = new javax.swing.JButton();
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
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnI_Fees = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnI_Semester_Edit = new javax.swing.JMenuItem();
        mnu_Teacher = new javax.swing.JMenu();
        mnI_teacher_info = new javax.swing.JMenuItem();
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
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 135, 45));

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0, 100)
        );

        tbl_course.setBackground(new java.awt.Color(0, 0, 0, 100)
        );
        tbl_course.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        tbl_course.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Semester", "Course ID", "Course Name", "Course hours", "Teacher", "Submit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_course);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 520, 240));

        btn_cancel.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 135, 45));

        btn_add_course.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        btn_add_course.setText("Add");
        btn_add_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_courseActionPerformed(evt);
            }
        });
        getContentPane().add(btn_add_course, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 135, 45));

        btn_update_course_.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        btn_update_course_.setText("Update");
        btn_update_course_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update_course_ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update_course_, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 135, 45));

        btn_delete_course_.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        btn_delete_course_.setText("Delete");
        btn_delete_course_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_course_ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delete_course_, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 135, 45));

        btn_print.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        btn_print.setText("Print");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        getContentPane().add(btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 135, 45));

        btn_confirm.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        btn_confirm.setText("Confirm");
        btn_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmActionPerformed(evt);
            }
        });
        getContentPane().add(btn_confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 135, 45));

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
        jMenu5.add(jSeparator2);

        mnI_Fees.setText("Fees");
        mnI_Fees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnI_FeesActionPerformed(evt);
            }
        });
        jMenu5.add(mnI_Fees);

        mnu_Admin.add(jMenu5);

        jMenu6.setText("Course");

        jMenuItem7.setText("Add");
        jMenu6.add(jMenuItem7);

        jMenuItem8.setText("Update");
        jMenu6.add(jMenuItem8);

        jMenuItem9.setText("Delete");
        jMenu6.add(jMenuItem9);

        mnu_Admin.add(jMenu6);
        mnu_Admin.add(jSeparator1);

        mnI_Semester_Edit.setText("Semester Edit");
        mnI_Semester_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnI_Semester_EditActionPerformed(evt);
            }
        });
        mnu_Admin.add(mnI_Semester_Edit);

        jMenuBar1.add(mnu_Admin);

        mnu_Teacher.setText("Teacher");

        mnI_teacher_info.setText("Profile");
        mnI_teacher_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnI_teacher_infoActionPerformed(evt);
            }
        });
        mnu_Teacher.add(mnI_teacher_info);

        jMenuItem18.setText("Courses");
        mnu_Teacher.add(jMenuItem18);

        jMenuItem19.setText("Students");
        mnu_Teacher.add(jMenuItem19);

        jMenuBar1.add(mnu_Teacher);

        mnu_Student.setText("Student");

        mnI_infoUsr_.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_DOWN_MASK));
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

        mnI_addUsr_.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnI_addUsr_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/controls/user-add-icon.png"))); // NOI18N
        mnI_addUsr_.setText("Add");
        mnI_addUsr_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnI_addUsr_ActionPerformed(evt);
            }
        });
        mnu_Student.add(mnI_addUsr_);

        mnI_updatUsr_.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnI_updatUsr_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/controls/user-edit-icon16.png"))); // NOI18N
        mnI_updatUsr_.setText("Update");
        mnI_updatUsr_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnI_updatUsr_ActionPerformed(evt);
            }
        });
        mnu_Student.add(mnI_updatUsr_);

        mnI_deletUsr.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_DOWN_MASK));
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
        Tools.openForm(new frm_ayat_SignIn());
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
        this.dispose();
        frm_ayat_en_Student_Info sMenu = new frm_ayat_en_Student_Info();
        Tools.openForm(sMenu);
        sMenu.mnu_Admin.setEnabled(false);
        sMenu.mnu_Teacher.setEnabled(false);


    }//GEN-LAST:event_mnI_infoUsr_ActionPerformed

    private void mnI_teacher_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnI_teacher_infoActionPerformed
        this.dispose();
        frm_ayat_en_Teacher_Info tMenu = new frm_ayat_en_Teacher_Info();
        Tools.openForm(tMenu);
        tMenu.mnu_Admin.setEnabled(false);
        tMenu.mnu_Student.setEnabled(false);

    }//GEN-LAST:event_mnI_teacher_infoActionPerformed

    private void mnI_Semester_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnI_Semester_EditActionPerformed
        this.dispose();
        Tools.openForm(new frm_ayat_en_Semester());
    }//GEN-LAST:event_mnI_Semester_EditActionPerformed

    private void mnI_FeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnI_FeesActionPerformed
        this.dispose();
        Tools.openForm(new frm_ayat_en_Fees());
    }//GEN-LAST:event_mnI_FeesActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        clear();
        btn_add_course.setEnabled(true);
        btn_delete_course_.setEnabled(true);
        btn_update_course_.setEnabled(false);
        btn_cancel.setEnabled(false);
        btn_confirm.setEnabled(false);

    }//GEN-LAST:event_btn_cancelActionPerformed
    Ayat_Courses crs;
    private void btn_add_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_courseActionPerformed
        int value = Integer.parseInt((String) Tools.inputBox("Enter the strudent ID: "));
        if (value == 0) {
            btn_add_course.setEnabled(false);
            btn_delete_course_.setEnabled(false);
            btn_update_course_.setEnabled(false);
            btn_cancel.setEnabled(true);
            btn_confirm.setEnabled(true);
           crs.getCustomRows("SELECT * FROM view_Course WHERE Semester=" + sem, tbl_course);
        } else {
        }

    }//GEN-LAST:event_btn_add_courseActionPerformed

    private void btn_update_course_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update_course_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_update_course_ActionPerformed

    private void btn_delete_course_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_course_ActionPerformed
        btn_add_course.setEnabled(false);
        btn_delete_course_.setEnabled(false);
        btn_update_course_.setEnabled(false);
        btn_cancel.setEnabled(true);
        btn_confirm.setEnabled(true);

        Tools.ConfirmMessege("Are you sure?");

    }//GEN-LAST:event_btn_delete_course_ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Tools.setReport(tbl_course);

        clear();
    }//GEN-LAST:event_formWindowOpened

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        Tools.printReport(tbl_course, "Course");
    }//GEN-LAST:event_btn_printActionPerformed

    private void btn_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_confirmActionPerformed

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
            java.util.logging.Logger.getLogger(frm_ayat_en_Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_en_Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_en_Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_en_Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_ayat_en_Course().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_course;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_confirm;
    private javax.swing.JButton btn_delete_course_;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_update_course_;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JMenuItem mnI_Fees;
    private javax.swing.JMenuItem mnI_Semester_Edit;
    private javax.swing.JMenuItem mnI_addUsr_;
    private javax.swing.JMenuItem mnI_deletUsr;
    private javax.swing.JMenuItem mnI_infoUsr_;
    private javax.swing.JMenuItem mnI_teacher_info;
    private javax.swing.JMenuItem mnI_updatUsr_;
    public javax.swing.JMenu mnu_Admin;
    public javax.swing.JMenu mnu_Student;
    public javax.swing.JMenu mnu_Teacher;
    private javax.swing.JTable tbl_course;
    // End of variables declaration//GEN-END:variables

    private void clear() {
        Tools.clearTxt(this);
        btn_add_course.setEnabled(true);
        btn_update_course_.setEnabled(false);
        btn_delete_course_.setEnabled(false);
        dp.Go.getAllRows(tbl_course);
    }
}
