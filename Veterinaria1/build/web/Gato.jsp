<%-- 
    Document   : Gato
    Created on : 13/10/2022, 07:32:48 AM
    Author     : Nesema
--%>

<%@page import="java.util.Iterator"%>
<%@page import="sisas.Gato"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gato</title>
    </head>
    <body>


        <form action="ListaGatos.jsp"method="post">
            <h1>Agregue los datos del gato</h1>

            Digite el nombre: <input type=text" name= "nombre"> <br/>   


            Digite la raza: <input type=text" name= "raza"><br/>


            Digite el color: <input type=text" name= "color"><br/>

            Digite la edad: <input type=text" name= "edad"><br/>

            ¿Se encuentra libre de toxoplasmosis?(Si/No): <input type=text" name= "toxoplas"><br/>
            <input type="submit" value="Agregar y ver lista"> 
            

           


    </body>
</html>
