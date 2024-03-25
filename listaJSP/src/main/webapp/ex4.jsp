<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <% 
        String nomeUsuario = request.getParameter("nome");
        
        if (nomeUsuario != null) {
    %>
            <p>Seja bem-vindo(a) , <%= nomeUsuario %></p>
    <% 
        }
    %>
    
    <form method="post" action="">
        <label for="nome">Informe seu nome:</label>
        <input type="text" id="nome" name="nome" required>
        <button type="submit">Enviar</button>
    </form>
</body>
</html>