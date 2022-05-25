/*
Employee_phones Class
 */
package entity;

import ayat.Tools;
import javax.swing.JTable;

public class Ayat_phones implements MainData{
    private int EmpNo;
    private String PhoneNo;

    public int getEmpNo() {
        return EmpNo;
    }

    public void setEmpNo(int EmpNo) {
        this.EmpNo = EmpNo;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

    @Override
    public void add() {
        String strAdd= "INSERT INTO Employee_phones VALUES("+ EmpNo+","
                +"'" + PhoneNo +"')";
        boolean isAdd= dp.Go.runNonQuery(strAdd);
        if(isAdd)
            Tools.msgBox("Phone is added!");
    }   

    @Override
    public void update() {
        Tools.msgBox("Not avalible ubdate!");
    }

    @Override
    public void delete() {
        String strDelete= "SELECT * FROM employee_phones WHERE EmpNo= "+ EmpNo+
                "AND PhoneNo= '" + PhoneNo+ "'";    // We put AND becuse we have 2 primary keys
        
//        Tools.msgConfirm("Are you sure deleting?");// messege confirm in btnDelet
        boolean isDelete= dp.Go.runNonQuery(strDelete);
        if(isDelete){
//            Tools.msgBox("Phone is deleted!");
    }
    }
    
    public void deleteByEmp(){  //not in mainData interface
        String strDeleteAll= "SELECT FROM employee_phones WHERE EmpNo= "+ EmpNo;
        boolean isDeleted= dp.Go.runNonQuery(strDeleteAll);
        if (isDeleted) {
//            Tools.msgBox("Phones are deleted");
        }
    
    }

    @Override
    public String getAutoNumber() {
       Tools.msgBox("AutoNo. not using here!");
      return ""; 
    }

    @Override
    public void getAllRows(JTable jtable) {
        String strSelect= "SELECT phone FROM employee_phones WHERE EmpNo= " +
                EmpNo;
        dp.Go.fillToJTable(strSelect, jtable);
                
    }

    @Override
    public void getOneRow(JTable jtable) {
        Tools.msgBox("getOneRow not working here!");
    }

    @Override
    public void getCustomRows(String statement, JTable jtable) {
        Tools.msgBox("getCustomRows not working here!");
    }

    @Override
    public String getValueByName(String name) {
        Tools.msgBox("This method is not working here!");
        return "";
    }

    @Override
    public String getNameByValue(String value) {
        Tools.msgBox("This method is not working here!");
        return "";
    }
    
    
    
}
