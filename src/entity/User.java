/*
 User entity
 */
package entity;

import ayat.Tools;
import com.mysql.jdbc.PreparedStatement;
import forms.english.frm_ayat_en_my_contacts;
import java.io.InputStream;
import java.sql.SQLException;
import javax.swing.JTable;

public class User implements MainData{
    
    private String First_Name;
    private String Last_Name;
    private String User_Name;
    private String Password;
    private String Photo;
    
    @Override
    public void add() {
        String sql= "INSERT INTO User VALUES ("
                 + "'" + First_Name + "',"
                + "'" + Last_Name + "',"
                 + "'" + User_Name + "',"
                + "'" + Password + "',"
                + "'" + Photo + "'"
                +")";
        boolean isAdded = dp.Go.runNonQuery(sql);
        if (isAdded) {
            Tools.msgBox("Add successfully!");
        }
    }
    
    //ANTHOR WAY TO ADD USER
    
    public void creat() throws SQLException{
        dp.Go.setConnection();
        PreparedStatement ps = null;
       String sql= "INSERT INTO `User`(`First_Name`, `Last_Name`, `User_Name`, `Password`, `Photo`)"
               + "  VALUES (?,?,?,?,?)";
       
       
       ps.setString(1, frm_ayat_en_my_contacts.txt_FirstName.getText());
       ps.setString(2, frm_ayat_en_my_contacts.Txt_LastName.getText());
       ps.setString(1, frm_ayat_en_my_contacts.txt_FirstName.getText());
       ps.setString(1, frm_ayat_en_my_contacts.txt_FirstName.getText());
       ps.setString(1, frm_ayat_en_my_contacts.txt_FirstName.getText());
       ps.setString(1, frm_ayat_en_my_contacts.txt_FirstName.getText());
       ps.setString(1, frm_ayat_en_my_contacts.txt_FirstName.getText());
       ps.setString(1, frm_ayat_en_my_contacts.txt_FirstName.getText());
       ps.setString(1, frm_ayat_en_my_contacts.txt_FirstName.getText());
       ps.setString(1, frm_ayat_en_my_contacts.txt_FirstName.getText());
        boolean isAdded = dp.Go.runNonQuery(sql);
        if (isAdded) {
            Tools.msgBox("Add successfully!");
        } 
    
    }

    @Override
    public void update() {
//        String sql= "UPDATE view_user SET "
//                 + "First_Name= '" + First_Name + "', "
//                + "Last_Name= '" + Last_Name + "', "
//                 + "User_Name= '" + User_Name + "', "
//                + "Password= '" + Password + "', "
//                + "Photo= '" + Photo + "' "
//
//                + "WHERE " //Don't forget WHERE condition
//
//                + "ID= " + ID;  // MASTER KEY
//
//        boolean isUpdated = dp.Go.runNonQuery(sql);
//
//        if (isUpdated) {
//            Tools.msgBox("This User is updated successfully!");
//        }
                
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAutoNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getAllRows(JTable jtable) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getOneRow(JTable jtable) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getCustomRows(String statement, JTable jtable) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getValueByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNameByValue(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }

    public void setPhoto(InputStream img) {
       this.Photo = String.valueOf(img);

    }
    
}
