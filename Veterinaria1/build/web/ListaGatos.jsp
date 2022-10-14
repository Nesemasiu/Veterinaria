<%-- 
    Document   : ListaGatos
    Created on : 14/10/2022, 02:57:58 PM
    Author     : Usuario
--%>

<%@page import="sisas.Gato"%>
<%@page import="sisas.Gato"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de gatos</h1>
        <form action="Gato.jsp">
            <input type="submit" value="registrar otro gato"> 
        </form>

        <%

            String nombre = request.getParameter("nombre");
            String raza = request.getParameter("raza");
            String color = request.getParameter("color");
            String e = request.getParameter("edad");
            int edad = Integer.parseInt(e);
            String toxoplas = request.getParameter("toxoplas");
            ArrayList<Gato> gatos = (ArrayList<Gato>) request.getSession().getAttribute("gatos");
            if (nombre == null) {
                
                }
             else {
                if (gatos == null) {
                    gatos = new ArrayList<Gato>();
                    gatos.add(new Gato(nombre, raza, color, edad, toxoplas));
                    request.getSession().setAttribute("gatos", gatos);
                } else {
                    gatos.add(new Gato(nombre, raza, color, edad, toxoplas));
                    request.getSession().setAttribute("gatos", gatos);

                }
            }


        %>
        


        <%
            double promedio = 0;
            if (gatos == null) {
                out.println("no hay gatos registrados");
            } else {
                for (int i = 0; i < gatos.size(); i++) {
                    out.println((i + 1) + ") " + gatos.get(i) + "<br/>");
                    promedio = promedio + gatos.get(i).getEdad();
                }
            }

        %>

        <h2>El promedio de las edades es: <% out.println(promedio / gatos.size());
            %> <br/>
            Cantidad de felinos guardados: <% out.println(gatos.size());%><br/>


        </h2>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>

        ___________________________________________________________________________________________________________________________________________________________________________<br/>


        <form action="EliminarGato.jsp"method="post"> 
            Digite el numero de la lista que quiere borrar: <input type=text" name= "numero"><input type="submit" value="Borrar Gato">
            <br/>
        </form>

    </body>
</html>
