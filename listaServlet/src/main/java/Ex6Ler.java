import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Cookie;

@WebServlet("/LerCookieServlet")
public class Ex6Ler extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Cookie[] cookies = request.getCookies();
        String valorDoCookie = null;
        
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("meuCookie")) {
                    valorDoCookie = cookie.getValue();
                    break;
                }
            }
        }
        
        response.setContentType("text/html");
        response.getWriter().println("<html><head><title>Valor do Cookie</title></head><body>");
        response.getWriter().println("<h1>Valor do Cookie</h1>");
       /* if (valorDoCookie = null) {
            response.getWriter().println("<p>O valor do cookie é: " + valorDoCookie + "</p>");
        } else {
            response.getWriter().println("<p>O cookie não foi encontrado.</p>");
        }*/
        response.getWriter().println("<p>O valor do cookie é: " + valorDoCookie + "</p>");
        response.getWriter().println("</body></html>");
    }
}