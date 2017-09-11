
        
       <%@page import="java.text.DecimalFormat"%>
<%-- 
    Document   : calcular
    Created on : Sep 11, 2017, 10:33:40 AM
    Author     : mpozo
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

        <%! int altura, peso;
        String genero, contextura;
        float masa, calc, cmin, cmax, min, max;
        String texto;
        %>
    </head>
     <body style="background-color: #151630;color: white;">
        <div class="container ali">
        <div class="page-header"><h1>Resultados</h1></div>
        <hr>
        <% 
        DecimalFormat df = new DecimalFormat("0.0");
        altura = Integer.parseInt(request.getParameter("alt"));
        peso = Integer.parseInt(request.getParameter("peso"));
        genero = request.getParameter("optradio");
        contextura = request.getParameter("optradi");
        calc = ((float) Math.pow(altura,2))/10000;
        masa  = peso/calc;
        cmin = (float) 18 * altura;
        min = (float) Math.sqrt(cmin);
        cmax = (float) 24.9 * altura;
        max = (float) Math.sqrt(cmax);
        
        if (masa < 18.5) {
                texto = "Peso inferior al normal";
            }
        else if(masa >= 18.5 && masa <= 24.9){
                texto = "Normal";    
                }
        else if(masa >= 25.0 && masa <= 29.9){
                texto = "Peso superior al normal";    
                }
        else if(masa >= 30.0){
                texto = "Obesidad";    
                }
        %>
        <h4>Peso actual es: </h4> <%=peso%> kg
        <h4>Tu indice de masa corporal es: </h4> <%=df.format(masa)%>
        <h4>Según este IMC obtenido, tiene: </h4> <%=texto%>
        <h4>Peso mínimo recomendado: </h4> <%=df.format(min)%> kg
        <h4>Peso máximo recomendado:</h4> <%=df.format(max)%> kg
        <br>
        <br>
        <a href="index.html" style="color: white" class="nounderline"> <button type="submit" class="btn btn-success btn-block">Regresar</button></a>
        </div>
    </body>
</html>
