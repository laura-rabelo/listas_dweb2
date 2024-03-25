import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex2
 */
public class Ex2 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public Ex2() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        response.getWriter().println("<html><head><title>Parâmetros de Consulta</title></head><body>");

        String nome = request.getParameter("nome");
        String idade = request.getParameter("idade");

        if (nome != null && idade != null ) {
            response.getWriter().println("<h1>Parâmetros Recebidos:</h1>");
            response.getWriter().println("<p>Nome: " + nome + "</p>");
            response.getWriter().println("<p>Idade: " + idade + "</p>");
        } else {
            response.getWriter().println("<h1>Nenhum nome e idade Recebido</h1>");
        }

        response.getWriter().println("</body></html>");
    }
}
