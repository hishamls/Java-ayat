/*
 Teacher class
 */
package entity;

import ayat.Tools;
import javax.swing.JTable;

/**
 *
 * @author hishamls
 */
public class Ayat_Employee implements MainData{

    public Ayat_Employee() {
        
    }

    @Override
    public void add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
      
        String strSelect = "UPDATE Ayat_Teacher SET "
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

                + "ID= " + ID;

        boolean isUpdated = dp.Go.runNonQuery(strSelect);

        if (isUpdated) {
            Tools.msgBox("This user is updated successfully!");
        }
    
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
        dp.Go.fillToJTable("Ayat_Employee", jtable);
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
    
     private int ID;
    private String User_Name;
    private String Password;
    private String First_Name;
    private String Last_Name;
    private String Phone;
    private String E_Mail;
    private String Address;
    private String Birth_Date;
    private String Hiring_Date;
    private String dep_Name; // Note the type of variable
    private double Salary;
    private String Gender;

    

   

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

    public String getHiring_Date() {
        return Hiring_Date;
    }

    public void setHiring_Date(String Hiring_Date) {
        this.Hiring_Date = Hiring_Date;
    }

  


    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getDepName() {
        return dep_Name;
    }

    public void setDepName(String dep_Name) {
        this.dep_Name = dep_Name;
    }

    
    
}
