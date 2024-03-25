<%@ page import="java.text.DecimalFormat" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>Calculadora de IMC</h1>
    
    <%!
        double calcularIMC(double peso, double altura) {
            
    	double imc = peso / (altura * altura);
           
            return imc;
        }
    %>
    
    <%
        String pesoString = request.getParameter("peso");
        String alturaString = request.getParameter("altura");
        
        double peso = 0;
        double altura = 0;
        double imc = 0;
        
        if (pesoString != null && alturaString != null) {
                peso = Double.parseDouble(pesoString);
                altura = Double.parseDouble(alturaString);

                imc = calcularIMC(peso, altura);          
        }
    %>
    
    <form method="post" action="">
        <label for="peso">Peso (kg):</label>
        <input type="text" id="peso" name="peso" required>
        <br>
        <label for="altura">Altura (metros):</label>
        <input type="text" id="altura" name="altura" required>
        <br>
        <button type="submit">Calcular</button>
    </form>
    
    <%-- Exibe o resultado do IMC apenas se for diferente de zero --%>
    <% if (imc != 0) { %>
        <p>IMC: <%= imc %></p>
    <% } %>
</body>
</html>