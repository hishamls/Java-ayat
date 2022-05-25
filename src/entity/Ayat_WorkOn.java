/*
Work On Class
 */
package entity;

import ayat.Tools;
import javax.swing.JTable;

public class Ayat_WorkOn implements MainData{
    private int EmpNo;
    private int ProjectNo;

    public int getEmpNo() {
        return EmpNo;
    }

    public void setEmpNo(int EmpNo) {
        this.EmpNo = EmpNo;
    }

    public int getProjectNo() {
        return ProjectNo;
    }

    public void setProjectNo(int ProjectNo) {
        this.ProjectNo = ProjectNo;
    }

    @Override
    public void add() {
        String strAdd= "INSERT INTO workOn VALUES("
                + EmpNo
                + ","
                + ProjectNo
                + ")";
        boolean isAdd= dp.Go.runNonQuery(strAdd);
        
        
        if (isAdd) {
            Tools.msgBox("this row is added!");
            
        }
    }

    @Override
    public void update() {
        Tools.msgBox("Update is not working here!");
    }

    @Override
    public void delete() {
        String strDelete= "DELETE FROM workOn WHERE "
                + "EmpNo=" + EmpNo
                + " AND "               // I alaways forgot AND
                + "ProjectNo=" + ProjectNo;// twice variable only in string.
        boolean isDeleted= dp.Go.runNonQuery(strDelete);
        if (isDeleted) {
            Tools.msgBox("this row is deleted");
        }
    }

    @Override
    public String getAutoNumber() {
        Tools.msgBox("getAutoNumber is not working here!");
        return "";
    }

    @Override
    public void getAllRows(JTable jtable) {
        dp.Go.fillToJTable("workOn_view", jtable);
    }

    @Override
    public void getOneRow(JTable jtable) {
        dp.Go.getTableData("SELECT * FROM workOn_view WHERE Emp_No=" + EmpNo +
                " AND " + "Project_No=" + ProjectNo);
    }

    @Override
    public void getCustomRows(String statement, JTable jtable) {
        dp.Go.fillToJTable(statement, jtable);
    }

    @Override
    public String getValueByName(String name) {
         Tools.msgBox("getValueByName is not working here!");
        return "";
    }

    @Override
    public String getNameByValue(String value) {
        Tools.msgBox("getNameByValue is not working here!");
        return "";
    }
    
    
}
