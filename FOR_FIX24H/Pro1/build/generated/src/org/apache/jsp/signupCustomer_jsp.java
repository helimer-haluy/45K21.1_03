package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signupCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!-- Created By CodingLab - www.codinglabweb.com -->\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <!---<title> Responsive Registration Form | CodingLab </title>--->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("     <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("   </head>\n");
      out.write("<body>\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <!-- <div class=\"title\">??NG KI? CHO KHA?CH</div> -->\n");
      out.write("    <div class=\"logo-title\">\n");
      out.write("      <img src=\"assets/img/portfolio/Logo1.png\" width=\"100\" height=\"100\">\n");
      out.write("      <div class=\"title\">??ng ký cho khách</div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"content\">\n");
      out.write("      <form action=\"#\">\n");
      out.write("        <div class=\"user-details\">\n");
      out.write("          <div class=\"input-box\">\n");
      out.write("            <span class=\"details\">H? và tên</span>\n");
      out.write("                 <input type=\"text\" id=\"fullname\" class=\"form-control \"style=\"background-color: #8fa2f6;\" placeholder=\"Enter your name\" required/>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"input-box\">\n");
      out.write("            <span class=\"details\">Tên ??ng nh?p</span>\n");
      out.write("            <input type=\"text\" id=\"username\" class=\"form-control \"style=\"background-color: #8fa2f6;\" placeholder=\"Enter your username\" required/>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"input-box\">\n");
      out.write("            <span class=\"details\">Email</span>\n");
      out.write("            <input type=\"email\" id=\"emailAddress\" class=\"form-control \"style=\"background-color: #8fa2f6;\" placeholder=\"Enter your email\" required/>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"input-box\">\n");
      out.write("            <span class=\"details\">S? ?i?n tho?i</span>\n");
      out.write("            <input type=\"text\" onkeypress='return event.charCode >= 48 && event.charCode <= 57' id=\"phoneNumber\" class=\"form-control \"style=\"background-color: #8fa2f6;\" placeholder=\"Enter your phoneNumber\" required/>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"input-box\">\n");
      out.write("            <span class=\"details\">M?t kh?u</span>\n");
      out.write("            <input type=\"password\" id=\"password\" class=\"form-control \"style=\"background-color: #8fa2f6;\" placeholder=\"Enter your password\" required/>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"input-box\">\n");
      out.write("            <span class=\"details\">Nh?p l?i m?t kh?u</span>\n");
      out.write("            <input type=\"password\" id=\"password\" class=\"form-control \"style=\"background-color: #8fa2f6;\" placeholder=\"Enter your password one more time\" required/>\n");
      out.write("          </div>\n");
      out.write("        </div>      \n");
      out.write("        <div class=\"button input-box-large\">\n");
      out.write("          <input type=\"submit\" value=\"dangky?\" >\n");
      out.write("        </div>\n");
      out.write("        <!-- <div class=\"button\">\n");
      out.write("          <input type=\"submit\" value=\"??ng ky?\" >\n");
      out.write("        </div> -->\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
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
