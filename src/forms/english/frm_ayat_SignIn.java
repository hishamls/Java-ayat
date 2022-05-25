/*
English Log in fram
 */
package forms.english;

import ayat.Tools;
import ayat.myFunctions;
import static dp.Go.idD;
import static dp.Go.rs;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class frm_ayat_SignIn extends javax.swing.JFrame {

    frm_ayat_en_main main = new frm_ayat_en_main();
    static String strID= null;
    String user;
//    frm_ayat_en_my_contacts
//     static boolean isOn;

    public frm_ayat_SignIn() {
        initComponents();
        setLayout(new AbsoluteLayout());
        txt_userName.requestFocus(true);
    }

    public static String getStrID() {
        return strID;
    }

    public static void setStrID(String strID) {
        frm_ayat_SignIn.strID = strID;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_userName = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        lbl_capslock = new javax.swing.JLabel();
        chb_show = new javax.swing.JCheckBox();
        cb_Access = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        btn_Log_In_ = new java.awt.Button();
        lbl_capslock_empty = new javax.swing.JLabel();
        lbl_new_acnt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_cancel = new java.awt.Button();
        btn_Mini = new java.awt.Button();
        btn_myContacts = new java.awt.Button();
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
        setTitle("Ayat log in");
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

        jPanel2.setBackground(new java.awt.Color(0, 0, 0, 1));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 162, 162, 46));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 135, 240, 5));

        txt_userName.setBackground(new java.awt.Color(255, 0, 153));
        txt_userName.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        txt_userName.setForeground(new java.awt.Color(0, 0, 0));
        txt_userName.setBorder(null);
        jPanel2.add(txt_userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 90, 240, 40));

        txt_password.setBackground(new java.awt.Color(0, 204, 153));
        txt_password.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        txt_password.setForeground(new java.awt.Color(0, 0, 0));
        txt_password.setBorder(null);
        jPanel2.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 162, 240, 40));

        lbl_capslock.setForeground(new java.awt.Color(255, 51, 153));
        lbl_capslock.setText("CapsLock button is on!");
        jPanel2.add(lbl_capslock, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 216, 170, 20));

        chb_show.setBackground(new java.awt.Color(0, 0, 0, 1));
        chb_show.setForeground(new java.awt.Color(255, 255, 255));
        chb_show.setText("Show");
        chb_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_showActionPerformed(evt);
            }
        });
        jPanel2.add(chb_show, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 216, -1, -1));

        cb_Access.setBackground(new java.awt.Color(153, 255, 51));
        cb_Access.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        cb_Access.setForeground(new java.awt.Color(0, 0, 0));
        cb_Access.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Teacher", "Student", "Contacts" }));
        cb_Access.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_AccessActionPerformed(evt);
            }
        });
        jPanel2.add(cb_Access, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 261, 240, 40));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 207, 240, 5));

        btn_Log_In_.setBackground(new java.awt.Color(255, 255, 255));
        btn_Log_In_.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        btn_Log_In_.setLabel("Log in");
        btn_Log_In_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Log_In_ActionPerformed(evt);
            }
        });
        btn_Log_In_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_Log_In_KeyPressed(evt);
            }
        });
        jPanel2.add(btn_Log_In_, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 315, 102, 40));

        lbl_capslock_empty.setForeground(new java.awt.Color(255, 51, 153));
        jPanel2.add(lbl_capslock_empty, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 170, 20));

        lbl_new_acnt.setForeground(new java.awt.Color(255, 51, 153));
        lbl_new_acnt.setText("You havn't account? Creat now!");
        lbl_new_acnt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_new_acnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_new_acntMouseClicked(evt);
            }
        });
        jPanel2.add(lbl_new_acnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 360, 234, 20));

        jLabel1.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Name");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 99, -1, -1));

        btn_cancel.setActionCommand("cancel");
        btn_cancel.setBackground(new java.awt.Color(255, 255, 255));
        btn_cancel.setFont(new java.awt.Font("Chilanka", 1, 14)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(204, 0, 0));
        btn_cancel.setLabel("X");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(747, 9, 45, 40));

        btn_Mini.setActionCommand("Minimize");
        btn_Mini.setBackground(new java.awt.Color(255, 255, 255));
        btn_Mini.setFont(new java.awt.Font("Chilanka", 1, 18)); // NOI18N
        btn_Mini.setForeground(new java.awt.Color(204, 0, 0));
        btn_Mini.setLabel("-");
        btn_Mini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MiniActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 9, 45, 40));

        btn_myContacts.setActionCommand("my contacts");
        btn_myContacts.setBackground(new java.awt.Color(255, 255, 255));
        btn_myContacts.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        btn_myContacts.setLabel("My contacts");
        btn_myContacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_myContactsActionPerformed(evt);
            }
        });
        btn_myContacts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_myContactsKeyPressed(evt);
            }
        });
        jPanel2.add(btn_myContacts, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 315, 171, 40));

        lbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/quran.png"))); // NOI18N
        lbl_background.setPreferredSize(new java.awt.Dimension(800, 600));
        lbl_background.setRequestFocusEnabled(false);
        jPanel2.add(lbl_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-126, 0, 927, 600));

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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Log_In_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Log_In_ActionPerformed
        Multi_log_in();

    }//GEN-LAST:event_btn_Log_In_ActionPerformed

    private void cb_AccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_AccessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_AccessActionPerformed

    private void chb_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_showActionPerformed
        if (chb_show.isSelected()) {
            txt_password.setEchoChar((char) 0);
        } else {
            txt_password.setEchoChar('*');
        }
    }//GEN-LAST:event_chb_showActionPerformed

    private void mnI_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnI_aboutActionPerformed
        Tools.openForm(new frm_ayat_en_about());
    }//GEN-LAST:event_mnI_aboutActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//        clearData();
//        dp.Go.fillCombo(tableName, ColumnName, cb_Access);
//        dp.Go.fillCombo("Ayat.Users_Type", "Type", cb_user_type);

    }//GEN-LAST:event_formWindowOpened

    private void btn_Log_In_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_Log_In_KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Multi_log_in();
        }
    }//GEN-LAST:event_btn_Log_In_KeyPressed

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

    private void lbl_new_acntMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_new_acntMouseClicked
        this.dispose();
        Tools.openForm(new frm_ayat_SignUp());
    }//GEN-LAST:event_lbl_new_acntMouseClicked

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_MiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MiniActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btn_MiniActionPerformed

    private void btn_myContactsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_myContactsActionPerformed
        Connection con = dp.Go.myConnection();
        PreparedStatement ps;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement("SELECT `User_Name`, `Password`, `Photo` FROM `User` WHERE `User_Name`= ? AND `Password`= ?");
            ps.setString(1, txt_userName.getText());
            ps.setString(2, String.valueOf(txt_password.getPassword()));
            ps.executeQuery();
            
            while (rs.next()) {
                frm_ayat_en_my_contacts mcn= new frm_ayat_en_my_contacts();
                Tools.openForm(mcn);
                String fName = rs.getString(1);
                String lName = rs.getString(2);
                frm_ayat_en_my_contacts.txtA_adrs.setText(fName + " " + lName);
                frm_ayat_en_my_contacts.txtA_adrs.setEditable(false);
                frm_ayat_en_my_contacts.lbl_usr_photo.setIcon(new myFunctions().resizePic(null, rs.getBytes(3), frm_ayat_en_my_contacts.lbl_usr_photo.getWidth(), frm_ayat_en_my_contacts.lbl_usr_photo.getHeight()));
                this.dispose();

            } 
        } catch (SQLException ex) {
            Logger.getLogger(frm_ayat_SignIn.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_myContactsActionPerformed

    private void btn_myContactsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_myContactsKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_myContactsKeyPressed

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
            java.util.logging.Logger.getLogger(frm_ayat_SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_ayat_SignIn().setVisible(true);

            }

        });
//            lbl_capslock.setText(strID);
//         
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar1;
    private java.awt.Button btn_Log_In_;
    private java.awt.Button btn_Mini;
    private java.awt.Button btn_cancel;
    private java.awt.Button btn_myContacts;
    private javax.swing.JComboBox<String> cb_Access;
    private javax.swing.JCheckBox chb_show;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_background;
    public static javax.swing.JLabel lbl_capslock;
    private javax.swing.JLabel lbl_capslock_empty;
    public static javax.swing.JLabel lbl_new_acnt;
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

    private void clearData() {
//        dp.Go.fillCombo("Ayat.User_Gender", "Gender", cb_gender);
        Tools.clearTxt(this);
        txt_userName.requestFocus();

        dp.Go.getAutoNumber("Log_In", "ID");
//         txt_log_ID.setText(log.getAutoNumber());
//        btn_Sign_Up_.setEnabled(true);
//        btn_clear.setEnabled(false);
        btn_Log_In_.setEnabled(true);
    }

    private void adminLogIn() {
        // CHECK THE DATA IS CORRECT           
        strID = txt_userName.getText();
        String strPassword = txt_password.getText();
        boolean isCorrect = dp.Go.chekAdmnUsrPass(strID, strPassword);
        if (isCorrect) {
            this.dispose();
            Tools.openForm(main);
            main.mnu_Student.setEnabled(false);
            main.mnu_Teacher.setEnabled(false);

        } else {
            Tools.msgBox("Invalid user name or password, please try again!");
            txt_userName.setText("");
            txt_password.setText("");
            txt_userName.setRequestFocusEnabled(true);

        }
    }

    private void teacherLogIn() {
        strID = txt_userName.getText();
        String strPassword = txt_password.getText();
        boolean isCorrect = dp.Go.chekTechrUsrPass(strID, strPassword);
        if (isCorrect) {
            this.dispose();
            Tools.openForm(main);
            main.mnu_Student.setEnabled(false);
            main.mnu_Admin.setEnabled(false);

        } else {
            Tools.msgBox("Invalid user name or password, please try again!");
            txt_userName.setText("");
            txt_password.setText("");
            txt_userName.setRequestFocusEnabled(true);

        }
    }

    private void studentLogIn() {

        strID = txt_userName.getText().trim();
        String strPassword = txt_password.getText().trim();

        boolean isCorrect = dp.Go.chekStudntUsrPass(strID, strPassword);
        if (isCorrect) {
            this.dispose();
            Tools.openForm(main);
            main.mnu_Admin.setEnabled(false);
            main.mnu_Teacher.setEnabled(false);

        } else {
            Tools.msgBox("Invalid user name or password, please try again!");
            txt_userName.setText("");
            txt_password.setText("");
            txt_userName.setRequestFocusEnabled(true);

        }
    }

    private void myContactsLogIn()  {
            String strUsrNam = txt_userName.getText().trim();
            String strPassword = txt_password.getText().trim();
            String sql= "SELECT * FROM `User` WHERE " + "User_Name='" + strUsrNam
                    + "' and " + "Password='" + strPassword + "'";
            //chekContUsrPass
            Connection connect= dp.Go.myConnection();
            PreparedStatement ps;
            try {
                 boolean isCorrect = dp.Go.chekContUsrPass(strUsrNam, strPassword);
             if (isCorrect) {
                this.dispose();
                ps = connect.prepareStatement(sql);
                ResultSet rs= ps.executeQuery();
                Tools.openForm(new frm_ayat_en_my_contacts());
                //GET FULL NAME AND PHOTO PROFILE USER
                while (rs.next()) {  
                    // FROM USER DATABASE TABLE
//                    frm_ayat_en_my_contacts.currentUserId= rs.getInt("ID");
                     String fName = rs.getString("First_Name");
                     String lName = rs.getString("Last_Name");
                     frm_ayat_en_my_contacts.lbl_usrFullName.setText(fName+ " "+lName);
                     frm_ayat_en_my_contacts.lbl_usr_photo.setIcon(new myFunctions().resizePic(null, rs.getBytes("Photo"), frm_ayat_en_my_contacts.lbl_usr_photo.getWidth(), frm_ayat_en_my_contacts.lbl_usr_photo.getHeight()));
//                     System.out.println("user ID is "+ IDd+ "from Sign in");
                }
             } else {
                Tools.msgBox("Invalid user name or password, please try again!");
                // CLEAR()
                txt_userName.setText("");
                txt_password.setText("");
                txt_userName.setRequestFocusEnabled(true);
            }  
                connect.close();
            } catch (SQLException ex) {
                Logger.getLogger(frm_ayat_SignIn.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
           
    

    private void Multi_log_in() {
        String strUserName = txt_userName.getText();
        String strPassword = txt_password.getText();

//  CHECK IF NO MISSING DATA
        String miss = "You miss: \n";
        if (strUserName.equals("")) {
            miss += " - User Name\n";

        }
        if (strPassword.equals("")) {
            miss += " - Password\n";

        }
        if (cb_Access.getSelectedIndex() == -1) {   //index not item
            miss += "Access\n";
        }
        // IF YOU DIDN'T MISS ANY FIELD:
        if (!strUserName.equals("") && !strPassword.equals("") && cb_Access.getSelectedIndex() != -1) {
            int x = cb_Access.getSelectedIndex();
            switch (x) {
                case 0:
                    adminLogIn();
                    break;
                case 1:
                    teacherLogIn();
                    break;
                case 2:
                    studentLogIn();
                    break;
                case 3:
                    myContactsLogIn();
                    break;
                    
            }
        } else {
            Tools.msgBox(miss);
        }

    }
}
