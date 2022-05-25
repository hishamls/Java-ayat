/*
 User Type enum
 */
package dp.user_type;


/**
 *
 * @author hishamls
 */
public enum Users_Type { //wrote enum instade of class
    ADMIN(1, "admin"), TEACHER(2, "teacher"), STUDENT(3, "student"); // must CAPITALS
    
    private int ID_Type;
    private String Type;

    private Users_Type(int ID_Type, String Type) {
        this.ID_Type = ID_Type;
        this.Type = Type;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getID_Type() {
        return ID_Type;
    }

    public void setID_Type(int ID_Type) {
        this.ID_Type = ID_Type;
    }

    
    public Users_Type get_user_type_by_ID_Type(int ID_Type){
        for (Users_Type UType : Users_Type.values()) {
            if (UType.getID_Type() == ID_Type) {
              return UType;
            }
        }
        
        return null;
    
    }
    
}
