import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Cookie;

@WebServlet("/Ex6AdicionarServlet")
public class Ex6Adicionar extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Cookie cookie = new Cookie("meuCookie", "valorDoCookie");
        cookie.setMaxAge(30);
        response.addCookie(cookie);
        
        response.setContentType("text/html");
        response.getWriter().println("<html><head><title>Cookie Adicionado</title></head><body>");
        response.getWriter().println("<h1>Cookie Adicionado</h1>");
        response.getWriter().println("<p>Um cookie foi adicionado à resposta por 30 segundos.</p>");
        response.getWriter().println("</body></html>");
    }
}