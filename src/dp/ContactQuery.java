package dp;

import ayat.Tools;
import entity.My_Contacts;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContactQuery {

    public static void insertContact(My_Contacts contact) {

        Connection con = dp.Go.myConnection();
        PreparedStatement ps;
        String sql = "INSERT INTO `my_contact`( `First_Name`, `Last_Name`,"
        + " `Groups`, `Phone`, `E_Mail`, `Address`, `Photo`, `User_ID`) VALUES (?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
//            ps.executeQuery(); //INSERT IS NOT A QUERY ITS UPDATE
            ps.setString(1, contact.getFirst_Name());
            ps.setString(2, contact.getLast_Name());
            ps.setString(3, contact.getGroups());
            ps.setString(4, contact.getPhone());
            ps.setString(5, contact.getE_Mail());
            ps.setString(6, contact.getAddress());
            ps.setBytes(7, contact.getPhoto());
            ps.setInt(8, contact.getUser_ID());

            if (ps.executeUpdate() != 0) {
                Tools.msgBox("Added done!");
            } else {
                Tools.msgBox("Added NOT done!");
            }

        } catch (SQLException ex) {
            Logger.getLogger(ContactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updateContact(My_Contacts cont, boolean withImage) {

        Connection con = dp.Go.myConnection();
        PreparedStatement ps;
        String sql = "";
        // UPDATING WITH PHOTO PROFILE
        if (withImage == true) {
            sql = "UPDATE `my_contact` SET `First_Name`=?,`Last_Name`=?,"
                + "`Groups`=?,`Phone`=?,`E_Mail`=?,`Address`=?,`Photo`=?"
                + " WHERE `ID`=?";
            try {
                ps = con.prepareStatement(sql);
//                ps.setInt(0, cont.getID()); // THE ACCOUNT ID
                ps.setString(1, cont.getFirst_Name());
                ps.setString(2, cont.getLast_Name());
                ps.setString(3, cont.getGroups());
                ps.setString(4, cont.getPhone());
                ps.setString(5, cont.getE_Mail());
                ps.setString(6, cont.getAddress());
                ps.setBytes(7, cont.getPhoto());
                ps.setInt(8, cont.getID());
                if (ps.executeUpdate() != 0) {
                    Tools.msgBox("Ubdate is done!");
                } else {
                    Tools.msgBox("Ubdated is NOT done!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(ContactQuery.class.getName()).log(Level.SEVERE, null, ex);
            }       // WITHOUT PHOTO PORFILE
        } else {
            sql = "UPDATE `my_contact` SET `First_Name`=?,`Last_Name`=?,"
                    + "`Groups`=?,`Phone`=?,`E_Mail`=?,`Address`=? "
                    + "WHERE `ID`=?";
            try {
                ps = con.prepareStatement(sql);
//                ps.setInt(0, cont.getID());// THE ACCOUNT ID
                ps.setString(1, cont.getFirst_Name());
                ps.setString(2, cont.getLast_Name());
                ps.setString(3, cont.getGroups());
                ps.setString(4, cont.getPhone());
                ps.setString(5, cont.getE_Mail());
                ps.setString(6, cont.getAddress());
                ps.setInt(7, cont.getID());
                if (ps.executeUpdate() != 0) {
                    Tools.msgBox("Ubdate is done!");
                } else {
                    Tools.msgBox("Ubdated is NOT done!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(ContactQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public ArrayList<My_Contacts> contactList(int user_id) {
        ArrayList<My_Contacts> contList = new ArrayList<>();
        Connection con = Go.myConnection();
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT `ID`, `First_Name`, `Last_Name`,"
                    + " `Groups`, `Phone`, `E_Mail`, `Address`, `Photo`"
                    + " FROM `my_contact` "
                    + "WHERE `User_ID`=" + dp.Go.idD);

            // 1) GET VALUES FROM DATA BASE
            while (rs.next()) {
                My_Contacts contact = new My_Contacts(
                        rs.getInt("ID"),
                        rs.getString("First_Name"),
                        rs.getString("Last_Name"),
                        rs.getString("Groups"),
                        rs.getString("Phone"),
                        rs.getString("E_Mail"),
                        rs.getString("Address"),
                        rs.getBytes("Photo"),
                        dp.Go.idD
                );
                // 2) PREPARING VALUES 
                contList.add(contact);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(My_Contacts.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contList;

    }

}
