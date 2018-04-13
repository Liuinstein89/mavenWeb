import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class ServletTest extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response){

        try {
            response.getWriter().println("<h1>Hello Servlet gitTest!!!</h1>");
            response.getWriter().println(new Date().toLocaleString());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
