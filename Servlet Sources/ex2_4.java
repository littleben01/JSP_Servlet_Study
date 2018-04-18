import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ex2_4 extends HttpServlet {
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        int a= Integer.parseInt(request.getParameter("num1"))  ;
        int b= Integer.parseInt(request.getParameter("num2"))  ;
        int total = a + b;
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD><TITLE> Ex2_4 </TITLE></HEAD>");
        out.println("<BODY>");
        out.printf("total = %d",total);
        out.println("</BODY>"); 
        out.println("</HTML>");
    }
}
