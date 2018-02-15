/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beansIo;

/**
 *
 * @author Matthews
 */
import beans.AdminAudit;
import beans.Equipment;
import database.Dbconnection;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.swing.*;

public class Adminaudits {

    private static ObservableList<beans.AdminAudit> audits;
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    /* implement the following addequipmentaudit,editedequipmentaudit,deletedequipmentaudit,editeduseraudit,deleteduseraudit,
    receivedequipmentaudit*/
    public boolean addequipmentaudit(Equipment eq, String adminid) {
        System.out.println("I will audit your equipment addition");
        JOptionPane.showMessageDialog(null, "helloo" + adminid + " Dealing with auditing your equipment Perpendicularly" + eq.getName());

        try {
            Connection conn = Dbconnection.ConnectDB();

            String activity = "added " + eq.getName() + "Quantity" + eq.getQuantity() + " category" + eq.getCategory() + ""
                    + "and details as follows " + eq.getDescription();
            String insert = "INSERT INTO AUDITTRAIL (Userid,date_time,Activity)VALUES('" + adminid + "',SYSDATE(), '" + activity + "')";
            pst = conn.prepareStatement(insert);

            if (pst.execute() == false) {
                conn.close();
                return true;
            } else {
                conn.close();
                return false;
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    public void editequipmentaudit() {

    }

    public void deletedequipmentaudit() {

    }

    public void editeduseraudit() {

    }

    public void deleteduseraudit() {
    }

    public void receivedequipmentaudit() {

    }

    public ObservableList<beans.AdminAudit> getAudits() {
        audits = FXCollections.observableArrayList();
        con = Dbconnection.ConnectDB();
        String sql = "select *from audittrail";

        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                //*get the id then query the name from the users table*/
              String userid= rs.getString("Userid");
              String acitivity=rs.getString("activity");
              String date=rs.getString(3);
              String sql2 = "select *from users where staff_id='"+userid+"'";
                 pst = con.prepareStatement(sql2);
            ResultSet rs2 = pst.executeQuery();
            if(rs2.next()){
        AdminAudit auditings= new  AdminAudit(rs2.getString("staff_id"), rs2.getString(2), rs2.getString(5), rs2.getString(6), rs2.getString(9), rs2.getString(8),acitivity,date);
       audits.add(auditings);  
            }      

            } 
            for ( AdminAudit st : audits) {
                System.out.println("My for loop for the audits here are" + st.getName()+st.getActivity());
            }
            return audits;
        } catch (SQLException ex) {
            Logger.getLogger(equipmentsmanager.class.getName()).log(Level.SEVERE, null, ex);
            return audits;
        }
    }

}
