/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-05-09 17:38:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class projectcreation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Project Creation</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/css/home.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/css/projectcreation.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<link href=\"webjars/bootstrap/3.3.6/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"bg-light\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"menu-bar\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li class=\"active\"><a href=\"#\"><i class=\"fa fa-home\"\r\n");
      out.write("\t\t\t\t\taria-hidden=\"true\"></i>Home</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\"><i class=\"fa fa-product-hunt\"\r\n");
      out.write("\t\t\t\t\taria-hidden=\"true\"></i>Projects</a>\r\n");
      out.write("\t\t\t\t<div class=\"sub-menu-1\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/projectcreation\">New Projects</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"hover-me\"><a href=\"#\">Existing Projects</a><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-angle-right\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"sub-menu-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"/modulecreation\">Create Module</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Modules List</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\"><i class=\"fa fa-bars\" aria-hidden=\"true\"></i>Reports</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"/dashboard\"><i class=\"fa fa-th-large\"\r\n");
      out.write("\t\t\t\t\taria-hidden=\"true\"></i>DashBoard</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"/contact\"><i class=\"fa fa-address-book\"\r\n");
      out.write("\t\t\t\t\taria-hidden=\"true\"></i>Contact Us</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"login.html\"><i class=\"fa fa-sign-out\"\r\n");
      out.write("\t\t\t\t\taria-hidden=\"true\"></i>LogOut</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<h2 align=\"center\">Project Creation</h2>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<form action=\"/\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"form-group col-lg-7\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t<label for=\"proj\">Project Name:</label> \r\n");
      out.write("\t\t\t\t\t<input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control \" id=\"proj\" name=\"projname\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"enter project name\" required autofocus>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"form-group col-lg-7\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t<label for=\"dev\">Developed By:</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control\" id=\"dev\" name=\"developed\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"ex:CMRO\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"form-group col-lg-7\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t<label for=\"intg\">Integrations:</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control\" id=\"intg\" name=\"Integrations\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"enter integrated with any other resource details\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"form-group col-lg-7\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t<label for=\"dis\">Description:</label>\r\n");
      out.write("\t\t\t\t\t<textarea class=\"form-control\" rows=\"10\" id=\"dis\" required></textarea>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group col-lg-7\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t<label for=\"dis\">Upload:</label>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Submit</button>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"webjars/jquery/1.9.1/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"webjars/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
