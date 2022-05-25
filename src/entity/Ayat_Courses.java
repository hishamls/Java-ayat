/*
Project Class
 */
package entity;

import ayat.Tools;
import javax.swing.JTable;

public class Ayat_Courses implements MainData{
    private int Course_ID;
    private String Course_Name;
    private String Location;
    private int Dep_No;
    private String Dep_Name;

    public int getCourse_ID() {
        return Course_ID;
    }

    public void setCourse_ID(int Course_ID) {
        this.Course_ID = Course_ID;
    }

    public String getCourse_Name() {
        return Course_Name;
    }

    public void setCourse_Name(String Course_Name) {
        this.Course_Name = Course_Name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getDep_No() {
        return Dep_No;
    }

    public void setDep_No(int Dep_No) {
        this.Dep_No = Dep_No;
    }

    @Override
    public void add() {
        String strAdd= "INSERT INTO Ayat_Course VALUES("
                + Course_ID + ","
                + "'" + Course_Name +"',"  //I wrote Course_Name between " "
                + "'" + Location + "',"
                + Dep_No + ","
//                +"'" + Dep_Name +"'" 
                + ")"
                ;
        boolean isAdded= dp.Go.runNonQuery(strAdd);
        if (isAdded) {
            Tools.msgBox("The Ayat_Course is added!");
        }
    } 
    

    @Override
    public void update() {
       String strUpdate= "UPDATE Ayat_Course SET "
               + "Course_Name='" +Course_Name +"',"
               + "Location='" + Location +"',"
               + "Dep_No=" + Dep_No +","
//               + "Dep_Name='"+ Dep_Name +"',"
               + "WHERE Course_ID="  + Course_ID;
                
               
       boolean isUbdated= dp.Go.runNonQuery(strUpdate);
        if (isUbdated) {
            Tools.msgBox("The Ayat_Course is ubdated!");
        }
    }

    @Override
    public void delete() {
        String strDelete= "DELETE FROM Ayat_Course WHERE Course_ID=" + Course_ID;// I FORGOT 'FROM'
        boolean isDeleted= dp.Go.runNonQuery(strDelete);
        if (isDeleted) {
            Tools.msgBox("The Ayat_Course is deleted!");
        }
    }

    @Override
    public String getAutoNumber() {
        return dp.Go.getAutoNumber("Ayat_Course", "Course_ID");
    }

    @Override
    public void getAllRows(JTable jtable) {
        dp.Go.fillToJTable("view_course", jtable);
    }

    @Override
    public void getOneRow(JTable jtable) {
        String strSelect= "SELECT * FROM Ayat_Course WHERE Course_ID="+ Course_ID;
        dp.Go.fillToJTable(strSelect, jtable);
    }

    @Override
    public void getCustomRows(String statement, JTable jtable) {
        dp.Go.fillToJTable(statement, jtable);
    }

    @Override
    public String getValueByName(String name) {
       String strSelect= "SELECT Course_ID FROM view_course WHERE Course_Name='" + name +"'";// I wrote + Course_Name instade of name
        String strval=(String) dp.Go.getTableData(strSelect).items[0][0];
        return strval;
    }

    @Override
    public String getNameByValue(String value) {
        String strSelect= "SELECT Course_Name FROM view_course WHERE Course_ID="+ value;
        String strName= (String) dp.Go.getTableData(strSelect).items[0][0];
        return strName;
    }

    public String getDep_Name() {
        return Dep_Name;
    }

    public void setDep_Name(String Dep_Name) {
        this.Dep_Name = Dep_Name;
    }
    
    
}
