/*
First file in Ayat project
 */
package ayat;

import forms.english.frm_ayat_SignIn;


/**
 *
 * @author Hisham sakr 01090209759
 */
public class Ayat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Tools.openForm(new frm_ayat_SignIn());
//        MyDraw drw= new MyDraw(new frm_LogIn());
//        drw.drawImage(600, 600, "quran.jpg");
       
    }
    
}
