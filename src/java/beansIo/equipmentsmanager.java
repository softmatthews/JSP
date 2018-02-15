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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import beans.Equipment;
import database.Dbconnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class equipmentsmanager {

    PreparedStatement st = null;

    private String sql;
    private String sql2;
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    private static ObservableList<beans.Equipment> myequipments;

    public boolean insertItems(Equipment eq) throws SQLException, ClassNotFoundException {
        /* name="eqpdetails"  name="eqpcost" name="eqpquantity"  name="eqpcategory" */
        try {
            Connection conn = Dbconnection.ConnectDB();
            PreparedStatement pst;
            String insert = "INSERT INTO EQUIPMENTS (eqpname, eqpcost, eqpdetails, quantity,eqpcategory,date_created)VALUES('" + eq.getName() + "', '" + eq.getCurrent_value() + "','" + eq.getDescription() + "','" + eq.getQuantity() + "','" + eq.getCategory() + "',SYSDATE())";
            pst = conn.prepareStatement(insert);

            PreparedStatement pst2;
            String insert2 = "INSERT INTO UNBOOKEDEqPMNTS  (eqpname, eqpcost, eqpdetails, quantity,eqpcategory,date_created) VALUES('" + eq.getName() + "', '" + eq.getCurrent_value() + "','" + eq.getDescription() + "','" + eq.getQuantity() + "','" + eq.getCategory() + "',SYSDATE())";
            pst2 = conn.prepareStatement(insert2);

            if (pst2.execute() == false && pst.execute() == false) {
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

    public ObservableList<Equipment> getEquipment() {
        myequipments = FXCollections.observableArrayList();
        con = Dbconnection.ConnectDB();
        String sql = "select *from equipments";

        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                Equipment mequipment = new Equipment(rs.getString(1), rs.getString(2), rs.getInt(5), rs.getDouble(3), rs.getString(4));
                myequipments.add(mequipment);

            }
            for (Equipment st : myequipments) {
                System.out.println("My for loop stocks here are" + st.getName());
            }
            return myequipments;
        } catch (SQLException ex) {
            Logger.getLogger(equipmentsmanager.class.getName()).log(Level.SEVERE, null, ex);
            return myequipments;
        }
    }
    public ObservableList<Equipment> getEquipmentBookings() {
        /* using the equipments bean for getting the bookings*/
        myequipments = FXCollections.observableArrayList();
        con = Dbconnection.ConnectDB();
        String sql = "select *from bookedeqpmnts";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                /*String sql2="select * from equipments where eqp_id='"+rs.getString(3)+"'";
                 pst = con.prepareStatement(sql2);
                 ResultSet rs2 = pst.executeQuery();
           //Equipment(String equip_id, String name,String quantity, String current_value, String description,String category) 
                */
                Equipment mequipment = new Equipment(rs.getString(1), rs.getString(2), rs.getString(5), rs.getString(2),rs.getString(3), rs.getString(4));
                myequipments.add(mequipment);
            }
            for (Equipment st : myequipments) {
                System.out.println("My for loop bookings here are" + st.getName());
            }
            return myequipments;
        } catch (SQLException ex) {
            Logger.getLogger(equipmentsmanager.class.getName()).log(Level.SEVERE, null, ex);
            return myequipments;
        }
    }

    public Equipment[] displayInfo() throws SQLException, ClassNotFoundException {
        sql = "select * from equipments";
        ResultSet rs = null;

        try {
            Connection conn = Dbconnection.ConnectDB();
            st = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery();

            rs.last();
            int nRows = rs.getRow();
            if (nRows == 0) {
                System.out.println("No rows were found");
                return null;
            } else {

                Equipment eq[] = new Equipment[nRows];
                rs.first();

                int i = 1;

                while (rs.next()) {
                    eq[i].setEquip_id(rs.getString("equipment_id"));
                    eq[i].setName(rs.getString("Name"));
                    eq[i].setQuantity(rs.getInt("quantity"));
                    eq[i].setCurrent_value(rs.getDouble("current_value"));
                    eq[i].setDescription(rs.getString("description"));
                    //eq[i].setDate_acquired(rs.getDate("date_acquired"));

                    i++;
                }

                return eq;
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
        }
    }

    public Equipment getRow(String id) throws SQLException, ClassNotFoundException {

        try {
            Connection conn = Dbconnection.ConnectDB();
            PreparedStatement pst;
            ResultSet rs;
            Equipment eq = null;
            System.out.println("we passed the following id to viewin the manager" + id);
            sql = "select * from equipments where eqpID = '" + id + "'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {

                Double cost = Double.parseDouble(rs.getString("eqpcost"));
                int quantity = rs.getInt("quantity");
                //  Myequipment(String equip_id, String name, int quantity, double current_value, String description,String category) {
                eq = new Equipment(rs.getString(1), rs.getString(2), rs.getInt(5), rs.getDouble(3), rs.getString(4));

            }
            return eq;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public boolean update(Equipment eq) throws SQLException, ClassNotFoundException {
        final String sql = "update equipments set equipment_id=?, name=?, quantity=?, current_value=?, description=?, data_acquired = ?";
        int affected = 0;
           System.out.println("Updating method in my manager");
        //Timestamp time = new Timestamp(eq.getDate_acquired().getTime());
        try {
            Connection conn = Dbconnection.ConnectDB();
            st = conn.prepareStatement(sql);
            st.setString(1, eq.getEquip_id());
            st.setString(2, eq.getName());
            st.setInt(3, eq.getQuantity());
            st.setDouble(4, eq.getCurrent_value());
            st.setString(5, eq.getDescription());
            //st.setTimestamp(6, time);

            affected = st.executeUpdate();
            if (affected == 1) {
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

    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        int affected = 0, affected2 = 0;
        System.out.println("we passed the following id to delete in the manager" + id);
        sql = "delete from equipments where eqpID = '" + id + "' ";
        sql2 = "delete from unbookedeqpmnts where eqPID='" + id + "' ";
        try {
            Connection conn = Dbconnection.ConnectDB();
            //st.setString(1, id);
            st = conn.prepareStatement(sql);
            affected = st.executeUpdate();
            st = conn.prepareStatement(sql2);
            affected2 = st.executeUpdate();
            System.out.println("The delete function produced" + affected + "and" + affected2);
            if (affected == 1 && affected2 == 1) {
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
