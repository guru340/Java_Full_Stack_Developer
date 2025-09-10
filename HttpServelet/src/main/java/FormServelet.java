import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;

public class FormServelet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out= resp.getWriter();
        out.println("<h2> Welcome to Cfs</h2>");
        out.println("<p>you can contact us at 81454266</p>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String course=req.getParameter("Course");

        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<h2> Student details:</h2>");
        out.println("<p>Student name:"+name+"</p>");
        out.println("<p>Student course:"+course+"</p>");
    }
}
