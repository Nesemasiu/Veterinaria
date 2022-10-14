<%-- 
    Document   : Perro
    Created on : 13/10/2022, 07:32:09 AM
    Author     : Nesema
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Perro</title>
    </head>
    <body>
        <h1>Agregue los datos del Perro</h1>
       
    
        <form action="ListaPerros.jsp">
            Digite el nombre: <input type=text" name= "nombre"> <br/>   


            Digite la raza: <input type=text" name= "raza"><br/>


            Digite el color: <input type=text" name= "color"><br/>

            Digite la edad: <input type=text" name= "edad"><br/>
            
            Digite el nivel de entrenamiento: <input type=text" name= "nivelEntrena"><br/>
            <input type="submit" value="Agregar y ver lista"> 
            </form>
    
        
    </body>
</html>
