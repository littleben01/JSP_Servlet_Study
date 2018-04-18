import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ex2_5 extends HttpServlet{
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("NAME");
        String title = request.getParameter("TITLE");
        String text = request.getParameter("TEXT");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<HTML>");
        out.println("<HEAD><TITLE>Ex2_5</TITLE></HEAD>");
        out.println("<BODY>");
        out.println("이름 :"+name+"<BR>");
        out.println("이름 :"+title+"<BR>");
        out.println("------------------------");
        out.println("<PRE>"+text+"</PRE>");
        out.println("------------------------");
        out.println("</BODY>");
        out.println("</HTML>");
    }
}