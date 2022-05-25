/*
 MainData interface
 */
package entity;


import javax.swing.JTable;

public interface MainData {
    public void add();
    public void update();
    public void delete();
    public String getAutoNumber();
    public void getAllRows(JTable jtable);
    public void getOneRow(JTable jtable);
    public void getCustomRows(String statement,JTable jtable);
    public String getValueByName(String name);// must be string method
    public String getNameByValue(String value); // must be string method
             
    
}
