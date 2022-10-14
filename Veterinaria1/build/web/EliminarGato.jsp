<%-- 
    Document   : EliminarGato
    Created on : 14/10/2022, 05:03:40 PM
    Author     : Usuario
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="sisas.Gato"%>
<%@page import="sisas.Gato"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Nueva lista </h1><br/>
        <br/>
        
        <%
             ArrayList<Gato> gatos = (ArrayList<Gato>) request.getSession().getAttribute("gatos");
            String num = request.getParameter("numero");
            if (num == null) {
            } else {
                int numero = Integer.parseInt(num)-1;
                for (int i = 0; i < gatos.size(); i++) {
                    if (numero == i) {
                        gatos.remove(i);
                         }

                     }
                 }
            if (gatos == null) {
                out.println("no hay gatos registrados");
            } else {
                for (int i = 0; i < gatos.size(); i++) {
                    out.println((i + 1) + ") " + gatos.get(i) + "<br/>");
                    
                }
            }
        %>
        <br/>
        <br/>
        <form action="Gato.jsp">
            Gato Eliminado Presione continuar para seguir agregando gatos: <input type="submit" value="Agregar"> 
        </form>
    </body>
</html>
