/*
 STATIC TOOLS
 */
package ayat;


import forms.english.frm_ayat_en_my_contacts;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Tools {
    //METHODS
    
     public static void Welcome(String name){
    System.out.println("Welcom "+ name);
       
       } 
    public static void clearTxt(Container form){// الحاوية
        for(Component c: form.getComponents()){// المحتويات
            if(c instanceof JTextField ){
                JTextField txt = (JTextField)c;// casting c from component to JtextField
                txt.setText("");
            }
//            if (c instanceof JLabel) {
////                ((JLabel) c).setIcon(null);// DELETE BACKGROUND LABLE
//                  frm_ayat_en_my_contacts.lbl_foto2.setIcon(null);
//            }
            if (c instanceof JTextArea) {
                ((JTextArea) c).setText("");
            }
            else if (c instanceof Container)
                clearTxt((Container) c);// we call same method clearTxt
                
        }
    }
public static boolean msgConfirm(String messege) {
        int msgConf =JOptionPane.showConfirmDialog(null, messege);
        if(msgConf == JOptionPane.YES_OPTION){
            return true;
        }else {
            return false;
        }
    }
    
    public static void openFrame(JFrame form){
        try {
            form.setVisible(true);
            form.setLocationRelativeTo(null);
            Image img = ImageIO.read(Tools.class.getResource("flower.png"));
            form.setIconImage(img);
            form.setDefaultCloseOperation(2);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public static void creatEmptyFile(String fileName) {
        try {
            File f = new File(fileName);
            f.createNewFile();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        Tools.msgBox(fileName +" file is created successfully!");
    }
    
    public static void creatEmptyFiles(String[] filesNames){
        for(String name : filesNames){
            Tools.creatEmptyFile(name + ".txt");
        }
    }
    
    public static void creatDataFile(String fileName, Object [] data) {
        PrintWriter p = null;
        try {
            p = new PrintWriter(fileName);
            for(Object obj : data){
             p.println(obj);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            p.close();
        }
    }
    
    
public static void createNewFolder(String folderName, String path){
    File f = new File(path + "/" + folderName);
            f.mkdir();
            Tools.msgBox(folderName + " foder is created successfully!");//Static method in onther static method
          
}

public static void createNewFolder(String folderName){
    File f = new File(folderName);
            f.mkdir();
            Tools.msgBox(folderName + " foder is created successfully!");//Static method in onther static method
          
}

public static void openForm(JFrame form) {
        try {
            form.setLocationRelativeTo(null);
            Image img = ImageIO.read(Tools.class.getResource("ayat.jpeg"));
            form.setIconImage(img);
            form.setVisible(true);
//          form.pack();
            form.setDefaultCloseOperation(2);// to close any form indvidully
        } catch (IOException ex) {
               JOptionPane.showMessageDialog(null, ex);
                   }

}
    
    public static void msgBox(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public static Object inputBox(String title) {
      Object obj = JOptionPane.showInputDialog(title);
      return obj;
    }
    
    public static String getNumberFromString(String text) {
        String val = "";
        for(char c : text.toCharArray()){
            if(c == '0' || c == '1' ||c == '2' ||c == '3' ||c == '4' ||c == '5' ||c == '6' ||c == '7' ||c == '8' ||c == '9'){
                //we must write numbers between ''; becouse it not numbers it's chars
               val += c; // not val =+ c;
        }
            }
        return val;
    }
    
    public static String removeNumbersFromString(String text) {
        String val = "";
        for(char c : text.toCharArray()){
            if(!(c == '0' || c == '1' ||c == '2' ||c == '3' ||c == '4' ||c == '5' ||c == '6' ||c == '7' ||c == '8' ||c == '9')){
               val += c; // not val =+ c;
        }
            }
        return val;
    }
    
    public static void printScreen(String imageName){
        try {
            Robot r =new Robot();
            Rectangle rec = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage img = r.createScreenCapture(rec);
            ImageIO.write(img, "JPG", new File (imageName + ".JPG"));
        } catch (Exception ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void printScreen(String imageName, JFrame form){
        try {
            form.setState(1);
            Robot r =new Robot();
            Rectangle rec = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage img = r.createScreenCapture(rec);
            ImageIO.write(img, "JPG", new File (imageName + ".JPG"));
            form.setState(0);//to print without form
        } catch (Exception ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

public static void AsalmuAlikom(){
     Object obj =Tools.inputBox("ما أسمك؟");
         Tools.msgBox("السلام عليكم يا  "+ obj );
     }


public static void setReport(JTable table){
//    table.getTableHeader().setReorderingAllowed(false);
    table.getTableHeader().setBackground(Color.lightGray);
    table.getTableHeader().setForeground(Color.MAGENTA); //Onther way to set color
}

public static void printReport(JTable table, String title){
    try {
        MessageFormat header= new MessageFormat(title);
        MessageFormat footer= new MessageFormat("Page - {0}");
        table.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        
    } catch (Exception e) {
        Tools.msgBox(e.getMessage());
    }
}
    
      //////////////////MAIN METHOD////////////////////////
    
//    public static void main(String[] args) {
////        JFrame Frame1 = new JFrame();
////       Tools.openFrame(Frame1);
//        Tools.openFrame(new Frame1());
//        Tools.openFrame(new Frame2());
//    }

  public static boolean ConfirmMessege(String messege) {
        int msgConf =JOptionPane.showConfirmDialog(null, messege);
         return msgConf == JOptionPane.YES_OPTION; //redunet if case
    }
    
   
}
