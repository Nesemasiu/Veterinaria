package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sisas.Gato;
import sisas.Gato;
import java.util.ArrayList;

public final class ListaGatos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Lista de gatos</h1>\n");
      out.write("        <form action=\"Gato.jsp\">\n");
      out.write("            <input type=\"submit\" value=\"registrar otro gato\"> \n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        ");


            String nombre = request.getParameter("nombre");
            String raza = request.getParameter("raza");
            String color = request.getParameter("color");
            String e = request.getParameter("edad");
            int edad = Integer.parseInt(e);
            String toxoplas = request.getParameter("toxoplas");
            ArrayList<Gato> gatos = (ArrayList<Gato>) request.getSession().getAttribute("gatos");
            if (gatos == null) {
                gatos = new ArrayList<Gato>();
                gatos.add(new Gato(nombre, raza, color, edad, toxoplas));
                request.getSession().setAttribute("gatos", gatos);
            } else {
                gatos.add(new Gato(nombre, raza, color, edad, toxoplas));
                request.getSession().setAttribute("gatos", gatos);

            }

        
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("        ");

            double promedio = 0;
            if (gatos == null) {
                out.println("no hay gatos registrados");
            } else {
                for (int i = 0; i < gatos.size(); i++) {
                    out.println(""+(i+1)+gatos.get(i) + "<br/>");
                    promedio = promedio + gatos.get(i).getEdad();
                }
            }

        
      out.write("\n");
      out.write("        <h2>El promedio de las edades es: ");
 out.println( promedio / gatos.size());
            
      out.write(" <br/>\n");
      out.write("            Cantidad de felinos guardados: ");
 out.println(gatos.size());
      out.write("<br/>\n");
      out.write("\n");
      out.write("        </h2>\n");
      out.write("        _________________________________________________________________________________________________________________________________<br/>\n");
      out.write("\n");
      out.write("        <form action=\"EliminarGato.jsp\"method=\"post\">\n");
      out.write("            <input type=\"submit\" value=\"Eliminar Gato\"> <br/>\n");
      out.write("\n");
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
