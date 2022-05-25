/*
 class Ayat_UseresVO
 */
package entity;

import dp.user_type.Users_Type;

/**
 *
 * @author hishamls
 */
public class Ayat_UseresVO {
    private int ID;
    private String User_Name;
    private String Password;
    private Users_Type user_type; // It is enum

    public Ayat_UseresVO() {
    }

    public Ayat_UseresVO(int ID, String User_Name, String Password, Users_Type user_type) {
        this.ID = ID;
        this.User_Name = User_Name;
        this.Password = Password;
        this.user_type = user_type;
    }

    public Users_Type getUser_type() {
        return user_type;
    }

    public void setUser_type(Users_Type user_type) {
        this.user_type = user_type;
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
    
    
    
}
