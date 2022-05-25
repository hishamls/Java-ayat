/*
 new user account frame
 */
package forms.english;

import ayat.My_Model;
import ayat.Tools;
import ayat.myFunctions;
import dp.ContactQuery;
import entity.My_Contacts;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import entity.User;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class frm_ayat_en_my_contacts extends javax.swing.JFrame {

    frm_ayat_en_main main = new frm_ayat_en_main();
    My_Contacts cont = new My_Contacts();
    My_Model mdl = new My_Model();
    ayat.myFunctions func = new myFunctions();
    public static PreparedStatement ps = null;
    public static ResultSet rs = null;
//    public static int currentUserId= dp.Go.idD;

    static String strID;
    String user;
    String photo_path;
    User usr;
    int pos =0;


//     static boolean isOn;
    public frm_ayat_en_my_contacts() {
        initComponents();
        setLayout(new AbsoluteLayout());
//        setTableContents();

    }

    public static String getStrID() {
        return strID;
    }

    public static void setStrID(String strID) {
        frm_ayat_en_my_contacts.strID = strID;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPan = new javax.swing.JPanel();
        pan_Grid = new javax.swing.JPanel();
        lbl_ID = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        lbl_fst_nam = new javax.swing.JLabel();
        txt_FirstName = new javax.swing.JTextField();
        lbl_lst_nam = new javax.swing.JLabel();
        Txt_LastName = new javax.swing.JTextField();
        lbl_phone = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        lbl_eMail = new javax.swing.JLabel();
        txt_eMail = new javax.swing.JTextField();
        lbl_group = new javax.swing.JLabel();
        cb_group = new javax.swing.JComboBox<>();
        pan_user = new javax.swing.JPanel();
        lbl_usr_photo = new javax.swing.JLabel();
        btn_Mini = new java.awt.Button();
        btn_cancel1 = new java.awt.Button();
        lbl_usrFullName = new javax.swing.JLabel();
        pan_photo = new javax.swing.JPanel();
        lbl_foto = new javax.swing.JLabel();
        lbl_foto2 = new javax.swing.JLabel();
        lbl_address = new javax.swing.JLabel();
        btn_Brows = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA_adrs = new javax.swing.JTextArea();
        btn_clear = new java.awt.Button();
        btn_add = new java.awt.Button();
        btn_edit = new java.awt.Button();
        btn_delet = new java.awt.Button();
        pnl_tbl = new javax.swing.JPanel();
        btn_find = new java.awt.Button();
        scl_tbl = new javax.swing.JScrollPane();
        tbl_contacts = new javax.swing.JTable();
        pan_nav = new javax.swing.JPanel();
        lbl_usrFullName1 = new javax.swing.JLabel();
        btn_firstCont = new java.awt.Button();
        btn_PrevCont = new java.awt.Button();
        btn_nextCont = new java.awt.Button();
        btn_lastCont = new java.awt.Button();
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
        setTitle("My contacts");
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

        pan_Grid.setBackground(new java.awt.Color(0, 0, 0, 80));
        pan_Grid.setAlignmentX(1.5F);
        pan_Grid.setLayout(new java.awt.GridLayout(6, 2, 40, 15));

        lbl_ID.setFont(new java.awt.Font("Chilanka", 0, 10)); // NOI18N
        lbl_ID.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ID.setText("ID");
        pan_Grid.add(lbl_ID);

        txt_ID.setBackground(new java.awt.Color(255, 0, 153));
        txt_ID.setFont(new java.awt.Font("Chilanka", 0, 11)); // NOI18N
        txt_ID.setForeground(new java.awt.Color(0, 0, 0));
        txt_ID.setAlignmentX(20.0F);
        txt_ID.setBorder(null);
        pan_Grid.add(txt_ID);

        lbl_fst_nam.setFont(new java.awt.Font("Chilanka", 0, 10)); // NOI18N
        lbl_fst_nam.setForeground(new java.awt.Color(255, 255, 255));
        lbl_fst_nam.setText("First Name");
        pan_Grid.add(lbl_fst_nam);

        txt_FirstName.setBackground(new java.awt.Color(255, 0, 153));
        txt_FirstName.setFont(new java.awt.Font("Chilanka", 0, 11)); // NOI18N
        txt_FirstName.setForeground(new java.awt.Color(0, 0, 0));
        txt_FirstName.setAlignmentX(20.0F);
        txt_FirstName.setBorder(null);
        pan_Grid.add(txt_FirstName);

        lbl_lst_nam.setFont(new java.awt.Font("Chilanka", 0, 10)); // NOI18N
        lbl_lst_nam.setForeground(new java.awt.Color(255, 255, 255));
        lbl_lst_nam.setText("Last Name");
        pan_Grid.add(lbl_lst_nam);

        Txt_LastName.setBackground(new java.awt.Color(255, 0, 153));
        Txt_LastName.setFont(new java.awt.Font("Chilanka", 0, 11)); // NOI18N
        Txt_LastName.setForeground(new java.awt.Color(0, 0, 0));
        Txt_LastName.setAlignmentX(20.0F);
        Txt_LastName.setBorder(null);
        pan_Grid.add(Txt_LastName);

        lbl_phone.setFont(new java.awt.Font("Chilanka", 0, 10)); // NOI18N
        lbl_phone.setForeground(new java.awt.Color(255, 255, 255));
        lbl_phone.setText("Phone");
        pan_Grid.add(lbl_phone);

        txt_phone.setBackground(new java.awt.Color(255, 0, 153));
        txt_phone.setFont(new java.awt.Font("Chilanka", 0, 11)); // NOI18N
        txt_phone.setForeground(new java.awt.Color(0, 0, 0));
        txt_phone.setBorder(null);
        txt_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phoneActionPerformed(evt);
            }
        });
        pan_Grid.add(txt_phone);

        lbl_eMail.setFont(new java.awt.Font("Chilanka", 0, 10)); // NOI18N
        lbl_eMail.setForeground(new java.awt.Color(255, 255, 255));
        lbl_eMail.setText("EMail");
        pan_Grid.add(lbl_eMail);

        txt_eMail.setBackground(new java.awt.Color(255, 0, 153));
        txt_eMail.setFont(new java.awt.Font("Chilanka", 0, 11)); // NOI18N
        txt_eMail.setForeground(new java.awt.Color(0, 0, 0));
        txt_eMail.setBorder(null);
        txt_eMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_eMailActionPerformed(evt);
            }
        });
        pan_Grid.add(txt_eMail);

        lbl_group.setFont(new java.awt.Font("Chilanka", 0, 10)); // NOI18N
        lbl_group.setForeground(new java.awt.Color(255, 255, 255));
        lbl_group.setText("Group");
        pan_Grid.add(lbl_group);

        cb_group.setBackground(new java.awt.Color(153, 255, 51));
        cb_group.setFont(new java.awt.Font("Chilanka", 0, 11)); // NOI18N
        cb_group.setForeground(new java.awt.Color(0, 0, 0));
        cb_group.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Family", "Friends", "Work" }));
        cb_group.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_groupActionPerformed(evt);
            }
        });
        pan_Grid.add(cb_group);

        MainPan.add(pan_Grid, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 90, 477, 315));
        pan_Grid.add(lbl_ID);
        pan_Grid.add(txt_ID);
        pan_Grid.add(lbl_fst_nam);
        pan_Grid.add(txt_FirstName);
        pan_Grid.add(lbl_lst_nam);
        pan_Grid.add(Txt_LastName);
        pan_Grid.add(lbl_phone);
        pan_Grid.add(txt_phone);
        pan_Grid.add(lbl_eMail);
        pan_Grid.add(txt_eMail);
        pan_Grid.add(lbl_group);
        pan_Grid.add(cb_group);

        pan_user.setBackground(new java.awt.Color(0, 0, 0, 80));
        pan_user.setLayout(null);

        lbl_usr_photo.setBackground(new java.awt.Color(255, 0, 153));
        lbl_usr_photo.setFont(new java.awt.Font("Chilanka", 0, 10)); // NOI18N
        lbl_usr_photo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usr_photo.setOpaque(true);
        lbl_foto2.setSize(250, 600);
        pan_user.add(lbl_usr_photo);
        lbl_usr_photo.setBounds(180, 9, 81, 45);

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
        pan_user.add(btn_Mini);
        btn_Mini.setBounds(849, 9, 36, 36);

        btn_cancel1.setActionCommand("cancel");
        btn_cancel1.setBackground(new java.awt.Color(255, 255, 255));
        btn_cancel1.setFont(new java.awt.Font("Chilanka", 1, 14)); // NOI18N
        btn_cancel1.setForeground(new java.awt.Color(204, 0, 0));
        btn_cancel1.setLabel("X");
        btn_cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancel1ActionPerformed(evt);
            }
        });
        pan_user.add(btn_cancel1);
        btn_cancel1.setBounds(891, 9, 36, 37);

        lbl_usrFullName.setBackground(new java.awt.Color(0, 0, 0, 80)
        );
        lbl_usrFullName.setFont(new java.awt.Font("Chilanka", 0, 10)); // NOI18N
        lbl_usrFullName.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usrFullName.setAlignmentX(1.0F);
        lbl_usrFullName.setAlignmentY(10.0F);
        pan_user.add(lbl_usrFullName);
        lbl_usrFullName.setBounds(9, 9, 162, 36);

        MainPan.add(pan_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 18, 936, 63));

        pan_photo.setBackground(new java.awt.Color(0, 0, 0, 80));
        pan_photo.setLayout(null);

        lbl_foto.setFont(new java.awt.Font("Chilanka", 0, 10)); // NOI18N
        lbl_foto.setForeground(new java.awt.Color(255, 255, 255));
        lbl_foto.setText("Photo");
        lbl_foto.setAlignmentX(1.0F);
        lbl_foto.setAlignmentY(10.0F);
        pan_photo.add(lbl_foto);
        lbl_foto.setBounds(9, 9, 108, 41);

        lbl_foto2.setBackground(new java.awt.Color(255, 0, 153));
        lbl_foto2.setFont(new java.awt.Font("Chilanka", 0, 10)); // NOI18N
        lbl_foto2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_foto2.setOpaque(true);
        lbl_foto2.setSize(250, 600);
        pan_photo.add(lbl_foto2);
        lbl_foto2.setBounds(135, 0, 126, 90);

        lbl_address.setFont(new java.awt.Font("Chilanka", 0, 10)); // NOI18N
        lbl_address.setForeground(new java.awt.Color(255, 255, 255));
        lbl_address.setText("Address");
        lbl_address.setAlignmentX(1.0F);
        lbl_address.setAlignmentY(10.0F);
        pan_photo.add(lbl_address);
        lbl_address.setBounds(9, 135, 90, 27);

        btn_Brows.setActionCommand("Brows");
        btn_Brows.setBackground(new java.awt.Color(255, 255, 255));
        btn_Brows.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        btn_Brows.setLabel("Brows");
        btn_Brows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BrowsActionPerformed(evt);
            }
        });
        btn_Brows.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_BrowsKeyPressed(evt);
            }
        });
        pan_photo.add(btn_Brows);
        btn_Brows.setBounds(333, 9, 108, 40);

        txtA_adrs.setBackground(new java.awt.Color(255, 0, 153));
        txtA_adrs.setColumns(20);
        txtA_adrs.setFont(new java.awt.Font("Chilanka", 0, 11)); // NOI18N
        txtA_adrs.setForeground(new java.awt.Color(0, 0, 0));
        txtA_adrs.setRows(5);
        jScrollPane1.setViewportView(txtA_adrs);

        pan_photo.add(jScrollPane1);
        jScrollPane1.setBounds(135, 126, 306, 99);

        btn_clear.setActionCommand("clear");
        btn_clear.setBackground(new java.awt.Color(255, 255, 255));
        btn_clear.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        btn_clear.setLabel("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        pan_photo.add(btn_clear);
        btn_clear.setBounds(333, 72, 102, 40);
        btn_clear.getAccessibleContext().setAccessibleName("clear");

        btn_add.setActionCommand("Add");
        btn_add.setBackground(new java.awt.Color(255, 255, 255));
        btn_add.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        btn_add.setForeground(new java.awt.Color(0, 102, 0));
        btn_add.setLabel("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        pan_photo.add(btn_add);
        btn_add.setBounds(9, 261, 102, 40);

        btn_edit.setActionCommand("clear");
        btn_edit.setBackground(new java.awt.Color(255, 255, 255));
        btn_edit.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        btn_edit.setForeground(new java.awt.Color(0, 0, 153));
        btn_edit.setLabel("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        pan_photo.add(btn_edit);
        btn_edit.setBounds(117, 261, 102, 40);

        btn_delet.setActionCommand("delete");
        btn_delet.setBackground(new java.awt.Color(255, 255, 255));
        btn_delet.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        btn_delet.setForeground(new java.awt.Color(153, 0, 51));
        btn_delet.setLabel("Delete");
        btn_delet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletActionPerformed(evt);
            }
        });
        pan_photo.add(btn_delet);
        btn_delet.setBounds(234, 261, 102, 40);

        MainPan.add(pan_photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 90, 450, 315));

        pnl_tbl.setBackground(new java.awt.Color(0, 0, 0, 80));
        pnl_tbl.setLayout(null);

        btn_find.setActionCommand("find");
        btn_find.setBackground(new java.awt.Color(255, 255, 255));
        btn_find.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        btn_find.setForeground(new java.awt.Color(0, 204, 0));
        btn_find.setLabel("Find");
        btn_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_findActionPerformed(evt);
            }
        });
        pnl_tbl.add(btn_find);
        btn_find.setBounds(18, 162, 102, 40);

        scl_tbl.setBackground(new java.awt.Color(0, 0, 0, 80));

        tbl_contacts.setBackground(new java.awt.Color(0, 0, 0, 80));
        tbl_contacts.setFont(new java.awt.Font("Chilanka", 0, 10)); // NOI18N
        tbl_contacts.setForeground(new java.awt.Color(255, 255, 255));
        tbl_contacts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "First_Name", "Last_Name", "Group", "Phone", "E_Mail", "Address", "Photo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_contacts.setGridColor(new java.awt.Color(0, 0, 0));
        tbl_contacts.setRowHeight(30);
        tbl_contacts.getTableHeader().setReorderingAllowed(false);
        tbl_contacts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_contactsMouseClicked(evt);
            }
        });
        scl_tbl.setViewportView(tbl_contacts);

        pnl_tbl.add(scl_tbl);
        scl_tbl.setBounds(0, 27, 927, 225);

        MainPan.add(pnl_tbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 477, 936, 207));

        pan_nav.setBackground(new java.awt.Color(0, 0, 0, 80));

        lbl_usrFullName1.setBackground(new java.awt.Color(0, 0, 0, 80)
        );
        lbl_usrFullName1.setFont(new java.awt.Font("Chilanka", 0, 10)); // NOI18N
        lbl_usrFullName1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usrFullName1.setAlignmentX(1.0F);
        lbl_usrFullName1.setAlignmentY(10.0F);
        pan_nav.add(lbl_usrFullName1);

        btn_firstCont.setActionCommand("First Contact");
        btn_firstCont.setBackground(new java.awt.Color(255, 255, 255));
        btn_firstCont.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        btn_firstCont.setForeground(new java.awt.Color(153, 0, 51));
        btn_firstCont.setLabel("|<");
        btn_firstCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_firstContActionPerformed(evt);
            }
        });
        pan_nav.add(btn_firstCont);

        btn_PrevCont.setActionCommand("Previous Contact");
        btn_PrevCont.setBackground(new java.awt.Color(255, 255, 255));
        btn_PrevCont.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        btn_PrevCont.setForeground(new java.awt.Color(0, 0, 153));
        btn_PrevCont.setLabel("<");
        btn_PrevCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PrevContActionPerformed(evt);
            }
        });
        pan_nav.add(btn_PrevCont);

        btn_nextCont.setActionCommand("Next Contact");
        btn_nextCont.setBackground(new java.awt.Color(255, 255, 255));
        btn_nextCont.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        btn_nextCont.setForeground(new java.awt.Color(0, 0, 153));
        btn_nextCont.setLabel(">");
        btn_nextCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextContActionPerformed(evt);
            }
        });
        pan_nav.add(btn_nextCont);

        btn_lastCont.setActionCommand("Last");
        btn_lastCont.setBackground(new java.awt.Color(255, 255, 255));
        btn_lastCont.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        btn_lastCont.setForeground(new java.awt.Color(153, 0, 51));
        btn_lastCont.setLabel(">|");
        btn_lastCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lastContActionPerformed(evt);
            }
        });
        pan_nav.add(btn_lastCont);

        MainPan.add(pan_nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 414, 486, 50));

        lbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/quran.png"))); // NOI18N
        lbl_background.setPreferredSize(new java.awt.Dimension(800, 600));
        lbl_background.setRequestFocusEnabled(false);
        MainPan.add(lbl_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -9, 1026, 711));

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
                .addComponent(MainPan, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnI_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnI_aboutActionPerformed
        Tools.openForm(new frm_ayat_en_about());
    }//GEN-LAST:event_mnI_aboutActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        clearData();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        clearData();

//        clear();
//       cont.getAllRows(tbl_contacts);
     System.out.println("user ID is "+ dp.Go.idD+ " from MY contactS");
        setTableContents(); // MISS CONNECTION WITH DATA BASE
//        Tools.setReport(tbl_contacts);
    }//GEN-LAST:event_formWindowOpened

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
//              if (evt.getKeyCode() == KeyEvent.VK_CAPS_LOCK) {

//        boolean isOn = Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
//        lbl_capslock_empty.setText("CapsLock button is " + (isOn ? "on" : "off"));
//   if (isOn) {
//            lbl_capslock.setVisible(true);
//        } else {
//            lbl_capslock.setVisible(false);
//        }
    }//GEN-LAST:event_formKeyPressed

    private void txt_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phoneActionPerformed

    private void btn_BrowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BrowsActionPerformed
        photo_path = func.browsImage(lbl_foto2);
    }//GEN-LAST:event_btn_BrowsActionPerformed

    private void txt_eMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_eMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_eMailActionPerformed

    private void cb_groupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_groupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_groupActionPerformed

    private void btn_MiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MiniActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btn_MiniActionPerformed

    private void btn_cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancel1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_cancel1ActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
//        setValues();
//        cont.add(); //WITH AUTO USERid
//        addNewContact();
        addANewContact();
        clearData();
//        cont.getAllRows(tbl_contacts);
        setTableContents();
        dp.Go.fillCombo("my_contact", "Groups", cb_group);
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed

//        setValues();
//        cont.update();
       editContact();
        clearData();
//        cont.getAllRows(tbl_contacts);
        setTableContents();
        dp.Go.fillCombo("my_contact", "Groups", cb_group);
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_deletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletActionPerformed
//        setValues();
//        cont.delete();
        int ID= Integer.valueOf(txt_ID.getText());
        deleteContact(ID);
        clearData();
        setTableContents();

//        cont.getAllRows(tbl_contacts);
    }//GEN-LAST:event_btn_deletActionPerformed

    private void btn_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_findActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_findActionPerformed

    private void tbl_contactsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_contactsMouseClicked
        int  row= tbl_contacts.getSelectedRow();
        showTableData(row);
        btn_add.setEnabled(false);
        btn_edit.setEnabled(true);
        btn_delet.setEnabled(true);
    }//GEN-LAST:event_tbl_contactsMouseClicked

    private void btn_BrowsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_BrowsKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            photo_path = func.browsImage(lbl_foto2);
        }
    }//GEN-LAST:event_btn_BrowsKeyPressed

    private void btn_lastContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lastContActionPerformed
        pos= tbl_contacts.getRowCount()-1;
        showTableData(pos);
    }//GEN-LAST:event_btn_lastContActionPerformed

    private void btn_firstContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_firstContActionPerformed
        pos= 0;
        showTableData(pos);
    }//GEN-LAST:event_btn_firstContActionPerformed

    private void btn_nextContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextContActionPerformed
        pos++;
        showTableData(pos);
    }//GEN-LAST:event_btn_nextContActionPerformed

    private void btn_PrevContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PrevContActionPerformed
        pos--;
        showTableData(pos);
   
    }//GEN-LAST:event_btn_PrevContActionPerformed

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
            java.util.logging.Logger.getLogger(frm_ayat_en_my_contacts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_en_my_contacts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_en_my_contacts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_ayat_en_my_contacts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_ayat_en_my_contacts().setVisible(true);

            }

        });
//            lbl_capslock.setText(strID);
//        

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel MainPan;
    public static javax.swing.JMenuBar MenuBar1;
    public static javax.swing.JTextField Txt_LastName;
    public static java.awt.Button btn_Brows;
    public static java.awt.Button btn_Mini;
    public static java.awt.Button btn_PrevCont;
    public static java.awt.Button btn_add;
    public static java.awt.Button btn_cancel1;
    public static java.awt.Button btn_clear;
    public static java.awt.Button btn_delet;
    public static java.awt.Button btn_edit;
    public static java.awt.Button btn_find;
    public static java.awt.Button btn_firstCont;
    public static java.awt.Button btn_lastCont;
    public static java.awt.Button btn_nextCont;
    public static javax.swing.JComboBox<String> cb_group;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lbl_ID;
    public static javax.swing.JLabel lbl_address;
    public static javax.swing.JLabel lbl_background;
    public static javax.swing.JLabel lbl_eMail;
    public static javax.swing.JLabel lbl_foto;
    public static javax.swing.JLabel lbl_foto2;
    public static javax.swing.JLabel lbl_fst_nam;
    public static javax.swing.JLabel lbl_group;
    public static javax.swing.JLabel lbl_lst_nam;
    public static javax.swing.JLabel lbl_phone;
    public static javax.swing.JLabel lbl_usrFullName;
    public static javax.swing.JLabel lbl_usrFullName1;
    public static javax.swing.JLabel lbl_usr_photo;
    public static javax.swing.JMenuItem mnI_about;
    public static javax.swing.JMenuItem mnI_exit;
    public static javax.swing.JMenuItem mnI_help;
    public static javax.swing.JMenuItem mnI_lang;
    public static javax.swing.JMenu mn_file;
    public static javax.swing.JMenu mn_help;
    public static javax.swing.JMenu mn_styel;
    public static javax.swing.JPanel pan_Grid;
    public static javax.swing.JPanel pan_nav;
    public static javax.swing.JPanel pan_photo;
    public static javax.swing.JPanel pan_user;
    public static javax.swing.JPanel pnl_tbl;
    public static javax.swing.JRadioButtonMenuItem rdBMI1;
    public static javax.swing.JRadioButtonMenuItem rdBMI2;
    public static javax.swing.JRadioButtonMenuItem rdBMI3;
    public static javax.swing.JScrollPane scl_tbl;
    public static javax.swing.JTable tbl_contacts;
    public static javax.swing.JTextArea txtA_adrs;
    public static javax.swing.JTextField txt_FirstName;
    public static javax.swing.JTextField txt_ID;
    public static javax.swing.JTextField txt_eMail;
    public static javax.swing.JTextField txt_phone;
    // End of variables declaration//GEN-END:variables

    private void clearData() {
        Tools.clearTxt(this);
        frm_ayat_en_my_contacts.lbl_foto2.setIcon(null);
        photo_path= null;
        txt_FirstName.requestFocus();
//        dp.Go.getAutoNumber("my_contact", "ID");
//         txt_log_ID.setText(log.getAutoNumber());
        btn_add.setEnabled(true);
        btn_delet.setEnabled(false);
        btn_edit.setEnabled(false);
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
//    String miss = "You miss: \n";
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
//        InputStream img = new FileInputStream(new File(photo_path));
////            ps.setBlob(5, img);
//        usr.setPhoto(img);
//    }
    private void clear() {
        Tools.clearTxt(this);
//        lbl_foto2.setText("");
        txt_FirstName.requestFocus();
        btn_clear.setEnabled(true);
        btn_add.setEnabled(true);
        btn_delet.setEnabled(false);
        btn_clear.setEnabled(false);
    }

//    private boolean verifyData() {
//        //IF SOME FIELDS ARE EMPTY
//        if (txt_FirstName.getText() == null && Txt_LastName.getText() == null
//                || txt_phone.getText().equals("") || String.valueOf(txt_password.getPassword()).equals("")
//                || String.valueOf(txt_repass.getPassword()).equals("")) {
//            Tools.msgBox("One or more field are empty!");
//            return false;
//        }
//        //IF REPASSWORD NOT MATCHES PASSWORD   
//        if (!String.valueOf(txt_password.getPassword()).equals(String.valueOf(txt_repass.getPassword()))) {
//            Tools.msgBox("pass and repass didn't match!");
//            return false;
//        }
//        // IF NO PICTURE UPLOADED   
//        if (photo_path == null) {
//            Tools.msgBox("No image is selected!");
//            return false;
//        } //ELSE EVERY THING IS OK
//        else {
//            return true;
//        }
//    }
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
            ps.setString(1, txt_phone.getText());
            rs = ps.executeQuery();
            if (rs.next()) {
                unExist = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(frm_ayat_en_my_contacts.class.getName()).log(Level.SEVERE, null, ex);
        }
        return unExist;

    }

    private void setValues() {
        cont.setID(Integer.parseInt(cont.getAutoNumber()));
        cont.setFirst_Name(txt_FirstName.getText());
        cont.setLast_Name(Txt_LastName.getText());
        cont.setPhone(txt_phone.getText());
        cont.setE_Mail(txt_eMail.getText());
        cont.setAddress(txtA_adrs.getText());
        cont.setGroups((String) cb_group.getSelectedItem());
        cont.setPhoto(cont.getPhoto());
//        cont.setPhoto((byte[])lbl_foto2.getIcon());
        cont.setUser_ID(Integer.parseInt(cont.getAutoNumber()));
    }

    private void setTableContents() {

//  3) GETTING PREPARD DATA
            ContactQuery myQry = new ContactQuery();
            ArrayList<My_Contacts> conList = myQry.contactList(dp.Go.idD);
            
            String[] columnNames = {"ID", "First_Name", "Last_Name", "Groups",
                                        "Phone", "E_Mail", "Address", "Photo"};
            Object[][] cell = new Object[conList.size()][8]; 
            
            for (int row = 0; row < conList.size(); row++) { // ROW = I
                cell[row][0] = conList.get(row).getID();
                cell[row][1] = conList.get(row).getFirst_Name();
                cell[row][2] = conList.get(row).getLast_Name();
                cell[row][3] = conList.get(row).getGroups();
                cell[row][4] = conList.get(row).getPhone();
                cell[row][5] = conList.get(row).getE_Mail();
                cell[row][6] = conList.get(row).getAddress();
                ImageIcon img = new ImageIcon(
                                new ImageIcon(
                                conList.get(row)
                                .getPhoto())
                                .getImage()
                                .getScaledInstance(70, 40, Image.SCALE_SMOOTH));

                cell[row][7] = img;
                  }
            //4) SETTING DATA IN JTable (FILL OR POPULATE A JTABLE)
            mdl = new My_Model(cell, columnNames);
            tbl_contacts.setModel(mdl);
            tbl_contacts.setRowHeight(40);
            tbl_contacts.getColumnModel().getColumn(7).setPreferredWidth(70);
            
    }

    private void addNewContact() {
        Connection con= dp.Go.myConnection();
        try {
            String sql= "INSERT INTO `my_contact`(`First_Name`, `Last_Name`, "
                    + "`Groups`, `Phone`, `E_Mail`, `Address`, `Photo`, "
                    + "`User_ID` ) VALUES (?,?,?,?,?,?,?,?)";
            ps= con.prepareStatement(sql);
            ps.setString(1, cont.getFirst_Name());
            ps.setString(2, cont.getLast_Name());
            ps.setString(3, (String) cb_group.getSelectedItem());
            ps.setString(4, cont.getPhone());
            ps.setString(5, cont.getE_Mail());
            ps.setString(6, cont.getAddress());
            ps.setBytes(7, cont.getPhoto());
            ps.setInt(8, cont.getUser_ID());
            
            if (ps.executeUpdate() != 0) {
                        Tools.msgBox("Add successfully!");
                        clear();
                    } 
                    else {
                        Tools.msgBox("Somthing wrong!");
                    }
            con.close();
        } catch (SQLException e) {
            Tools.msgBox(e.getMessage());
        }
//        My_Contacts contact= new My_Contacts(null,First_Name,Last_Name,Groups,Phone,E_Mail,Address, Photo,  0);
    }

    private void addANewContact() {
        // GETTING VALUES
            String First_Name= txt_FirstName.getText();
            String Last_Name= Txt_LastName.getText();
            String Groups= (String) cb_group.getSelectedItem();
            String Phone= txt_phone.getText();
            String E_Mail= txt_eMail.getText();
            String Address= txtA_adrs.getText();
            byte[] Photo= null;
            if (photo_path != null) {
                 try {
            Path pth= Paths.get(photo_path);
            Photo= Files.readAllBytes(pth);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frm_ayat_en_my_contacts.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(frm_ayat_en_my_contacts.class.getName()).log(Level.SEVERE, null, ex);
        }// SETTING VALUES
        My_Contacts aContact= new My_Contacts( null,First_Name, Last_Name, Groups, Phone, 
                E_Mail, Address, Photo, dp.Go.idD);
        //IMPLIMENT THE QUERY
        dp.ContactQuery.insertContact(aContact);
        } else {
                Tools.msgBox("You must select a profile picture!");
        }
           
    }

    private void editContact() {
         // GETTING VALUES
//            int ID= Integer.parseInt(txt_ID.getText());
            int ID= Integer.valueOf(txt_ID.getText());
            String First_Name= txt_FirstName.getText();
            String Last_Name= Txt_LastName.getText();
            String Groups= (String) cb_group.getSelectedItem();
            String Phone= txt_phone.getText();
            String E_Mail= txt_eMail.getText();
            String Address= txtA_adrs.getText();
            byte[] Photo= null;
            
           ///// // update with photo////////
            if (photo_path != null) {
                  
                try {
                Path pth= Paths.get(photo_path);
                Photo= Files.readAllBytes(pth);
                // SETTING VALUES
                My_Contacts aContact= new My_Contacts(ID, First_Name, Last_Name, Groups, Phone, 
                        E_Mail, Address, Photo, dp.Go.idD);
                //IMPLIMENT THE QUERY
                ContactQuery.updateContact(aContact, true);

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(frm_ayat_en_my_contacts.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(frm_ayat_en_my_contacts.class.getName()).log(Level.SEVERE, null, ex);
                }
        } else {
                // SETTING VALUES
                My_Contacts aContact= new My_Contacts(ID, First_Name, Last_Name, Groups, Phone, 
                        E_Mail, Address, Photo, dp.Go.idD);
                //IMPLIMENT THE QUERY
                ContactQuery.updateContact(aContact, false);
        }
        
    }

    private void deleteContact(int ID) {
        
        Connection con= dp.Go.myConnection();
        PreparedStatement ps;
        String sql= "DELETE FROM `my_contact` WHERE `ID`= ?";
          boolean isYes=Tools.ConfirmMessege("Are you sure?");
          if (isYes) {
            try {
            ps= con.prepareStatement(sql);
            ps.setInt(1, ID);
            if (ps.executeUpdate() != 0) {
                Tools.msgBox("Contact is deleted!");
                
            } else {
                Tools.msgBox("Something problem!");

            }
        } catch (Exception e) {
                Tools.msgBox(e.getMessage());

        }
        } else {
                Tools.msgBox("Contact is NOT deleted!");
        }
        
    }

    private void showTableData(int row) {
        txt_ID.setText( tbl_contacts.getValueAt(row, 0).toString()); // CASTING NOT WORK HERE!
        txt_FirstName.setText((String) tbl_contacts.getValueAt(row, 1));
        Txt_LastName.setText((String) tbl_contacts.getValueAt(row, 2));
        cb_group.setSelectedItem((String) tbl_contacts.getValueAt(row, 3));
        txt_phone.setText((String) tbl_contacts.getValueAt(row, 4));
        txt_eMail.setText((String) tbl_contacts.getValueAt(row, 5));
        txtA_adrs.setText((String) tbl_contacts.getValueAt(row, 6));
        Image pic= ((ImageIcon)  tbl_contacts.getValueAt(row, 7))
                .getImage().getScaledInstance(lbl_foto2.getWidth() , lbl_foto2.getHeight() , Image.SCALE_SMOOTH);
        ImageIcon img= new ImageIcon(pic);
        lbl_foto2.setIcon(img);
    }

}
