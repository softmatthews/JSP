package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class changeusersrole_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/jsps/header.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <title>Booking Sample</title>\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"bootstrap/css/bootstrap-responsive.css\" rel=\"stylesheet\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">        \n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write(" <header>\n");
      out.write("            <nav class=\"navbar navbar-inverse navbar-static-top\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <a class=\"navbar-brand\" href=\"#\"><img src=\"\"></img></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                            <li><a href=\"#\">Lab Management System</a></li>\n");
      out.write("                            <li><a href=\"#\"><span class=\"glyphicon glyphicon-folder-open\"></span></a></li>\n");
      out.write("                            <li><a href=\"#\"><span class=\"glyphicon glyphicon-envelope\"></span></a></li>\n");
      out.write("                            <li><a href=\"#\"><span class=\"glyphicon glyphicon-glass\"></span></a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                            <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> Register</a></li>\n");
      out.write("                            <li><a href=\"jsps/login.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("        </header> ");
      out.write("    \n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"row row-offcanvas row-offcanvas-right\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"col-xs-12 col-sm-9\">\n");
      out.write("                    <p class=\"pull-right visible-xs\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary btn-xs\" data-toggle=\"offcanvas\">Toggle nav</button>\n");
      out.write("                    </p>\n");
      out.write("\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                        <li><a href=\"Leadership.php\">List</a></li>\n");
      out.write("                    </ol>\n");
      out.write("\n");
      out.write("                    <div class=\"well\">\n");
      out.write("                        <form class=\"form-horizontal\" action=\"users?action=changerole\" method=\"POST\">\n");
      out.write("                            <!-- *********************************************************************************************\n");
      out.write("                            ********************************************************************************************************-->\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                 <label for=\"inputEmail3\" class=\"col-sm-2 control-label\"> Name</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <input type=\"text\" name=\"usersname\" class=\"form-control\" id=\"inputEmail3\" required/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">Descriptions</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <textarea class=\"form-control\" name=\"usercontacts\" rows=\"3\" required/></textarea>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">Equipmentcost</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <input type=\"text\" name=\"userfaculty\" class=\"form-control\" id=\"inputEmail3\" required/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">Quantity Available</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <input type=\"text\" name=\"userdepartment\" class=\"form-control\" id=\"inputEmail3\" required/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">Equipment Category</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <select type=\"text\" name=\"userole\" class=\"form-control\" id=\"inputEmail3\" required>\n");
      out.write("                                        <option>Admin</option>\n");
      out.write("                                        <option>Normal User</option>\n");
      out.write("                                        <option>Super Admin</option>\n");
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-sm-offset-1 col-sm-10\">\n");
      out.write("                                    &nbsp;&nbsp;\n");
      out.write("                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                    <a href=\"/labclassworks\" ><input type=\"button\" value=\"BACK\" class=\"btn btn-success\"/></a>\n");
      out.write("                                    <button type=\"submit\" name=\"submit\" class=\"btn btn-success\">Save</button>\t   \t\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-6 col-sm-3 sidebar-offcanvas\" id=\"sidebar\" role=\"navigation\">\n");
      out.write("                    <div class=\"list-group\">\n");
      out.write("                        <a href=\"\" class=\"list-group-item active\"></a>\n");
      out.write("                        <a href=\"http://localhost:8080/Bookingweb/\" class=\"list-group-item \">Home</a>\n");
      out.write("                        <a href=\"http://localhost:8080/Bookingweb/\" class=\"list-group-item \">All Equipments</a>\n");
      out.write("                        <a href=\"http://localhost:8080/Bookingweb/jsps/allusers.jsp\" class=\"list-group-item\">View Users</a>\n");
      out.write("                        <a href=\"http://localhost:8080/Bookingweb/jsps/alltechnicians.jsp\" class=\"list-group-item\">View Technicians</a>\n");
      out.write("\n");
      out.write("                        __________________________________\n");
      out.write("                        <a href=\"\" class=\"list-group-item\">View Audits</a>\n");
      out.write("                        <a href=\"\" class=\"list-group-item\">Clear a User</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write(" \n");
      out.write("\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
