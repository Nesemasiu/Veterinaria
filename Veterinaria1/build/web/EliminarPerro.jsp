<%-- 
    Document   : EliminarPerro
    Created on : 14/10/2022, 05:35:39 PM
    Author     : Usuario
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="sisas.Perro"%>
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
             ArrayList<Perro> perros = (ArrayList<Perro>) request.getSession().getAttribute("perros");
            String num = request.getParameter("numero");
            if (num == null) {
            } else {
                int numero = Integer.parseInt(num)-1;
                for (int i = 0; i < perros.size(); i++) {
                    if (numero == i) {
                        perros.remove(i);
                         }

                     }
                 }
            if (perros == null) {
                out.println("no hay perros registrados");
            } else {
                for (int i = 0; i < perros.size(); i++) {
                    out.println((i + 1) + ") " + perros.get(i) + "<br/>");
                    
                }
            }
        %>
        <br/>
        <br/>
        <form action="Perro.jsp">
            Perro Eliminado Presione continuar para seguir agregando gatos: <input type="submit" value="Agregar"> 
        </form>
    </body>
</html>
