/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beansIo;

import beans.User;
import database.Dbconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Matthews
 */
public class usersmanager {
   Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    private static ObservableList<beans.User> systemusers;
    
    public ObservableList<User> getUsers() {
        systemusers = FXCollections.observableArrayList();
        con = Dbconnection.ConnectDB();
        String sql = "select *from users";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
               User myuser = new User(rs.getString(1), rs.getString(2), rs.getString(5), rs.getString(6), rs.getString(9),rs.getString(8));
               systemusers.add(myuser);

            }
            /*for (Myequipment st : myequipments) {
                System.out.println("My for loop stocks here are" + st.getName());
            }*/
            return systemusers;
        } catch (SQLException ex) {
            Logger.getLogger(usersmanager.class.getName()).log(Level.SEVERE, null, ex);
            return systemusers;
        }
    }
    public boolean userDelete(String id) throws SQLException, ClassNotFoundException {
        int affected = 0, affected2 = 0;
        PreparedStatement st=null;
        System.out.println("we passed the following id to delete in the usermanager" + id);
        String sql = "delete from users where staff_id = '" + id + "' ";        
        try {
            Connection conn = Dbconnection.ConnectDB();
            //st.setString(1, id);
            st = conn.prepareStatement(sql);
            affected = st.executeUpdate();            
            System.out.println("The delete function produced" + affected );
            if (affected == 1 ) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        } finally {
            if (st != null) {
                st.close();
            }
        }
    }
    
}
