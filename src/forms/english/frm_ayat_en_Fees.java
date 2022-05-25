/*
 Fees
 */
package forms.english;

import ayat.Tools;
import java.awt.event.KeyEvent;

/**
 *
 * @author hishamls
 */
public class frm_ayat_en_Fees extends javax.swing.JFrame {

    static entity.Ayat_Student st;
    public static int sEdit;

    public frm_ayat_en_Fees()  {
        initComponents();
        int ids = dp.Go.idD;
        dp.Go.info_student(ids);
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
        txt_fees = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txt_paied = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txt_LastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        txt_rest_ = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txt_pay_ = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        btn_payment = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student info.");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        btn_back.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back);
        btn_back.setBounds(30, 460, 135, 45);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 0, 0);

        jLabel1.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(216, 72, 8, 14);

        txt_ID.setBackground(new java.awt.Color(0, 0, 0, 100));
        txt_ID.setFont(new java.awt.Font("Chilanka", 0, 20)); // NOI18N
        txt_ID.setForeground(new java.awt.Color(204, 255, 204));
        txt_ID.setBorder(null);
        txt_ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_IDKeyPressed(evt);
            }
        });
        getContentPane().add(txt_ID);
        txt_ID.setBounds(360, 63, 240, 40);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(360, 108, 240, 5);

        txt_sName.setBackground(new java.awt.Color(0, 0, 0, 100));
        txt_sName.setFont(new java.awt.Font("Chilanka", 0, 20)); // NOI18N
        txt_sName.setForeground(new java.awt.Color(204, 255, 204));
        txt_sName.setBorder(null);
        getContentPane().add(txt_sName);
        txt_sName.setBounds(360, 117, 240, 40);

        jLabel2.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fees");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(216, 234, 28, 14);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(360, 270, 240, 9);

        txt_fees.setBackground(new java.awt.Color(0, 0, 0, 100));
        txt_fees.setFont(new java.awt.Font("Chilanka", 0, 20)); // NOI18N
        txt_fees.setForeground(new java.awt.Color(204, 255, 204));
        txt_fees.setBorder(null);
        getContentPane().add(txt_fees);
        txt_fees.setBounds(360, 225, 240, 40);

        jLabel3.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(216, 126, 59, 14);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(360, 162, 240, 5);

        jLabel4.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Paid");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(216, 288, 22, 14);

        txt_paied.setBackground(new java.awt.Color(0, 0, 0, 100));
        txt_paied.setFont(new java.awt.Font("Chilanka", 0, 20)); // NOI18N
        txt_paied.setForeground(new java.awt.Color(204, 255, 204));
        txt_paied.setBorder(null);
        getContentPane().add(txt_paied);
        txt_paied.setBounds(360, 279, 240, 40);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(360, 324, 240, 9);

        txt_LastName.setBackground(new java.awt.Color(0, 0, 0, 100));
        txt_LastName.setFont(new java.awt.Font("Chilanka", 0, 20)); // NOI18N
        txt_LastName.setForeground(new java.awt.Color(204, 255, 204));
        txt_LastName.setBorder(null);
        getContentPane().add(txt_LastName);
        txt_LastName.setBounds(360, 171, 240, 40);

        jLabel5.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Rest");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(216, 342, 26, 14);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(360, 378, 240, 9);

        txt_rest_.setBackground(new java.awt.Color(0, 0, 0, 100));
        txt_rest_.setFont(new java.awt.Font("Chilanka", 0, 20)); // NOI18N
        txt_rest_.setForeground(new java.awt.Color(204, 255, 204));
        txt_rest_.setBorder(null);
        getContentPane().add(txt_rest_);
        txt_rest_.setBounds(360, 333, 240, 40);

        jLabel6.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Last Name");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(216, 180, 56, 14);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(360, 216, 240, 5);

        jLabel7.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pay");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(216, 387, 18, 14);

        txt_pay_.setBackground(new java.awt.Color(0, 0, 0, 100));
        txt_pay_.setFont(new java.awt.Font("Chilanka", 0, 20)); // NOI18N
        txt_pay_.setForeground(new java.awt.Color(204, 255, 204));
        txt_pay_.setBorder(null);
        getContentPane().add(txt_pay_);
        txt_pay_.setBounds(360, 387, 240, 40);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(360, 432, 240, 5);

        btn_payment.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        btn_payment.setText("Pay");
        btn_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paymentActionPerformed(evt);
            }
        });
        getContentPane().add(btn_payment);
        btn_payment.setBounds(639, 387, 135, 45);

        btn_reset.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reset);
        btn_reset.setBounds(360, 450, 135, 45);

        lbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/quran_ar3.jpg"))); // NOI18N
        getContentPane().add(lbl_background);
        lbl_background.setBounds(0, 0, 800, 566);

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
        frm_ayat_en_main main =new frm_ayat_en_main();
        Tools.openForm(main);
        main.mnu_Admin.setEnabled(false);
        main.mnu_Teacher.setEnabled(false);
         
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
        
            Tools.openForm(new frm_ayat_en_Fees());
      
    }//GEN-LAST:event_mnI_infoUsr_ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void btn_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paymentActionPerformed
        if (!txt_pay_.getText().equals("") && Integer.parseInt(txt_pay_.getText()) >0) {
                    dp.Go.pay_rest();
        } else {
            Tools.msgBox("Enter a positive value!");
        }
    }//GEN-LAST:event_btn_paymentActionPerformed

    private void txt_IDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IDKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if ("".equals(txt_ID.getText())) 
                Tools.msgBox("Enter the student ID!");
            else 
                dp.Go.fees_student_info_(Integer.parseInt(txt_ID.getText()));
        }
    
    }//GEN-LAST:event_txt_IDKeyPressed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
       Tools.clearTxt(this);
    }//GEN-LAST:event_btn_resetActionPerformed

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
            java.util.logging.Logger.getLogger(frm_ayat_en_Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_en_Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_en_Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_en_Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
              
                    new frm_ayat_en_Fees().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_payment;
    private javax.swing.JButton btn_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JLabel lbl_background;
    private javax.swing.JMenuItem mnI_addUsr_;
    private javax.swing.JMenuItem mnI_deletUsr;
    private javax.swing.JMenuItem mnI_infoUsr_;
    private javax.swing.JMenuItem mnI_updatUsr_;
    public javax.swing.JMenu mnu_Admin;
    public javax.swing.JMenu mnu_Student;
    public javax.swing.JMenu mnu_Teacher;
    public static javax.swing.JTextField txt_ID;
    public static javax.swing.JTextField txt_LastName;
    public static javax.swing.JTextField txt_fees;
    public static javax.swing.JTextField txt_paied;
    public static javax.swing.JTextField txt_pay_;
    public static javax.swing.JTextField txt_rest_;
    public static javax.swing.JTextField txt_sName;
    // End of variables declaration//GEN-END:variables

  



 

}
