/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms.english;

import forms.english.frm_ayat_SignIn;
import ayat.Tools;
import dp.Go;
import dp.user_type.Users_Type;
import entity.Sign_Up;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

/**
 *
 * @author hishamls
 */
public class frm_ayat_en_Sign_Up extends javax.swing.JFrame {

    /**
     * Creates new form frm_Register
     */
    public frm_ayat_en_Sign_Up() {
        this.usr = new Sign_Up();
//         this.setContentPane(pan);
//         btn_test.setBounds(300, 20, 200, 30);
//        this.add(btn_test);
        initComponents();

    }

//      private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
//        btnGroup.add(rBNo);
//        btnGroup.add(rBName);
//        btnGroup.add(rBLocation);
//        
//        Tools.setReport(tblTest);
//        clearData();
//        usr.getAllRows(tbl_users);
//    }                                 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grb_search = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnl_left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_FirstName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Txt_LastName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Phone = new javax.swing.JTextField();
        txt_EMail = new javax.swing.JTextField();
        txt_Address = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cb_Gender = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_update = new java.awt.Button();
        btn_back = new java.awt.Button();
        chB_Acception = new javax.swing.JCheckBox();
        btn_Delete = new java.awt.Button();
        btn_Clear = new java.awt.Button();
        pnl_rdionButtons = new javax.swing.JPanel();
        rdo_UserName = new javax.swing.JRadioButton();
        rdo_BirthDate = new javax.swing.JRadioButton();
        rdo_gender = new javax.swing.JRadioButton();
        rdo_password = new javax.swing.JRadioButton();
        rdo_firstName = new javax.swing.JRadioButton();
        rdo_Address = new javax.swing.JRadioButton();
        rdo_EMail = new javax.swing.JRadioButton();
        rdo_LastName = new javax.swing.JRadioButton();
        rdo_id = new javax.swing.JRadioButton();
        rdo_phone = new javax.swing.JRadioButton();
        txt_search = new javax.swing.JTextField();
        btn_search = new java.awt.Button();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_users = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        btn_getAllRows = new java.awt.Button();
        btn_Print = new java.awt.Button();
        jLabel12 = new javax.swing.JLabel();
        btn_SignUp = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setSize(new java.awt.Dimension(1400, 850));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setPreferredSize(new java.awt.Dimension(1800, 1800));

        pnl_left.setBackground(new java.awt.Color(204, 255, 153));
        pnl_left.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnl_left.setForeground(new java.awt.Color(51, 0, 102));
        pnl_left.setAutoscrolls(true);
        pnl_left.setPreferredSize(new java.awt.Dimension(1200, 800));
        pnl_left.setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("First Name");
        pnl_left.add(jLabel1);
        jLabel1.setBounds(9, 297, 100, 40);

        txt_FirstName.setBackground(new java.awt.Color(255, 153, 255));
        txt_FirstName.setFont(new java.awt.Font("DejaVu Serif Condensed", 0, 16)); // NOI18N
        txt_FirstName.setForeground(new java.awt.Color(51, 0, 0));
        txt_FirstName.setBorder(null);
        pnl_left.add(txt_FirstName);
        txt_FirstName.setBounds(117, 297, 260, 40);

        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Last Name");
        pnl_left.add(jLabel2);
        jLabel2.setBounds(9, 360, 100, 40);

        Txt_LastName.setBackground(new java.awt.Color(255, 153, 255));
        Txt_LastName.setFont(new java.awt.Font("DejaVu Serif Condensed", 0, 16)); // NOI18N
        Txt_LastName.setForeground(new java.awt.Color(51, 0, 0));
        Txt_LastName.setBorder(null);
        pnl_left.add(Txt_LastName);
        Txt_LastName.setBounds(117, 351, 260, 40);

        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Phone");
        pnl_left.add(jLabel3);
        jLabel3.setBounds(9, 414, 100, 40);

        txt_Phone.setBackground(new java.awt.Color(255, 153, 255));
        txt_Phone.setFont(new java.awt.Font("DejaVu Serif Condensed", 0, 16)); // NOI18N
        txt_Phone.setForeground(new java.awt.Color(51, 0, 0));
        txt_Phone.setBorder(null);
        pnl_left.add(txt_Phone);
        txt_Phone.setBounds(117, 414, 260, 40);

        txt_EMail.setBackground(new java.awt.Color(255, 153, 255));
        txt_EMail.setFont(new java.awt.Font("DejaVu Serif Condensed", 0, 16)); // NOI18N
        txt_EMail.setForeground(new java.awt.Color(51, 0, 0));
        txt_EMail.setBorder(null);
        pnl_left.add(txt_EMail);
        txt_EMail.setBounds(117, 477, 260, 40);

        txt_Address.setBackground(new java.awt.Color(255, 153, 255));
        txt_Address.setFont(new java.awt.Font("DejaVu Serif Condensed", 0, 16)); // NOI18N
        txt_Address.setForeground(new java.awt.Color(51, 0, 0));
        txt_Address.setBorder(null);
        pnl_left.add(txt_Address);
        txt_Address.setBounds(117, 540, 260, 40);

        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Gender");
        pnl_left.add(jLabel6);
        jLabel6.setBounds(9, 648, 100, 40);

        cb_Gender.setBackground(new java.awt.Color(0, 0, 0, 1));
        cb_Gender.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cb_Gender.setForeground(new java.awt.Color(0, 0, 0));
        pnl_left.add(cb_Gender);
        cb_Gender.setBounds(117, 648, 260, 40);

        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Birth Date");
        pnl_left.add(jLabel7);
        jLabel7.setBounds(9, 594, 100, 40);

        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Address");
        pnl_left.add(jLabel8);
        jLabel8.setBounds(9, 540, 100, 40);

        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("E_Mail");
        pnl_left.add(jLabel4);
        jLabel4.setBounds(9, 477, 100, 40);

        btn_update.setLabel("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        pnl_left.add(btn_update);
        btn_update.setBounds(414, 468, 119, 40);

        btn_back.setLabel("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        pnl_left.add(btn_back);
        btn_back.setBounds(9, 702, 119, 40);

        chB_Acception.setText("Accept Terms");
        pnl_left.add(chB_Acception);
        chB_Acception.setBounds(153, 711, 122, 24);

        btn_Delete.setLabel("Delete");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });
        pnl_left.add(btn_Delete);
        btn_Delete.setBounds(567, 468, 119, 40);

        btn_Clear.setLabel("Clear");
        btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearActionPerformed(evt);
            }
        });
        pnl_left.add(btn_Clear);
        btn_Clear.setBounds(450, 702, 119, 40);

        pnl_rdionButtons.setBackground(new java.awt.Color(204, 255, 153));
        pnl_rdionButtons.setPreferredSize(new java.awt.Dimension(750, 70));

        rdo_UserName.setSelected(true);
        rdo_UserName.setText("user name");

        rdo_BirthDate.setText("Birth Date");

        rdo_gender.setText("Gender");

        rdo_password.setText("Password");

        rdo_firstName.setText("First Name");

        rdo_Address.setText("Address");

        rdo_EMail.setText("E_Mail");

        rdo_LastName.setText("Last Name");

        rdo_id.setText("ID");

        rdo_phone.setText("Phone");

        txt_search.setBackground(new java.awt.Color(255, 153, 255));
        txt_search.setFont(new java.awt.Font("DejaVu Serif Condensed", 0, 16)); // NOI18N
        txt_search.setForeground(new java.awt.Color(51, 0, 0));
        txt_search.setBorder(null);

        btn_search.setLabel("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_rdionButtonsLayout = new javax.swing.GroupLayout(pnl_rdionButtons);
        pnl_rdionButtons.setLayout(pnl_rdionButtonsLayout);
        pnl_rdionButtonsLayout.setHorizontalGroup(
            pnl_rdionButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_rdionButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_rdionButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_rdionButtonsLayout.createSequentialGroup()
                        .addGroup(pnl_rdionButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_rdionButtonsLayout.createSequentialGroup()
                                .addComponent(rdo_UserName)
                                .addGap(10, 10, 10)
                                .addComponent(rdo_password)
                                .addGap(6, 6, 6)
                                .addComponent(rdo_firstName)
                                .addGap(0, 0, 0)
                                .addComponent(rdo_LastName)
                                .addGap(10, 10, 10)
                                .addComponent(rdo_phone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdo_BirthDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdo_gender))
                            .addGroup(pnl_rdionButtonsLayout.createSequentialGroup()
                                .addGap(423, 423, 423)
                                .addComponent(rdo_EMail)
                                .addGap(6, 6, 6)
                                .addComponent(rdo_id)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdo_Address)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl_rdionButtonsLayout.createSequentialGroup()
                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        pnl_rdionButtonsLayout.setVerticalGroup(
            pnl_rdionButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_rdionButtonsLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(pnl_rdionButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_rdionButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdo_UserName)
                    .addComponent(rdo_password)
                    .addComponent(rdo_firstName)
                    .addComponent(rdo_LastName)
                    .addGroup(pnl_rdionButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdo_phone)
                        .addComponent(rdo_BirthDate)
                        .addComponent(rdo_gender)))
                .addGap(8, 8, 8)
                .addGroup(pnl_rdionButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdo_EMail)
                    .addGroup(pnl_rdionButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdo_id)
                        .addComponent(rdo_Address)))
                .addGap(23, 23, 23))
        );

        pnl_left.add(pnl_rdionButtons);
        pnl_rdionButtons.setBounds(405, 300, 846, 150);

        tbl_users.setAutoCreateRowSorter(true);
        tbl_users.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tbl_users.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        tbl_users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NO.", "User_ID", "User Type", "User Name", "Password", "First Name", "Last Name", "Phone", "E Mail", "Address", "Birth Date", "Gender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_users.setMaximumSize(new java.awt.Dimension(1000, 200));
        tbl_users.setPreferredSize(new java.awt.Dimension(1000, 200));
        tbl_users.getTableHeader().setReorderingAllowed(false);
        tbl_users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_usersMouseClicked(evt);
            }
        });
        tbl_users.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_usersKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_usersKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_users);

        pnl_left.add(jScrollPane3);
        jScrollPane3.setBounds(396, 72, 900, 189);
        pnl_left.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 3, 3);

        btn_getAllRows.setLabel("Get all rows");
        btn_getAllRows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_getAllRowsActionPerformed(evt);
            }
        });
        pnl_left.add(btn_getAllRows);
        btn_getAllRows.setBounds(1134, 270, 119, 40);

        btn_Print.setActionCommand("Print");
        btn_Print.setLabel("Print");
        btn_Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PrintActionPerformed(evt);
            }
        });
        pnl_left.add(btn_Print);
        btn_Print.setBounds(720, 270, 119, 40);

        jLabel12.setFont(new java.awt.Font("Chilanka", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 102));
        jLabel12.setText("Sign Up");
        pnl_left.add(jLabel12);
        jLabel12.setBounds(549, 9, 189, 40);

        btn_SignUp.setLabel("Sign Up");
        btn_SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SignUpActionPerformed(evt);
            }
        });
        pnl_left.add(btn_SignUp);
        btn_SignUp.setBounds(405, 549, 119, 40);

        jScrollPane2.setViewportView(pnl_left);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, 1809, 1800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SignUpActionPerformed
//        String strSQL= "INSERT INTO `sign_up`(`First_Name`, `Last_Name`, `Phone`, `E_Mail`, `Address`, `Birth_Date`, `Gender`, `User_Name`, `Password`) VALUES (?,?,?,?,?,?,?,?,?)";
//        Go.runNonQuery(strSQL);

        setValues();
        usr.add();
        clearData();
        usr.getAllRows(tbl_users);
        dp.Go.fillCombo("User_Gender", "Gender", cb_Gender);

    }//GEN-LAST:event_btn_SignUpActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        this.dispose();
        Tools.openFrame(new frm_ayat_SignIn());
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        setValues();
        usr.update();
        clearData();
        usr.getAllRows(tbl_users);
    }//GEN-LAST:event_btn_updateActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//        usr.getAutoNumber();
        usr.getAllRows(tbl_users);
        
        Tools.setReport(tbl_users);

        grb_search.add(rdo_id);
        grb_search.add(rdo_Address);
        grb_search.add(rdo_BirthDate);
        grb_search.add(rdo_EMail);
        grb_search.add(rdo_LastName);
        grb_search.add(rdo_UserName);
        grb_search.add(rdo_firstName);
        grb_search.add(rdo_gender);
        grb_search.add(rdo_password);
        grb_search.add(rdo_phone);

        clearData();
        
//        dp.Go.fillCombo("Ayat.Users_Type", "Type", cb_user_type);
        dp.Go.fillCombo("Ayat.User_Gender", "Gender", cb_Gender);

    }//GEN-LAST:event_formWindowOpened

    private void btn_getAllRowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_getAllRowsActionPerformed
        usr.getAllRows(tbl_users);
    }//GEN-LAST:event_btn_getAllRowsActionPerformed

    private void tbl_usersKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_usersKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_UP) {
            try {
                int row = tbl_users.getSelectedRow();
                String strID = tbl_users.getValueAt(row, 0).toString();
                String strUser_Name = tbl_users.getValueAt(row, 1).toString();
                String strPassword = tbl_users.getValueAt(row, 2).toString();
                String strFirst_Name = tbl_users.getValueAt(row, 3).toString();
                String strLast_Name = tbl_users.getValueAt(row, 4).toString();
                String strPhone = tbl_users.getValueAt(row, 5).toString();
                String strE_Mail = tbl_users.getValueAt(row, 6).toString();
                String strAddress = tbl_users.getValueAt(row, 7).toString();

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//M = Month
                // m= minutes
                Date BDate = sdf.parse(tbl_users.getValueAt(row, 8).toString());

//                txt_BirthDate.setDate(BDate);
//            Date Birth_Date = (Date) tbl_users.getValueAt(row, 6);      //Date
                String strGender = tbl_users.getValueAt(row, 9).toString();

//                txt_user_ID.setText(strID);
                txt_FirstName.setText(strFirst_Name);
                Txt_LastName.setText(strLast_Name);
                txt_Phone.setText(strPhone);
                txt_EMail.setText(strE_Mail);
                txt_Address.setText(strAddress);
//             SimpleDateFormat f= new SimpleDateFormat("yyyy-mm-dd");
//       
//        String BDate = String.valueOf(f.format(txt_BirthDate.getDate()));
//        
//        
//        usr.setBirth_Date(BDate);

//            txt_BirthDate.setDate(BDate);
                cb_Gender.setSelectedItem(strGender);
//                txt_userName.setText(strUser_Name);
//                txt_password.setText(strPassword);

                btn_SignUp.setEnabled(false);
                btn_update.setEnabled(true);
                btn_Delete.setEnabled(true);
            } catch (Exception e) {
                Tools.msgBox(e.getMessage());
            }
        }
    }//GEN-LAST:event_tbl_usersKeyPressed

    private void tbl_usersKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_usersKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_UP) {
            try {
                int row = tbl_users.getSelectedRow();
                String strID = tbl_users.getValueAt(row, 0).toString();
                String strUser_Name = tbl_users.getValueAt(row, 1).toString();
                String strPassword = tbl_users.getValueAt(row, 2).toString();
                String strFirst_Name = tbl_users.getValueAt(row, 3).toString();
                String strLast_Name = tbl_users.getValueAt(row, 4).toString();
                String strPhone = tbl_users.getValueAt(row, 5).toString();
                String strE_Mail = tbl_users.getValueAt(row, 6).toString();
                String strAddress = tbl_users.getValueAt(row, 7).toString();

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date BDate = sdf.parse(tbl_users.getValueAt(row, 8).toString());

//                txt_BirthDate.setDate(BDate);
//            Date Birth_Date = (Date) tbl_users.getValueAt(row, 6);      //Date
                String strGender = tbl_users.getValueAt(row, 9).toString();

//                txt_user_ID.setText(strID);
                txt_FirstName.setText(strFirst_Name);
                Txt_LastName.setText(strLast_Name);
                txt_Phone.setText(strPhone);
                txt_EMail.setText(strE_Mail);
                txt_Address.setText(strAddress);
//             SimpleDateFormat f= new SimpleDateFormat("yyyy-MM-dd");
//       
//        String BDate = String.valueOf(f.format(txt_BirthDate.getDate()));
//        
//        
//        usr.setBirth_Date(BDate);

//            txt_BirthDate.setDate(BDate);
                cb_Gender.setSelectedItem(strGender);
//                txt_userName.setText(strUser_Name);
//                txt_password.setText(strPassword);

                btn_SignUp.setEnabled(false);
                btn_update.setEnabled(true);
                btn_Delete.setEnabled(true);
            } catch (Exception e) {
                Tools.msgBox(e.getMessage());
            }
        }

    }//GEN-LAST:event_tbl_usersKeyReleased

    private void tbl_usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_usersMouseClicked

        try {
            int row = tbl_users.getSelectedRow();
            String strID = tbl_users.getValueAt(row, 0).toString();
            String strUser_Name = tbl_users.getValueAt(row, 1).toString();
            String strPassword = tbl_users.getValueAt(row, 2).toString();
            String strFirst_Name = tbl_users.getValueAt(row, 3).toString();
            String strLast_Name = tbl_users.getValueAt(row, 4).toString();
            String strPhone = tbl_users.getValueAt(row, 5).toString();
            String strE_Mail = tbl_users.getValueAt(row, 6).toString();
            String strAddress = tbl_users.getValueAt(row, 7).toString();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date BDate = sdf.parse(tbl_users.getValueAt(row, 8).toString());

//            txt_BirthDate.setDate(BDate);
//            Date Birth_Date = (Date) tbl_users.getValueAt(row, 6);      //Date
            String strGender = tbl_users.getValueAt(row, 9).toString();

//            txt_user_ID.setText(strID);
            txt_FirstName.setText(strFirst_Name);
            Txt_LastName.setText(strLast_Name);
            txt_Phone.setText(strPhone);
            txt_EMail.setText(strE_Mail);
            txt_Address.setText(strAddress);
//             SimpleDateFormat f= new SimpleDateFormat("yyyy-mm-dd");
//       
//        String BDate = String.valueOf(f.format(txt_BirthDate.getDate()));
//        
//        
//        usr.setBirth_Date(BDate);

//            txt_BirthDate.setDate(BDate);
            cb_Gender.setSelectedItem(strGender);
//            txt_userName.setText(strUser_Name);
//            txt_password.setText(strPassword);

            btn_SignUp.setEnabled(false);
            btn_update.setEnabled(true);
            btn_Delete.setEnabled(true);
        } catch (Exception e) {
            Tools.msgBox(e.getMessage());
        }


    }//GEN-LAST:event_tbl_usersMouseClicked

    private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed
        clearData();
    }//GEN-LAST:event_btn_ClearActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        setValues(); // I forgot it so not delete before I do update
        usr.delete();
        clearData();
        usr.getAllRows(tbl_users);
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        String strSearch = "SELECT * FROM users WHERE ";
        if (rdo_UserName.isSelected()) {
            strSearch += "User_Name";    //Don't forget ""; 
        } else if (rdo_password.isSelected()) {
            strSearch += "Password";
        } else if (rdo_id.isSelected()) {
            strSearch += "ID";
        } else if (rdo_firstName.isSelected()) {
            strSearch += "First_Name";
        } else if (rdo_LastName.isSelected()) {
            strSearch += "Last_Name";
        } else if (rdo_phone.isSelected()) {
            strSearch += "Phone";
        } else if (rdo_EMail.isSelected()) {
            strSearch += "E_Mail";
        } else if (rdo_Address.isSelected()) {
            strSearch += "Address";
        } else if (rdo_BirthDate.isSelected()) {
            strSearch += "Birth_Date";
        } else {
            strSearch += "Gender";
        }
        strSearch += " LIKE '%" + txt_search.getText() + "%'";

        usr.getCustomRows(strSearch, tbl_users);
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PrintActionPerformed
        Tools.printReport(tbl_users, "Sign_Up");
    }//GEN-LAST:event_btn_PrintActionPerformed

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
            java.util.logging.Logger.getLogger(frm_ayat_en_Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_en_Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_en_Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_en_Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        JScrollPane pan = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_ayat_en_Sign_Up().setVisible(true);
//                 frm_ayat_en_Sign_Up.setContentPane(pan);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Txt_LastName;
    private java.awt.Button btn_Clear;
    private java.awt.Button btn_Delete;
    private java.awt.Button btn_Print;
    private java.awt.Button btn_SignUp;
    private java.awt.Button btn_back;
    private java.awt.Button btn_getAllRows;
    private java.awt.Button btn_search;
    private java.awt.Button btn_update;
    private javax.swing.JComboBox<String> cb_Gender;
    private javax.swing.JCheckBox chB_Acception;
    private javax.swing.ButtonGroup grb_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel pnl_left;
    private javax.swing.JPanel pnl_rdionButtons;
    private javax.swing.JRadioButton rdo_Address;
    private javax.swing.JRadioButton rdo_BirthDate;
    private javax.swing.JRadioButton rdo_EMail;
    private javax.swing.JRadioButton rdo_LastName;
    private javax.swing.JRadioButton rdo_UserName;
    private javax.swing.JRadioButton rdo_firstName;
    private javax.swing.JRadioButton rdo_gender;
    private javax.swing.JRadioButton rdo_id;
    private javax.swing.JRadioButton rdo_password;
    private javax.swing.JRadioButton rdo_phone;
    private javax.swing.JTable tbl_users;
    private javax.swing.JTextField txt_Address;
    private javax.swing.JTextField txt_EMail;
    private javax.swing.JTextField txt_FirstName;
    private javax.swing.JTextField txt_Phone;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables

    Sign_Up usr;
//    Log_In log;
    Users_Type typ;

    private void setValues() {
//        usr.setUser_ID(Integer.parseInt(txt_user_ID.getText())); // wrong
        usr.setUser_ID(Integer.parseInt(usr.getAutoNumber()));

//        log.setID(Integer.parseInt(log.getAutoNumber())); // wrong
// //////      usr.setLog_ID(log.getID());
//String x= log.getAutoNumber();
//        usr.setLog_ID(Integer.parseInt(x));

//log.getID();

//cb_user_type.setSelectedItem(typ);
//        usr.setUser_Type(User_Type);
//        usr.setUser_Type(cb_user_type.getSelectedItem().toString());
        
        usr.setAddress(txt_Address.getText());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        String BDate = String.valueOf(sdf.format(txt_BirthDate.getDate()));
//        usr.setBirth_Date(BDate);

        usr.setE_Mail(txt_EMail.getText());
        usr.setFirst_Name(txt_FirstName.getText());
        usr.setGender(cb_Gender.getSelectedItem().toString());
        usr.setLast_Name(Txt_LastName.getText());
//        usr.setPassword(txt_password.getText());
        usr.setPhone(txt_Phone.getText());
//        usr.setUser_Name(txt_userName.getText());
    }

    private void clearData() {
        Tools.clearTxt(this);
        txt_FirstName.requestFocus();

//        txt_user_ID.setText(usr.getAutoNumber());

        btn_SignUp.setEnabled(true);
        btn_Delete.setEnabled(false);
        btn_update.setEnabled(false);

    }
//    JScrollBar bar= new JScrollBar(850);

//    JButton btn_test= new JButton("Test in Source");
}
