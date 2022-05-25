/*
 Student
 */
package entity;

import ayat.Tools;
import forms.english.frm_ayat_en_Student;
import javax.swing.JTable;

/**
 *
 * @author hishamls
 */
public class Ayat_Student implements MainData{

    frm_ayat_en_Student s;
    @Override
    public void add()  {
        
        
        String strAdd = "INSERT INTO view_student VALUES ("
                + ID + ","
                + "'" + First_Name + "',"
//                + "'" + Last_Name + "',"
                + "'" + Phone + "',"
//                + "'" + E_Mail + "',"
//                + "'" + Address + "',"
//                + "'" + Birth_Date + "',"
                + "'" + Gender + "'"    // deleted ","
//                + "'" + User_Name + "',"
//                + "'" + Password + "'"
                + ")";
        boolean isAdded = dp.Go.runNonQuery(strAdd);
        if (isAdded) {
            Tools.msgBox("The student is added successfully!");

        }
    }

      @Override
    public void update() {
        String strSelect = "UPDATE view_student SET "
                + "First_Name= '" + First_Name + "', "
//                + "Last_Name= '" + Last_Name + "', "
                + "Phone= '" + Phone + "', "
//                + "E_Mail= '" + E_Mail + "', "
//                + "Birth_Date= '" + Birth_Date + "', "
                + "Gender= '" + Gender + "' " // without (,)
//                + "User_Name= '" + User_Name + "', "
//                + "Password= '" + Password + "' "

                + "WHERE " //Don't forget WHERE condition

                + "ID= " + ID;  // MASTER KEY

        boolean isUpdated = dp.Go.runNonQuery(strSelect);

        if (isUpdated) {
            Tools.msgBox("This Student is updated successfully!");
        }
    }

    @Override
    public void delete()  {
        boolean conf = Tools.ConfirmMessege("Are you sure?");
        if (conf) {
            String strDelet = "DELETE FROM Student WHERE ID= " + ID;
            boolean isDeleted = dp.Go.runNonQuery(strDelet);
            if (isDeleted) //{
            {
                Tools.msgBox("Student ID no. " + ID + "is deleted successfully!");
            }
        }
//            else  // not nessesary!
//                Tools.msgBox(" ID no." + Log_ID + " is NOT deleted !");
//        }
    }


    @Override
    public String getAutoNumber() {
        return dp.Go.getAutoNumber("view_student", "ID");
    }

    @Override
    public void getAllRows(JTable jtable) {
        dp.Go.fillToJTable("Student", jtable);
    }

    @Override
    public void getOneRow(JTable jtable) {
        String strSelect = "SELECT * FROM Student WHERE ID= "
                + ID;
        dp.Go.fillToJTable(strSelect, jtable);

    }

    @Override
    public void getCustomRows(String statement, JTable jtable) {
        dp.Go.fillToJTable(statement, jtable);
    }

    @Override
    public String getValueByName(String name) {
        String strSelect = "SELECT ID FROM Student WHERE First_Name= '"
                + First_Name + "'";
        String strVal = (String) dp.Go.getTableData(strSelect).items[0][0];
        return strVal;
    }

    @Override
    public String getNameByValue(String value) {
        String strSelect = "SELECT First_Name FROM Student WHERE ID= " + ID;
        return (String) dp.Go.getTableData(strSelect).items[0][0];
    }
    
    public static int ID;
    private String User_Name;
    private String Password;
    private String First_Name;
    private String Last_Name;
    private String Phone;
    private String E_Mail;
    private String Birth_Date;
    private String Gender;

    public Ayat_Student() {
    }

    public Ayat_Student(int ID, String User_Name, String Password, String First_Name, String Last_Name, String Phone, String E_Mail, String Birth_Date, String Gender) {
        this.ID = ID;
        this.User_Name = User_Name;
        this.Password = Password;
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.Phone = Phone;
        this.E_Mail = E_Mail;
        this.Birth_Date = Birth_Date;
        this.Gender = Gender;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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
    
    
    
}
