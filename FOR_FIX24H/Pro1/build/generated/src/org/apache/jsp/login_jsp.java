package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  \n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("    <meta name=\"description\" content=\"\" />\n");
      out.write("    <meta name=\"author\" content=\"\" />\n");
      out.write("    <title>fix24h.biz</title>\n");
      out.write("    <!-- Favicon-->\n");
      out.write("    <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\n");
      out.write("    <!-- Font Awesome icons (free version)-->\n");
      out.write("\t<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("\t<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\n");
      out.write("\t<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <!-- Core theme CSS (includes Bootstrap)-->\n");
      out.write("    <link href=\"css/login.css\" rel=\"stylesheet\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<div class=\"wrapper bg-white\">\n");
      out.write("\t\t<div class=\"h2 text-center \"><img src=\"images/Logo1.png\" alt=\"LOGO FIX 24H\"  style=\"border-radius:100%; width: 65%;\"/></div>\n");
      out.write("\t\t<div class=\"h4 text-muted text-center pt-2\">Đăng nhập</div>\n");
      out.write("\t\t<form class=\"pt-3\" action=\"login\" method=\"post\">\n");
      out.write("\t\t\t<div class=\"form-group py-2\">\n");
      out.write("\t\t\t\t<div class=\"input-field\"> <span class=\"far fa-user p-2\"></span> <input type=\"text\" placeholder=\"Tên ??ng nh?p\" name =\"username\" required class=\"\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group py-1 pb-2\">\n");
      out.write("\t\t\t\t<div class=\"input-field\"> <span class=\"fas fa-lock p-2\"></span> <input type=\"password\" placeholder=\"M?t Kh?u\" name=\"password\" required class=\"\"> <button class=\"btn bg-white text-muted\"> <span class=\"far fa-eye-slash\"></span> </button> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t <button type=\"submit\" class=\"btn btn-block text-center my-2 \" style=\"display: block;\n");
      out.write("\t\t\t margin-left: auto;\n");
      out.write("\t\t\t margin-right: auto;\n");
      out.write("\t\t\t width: 40%;\">Đăng nhập</button>\n");
      out.write("\t\t\t<div class=\"text-center pt-1 text-muted\"> \n");
      out.write("\t\t\t\t<a\n");
      out.write("\t\t\t\thref=\"QUên Mật Khẩu.html\">Quên mật khẩu\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
