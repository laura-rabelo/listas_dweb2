

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
/**
 * Servlet implementation class Ex7
 */
@WebServlet("/UploadImagemServlet")
public class Ex7 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ex7() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Collection<Part> partes = request.getParts();
        
        for (Part parte : partes) {
            String contentType = parte.getContentType();
            
            if (contentType != null && contentType.startsWith("image/")) {
                String fileName = Paths.get(parte.getSubmittedFileName()).getFileName().toString();
                InputStream fileContent = parte.getInputStream();
                String uploadDirectory = "C:\\Users\\User\\Desktop\\dweb2";
                Path uploadPath = Paths.get(uploadDirectory);
                if (!Files.exists(uploadPath)) {
                    Files.createDirectories(uploadPath);
                }
                Path imagePath = uploadPath.resolve(fileName);
                Files.copy(fileContent, imagePath);
            }
        }
        
        response.setContentType("text/html");
        response.getWriter().println("<html><head><title></title></head><body>");
        response.getWriter().println("<h1>Imagem(s) enviada(s) com sucesso!</h1>");
        response.getWriter().println("</body></html>");
    }
}
//http://localhost:8080/listaServlet/upload.html