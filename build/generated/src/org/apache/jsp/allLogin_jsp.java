package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class allLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <title>Lab Equipments Booking System </title>\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"bootstrap/css/bootstrap-responsive.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write(" <header>\n");
      out.write("            <nav class=\"navbar navbar-inverse navbar-static-top\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <a class=\"navbar-brand\" href=\"#\"><img src=\"http://localhost/lr/images/aa.jpg\"></img></a>\n");
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
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-2\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-8\">\n");
      out.write("                <form class=\"form-horizontal\" action=\"\"  role=\"form\" method=\"post\">  \n");
      out.write("                    <label>UserName :</label>\n");
      out.write("                    <input type=\"text\" name=\"username\" id=\"name\" placeholder=\"username\"/><br /><br />\n");
      out.write("                    <label>Password :</label>\n");
      out.write("                    <input type=\"password\" name=\"password\" id=\"password\" placeholder=\"**********\"/><br/><br />\n");
      out.write("                    <label>Email:</label>\n");
      out.write("                    <input type=\"text\" name=\"email\" id=\"email\" placeholder=\"your Registration Email\"/><br /><br />\n");
      out.write("                    <input type=\"submit\" value=\" Login \" name=\"submit\"/><br />\n");
      out.write("                    <p>Not yet Registerd?<a href=\"<?php echo base_url() ?>index.php/home/register\"> SignUp Here.</a></p>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
