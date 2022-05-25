/*
User_VO
 */
package dp.vo;

import dp.user_type.Users_Type;

/**
 *
 * @author hishamls
 */
public class User_VO {
    private int ID;
    private String User_Name;
    private String Password;
    private Users_Type user_type;

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

    public Users_Type getUser_type() {
        return user_type;
    }

    public void setUser_type(Users_Type user_type) {
        this.user_type = user_type;
    }
    
    
    
}
