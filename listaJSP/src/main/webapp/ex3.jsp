<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>Verificação de Idade em JSP</h1>
    
    <%
        String idadeString = request.getParameter("idade");
        
        if (idadeString != null && !idadeString.isEmpty()) {
            int idade = Integer.parseInt(idadeString);
            
            int idadeMin = 18;
            
            boolean maiorDe18 = false;
            
            if (idade >= idadeMin) {
                maiorDe18 = true;
            }
            
            if (maiorDe18) {
    %>
                <p>Sucesso!</p>
    <% 
            } else {
    %>
                <p>Desculpe, você ainda não atingiu a idade mínima de 18 anos.</p>
    <% 
            }
        }
    %>
    
    <form method="post" action="">
        <label for="idade">Informe sua idade:</label>
        <input type="number" id="idade" name="idade" required>
        <button type="submit">OK</button>
    </form>
</body>
</html>