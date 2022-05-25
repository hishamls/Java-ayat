/*
 
 */
package ayat;

import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;


public class My_Model extends AbstractTableModel{
 private String [] column;
    private Object [][] cell; 

    public My_Model() {
    }

    public My_Model( Object[][] dataCell, String[] columnsName) {
        this.column = columnsName;
        this.cell = dataCell;
    }

    @Override
    public int getRowCount() {
        return this.cell.length;
    }

    @Override
    public int getColumnCount() {
        return this .column.length;
    }
// GET DATA CELL
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return this.cell[rowIndex][columnIndex];
    }
    
    public Class getColumnClass(int col){
        // THE INDEX OF COLUMN HERE IS 8
         if (col == 7) {
              return Icon.class;      
                } else {
             return getValueAt(0, col).getClass();
                }

}
    public String getColumnName(int col){
        return this.column[col];
    
    }
    
}
