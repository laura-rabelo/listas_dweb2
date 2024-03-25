import java.io.IOException;
import java.util.regex.Pattern;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CadastroServlet")
public class Ex8 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        
        if (isValidInput(nome) && isValidInput(email)) {
            email = sanitize(email);
            response.sendRedirect("cadastro_sucesso.html");
        } else {
            response.sendRedirect("erro_campos.html");
        }
    }
    
    private boolean isValidInput(String input) {
        return input != null && !input.isEmpty();
    }
    
    private String sanitize(String input) {
        return input.replaceAll("\\<.*?\\>", "");
    }
}
