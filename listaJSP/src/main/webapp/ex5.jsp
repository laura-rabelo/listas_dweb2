<%@ page import="java.util.ArrayList" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    
    <% 
        ArrayList<String> nomes;
        if (session.getAttribute("nomes") == null) {
            nomes = new ArrayList<>();
            session.setAttribute("nomes", nomes);
        } else {
            nomes = (ArrayList<String>) session.getAttribute("nomes");
        }
        
        String novoNome = request.getParameter("novoNome");
        if (novoNome != null) {
            nomes.add(novoNome);
        }
    %>
    
    <form method="post" action="">
        <label for="novoNome">Nome:</label>
        <input type="text" id="novoNome" name="novoNome" required>
        <button type="submit">Adicionar</button>
    </form>
    
    <h2>Lista de Nomes</h2>
    <ul>
        <% 
            for (String nome : nomes) {
        %>
                <li><%= nome %></li>
        <% 
            }
        %>
    </ul>
    </body>
</html>