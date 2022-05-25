/*
EDITING A 2D ARRAY (TABLE) ADD, REMOVE, UPDATE ROWS & ITEMS
 */
package dp;

import java.util.Arrays;


public class Table{
    int columns;
   public Object[][] items;
    
    //Methods

    public Table(int columns) {
        this.columns = columns;
        items = new Object[0][columns];
    }
    
    public void addRow(Object[] row){
        Object[][] tempItems = items;// saving old items in a temporary items
        items= new Object[items.length + 1][columns]; // for adding a new row
        for (int i = 0; i < tempItems.length; i++) {// filling new items with old items
            items[i] = tempItems[i];//obsit the first line code
            
        }
        items[items.length -1]= row;// add a new row for items
    
    }
    
    public void editRow(int rowIndx, int colmIndx, Object newData){
        items[rowIndx][colmIndx]= newData;
    
    }
    
    //Delet row
    //https://www.youtube.com/watch?v=wmX-L8OJUDk&list=PLHIfW1KZRIfn9BnepQuzWiM_ZPIwUDawL&index=136&ab_channel=HassounaAcademy
    public void deletRow(int rowIndx){
        Object[][] tempItems = items;
        items = new Object[items.length -1][columns];
        int y =0;
        for (int i = 0; i < tempItems.length; i++) {
             if(i != rowIndx){
             items[y]= tempItems[i];
             y++;
             }
            
        }
    }
    
    public Object getValue(int rowIndx, int colmIndx){
        return items[rowIndx][colmIndx];
    
    }
    
    public void  getRow(int rowIndx){
            System.out.println(Arrays.toString(items[rowIndx]));
    }
    
    public void printItems(){
        for (Object[] item : items) {
            for (Object object : item) {
                System.out.print(object + "; ");
                
            }
            System.out.println();
            
        }
    
    }
    
    //Main method & Using class
    public static void main(String[] args) {
        Table t = new Table(3);
        Object[] r1 = {"Hisham","Salem","Nabil"};
        Object[] r2 = {"Sameera","Sherehan","Salwa"};
        
        
        t.addRow(r1);
        t.addRow(r2);
        t.addRow(new Object[]{"Sameh", "Nour","Ali"});//onther way instade of r3
        
        t.printItems();
        System.out.println("*************");
        
        t.editRow(1, 1, "Hoor");// instade Sherehan
        t.printItems();
        System.out.println("*************");
        
        t.deletRow(0);
        t.printItems();
        System.out.println("*************");
        
        System.out.println(t.getValue(0, 1));
        
        t.getRow(0);
       
    }
    
}