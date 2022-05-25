/*
 arabic log in
 */
package forms;

import forms.english.frm_ayat_en_Sign_Up;
import forms.english.frm_ayat_SignIn;
import forms.english.frm_ayat_en_main;
import ayat.Tools;
import java.awt.ComponentOrientation;

/**
 *
 * @author hishamls
 */
public class frm_ayat_ar_log extends javax.swing.JFrame {

    /**
     * Creates new form frm_ayat_ar_log
     */
    public frm_ayat_ar_log() {
        initComponents();
        setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        MenuBar1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        mn_file.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        mnI_lang.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        mnI_exit.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        mn_help.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        mn_styel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        rdBMI1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        rdBMI2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        rdBMI3.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        
        mnI_help.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        mnI_about.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        txt_userName.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        txt_password.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        cb_Access.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
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
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txt_userName = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        chb_show = new javax.swing.JCheckBox();
        cb_Access = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        btn_enter_ = new java.awt.Button();
        btn_new_user_ = new java.awt.Button();
        lbl_background = new javax.swing.JLabel();
        MenuBar1 = new javax.swing.JMenuBar();
        mn_file = new javax.swing.JMenu();
        mnI_lang = new javax.swing.JMenuItem();
        mnI_exit = new javax.swing.JMenuItem();
        mn_help = new javax.swing.JMenu();
        mn_styel = new javax.swing.JMenu();
        rdBMI1 = new javax.swing.JRadioButtonMenuItem();
        rdBMI2 = new javax.swing.JRadioButtonMenuItem();
        rdBMI3 = new javax.swing.JRadioButtonMenuItem();
        mnI_help = new javax.swing.JMenuItem();
        mnI_about = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("تسجيل الدخول");
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Noto Sans Arabic UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("كلمة السر");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 153, 150, 35));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 126, 240, 40));

        jLabel3.setFont(new java.awt.Font("Noto Sans Arabic UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("أسم المستخدم");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 81, 150, 35));

        txt_userName.setBackground(new java.awt.Color(255, 0, 153));
        txt_userName.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        txt_userName.setForeground(new java.awt.Color(0, 0, 0));
        txt_userName.setBorder(null);
        jPanel1.add(txt_userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 81, 240, 40));

        txt_password.setBackground(new java.awt.Color(0, 204, 153));
        txt_password.setFont(new java.awt.Font("Chilanka", 0, 12)); // NOI18N
        txt_password.setForeground(new java.awt.Color(0, 0, 0));
        txt_password.setBorder(null);
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 153, 240, 40));

        chb_show.setBackground(new java.awt.Color(0, 0, 0, 80));
        chb_show.setFont(new java.awt.Font("Noto Sans Arabic UI", 1, 14)); // NOI18N
        chb_show.setForeground(new java.awt.Color(255, 255, 255));
        chb_show.setText("اظهر");
        chb_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_showActionPerformed(evt);
            }
        });
        jPanel1.add(chb_show, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 207, -1, -1));

        cb_Access.setBackground(new java.awt.Color(153, 255, 51));
        cb_Access.setFont(new java.awt.Font("Noto Sans Arabic UI", 1, 14)); // NOI18N
        cb_Access.setForeground(new java.awt.Color(0, 0, 0));
        cb_Access.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "اداري", "معلم", "طالب" }));
        cb_Access.setToolTipText("");
        cb_Access.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_AccessActionPerformed(evt);
            }
        });
        jPanel1.add(cb_Access, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 243, 240, 40));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 198, 240, 40));

        btn_enter_.setFont(new java.awt.Font("Noto Sans Arabic UI", 1, 14)); // NOI18N
        btn_enter_.setLabel("ادخل");
        btn_enter_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enter_ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_enter_, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 306, 102, 32));

        btn_new_user_.setActionCommand("مستخدم جديد");
        btn_new_user_.setFont(new java.awt.Font("Noto Sans Arabic UI", 1, 14)); // NOI18N
        btn_new_user_.setLabel("مستخدم جديد");
        btn_new_user_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_new_user_ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_new_user_, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 306, 102, 32));

        lbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/quran_ar3.jpg"))); // NOI18N
        jPanel1.add(lbl_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mn_file.setText("ملف");

        mnI_lang.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnI_lang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/English-icon.png"))); // NOI18N
        mnI_lang.setText("English");
        mnI_lang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnI_langActionPerformed(evt);
            }
        });
        mn_file.add(mnI_lang);

        mnI_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnI_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/exit-icon-16px.png"))); // NOI18N
        mnI_exit.setText("خروج");
        mnI_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnI_exitActionPerformed(evt);
            }
        });
        mn_file.add(mnI_exit);

        MenuBar1.add(mn_file);

        mn_help.setText("مساعدة");

        mn_styel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/style-icon.png"))); // NOI18N
        mn_styel.setText("نمط");

        rdBMI1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_DOWN_MASK));
        rdBMI1.setSelected(true);
        rdBMI1.setText("نمط أول");
        mn_styel.add(rdBMI1);

        rdBMI2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_DOWN_MASK));
        rdBMI2.setSelected(true);
        rdBMI2.setText("نمط ثان");
        mn_styel.add(rdBMI2);

        rdBMI3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.ALT_DOWN_MASK));
        rdBMI3.setSelected(true);
        rdBMI3.setText("نمط ثالث");
        mn_styel.add(rdBMI3);

        mn_help.add(mn_styel);

        mnI_help.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnI_help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/help-icon.png"))); // NOI18N
        mnI_help.setText("مساعدة");
        mnI_help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnI_helpActionPerformed(evt);
            }
        });
        mn_help.add(mnI_help);

        mnI_about.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnI_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/about-icon.png"))); // NOI18N
        mnI_about.setText("عن البرنامج");
        mnI_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnI_aboutActionPerformed(evt);
            }
        });
        mn_help.add(mnI_about);

        MenuBar1.add(mn_help);

        setJMenuBar(MenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(810, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_new_user_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_new_user_ActionPerformed
        this.dispose();
        Tools.openForm(new frm_ayat_en_Sign_Up());
    }//GEN-LAST:event_btn_new_user_ActionPerformed

    private void btn_enter_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enter_ActionPerformed
        String strUserName = txt_userName.getText();
        String strPassword = txt_password.getText();
        boolean isCorrect = dp.Go.chekAdmnUsrPass(strUserName, strPassword);
        if (isCorrect) {
            this.dispose();
            Tools.openForm(new frm_ayat_en_main());
        } else {
            Tools.msgBox("Invalid user name or password, please try again!");
            txt_userName.setText("");
            txt_password.setText("");
            txt_userName.setRequestFocusEnabled(true);

        }
    }//GEN-LAST:event_btn_enter_ActionPerformed

    private void cb_AccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_AccessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_AccessActionPerformed

    private void chb_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_showActionPerformed
        if (chb_show.isSelected()) {
            txt_password.setEchoChar((char)0);
        } else {
            txt_password.setEchoChar('*');
        }
    }//GEN-LAST:event_chb_showActionPerformed

    private void mnI_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnI_aboutActionPerformed
        Tools.openForm(new frm_ayat_ar_about());
    }//GEN-LAST:event_mnI_aboutActionPerformed

    private void mnI_helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnI_helpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnI_helpActionPerformed

    private void mnI_langActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnI_langActionPerformed
        Tools.openForm(new frm_ayat_SignIn());
    }//GEN-LAST:event_mnI_langActionPerformed

    private void mnI_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnI_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnI_exitActionPerformed

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
            java.util.logging.Logger.getLogger(frm_ayat_ar_log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_ar_log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_ar_log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_ar_log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_ayat_ar_log().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar1;
    private java.awt.Button btn_enter_;
    private java.awt.Button btn_new_user_;
    private javax.swing.JComboBox<String> cb_Access;
    private javax.swing.JCheckBox chb_show;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JMenuItem mnI_about;
    private javax.swing.JMenuItem mnI_exit;
    private javax.swing.JMenuItem mnI_help;
    private javax.swing.JMenuItem mnI_lang;
    private javax.swing.JMenu mn_file;
    private javax.swing.JMenu mn_help;
    private javax.swing.JMenu mn_styel;
    private javax.swing.JRadioButtonMenuItem rdBMI1;
    private javax.swing.JRadioButtonMenuItem rdBMI2;
    private javax.swing.JRadioButtonMenuItem rdBMI3;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_userName;
    // End of variables declaration//GEN-END:variables
}
