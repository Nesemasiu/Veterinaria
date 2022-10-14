<%-- 
    Document   : ListaPerros
    Created on : 14/10/2022, 05:24:38 PM
    Author     : Usuario
--%>

<%@page import="sisas.Perro"%>
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
        <form action="Perro.jsp">
            <input type="submit" value="registrar otro perro"> 
        </form>

        <%

            String nombre = request.getParameter("nombre");
            String raza = request.getParameter("raza");
            String color = request.getParameter("color");
            String e = request.getParameter("edad");
            int edad = Integer.parseInt(e);
            String nivel = request.getParameter("nivelEntrena");
            int nivelEtreno=Integer.parseInt(nivel);
            ArrayList<Perro> perros = (ArrayList<Perro>) request.getSession().getAttribute("perros");
            if (nombre == null) {
                
                }
             else {
                if (perros == null) {
                    perros = new ArrayList<Perro>();
                    perros.add(new Perro(nombre, raza, color, edad, nivelEtreno));
                    request.getSession().setAttribute("perros", perros);
                } else {
                    perros.add(new Perro(nombre, raza, color, edad, nivelEtreno));
                    request.getSession().setAttribute("perros", perros);
                }
            }


        %>
        


        <%
            double promedio = 0;
            if (perros == null) {
                out.println("no hay perros registrados");
            } else {
                for (int i = 0; i < perros.size(); i++) {
                    out.println((i + 1) + ") " + perros.get(i) + "<br/>");
                    promedio = promedio + perros.get(i).getEdad();
                }
            }

        %>

        <h2>El promedio de las edades es: <% out.println(promedio / perros.size());
            %> <br/>
            Cantidad de felinos guardados: <% out.println(perros.size());%><br/>


        </h2>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>

        ___________________________________________________________________________________________________________________________________________________________________________<br/>


        <form action="EliminarPerro.jsp"method="post"> 
            Digite el numero de la lista que quiere borrar: <input type=text" name= "numero"><input type="submit" value="Borrar Perro">
            <br/>
        </form>

    </body>
</html>