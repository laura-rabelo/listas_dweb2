import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ContadorVisitasServlet")
public class Ex5 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        Integer contadorVisitas = (Integer) session.getAttribute("contadorVisitas");
        if (contadorVisitas == null) {
            contadorVisitas = 1;
        } else {
            contadorVisitas++;
        }
        
        session.setAttribute("contadorVisitas", contadorVisitas);
        
        response.setContentType("text/html");
        response.getWriter().println("<html><head><title></title></head><body>");
        response.getWriter().println("<h1>Contador de Visitas</h1>");
        response.getWriter().println("<p>Você já visitou esta página " + contadorVisitas + " vezes.</p>");
        response.getWriter().println("</body></html>");
    }
}
