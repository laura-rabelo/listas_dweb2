

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Ex3
 */
public class Ex3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ex3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        response.getWriter().println("<html><head><title>Formulário de Nome e Idade</title></head><body>");

        response.getWriter().println("<h1>Preencha seu nome e idade:</h1>");
        response.getWriter().println("<form method=\"post\">");
        response.getWriter().println("Nome: <input type=\"text\" name=\"nome\"><br>");
        response.getWriter().println("Idade: <input type=\"text\" name=\"idade\"><br>");
        response.getWriter().println("<input type=\"submit\" value=\"Enviar\">");
        response.getWriter().println("</form>");

        response.getWriter().println("</body></html>");
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nome = request.getParameter("nome");
        String idade = request.getParameter("idade");

        response.setContentType("text/html");
        response.getWriter().println("<html><head><title>Nome e Idade</title></head><body>");

        if (nome != null && idade != null) {
            response.getWriter().println("<h1>Nome e idade:</h1>");
            response.getWriter().println("<p>Nome: " + nome + "</p>");
            response.getWriter().println("<p>Idade: " + idade + "</p>");
        } else {
            response.getWriter().println("<h1>Preencha seu nome e idade!</h1>");
        }

        response.getWriter().println("</body></html>");
    }

}
