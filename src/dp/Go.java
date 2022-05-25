/*
 SQL DATA BASE CONNECTION
 */
package dp;

import ayat.Tools;
import ayat.myFunctions;
//import ayat.myModel;
import entity.My_Contacts;
import forms.english.frm_ayat_en_Fees;
import static forms.english.frm_ayat_en_Fees.txt_ID;
import static forms.english.frm_ayat_en_Fees.txt_pay_;
import forms.english.frm_ayat_en_Semester;
import forms.english.frm_ayat_en_Student_Info;
import forms.english.frm_ayat_en_Teacher_Info;
import forms.english.frm_ayat_en_main;
import forms.english.frm_ayat_en_my_contacts;
import static forms.english.frm_ayat_en_my_contacts.rs;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Go {

    private static String user = "root";
    private static String url = "";
    private static String DBName = "Ayat";
    private static Connection conn = null;
    private static int intSem;
    private static String img_path;
    
    public static PreparedStatement ps = null;
    public static ResultSet rs = null;
    public static int sem;
    public static int idD;
    public static frm_ayat_en_my_contacts myCont = new frm_ayat_en_my_contacts();
    public static My_Contacts cont = new My_Contacts();
    
    frm_ayat_en_Student_Info sInfo;
    
//    static myModel modl= new myModel();

    public static void getAllRows(JTable tbl_course) {
        fillToJTable("SELECT * FROM view_Course WHERE Semester = " + intSem + ";", tbl_course);

    }

    public static void getAllRows(String my_contact) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    private static void setURL() {
        url = "jdbc:mysql://localhost:3306/" + DBName;//+ "?useUnicode= true&characterEncoding=UTF-8"; //   local or any host 

    }

    public static void setConnection() {
        setURL();
        try {
            conn = DriverManager.getConnection(url, user, "");
            System.out.println("Connection to SQL has been established.");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        } //finally {  Makes errors
//            try {
//                if (conn != null) {
//                    conn.close();
//                }
//            } catch (SQLException ex) {
//                System.out.println(ex.getMessage());
//            }
//        }

    }

    public static Connection myConnection() {
        setURL();
        try {
            conn = DriverManager.getConnection(url, user, "");
            System.out.println("Connection to SQL has been established.");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return conn;
    }

    public static boolean is_UsrNam_Exist(String strUserName) {
        setConnection();
        String strCheck = "SELECT * FROM User WHERE User_Name='" + strUserName + "'";
        boolean isFound = dp.Go.runNonQuery(strCheck);
        return isFound;//            Tools.msgBox("This user name already token! Try again");
//            Tools.msgBox("You can take this one!");

    }

    public static boolean chekAdmnUsrPass(String strUserName, String strPassword) {
        try {

            String strCheck = "SELECT * FROM Admin WHERE " + "User_Name='" + strUserName
                    + "' and " + "Password='" + strPassword + "'";
            setConnection();
//           Statement stmt = conn.createStatement();

            ps = conn.prepareStatement(strCheck);
            rs = ps.executeQuery();

//           stmt.executeQuery(strCheck);
            while (rs.next()) {  //     SQL

                String fName = rs.getString("First_Name"); // Means column no. 2 and 3 in table student
                String lName = rs.getString("Last_Name"); // Means column no. 2 and 3 in table student
                Tools.msgBox("Welcome " + fName + " " + lName);
                frm_ayat_en_main.txtAr_welcome.setText("Welcome " + fName + " " + lName);
                frm_ayat_en_main.txtAr_welcome.setEditable(false);
                conn.close();
                return true;
            }
            conn.close();

        } catch (SQLException ex) {
            Tools.msgBox(ex.getMessage());

        }
        return false;

    }

    public static boolean chekTechrUsrPass(String strUserName, String strPassword) {
        try {

            String strCheck = "SELECT * FROM Teacher WHERE " + "User_Name='" + strUserName
                    + "' and " + "Password='" + strPassword + "'";
            setConnection();
//           Statement stmt = conn.createStatement();

            ps = conn.prepareStatement(strCheck);
            rs = ps.executeQuery();

//           stmt.executeQuery(strCheck);
            while (rs.next()) {  //     SQL

                String fName = rs.getString("First_Name"); // Means column no. 2 and 3 in table student
                String lName = rs.getString("Last_Name"); // Means column no. 2 and 3 in table student
                frm_ayat_en_main.txtAr_welcome.setText("Welcome " + fName + " " + lName);

                frm_ayat_en_main.txtAr_welcome.setEditable(false);
                idD = rs.getInt("ID");

                conn.close();
                return true;
            }
            conn.close();

        } catch (SQLException ex) {
            Tools.msgBox(ex.getMessage());

        }
        return false;

    }

    public static boolean chekStudntUsrPass(String strUserName, String strPassword) {
        try {
            String strCheck = "SELECT * FROM Student WHERE " + "User_Name='" + strUserName
                    + "' and " + "Password='" + strPassword + "'";
            setConnection();
            ps = conn.prepareStatement(strCheck);
            rs = ps.executeQuery();

            while (rs.next()) {  //     SQL
                String fName = rs.getString("First_Name"); // Means column no. 2 and 3 in table student
                String lName = rs.getString("Last_Name"); // Means column no. 2 and 3 in table student
                frm_ayat_en_main.txtAr_welcome.setText("Welcome " + fName + " " + lName);
                frm_ayat_en_main.txtAr_welcome.setEditable(false);
                idD = rs.getInt("ID");
                conn.close();
                return true;
            }
            conn.close();
        } catch (SQLException ex) {
            Tools.msgBox(ex.getMessage());

        }
        return false;

    }

    public static boolean chekContUsrPass(String strUserName, String strPassword) {
        try {
            String strCheck = "SELECT * FROM User WHERE " + "User_Name='" + strUserName
                    + "' and " + "Password='" + strPassword + "'";
            ps = conn.prepareStatement(strCheck);
            rs = ps.executeQuery();
            while (rs.next()) {  //     SQL
                String fName = rs.getString("First_Name");
                String lName = rs.getString("Last_Name");
                idD = rs.getInt("ID");
                Tools.msgBox("Welcome " +fName + " " +lName +"\n Your ID is " +idD);
                frm_ayat_en_my_contacts.lbl_usr_photo.setIcon(new myFunctions().resizePic(null, rs.getBytes("Photo"), frm_ayat_en_my_contacts.lbl_usr_photo.getWidth(), frm_ayat_en_my_contacts.lbl_usr_photo.getHeight()));
                return true;
            }
            conn.close();
        } catch (SQLException ex) {
            Tools.msgBox(ex.getMessage());
        }
        return false;
    }

    public static boolean chekStudntID(int ID) {
        try {
            String strCheck = "SELECT * FROM Student WHERE ID= " + ID;
            setConnection();
            ps = conn.prepareStatement(strCheck);
            rs = ps.executeQuery();
            while (rs.next()) {
                idD = rs.getInt("ID");
                conn.close();
                return true;
            }
            conn.close();

        } catch (SQLException ex) {
            Tools.msgBox(ex.getMessage());

        }
        return false;

    }

    public static void info_student(int ID) {
        try {
            String sqlStm = "SELECT * FROM Student WHERE ID= " + ID;
            setConnection();
            ps = conn.prepareStatement(sqlStm);
            rs = ps.executeQuery();
            while (rs.next()) {
                frm_ayat_en_Student_Info.txt_ID.setText(rs.getString(1));// RESULT SET COULMN COUNTED FROM 1
                frm_ayat_en_Student_Info.txt_sName.setText(rs.getString(2));
                frm_ayat_en_Student_Info.txt_LastName.setText(rs.getString(3));
                frm_ayat_en_Student_Info.txt_sMobile.setText(rs.getString(4));
                frm_ayat_en_Student_Info.txt_EMail.setText(rs.getString(5));
                frm_ayat_en_Student_Info.txt_BirthDate.setText(rs.getString(6));
                frm_ayat_en_Student_Info.txt_Gender.setText(rs.getString(7));
                frm_ayat_en_Student_Info.txt_UserName.setText(rs.getString(8));
                frm_ayat_en_Student_Info.txt_sPassword.setText(rs.getString(9));

            }
            conn.close();

        } catch (SQLException e) {
            Tools.msgBox(e.getMessage());
        }

    }

    public static void info_teacher(int ID) {
        try {
            String sqlStm = "SELECT * FROM Teacher WHERE ID= " + ID;
            setConnection();
            ps = conn.prepareStatement(sqlStm);
            rs = ps.executeQuery();
            while (rs.next()) {
                frm_ayat_en_Teacher_Info.txt_ID.setText(rs.getString(1));
                frm_ayat_en_Teacher_Info.txt_sName.setText(rs.getString(2));
                frm_ayat_en_Teacher_Info.txt_LastName.setText(rs.getString(3));
                frm_ayat_en_Teacher_Info.txt_sMobile.setText(rs.getString(4));
                frm_ayat_en_Teacher_Info.txt_EMail.setText(rs.getString(5));
                frm_ayat_en_Teacher_Info.txt_BirthDate.setText(rs.getString(6));
                frm_ayat_en_Teacher_Info.txt_Gender.setText(rs.getString(7));
                frm_ayat_en_Teacher_Info.txt_UserName.setText(rs.getString(8));
                frm_ayat_en_Teacher_Info.txt_sPassword.setText(rs.getString(9));

            }
            conn.close();

        } catch (SQLException e) {
            Tools.msgBox(e.getMessage());
        }

    }

    public static boolean runNonQuery(String SQLStatement) { // Only insert(Add) , update, delete
        try {
//            setConnection();
            Statement stmt = conn.createStatement();
            stmt.execute(SQLStatement);
//            conn.close();
            return true;
        } catch (SQLException ex) {
            Tools.msgBox(ex.getMessage());
            return false;
        }

    }

    public static String getAutoNumber(String tableName, String columnName) {
        try {
            setConnection();
            Statement stmt = conn.createStatement();
            String strAuto = "SELECT MAX(" + columnName + ")+1 AS autoNum " + "FROM " + tableName;
            stmt.executeQuery(strAuto);
            String num = "";
            while (stmt.getResultSet().next()) { // next() for stop on first result
                // = while there is a result after last record; = rows not ends ==
                // (true).
                num = stmt.getResultSet().getString("autoNum");// for namming the column
            }
            conn.close();

            if (num == null || "".equals(num)) {
                return "1"; //why? I wrot in strAuto "+1"
            } else {
                return num;
            }

        } catch (SQLException e) {
            Tools.msgBox(e.getMessage());
            return "0";
        }

    }

    public static Table getTableData(String statement) {    // WE MADE CALSS NAMED TABLE BREVIOUSLY
        try {
            setConnection();
            Statement stmt = conn.createStatement();

            ResultSet rs;
            rs = stmt.executeQuery(statement);
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            Table table = new Table(columnCount);// onther method
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    row[i] = rs.getObject(i + 1);// errors almost comes from AUTOCOMLETE
                }// I REPLACED rs.getString(i+1)
                table.addRow(row);
            }
            conn.close();
            return table;   //return in case true
        } catch (SQLException e) {
            Tools.msgBox(e.getMessage());
            return new Table(0); // return an empty table
        }                       //return in case catch false                       //return in case catch false
    }

    public static void fillCombo(String tableName, String ColumnName, JComboBox combo) {
        try {
            setConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs;
            String strSelect = "SELECT " + ColumnName + " FROM " + tableName;
            rs = stmt.executeQuery(strSelect);
            rs.last();
            int columnCount = rs.getRow();
            rs.beforeFirst();
            String[] values = new String[columnCount];
            int i = 0;
            while (rs.next()) {

                values[i] = rs.getString(1); // First colmn number = 1
                i++;

            }
            conn.close();
            combo.setModel(new DefaultComboBoxModel(values));
        } catch (SQLException e) {
            Tools.msgBox(e.getMessage());
        }

    }

    public static void fillToJTable(String SQLtableNameOrSelctStatement, JTable jtable) {
        try {
            
            setConnection();
            Statement stmt = conn.createStatement();
            ResultSet RS;   
            String SPart = SQLtableNameOrSelctStatement.substring(0, 7).toUpperCase();//NOT include cell 7
            String strSelect;
            if ("SELECT ".equals(SPart)) { //If select statement
                strSelect = SQLtableNameOrSelctStatement;
            } else {        // If table name
                strSelect = "SELECT * FROM " + SQLtableNameOrSelctStatement;
            }
            RS = stmt.executeQuery(strSelect);
            // To handle with tables
            ResultSetMetaData rsmd = RS.getMetaData();
            int columnCount = rsmd.getColumnCount();
            DefaultTableModel model = (DefaultTableModel) jtable.getModel();
            Vector row = new Vector();
            model.setRowCount(0);
            while (RS.next()) {
             row = new Vector(columnCount);
             for (int i = 1; i <= columnCount; i++){
                // IF COLUMN TYPE == BLOBE
                if ( model.getColumnClass(i).equals(Blob.class)) {
                     Blob blob = RS.getBlob(i);
                     row.add(blob);
                    BufferedImage image = null;
                    try (InputStream inpS = blob.getBinaryStream()) {
                        image = ImageIO.read(inpS);
                        ImageIcon icn= new ImageIcon(image.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
                        row.add(i, icn);
                        inpS.close();
                    } catch (IOException exp) {
                        Tools.msgBox(exp.getMessage());
                    }
                } else 
                    row.add(RS.getString(i));
                }
             model.addRow(row);
//                ImageIcon pic = new ImageIcon(new ImageIcon
//                                    (cont.contactList().get(7).getPhoto())
//                                    .getImage()
//                                    .getScaledInstance(40, 40, Image.SCALE_SMOOTH));
//                    row.add(7, pic);
//                for (int i = 1; i <= columnCount; i++)
//                {
//                    row.add(rs.getString(i)); //I REPLACED rs.getString(i)
//                    row.set(7, rs.getBlob("Photo"));
//                    row.add(rs.getBlob("Photo"));

//                    row[i][7]= pic;
                   

//                    ImageIcon img = new ImageIcon(image.getScaledInstance(40, 40, Image.SCALE_SMOOTH));

//                }
                

            }
            if (jtable.getColumnCount() != columnCount) {
                Tools.msgBox("JTable column count not equal to query column count\n"
                        + " JTable column count is: " + jtable.getColumnCount() + "\n "
                        + "Query column count is " + columnCount);

            }
            conn.close();
        } catch (SQLException e) {
            Tools.msgBox(e.getMessage());
        }
    }

    public static boolean isEmpty(String... text) {  // May calss has 2 or more var.
        for (String string : text) {
            if (string.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    //Overload same name method diff parameters
    public static boolean isEmpty(int... num) {  // overloaded
        for (int i : num) {
            if (i > 0) {
                return true;
            }

        }
        return false;
    }

    public static void semester() {
        try {
            String sql = "SELECT * FROM Semester";
            setConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getInt("First") == 1) {
                    sem = Integer.parseInt(frm_ayat_en_Semester.rdo_FirstSims.getText());
                    frm_ayat_en_Semester.rdo_FirstSims.setSelected(true);
                    intSem = 1;
                } else {
                    sem = Integer.parseInt(frm_ayat_en_Semester.rdo_SecondSims.getText());
                    frm_ayat_en_Semester.rdo_SecondSims.setSelected(true);
                    intSem = 2;
                }

            }
            conn.close();

        } catch (SQLException ex) {
            Tools.msgBox(ex.getMessage());
        }

    }

    public static void modifi_Sem() {
        if (frm_ayat_en_Semester.rdo_FirstSims.isSelected()) {
            if (frm_ayat_en_Semester.rdo_FirstSims.getText().equals(sem)) {
                Tools.msgBox("You can't modfi");
            } else {
                updatFirstSim();
            }

        } else if (frm_ayat_en_Semester.rdo_SecondSims.isSelected()) {
            if (frm_ayat_en_Semester.rdo_SecondSims.getText().equals(sem)) {
                Tools.msgBox("You can't modfi");
            } else {
                updatSecondSim();
            }
        }

    }

    private static void updatFirstSim() {
        try {
            String sql_stm = "UPDATE Semester SET First= 1, Second= 0";
            setConnection();
            ps = conn.prepareStatement(sql_stm);
//            rs = ps.executeQuery();
//            ps.executeQuery(); // not result set // not query
            ps.execute();
            Tools.msgBox("The semester has changed successfully!");
            intSem = 1;

            conn.close();

        } catch (SQLException ex) {
            Tools.msgBox(ex.getMessage());
        }

    }

    private static void updatSecondSim() {
        try {
            String sql_stm = "UPDATE Semester SET First= '0', Second= '1'";
            setConnection();
            ps = conn.prepareStatement(sql_stm);
//            rs = ps.executeQuery();
            ps.execute();

            Tools.msgBox("The semester has changed successfully!");
            intSem = 2;
            conn.close();

        } catch (SQLException ex) {
            Tools.msgBox(ex.getMessage());
        }
    }

    public static void fees_student_info_(int ID) {
        try {
            String sqlStm = "SELECT * FROM Student WHERE ID= " + ID;
            setConnection();
            ps = conn.prepareStatement(sqlStm);
            rs = ps.executeQuery();
            while (rs.next()) {
                frm_ayat_en_Fees.txt_ID.setText(rs.getString(1));
                frm_ayat_en_Fees.txt_sName.setText(rs.getString(2));
                frm_ayat_en_Fees.txt_LastName.setText(rs.getString(3));
                frm_ayat_en_Fees.txt_fees.setText(rs.getString(11));
                frm_ayat_en_Fees.txt_paied.setText(rs.getString(12));
                frm_ayat_en_Fees.txt_rest_.setText(rs.getString(13));

            }
//            conn.close();

        } catch (SQLException e) {
            Tools.msgBox(e.getMessage());
        }

    }

    public static void pay_rest() {
        try {
            setConnection();

            double pay_amount = Double.parseDouble(txt_pay_.getText());// not there are double & Double
            double paiedAfter = Double.parseDouble(frm_ayat_en_Fees.txt_paied.getText()) + pay_amount;
            double rest_after = Double.parseDouble(frm_ayat_en_Fees.txt_rest_.getText()) - pay_amount;
            String sql_stm = "UPDATE Student SET Paid=" + paiedAfter + ", "
                    + "Rest= " + rest_after;
            ps = conn.prepareStatement(sql_stm);
            ps.execute();
            Tools.msgBox("The paied amount is added successfully!");
            fees_student_info_(Integer.parseInt(txt_ID.getText()));
            frm_ayat_en_Fees.txt_pay_.setText("");
            conn.close();
        } catch (SQLException ex) {
            Tools.msgBox(ex.getMessage());
        }

    }
}
