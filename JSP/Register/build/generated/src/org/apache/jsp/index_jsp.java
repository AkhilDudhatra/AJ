package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("    <title>Form Centering</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            height: 100vh; /* Full viewport height */\n");
      out.write("            margin: 0;\n");
      out.write("            background-color: #f0f0f0; /* Optional: light background color */\n");
      out.write("        }\n");
      out.write("        form {\n");
      out.write("            background: #fff; /* Optional: white background for the form */\n");
      out.write("            padding: 20px; /* Space inside the form */\n");
      out.write("            border-radius: 8px; /* Rounded corners for the form */\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* Subtle shadow for depth */\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        input[type=\"text\"], input[type=\"password\"] {\n");
      out.write("            margin-bottom: 10px; /* Space between fields */\n");
      out.write("            padding: 8px;\n");
      out.write("            width: 200px; /* Adjust width as needed */\n");
      out.write("            box-sizing: border-box; /* Ensure padding is included in the width */\n");
      out.write("        }\n");
      out.write("        input[type=\"submit\"] {\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            background-color: #007bff; /* Blue background for the button */\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 4px; /* Rounded corners for the button */\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        input[type=\"submit\"]:hover {\n");
      out.write("            background-color: #0056b3; /* Darker blue on hover */\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <form action=\"Process.jsp\" >\n");
      out.write("            NAME: <input type=\"text\" name=\"name\" placeholder=\"Name....\" >\n");
      out.write("            <br><br>\n");
      out.write("            EMAIL: <input type=\"text\" name=\"email\" placeholder=\"Email ID....\" >\n");
      out.write("             <br><br>\n");
      out.write("            PASSWORD: <input type=\"password\" name=\"password\" placeholder=\"Password....\">\n");
      out.write("             <br><br>\n");
      out.write("            <input type=\"submit\" value=\"register\"/>\n");
      out.write("        </form>\n");
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
