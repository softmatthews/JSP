/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import beans.Equipment;
import beansIo.Adminaudits;
import beansIo.equipmentsmanager;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Matthews
 */
public class equipments extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        equipmentsmanager eq = new equipmentsmanager();
        Adminaudits audit=new Adminaudits();
        RequestDispatcher rd = null;
        if (action == null) {
            HttpSession session = request.getSession();
            System.out.println("here you got no action" + action);            
        if (session.equals(null)) {
                session.setAttribute("name", "matthews");
                request.setAttribute("equipments", eq.getEquipment());
                System.out.println("Your new session created");
                getServletContext().getRequestDispatcher("/homepage.jsp").forward(request, response);
            } else {
                System.out.println("You have a session already with you");
                session.setAttribute("name", "matthews");
                request.setAttribute("equipments", eq.getEquipment());
                getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
            }

        } else {
            System.out.println("here you got this action before swicth" + action);
            switch (action) {
                case "view":
                    try {
                        /* call the view selected items method*/
                        String id = request.getParameter("viewid");
                        Equipment equipment = (Equipment) eq.getRow(id);
                        request.setAttribute("viewequipment", equipment);
                        System.out.println("Am viewing the item: " + id + equipment.getName());
                        getServletContext().getRequestDispatcher("/viewequipment.jsp").forward(request, response);
                    } catch (SQLException ex) {
                        Logger.getLogger(equipments.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(equipments.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case "delete":
                    try {
                        /*call the delete method for the item*/
                        System.out.println("we are to delete this item id" + request.getParameter("deleteid"));
                        String deleteid = request.getParameter("deleteid");
                        if (eq.delete(deleteid) == false) {
                            System.out.println("You Successfully deleted my equipment id number" + deleteid);
                            HttpSession session = request.getSession();
                            session.setAttribute("equipments", eq.getEquipment());
                            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
                        } else {
                            System.out.println("I cannot delete your item,u dont exist");
                            response.sendRedirect("jsps/newjsp.jsp");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(equipments.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(equipments.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                /*call the update method for the item*/
                case "update":
                    System.out.println("Updating the equipment");
                    String name = request.getParameter("updatename");
                    System.out.println("Updating "+name);                    
                    String details = request.getParameter("updatedetails");
                    String category = request.getParameter("updatecategory");
                    String id = request.getParameter("eqpid");
                    String costi=request.getParameter("updatecost");
                    System.out.println("myc osti iss"+costi+category);
                    Double cost = Double.parseDouble(request.getParameter("updatecost"));
                    Integer quantity = Integer.parseInt(request.getParameter("updatequantity"));                  
                    Equipment myequipment = new Equipment(id, name, quantity, cost, category);
                     {
                        try {
                            eq.update(myequipment);
                        } catch (SQLException ex) {
                            Logger.getLogger(equipments.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(equipments.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    break;
                /*call the insert new item method for the item*/
                case "newitem":
                    System.out.println("We will insert a new item right here");
                    String eqpname = request.getParameter("eqpname");
                    Double eqpcost = Double.parseDouble(request.getParameter("eqpcost"));
                    int eqpquantity = Integer.parseInt(request.getParameter("eqpquantity"));
                    String eqpdetails = request.getParameter("eqpdetails");
                    String eqpcategory = request.getParameter("eqpcategory");
                    // Equipment(String equip_id, String name, int quantity, double current_value, String description,String category, String date_acquired) {
                    Equipment equipment = new Equipment("", eqpname, eqpquantity, eqpcost, eqpcategory);

                     {
                        try {
                            System.out.println("Inserting the equipment");
                             HttpSession session = request.getSession();
                             session.getAttribute("name");
                             audit.addequipmentaudit(equipment,(String)session.getAttribute("name"));
                             eq.insertItems(equipment);
                             session.setAttribute("equipments", eq.getEquipment());
                            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
                        } catch (SQLException ex) {
                            Logger.getLogger(equipments.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(equipments.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    break;
                default:
                    break;
            }

        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
