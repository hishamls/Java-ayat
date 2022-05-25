package ayat;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 my functions
 */
public class myFunctions {
                                                  //Blob instade of byte[]
    public ImageIcon resizePic(String imgPath, byte[] BloBPic, int wdth, int heit) {
        ImageIcon icn;
        if (imgPath != null) {
            icn = new ImageIcon(imgPath);
        } else {
            icn = new ImageIcon(BloBPic);
        }
        Image img = icn.getImage().getScaledInstance(wdth, heit, Image.SCALE_SMOOTH);
        ImageIcon newIcn = new ImageIcon(img);
        return newIcn;
    }

    public String browsImage(JLabel lbl) {
        String pth = "";

        //create a file chooser
        JFileChooser fshoz = new JFileChooser();
        fshoz.setCurrentDirectory(new File(System.getProperty("user.home")));
        // detrimen only image file extintions
        FileNameExtensionFilter fltr = new FileNameExtensionFilter("*.images", "jpg", "jpeg", "png", "gif");
        fshoz.addChoosableFileFilter(fltr);
        // if the user select file & get the path
        int fileState = fshoz.showSaveDialog(null);
        if (fileState == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fshoz.getSelectedFile();
            pth = selectedFile.getAbsolutePath();
            //DISPLAY THE IMAGE IN THE JLABLE
//         lbl.setIcon(new ImageIcon(path));
            lbl.setIcon(resizePic(pth, null, lbl.getWidth(), lbl.getHeight()));
            System.out.println(pth);
            //IF THE USER SELECT CANCEL   
            if (fileState == JFileChooser.CANCEL_OPTION) {
                lbl.setText("No image selected!");
            }
        }
        return pth;
    }
}
