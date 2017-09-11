<%-- 
    Document   : confirma
    Created on : 08/09/2017, 10:17:01 AM
    Author     : Laboratorios
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="sitio.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
        
        <%-- DECLARACIÓN DE VARIABLES --%>
        <%! String nombre, cedula, apellido; 
        int edad;%>

    </head>
    <body style="background-color: #151630;color: white;">
        <div class="container">
            <div class="page-header">
                <h1>Menú</h1>    
                <hr>
            </div>
            <%
                cedula = request.getParameter("ced");
                nombre = request.getParameter("nom");
                apellido = request.getParameter("ape");
                edad =  Integer.parseInt(request.getParameter("edad"));
            %>
            <h3>Hola, <%=nombre%></h3>
            <h2>Tu información personal</h2>
            <p><strong>Apellido: </strong> <%=apellido%></p>
            <p><strong>Edad: </strong> <%=edad%></p>
            <p><strong>Cédula: </strong> <%=cedula%></p>
            
            <a href="menu.html" style="color: white" class="nounderline"><button type="submit" class="btn btn-danger btn-block">Ir a calculadora</button></a>
             <br>
            <a href="index.html" style="color: white" class="nounderline"> <button type="submit" class="btn btn-info btn-block">Regresar</button></a>
            
        </div>
            
           


        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
    </body>
</html>
