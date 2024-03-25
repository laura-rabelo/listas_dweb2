<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="4">
        <tr>
            <th>tabela números 1 a 10</th>
        </tr>
        <% 
            for (int i = 1; i <= 10; i++) {
        %>
        <tr>
            <td><%= i %></td>
        </tr>
        <% 
            }
        %>
    </table>
</body>
</html>