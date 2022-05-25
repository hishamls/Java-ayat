/*
Sign_Up class
 */
package entity;

import ayat.Tools;
import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author hishamls
 */
public class Sign_Up implements MainData {

    private int Log_ID;
    private int User_ID;
    private String User_Type;
    private String User_Name;
    private String Password;
    private String First_Name;
    private String Last_Name;
    private String Phone;
    private String E_Mail;
    private String Address;
    private String Birth_Date;
    private String Gender;

    
        


    public Sign_Up() {

    }

    public Sign_Up(int Log_ID, int User_ID, String User_Type, String User_Name, String Password, String First_Name, String Last_Name, String Phone, String E_Mail, String Address, String Birth_Date, String Gender) {
        this.Log_ID = Log_ID;
        this.User_ID = User_ID;
        this.User_Type = User_Type;
        this.User_Name = User_Name;
        this.Password = Password;
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.Phone = Phone;
        this.E_Mail = E_Mail;
        this.Address = Address;
        this.Birth_Date = Birth_Date;
        this.Gender = Gender;
    }
    
    

    // We made setters and getters then implemented the interface.
    @Override
    public void add() {
        String strAdd = "INSERT INTO Sign_Up VALUES ("
                + Log_ID + ","
                + User_ID + ","
                + "'" + User_Type + "',"
                + "'" + User_Name + "',"
                + "'" + Password + "',"
                + "'" + First_Name + "',"
                + "'" + Last_Name + "',"
                + "'" + Phone + "',"
                + "'" + E_Mail + "',"
                + "'" + Address + "',"
                + "'" + Birth_Date + "',"
                + "'" + Gender + "'"
                + ")";
        boolean isAdded = dp.Go.runNonQuery(strAdd);
        if (isAdded) {
            Tools.msgBox("The user is added successfully!");

        }
    }

//    public static void check_user(String user, String pass){
//        https://www.youtube.com/watch?v=9Ut8pqg1yCA&list=PLnzqK5HvcpwTmQTPK54W95WyNzT-33MR0&index=57
//    }
    @Override
    public void update() {
        String strSelect = "UPDATE Sign_Up SET "
                + "User_Type= '" + User_Type + "', "
                + "User_Name= '" + User_Name + "', "
                + "Password= '" + Password + "', "
                + "First_Name= '" + First_Name + "', "
                + "Last_Name= '" + Last_Name + "', "
                + "Phone= '" + Phone + "', "
                + "E_Mail= '" + E_Mail + "', "
                + "Address= '" + Address + "', "
                + "Birth_Date= '" + Birth_Date + "', "
                + "Gender= '" + Gender + "' " // without (,)

                + "WHERE " //Don't forget WHERE condition

                + "User_ID= " + User_ID;

        boolean isUpdated = dp.Go.runNonQuery(strSelect);

        if (isUpdated) {
            Tools.msgBox("This user is updated successfully!");
        }
    }

    @Override
    public void delete() {
        boolean conf = Tools.ConfirmMessege("Are you sure?");
        if (conf) {
            String strDelet = "DELETE FROM Sign_Up WHERE User_ID= " + User_ID;
            boolean isDeleted = dp.Go.runNonQuery(strDelet);
            if (isDeleted) //{
            {
                Tools.msgBox("User_ID no. " + User_ID + "is deleted successfully!");
            }
        }
//            else  // not nessesary!
//                Tools.msgBox(" ID no." + Log_ID + " is NOT deleted !");
//        }
    }

    @Override
    public String getAutoNumber() {
//        return dp.Go.getAutoNumber("Sign_Up", "Log_ID");
        return dp.Go.getAutoNumber("Ayat.Sign_Up", "User_ID");
    }

    @Override
    public void getAllRows(JTable jtable) {
        dp.Go.fillToJTable("Sign_Up", jtable);
    }

    @Override
    public void getOneRow(JTable jtable) {
        String strSelect = "SELECT * FROM Sign_Up WHERE User_ID= "
                + User_ID;
        dp.Go.fillToJTable(strSelect, jtable);

    }

    @Override
    public void getCustomRows(String statement, JTable jtable) {
        dp.Go.fillToJTable(statement, jtable);
    }

    @Override
    public String getValueByName(String name) {
        String strSelect = "SELECT User_ID FROM Sign_Up WHERE First_Name= '"
                + First_Name + "'";
        String strVal = (String) dp.Go.getTableData(strSelect).items[0][0];
        return strVal;
    }

    @Override
    public String getNameByValue(String value) {
        String strSelect = "SELECT First_Name FROM Sign_Up WHERE User_ID= " + User_ID;
        return (String) dp.Go.getTableData(strSelect).items[0][0];
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getE_Mail() {
        return E_Mail;
    }

    public void setE_Mail(String E_Mail) {
        this.E_Mail = E_Mail;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getBirth_Date() {
        return Birth_Date;
    }

    public void setBirth_Date(String Birth_Date) {
        this.Birth_Date = Birth_Date;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getUser_Name() {
        return User_Name;
    }

    public void setUser_Name(String User_Name) {
        this.User_Name = User_Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getLog_ID() {
        return Log_ID;
    }

    public void setLog_ID(int Log_ID) {
        this.Log_ID = Log_ID;
    }
    
    

//    public static ArrayList<Sign_Up> get_user(){
//        ArrayList<Sign_Up> list = new ArrayList<>();
//        try {
//        } catch (Exception e) {
//            Tools.msgBox(e.getMessage());
//        }
//    return list;
//    }

    public int getUser_ID() {
        return User_ID;
    }

    public void setUser_ID(int User_ID) {
        this.User_ID = User_ID;
    }

    public String getUser_Type() {
        return User_Type;
    }

    public void setUser_Type(String User_Type) {
        this.User_Type = User_Type;
    }
}
