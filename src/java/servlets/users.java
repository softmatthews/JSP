/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import beansIo.usersmanager;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Matthews
 */
public class users extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet users</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet users at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         usersmanager usermng= new usersmanager();
        String action=request.getParameter("action");
        String deleteid=request.getParameter("deleteid");
        if(action.equals("delete")){
             try {
                 usermng.userDelete(deleteid);
                 usermng.getUsers();
        HttpSession session=request.getSession();
        session.setAttribute("allusers",usermng.getUsers());
        getServletContext().getRequestDispatcher("/allusers.jsp").forward(request, response);
             } catch (SQLException ex) {
                 Logger.getLogger(users.class.getName()).log(Level.SEVERE, null, ex);
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(users.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        if(action.equals("view")){
            
        }
      if(action.equals("changerole")){
          System.out.println("changing role here");
          String name=request.getParameter("userdepartment");
          String userole=request.getParameter("userole");
          String userdepartment=request.getParameter("userdepartment");
          String userfaculty=request.getParameter("userfaculty");
           System.out.println("changing role here"+name);
      
      }
        usermng.getUsers();
        HttpSession session=request.getSession();
        session.setAttribute("allusers",usermng.getUsers());
        getServletContext().getRequestDispatcher("/allusers.jsp").forward(request, response);
       //System.out.println(usermng.getUsers().toString());
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
