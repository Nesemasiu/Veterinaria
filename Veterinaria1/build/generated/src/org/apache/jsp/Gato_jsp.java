package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import sisas.Gato;
import java.util.ArrayList;

public final class Gato_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Gato</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        \n");
      out.write("                <form action=\"ListaGatos.jsp\"method=\"post\">\n");
      out.write("                    <h1>Agregue los datos del gato</h1>\n");
      out.write("        <h2>\n");
      out.write("            Digite el nombre: <input type=text\" name= \"nombre\">    \n");
      out.write("        </h2>\n");
      out.write("        <h2>\n");
      out.write("            Digite el raza: <input type=text\" name= \"raza\">\n");
      out.write("        </h2>\n");
      out.write("        <h2>\n");
      out.write("            Digite el color: <input type=text\" name= \"color\">\n");
      out.write("        </h2>\n");
      out.write("        <h2>\n");
      out.write("            Digite el edad: <input type=text\" name= \"edad\">\n");
      out.write("        </h2>\n");
      out.write("\n");
      out.write("        <h2>\n");
      out.write("            ¿Se encuentra libre de toxoplasmosis?(Si/No): <input type=text\" name= \"toxoplas\">\n");
      out.write("\n");
      out.write("            <center>\n");
      out.write("                ");

                    
            String nombre = request.getParameter("nombre");
            String raza = request.getParameter("raza");
            String color = request.getParameter("color");
            String e = request.getParameter("edad");
            int edad = Integer.parseInt(e);
            String toxoplas = request.getParameter("tocoplas");
            ArrayList<Gato> gatos = new ArrayList<Gato>();
            gatos.add(new Gato(nombre, raza, color, 21, toxoplas));
                
      out.write("\n");
      out.write("\n");
      out.write("                    <input type=\"submit\" value=\"Ver lista gatos\"> \n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </center>\n");
      out.write("        </h2\n");
      out.write("        <h3>\n");
      out.write("\n");
      out.write("        </h3>\n");
      out.write("\n");
      out.write("\n");
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
