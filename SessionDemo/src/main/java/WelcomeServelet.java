import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
@WebServlet("/welcome")
public class WelcomeServelet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession(false);//dont create session object if already exists
        String name=(session!=null) ?(String) session.getAttribute("username"):"Guest";
        String email=(session!=null) ?(String)session.getAttribute("useremail"):"Not Available";

        Cookie[] cookies= req.getCookies();
        String cookiesUser="Guest";
        if (cookies!=null){
            for (Cookie c:cookies){
                if (c.getName().equalsIgnoreCase("user")){
                    URLDecoder.decode(c.getValue(), StandardCharsets.UTF_8.toString());
                }
            }
        }
        resp.setContentType("text/html");
        PrintWriter our=resp.getWriter();
        our.println("<h2>Welcome buddy,  "+name+"</h2");
        our.println("<h2>Your Email,  "+email+"</h2");
    }
}
