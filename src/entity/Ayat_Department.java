/*
Department
 */
package entity;




import ayat.Tools;
//import myCompany.Table;
import javax.swing.JTable;


public class Ayat_Department implements MainData{
    private int depNo;
    private String depName;
    private String location;

    public int getDepNo() {
        return depNo;
    }

    public void setDepNo(int depNo) {
        this.depNo = depNo;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void add() {
      String strInsert = "INSERT INTO Ayat_Department VALUES "
              + "(" + depNo +","+
                 "'"+ depName +"',"+
                "'"+ location+ "')";
      boolean isAdd= dp.Go.runNonQuery(strInsert);
      if(isAdd){
          Tools.msgBox("new department data is added successfully!");
      }
    }

    @Override
    public void update() {
        String strUbdate= "UPDATE Ayat_Department SET "
                + "depName='" + depName + "',"
                + "location='" + location + "'"// "'" is nesseccery to avoid aknown field error
                + " WHERE depNo= " + depNo;
        boolean isUbdated= dp.Go.runNonQuery(strUbdate);
        if (isUbdated) {
            Tools.msgBox("Department is updated successfully!");
        }
              
    }

    @Override
    public void delete() {
        String strDelete= "DELETE FROM Ayat_Department"
                + " WHERE depNo= " + depNo; //notice the indetce space
        boolean isDeleted= dp.Go.runNonQuery(strDelete);
        if (isDeleted){
            Tools.msgBox("Deleted  successfully!");
        }
    }

    @Override
    public String getAutoNumber() {
       return dp.Go.getAutoNumber("Ayat_Department", "depNo");
    }

    @Override
    public void getAllRows(JTable jtable) {
        dp.Go.fillToJTable("Ayat_Department", jtable);
    }

    @Override
    public void getOneRow(JTable jtable) {
        String strSelect = "SELECT * FROM Ayat_Department "+ "WHERE depNo= " + depNo;
        dp.Go.fillToJTable(strSelect, jtable);
    }

    @Override
    public void getCustomRows(String statement, JTable jtable) {
        dp.Go.fillToJTable(statement, jtable);
    }

    @Override 
    public String getValueByName(String name) { // must be string method
        String strSelect = "SELECT depNo FROM Ayat_Department " + "WHERE depName='"+ name+ "'";
        String strVal = (String)dp.Go.getTableData(strSelect).items[0][0];
        return strVal;
    }

    @Override
    public String getNameByValue(String value) {// must be string method
        String strSelcet = "SELECT depName FROM Ayat_Department "+ "WHERE depNo='"+ value+ "'";
        String strVal = (String)dp.Go.getTableData(strSelcet).items[0][0];
        return strVal;
       
    }




    
}