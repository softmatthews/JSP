/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import beansIo.equipmentsmanager;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Matthews
 */
@WebServlet(name = "Bookings", urlPatterns = {"/Bookings"})
public class Bookings extends HttpServlet {

   
   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       doPost(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        equipmentsmanager eq=new equipmentsmanager();
        eq.getEquipmentBookings();
        HttpSession session=request.getSession();
        session.setAttribute("bookings", eq.getEquipmentBookings());
        getServletContext().getRequestDispatcher("/bookings.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
