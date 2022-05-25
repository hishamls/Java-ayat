/*
English new account fram
 */
package forms.english;

import ayat.Tools;
import ayat.myFunctions;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import entity.User;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class frm_ayat_SignUp extends javax.swing.JFrame {

    frm_ayat_en_main main = new frm_ayat_en_main();
    ayat.myFunctions func= new myFunctions();
//    Log_In log;
    static String strID;
    String user;
    String foto_path;
    User usr;
  

//     static boolean isOn;
    public frm_ayat_SignUp() {
        initComponents();
        setLayout(new AbsoluteLayout());

    }

    public static String getStrID() {
        return strID;
    }

    public static void setStrID(String strID) {
        frm_ayat_SignUp.strID = strID;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPan = new javax.swing.JPanel();
        btn_Sign_Up_ = new java.awt.Button();
        btn_cancel = new java.awt.Button();
        lbl_capslock_empty = new javax.swing.JLabel();
        btn_clear = new java.awt.Button();
        btn_Brows = new java.awt.Button();
        lbl_old_acnt = new javax.swing.JLabel();
        pan_Grid = new javax.swing.JPanel();
        lbl_fst_nam = new javax.swing.JLabel();
        txt_FirstName = new javax.swing.JTextField();
        lbl_lst_nam = new javax.swing.JLabel();
        Txt_LastName = new javax.swing.JTextField();
        lbl_usr_nam = new javax.swing.JLabel();
        txt_userName = new javax.swing.JTextField();
        lbl_pass = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        lbl_repass = new javax.swing.JLabel();
        txt_repass = new javax.swing.JPasswordField();
        pan_photo = new javax.swing.JPanel();
        lbl_foto = new javax.swing.JLabel();
        lbl_foto2 = new javax.swing.JLabel();
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
        setTitle("Sign UP");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        MainPan.setBackground(new java.awt.Color(0, 0, 0, 1));
        MainPan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Sign_Up_.setBackground(new java.awt.Color(255, 255, 255));
        btn_Sign_Up_.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        btn_Sign_Up_.setLabel("Sign Up");
        btn_Sign_Up_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Sign_Up_ActionPerformed(evt);
            }
        });
        MainPan.add(btn_Sign_Up_, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 594, -1, 40));
        btn_Sign_Up_.getAccessibleContext().setAccessibleName("Log in");

        btn_cancel.setActionCommand("cancel");
        btn_cancel.setBackground(new java.awt.Color(255, 255, 255));
        btn_cancel.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(204, 0, 0));
        btn_cancel.setLabel("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        MainPan.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 594, 102, 40));

        lbl_capslock_empty.setForeground(new java.awt.Color(255, 51, 153));
        MainPan.add(lbl_capslock_empty, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 170, 20));

        btn_clear.setActionCommand("clear");
        btn_clear.setBackground(new java.awt.Color(255, 255, 255));
        btn_clear.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        btn_clear.setLabel("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        MainPan.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 594, 102, 40));
        btn_clear.getAccessibleContext().setAccessibleName("clear");

        btn_Brows.setActionCommand("Brows");
        btn_Brows.setBackground(new java.awt.Color(255, 255, 255));
        btn_Brows.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        btn_Brows.setLabel("Brows");
        btn_Brows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BrowsActionPerformed(evt);
            }
        });
        MainPan.add(btn_Brows, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 369, 108, 40));

        lbl_old_acnt.setForeground(new java.awt.Color(255, 51, 153));
        lbl_old_acnt.setText("Already have an account? Click here to log in");
        lbl_old_acnt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_old_acnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_old_acntMouseClicked(evt);
            }
        });
        MainPan.add(lbl_old_acnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 648, 324, 20));

        pan_Grid.setBackground(new java.awt.Color(0, 0, 0, 80));
        pan_Grid.setAlignmentX(1.5F);
        pan_Grid.setLayout(new java.awt.GridLayout(5, 2, 40, 20));

        lbl_fst_nam.setFont(new java.awt.Font("Chilanka", 0, 10)); // NOI18N
        lbl_fst_nam.setForeground(new java.awt.Color(255, 255, 255));
        lbl_fst_nam.setText("First Name");
        pan_Grid.add(lbl_fst_nam);

        txt_FirstName.setBackground(new java.awt.Color(255, 0, 153));
        txt_FirstName.setFont(new java.awt.Font("Chilanka", 0, 10)); // NOI18N
        txt_FirstName.setForeground(new java.awt.Color(0, 0, 0));
        txt_FirstName.setAlignmentX(20.0F);
        txt_FirstName.setBorder(null);
        pan_Grid.add(txt_FirstName);

        lbl_lst_nam.setFont(new java.awt.Font("Chilanka", 0, 10)); // NOI18N
        lbl_lst_nam.setForeground(new java.awt.Color(255, 255, 255));
        lbl_lst_nam.setText("Last Name");
        pan_Grid.add(lbl_lst_nam);

        Txt_LastName.setBackground(new java.awt.Color(255, 0, 153));
        Txt_LastName.setFont(new java.awt.Font("Chilanka", 0, 10)); // NOI18N
        Txt_LastName.setForeground(new java.awt.Color(0, 0, 0));
        Txt_LastName.setAlignmentX(20.0F);
        Txt_LastName.setBorder(null);
        pan_Grid.add(Txt_LastName);

        lbl_usr_nam.setFont(new java.awt.Font("Chilanka", 0, 10)); // NOI18N
        lbl_usr_nam.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usr_nam.setText("User Name");
        pan_Grid.add(lbl_usr_nam);

        txt_userName.setBackground(new java.awt.Color(255, 0, 153));
        txt_userName.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        txt_userName.setForeground(new java.awt.Color(0, 0, 0));
        txt_userName.setBorder(null);
        txt_userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userNameActionPerformed(evt);
            }
        });
        pan_Grid.add(txt_userName);

        lbl_pass.setFont(new java.awt.Font("Chilanka", 0, 10)); // NOI18N
        lbl_pass.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pass.setText("Password");
        pan_Grid.add(lbl_pass);

        txt_password.setBackground(new java.awt.Color(255, 0, 153));
        txt_password.setFont(new java.awt.Font("Chilanka", 0, 10)); // NOI18N
        txt_password.setForeground(new java.awt.Color(0, 0, 0));
        txt_password.setAlignmentX(20.0F);
        txt_password.setBorder(null);
        pan_Grid.add(txt_password);

        lbl_repass.setFont(new java.awt.Font("Chilanka", 0, 10)); // NOI18N
        lbl_repass.setForeground(new java.awt.Color(255, 255, 255));
        lbl_repass.setText("Retype Pass");
        pan_Grid.add(lbl_repass);

        txt_repass.setBackground(new java.awt.Color(255, 0, 153));
        txt_repass.setFont(new java.awt.Font("Chilanka", 0, 10)); // NOI18N
        txt_repass.setForeground(new java.awt.Color(0, 0, 0));
        txt_repass.setAlignmentX(20.0F);
        txt_repass.setBorder(null);
        pan_Grid.add(txt_repass);

        MainPan.add(pan_Grid, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 500, 324));
        pan_Grid.add(lbl_fst_nam);
        pan_Grid.add(txt_FirstName);
        pan_Grid.add(lbl_lst_nam);
        pan_Grid.add(Txt_LastName);
        pan_Grid.add(lbl_usr_nam);
        pan_Grid.add(txt_userName);
        pan_Grid.add(lbl_pass);
        pan_Grid.add(txt_password);
        pan_Grid.add(lbl_repass);
        pan_Grid.add(txt_repass);

        pan_photo.setBackground(new java.awt.Color(0, 0, 0, 80));
        pan_photo.setLayout(null);

        lbl_foto.setFont(new java.awt.Font("Chilanka", 0, 10)); // NOI18N
        lbl_foto.setForeground(new java.awt.Color(255, 255, 255));
        lbl_foto.setText("Photo");
        lbl_foto.setAlignmentX(1.0F);
        lbl_foto.setAlignmentY(10.0F);
        pan_photo.add(lbl_foto);
        lbl_foto.setBounds(0, 9, 171, 41);

        lbl_foto2.setBackground(new java.awt.Color(255, 0, 153));
        lbl_foto2.setFont(new java.awt.Font("Chilanka", 0, 10)); // NOI18N
        lbl_foto2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_foto2.setOpaque(true);
        lbl_foto2.setSize(250, 600);
        pan_photo.add(lbl_foto2);
        lbl_foto2.setBounds(270, 9, 230, 200);

        MainPan.add(pan_photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 333, 500, 234));

        lbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/quran.png"))); // NOI18N
        lbl_background.setPreferredSize(new java.awt.Dimension(800, 600));
        lbl_background.setRequestFocusEnabled(false);
        MainPan.add(lbl_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-126, 0, 963, 702));

        mn_file.setText("File");

        mnI_lang.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        mnI_lang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/Saudi-Arabia-icon.png"))); // NOI18N
        mnI_lang.setText("عربي");
        mn_file.add(mnI_lang);

        mnI_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        mnI_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/exit-icon-16px.png"))); // NOI18N
        mnI_exit.setText("Exit");
        mn_file.add(mnI_exit);

        MenuBar1.add(mn_file);

        mn_help.setText("Help");

        mn_styel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/style-icon.png"))); // NOI18N
        mn_styel.setText("Styel");

        rdBMI1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK));
        rdBMI1.setSelected(true);
        rdBMI1.setText("Styel 1");
        mn_styel.add(rdBMI1);

        rdBMI2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_MASK));
        rdBMI2.setSelected(true);
        rdBMI2.setText("Styel 2");
        mn_styel.add(rdBMI2);

        rdBMI3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.ALT_MASK));
        rdBMI3.setSelected(true);
        rdBMI3.setText("Styel 3");
        mn_styel.add(rdBMI3);

        mn_help.add(mn_styel);

        mnI_help.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK));
        mnI_help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/help-icon.png"))); // NOI18N
        mnI_help.setText("Help");
        mn_help.add(mnI_help);

        mnI_about.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        mnI_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/about-icon.png"))); // NOI18N
        mnI_about.setText("About..");
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MainPan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPan, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Sign_Up_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Sign_Up_ActionPerformed

        if (verifyData()) {
            Connection connect = dp.Go.myConnection();
            java.sql.PreparedStatement pre_st ;
            String sql = "INSERT INTO `User`(`First_Name`, `Last_Name`, `User_Name`, `Password`, `Photo`)  VALUES (?,?,?,?,?)";
            boolean contacIsCreated= true;
            try {
                pre_st = connect.prepareStatement(sql);

                pre_st.setString(1, txt_FirstName.getText());
                pre_st.setString(2, Txt_LastName.getText());
                pre_st.setString(3, txt_userName.getText());
                pre_st.setString(4, String.valueOf(txt_password.getPassword()));
                InputStream img = new FileInputStream(new File(foto_path));
                pre_st.setBlob(5, img);
                if (isUserNameExist(txt_userName.getText())) {
                    Tools.msgBox("this user name is token, please try again!");
                } 
                else {
                    if (pre_st.executeUpdate() != 0) {
                        Tools.msgBox("Add successfully!");
                        clear();
                        contacIsCreated= true;
                    } 
                    else {
                        Tools.msgBox("Somthing wrong!");
                        contacIsCreated= false;
                    }
                }

            } catch (FileNotFoundException | SQLException ex) {
                Tools.msgBox(ex.getMessage());
            }
//            return contacIsCreated;
        }


    }//GEN-LAST:event_btn_Sign_Up_ActionPerformed

    private void mnI_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnI_aboutActionPerformed
        Tools.openForm(new frm_ayat_en_about());
    }//GEN-LAST:event_mnI_aboutActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        clearData();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        clearData();
//        dp.Go.fillCombo(tableName, ColumnName, cb_Access);
//        dp.Go.fillCombo("Ayat.Users_Type", "Type", cb_user_type);

    }//GEN-LAST:event_formWindowOpened

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
//              if (evt.getKeyCode() == KeyEvent.VK_CAPS_LOCK) {

        boolean isOn = Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
        lbl_capslock_empty.setText("CapsLock button is " + (isOn ? "on" : "off"));
//   if (isOn) {
//            lbl_capslock.setVisible(true);
//        } else {
//            lbl_capslock.setVisible(false);
//        }
    }//GEN-LAST:event_formKeyPressed

    private void txt_userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userNameActionPerformed

    private void btn_BrowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BrowsActionPerformed
        foto_path = func.browsImage(lbl_foto2);
    }//GEN-LAST:event_btn_BrowsActionPerformed

    private void lbl_old_acntMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_old_acntMouseClicked
        this.dispose();
        Tools.openForm(new frm_ayat_SignIn());
    }//GEN-LAST:event_lbl_old_acntMouseClicked

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(frm_ayat_SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_ayat_SignUp().setVisible(true);

            }

        });
//            lbl_capslock.setText(strID);
//        

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel MainPan;
    private static javax.swing.JMenuBar MenuBar1;
    private static javax.swing.JTextField Txt_LastName;
    private static java.awt.Button btn_Brows;
    private static java.awt.Button btn_Sign_Up_;
    private static java.awt.Button btn_cancel;
    private static java.awt.Button btn_clear;
    private static javax.swing.JLabel lbl_background;
    private static javax.swing.JLabel lbl_capslock_empty;
    private static javax.swing.JLabel lbl_foto;
    private static javax.swing.JLabel lbl_foto2;
    private static javax.swing.JLabel lbl_fst_nam;
    private static javax.swing.JLabel lbl_lst_nam;
    public static javax.swing.JLabel lbl_old_acnt;
    private static javax.swing.JLabel lbl_pass;
    private static javax.swing.JLabel lbl_repass;
    private static javax.swing.JLabel lbl_usr_nam;
    private static javax.swing.JMenuItem mnI_about;
    private static javax.swing.JMenuItem mnI_exit;
    private static javax.swing.JMenuItem mnI_help;
    private static javax.swing.JMenuItem mnI_lang;
    private static javax.swing.JMenu mn_file;
    private static javax.swing.JMenu mn_help;
    private static javax.swing.JMenu mn_styel;
    private static javax.swing.JPanel pan_Grid;
    private static javax.swing.JPanel pan_photo;
    private static javax.swing.JRadioButtonMenuItem rdBMI1;
    private static javax.swing.JRadioButtonMenuItem rdBMI2;
    private static javax.swing.JRadioButtonMenuItem rdBMI3;
    private static javax.swing.JTextField txt_FirstName;
    private static javax.swing.JPasswordField txt_password;
    private static javax.swing.JPasswordField txt_repass;
    private static javax.swing.JTextField txt_userName;
    // End of variables declaration//GEN-END:variables

    private void clearData() {
//        dp.Go.fillCombo("Ayat.User_Gender", "Gender", cb_gender);
        Tools.clearTxt(this);
        txt_FirstName.requestFocus();

        dp.Go.getAutoNumber("Log_In", "ID");
//         txt_log_ID.setText(log.getAutoNumber());
        btn_Sign_Up_.setEnabled(true);
//        btn_clear.setEnabled(false);
//        btn_Log_In_.setEnabled(true);

    }

//    private void adminLogIn() {
//        // CHECK THE DATA IS CORRECT           
//        strID = txt_userName.getText();
//        String strPassword = txt_password.getText();
//        boolean isCorrect = dp.Go.chekAdmnUsrPass(strID, strPassword);
//        if (isCorrect) {
//            this.dispose();
//            Tools.openForm(main);
//            main.mnu_Student.setEnabled(false);
//            main.mnu_Teacher.setEnabled(false);
//
//        } else {
//            Tools.msgBox("Invalid user name or password, please try again!");
//            txt_userName.setText("");
//            txt_password.setText("");
//            txt_userName.setRequestFocusEnabled(true);
//
//        }
//    }
//    private void teacherLogIn() {
//        strID = txt_userName.getText();
//        String strPassword = txt_password.getText();
//        boolean isCorrect = dp.Go.chekTechrUsrPass(strID, strPassword);
//        if (isCorrect) {
//            this.dispose();
//            Tools.openForm(main);
//            main.mnu_Student.setEnabled(false);
//            main.mnu_Admin.setEnabled(false);
//
//        } else {
//            Tools.msgBox("Invalid user name or password, please try again!");
//            txt_userName.setText("");
//            txt_password.setText("");
//            txt_userName.setRequestFocusEnabled(true);
//
//        }
//    }
//    private void studentLogIn() {
//
//        strID = txt_userName.getText().trim();
//        String strPassword = txt_password.getText().trim();
//
//        boolean isCorrect = dp.Go.chekStudntUsrPass(strID, strPassword);
//        if (isCorrect) {
//            this.dispose();
//            Tools.openForm(main);
//            main.mnu_Admin.setEnabled(false);
//            main.mnu_Teacher.setEnabled(false);
//
//        } else {
//            Tools.msgBox("Invalid user name or password, please try again!");
//            txt_userName.setText("");
//            txt_password.setText("");
//            txt_userName.setRequestFocusEnabled(true);
//
//        }
//    }
//    private void log_in() {
//         String strUserName = txt_userName.getText();
//        String strPassword = txt_password.getText();
//
////  CHECK IF NO MISSING DATA
    String miss = "You miss: \n";
//        if (strUserName.equals("")) {
//            miss += "User Name\n";
//
//        }
//        if (strPassword.equals("")) {
//            miss += "Password\n";
//
//        }
////        if (cb_Access.getSelectedIndex() == -1) {   //index not item
////            miss += "Access\n";}
//            
//       
//    
// 
//
//        
//        if (!strUserName.equals("") && !strPassword.equals("") && cb_Access.getSelectedIndex() != -1) {
//            int x = cb_Access.getSelectedIndex();
//            switch (x) {
//                case 0:
//                    adminLogIn();
//                    break;
//                case 1:
//                    teacherLogIn();
//                    break;
//                case 2:
//                    studentLogIn();
//                    break;
//
//            }
//        } else {
//            Tools.msgBox(miss);
//        }
//
//    }

//    public ImageIcon resizePic(String imgPath) {
//        ImageIcon icn = new ImageIcon(imgPath);
//        Image img = icn.getImage().getScaledInstance(lbl_foto2.getWidth(), lbl_foto2.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon newIcn = new ImageIcon(img);
//        return newIcn;
//    }
//
//    private void setValues() throws FileNotFoundException  {
//        usr.setFirst_Name(txt_FirstName.getText());
//        usr.setLast_Name(Txt_LastName.getText());
//        usr.setUser_Name(txt_userName.getText());
//        usr.setPassword(String.valueOf(txt_password.getPassword()));
//        InputStream img = new FileInputStream(new File(foto_path));
////            ps.setBlob(5, img);
//        usr.setPhoto(img);
//    }

    private void clear() {
        Tools.clearTxt(this);
//        lbl_foto2.setText("");
        txt_FirstName.requestFocus();
        btn_clear.setEnabled(true);
    }

    private boolean verifyData() {
        //IF SOME FIELDS ARE EMPTY
        if (txt_FirstName.getText() == null && Txt_LastName.getText() == null
                || txt_userName.getText().equals("") || String.valueOf(txt_password.getPassword()).equals("")
                || String.valueOf(txt_repass.getPassword()).equals("")) {
            Tools.msgBox("One or more field are empty!");
            return false;
        }
        //IF REPASSWORD NOT MATCHES PASSWORD   
        if (!String.valueOf(txt_password.getPassword()).equals(String.valueOf(txt_repass.getPassword()))) {
            Tools.msgBox("pass and repass didn't match!");
            return false;
        }
        // IF NO PICTURE UPLOADED   
        if (foto_path == null) {
            Tools.msgBox("No image is selected!");
            return false;
        } //ELSE EVERY THING IS OK
        else {
            return true;
        }
    }

    private boolean isUserNameExist(String strUserName) {
//        
        boolean unExist = false;
        try {
            //YOU HAVE TO DECLARED THESE VARIABLES AT EVERY METHOD:
              Connection conn = dp.Go.myConnection();
                java.sql.PreparedStatement ps;
                ResultSet rs;
            //THE NEXT STATMENT WILL ACCEPT ALL YOU ENTER EVEN IT REPEATED
//          ps = conn.prepareStatement("SELECT * FROM `User` WHERE `User_Name` ='" + strUserName+"'");
            ps = conn.prepareStatement("SELECT * FROM `User` WHERE `User_Name` = ?");
            ps.setString(1, txt_userName.getText());
            rs = ps.executeQuery();
            if (rs.next()) {
                unExist = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(frm_ayat_SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return unExist;

    }

}
