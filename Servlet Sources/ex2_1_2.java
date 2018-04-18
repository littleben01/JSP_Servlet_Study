import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ex2_1_2 extends HttpServlet {
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        int total = 0;
        for (int i=0;i<=100;i++)   {
            if(i%3 == 0)    continue;
            if(i%2 == 0)    continue;
            total+=i;
        }
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD><TITLE> Ex2_1 </TITLE></HEAD>");
        out.println("<BODY>");
        out.printf("1+4+5...+200 = %d",total);
        out.println("</BODY>"); 
        out.println("</HTML>");
    }
}
