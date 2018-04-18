import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ex2_9 extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("NAME");
        String id = request.getParameter("ID");
        String pw = request.getParameter("PW");
        String gender = request.getParameter("GENDER");
        if(gender.equals("male")) gender = "남";
        else gender = "여";

        String inotice = request.getParameter("inotice");
        if(inotice == null) inotice = "받지 않음";
        else inotice = "받음";
        String cnotice = request.getParameter("cnotice");
        if(cnotice == null) cnotice = "받지 않음";
        else cnotice = "받음";
        String dnotice = request.getParameter("dnotice");
        if(dnotice == null) dnotice = "받지 않음";
        else dnotice = "받음";

        String job = request.getParameter("job");
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<HTML>");
        out.println("<HEAD><TITLE>개인정보 입력 - 결과</TITLE></HEAD>");
        out.println("<BODY>");
        out.println("<H1>개인 정보 입력</H1>");
        out.println("이름 :"+name+"<BR>");
        out.println("아이디 :"+id+"<BR>");
        out.println("암호 :"+pw+"<BR>");
        out.println("성별 :"+gender+"<BR>");
        out.println("공지 메일 :"+inotice+"<BR>");
        out.println("광고 메일 :"+cnotice+"<BR>");
        out.println("배송 확인 메일 :"+dnotice+"<BR>");
        out.println("직업 :"+job+"<BR>");
        out.println("</BODY>");
        out.println("</HTML>");

    }
}