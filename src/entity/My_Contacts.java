/*
My contacts entity class
 */
package entity;

import ayat.Tools;
import ayat.myFunctions;
import javax.swing.JTable;


public class My_Contacts implements MainData {
     private Integer ID;
     private String First_Name;
     private String Last_Name;
     private String Groups;
     private String Phone;
     private String E_Mail;
     private String Address;
     private byte[] Photo;
     private int User_ID;
     

    public My_Contacts() {
    }

    public My_Contacts(Integer ID, String First_Name, String Last_Name, String Groups, String Phone, String E_Mail, String Address, byte[] Photo, int User_ID) {
        this.ID = ID;
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.Groups = Groups;
        this.Phone = Phone;
        this.E_Mail = E_Mail;
        this.Address = Address;
        this.Photo = Photo;
        this.User_ID = User_ID;
    }
     
     

    @Override
    public void add() {
         
String sql= "INSERT INTO my_contact VALUES ("
        + ID + ","
        + "'" + First_Name + "',"
        + "'" + Last_Name + "',"
        + "'" + Groups + "',"
        + "'" + Phone + "',"
        + "'" + E_Mail + "',"
        + "'" + Address + "',"
        + "'" + Photo + "',"    // I CAN'T SOLVE THIS ISSUE
        + "'" + User_ID + "'" //even int can take ''
        + ")";
boolean isAdded = dp.Go.runNonQuery(sql);
if (isAdded) {
    Tools.msgBox("Added successfully!");
}
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete() {
         boolean conf = Tools.ConfirmMessege("Are you sure?");
        if (conf) {
            String sql = "DELETE FROM my_contact WHERE ID= " + ID;
            boolean isDeleted = dp.Go.runNonQuery(sql);
            if (isDeleted) //{
            {
                Tools.msgBox("ID no. " + ID + " is deleted successfully!");
            }
        }
    }

    @Override
    public String getAutoNumber() {
        return dp.Go.getAutoNumber("my_contact", "ID");
    }

    @Override
    public void getAllRows(JTable jtable) {
        dp.Go.fillToJTable("my_contact", jtable);
    }

    @Override
    public void getOneRow(JTable jtable) {
        String strSelect = "SELECT * FROM my_contact WHERE ID= "
                + ID;
        dp.Go.fillToJTable(strSelect, jtable);
    }

    @Override
    public void getCustomRows(String statement, JTable jtable) {
        dp.Go.fillToJTable(statement, jtable);
    }

    @Override
    public String getValueByName(String name) {
        String strSelect = "SELECT ID FROM my_contact WHERE First_Name= '"
                + First_Name + "'";
        String strVal = (String) dp.Go.getTableData(strSelect).items[0][0];
        return strVal;    }

    @Override
    public String getNameByValue(String value) {
         String strSelect = "SELECT First_Name FROM my_contact WHERE ID= " + ID;
        return (String) dp.Go.getTableData(strSelect).items[0][0];
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
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

    public String getGroups() {
        return Groups;
    }

    public void setGroups(String Groups) {
        this.Groups = Groups;
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
    
    myFunctions func= new myFunctions();

    public byte[] getPhoto() {
//         try {
//             String foto_path = func.browsImage(lbl_foto2);
//             Path pth= Paths.get(foto_path);
//             Photo= Files.readAllBytes(pth);
//         } catch (IOException ex) {
//             Logger.getLogger(My_Contacts.class.getName()).log(Level.SEVERE, null, ex);
//         }
         return Photo;
    }

    public void setPhoto(byte[] Photo) {
        
        this.Photo = Photo;
    }

    public int getUser_ID() {
        return User_ID;
    }

    public void setUser_ID(int User_ID) {
        this.User_ID = User_ID;
    }
    
    


}