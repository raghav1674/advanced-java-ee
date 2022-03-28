
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class HelloWorld extends HttpServlet{

  
  public void doGet(HttpServletRequest request,HttpServletResponse response)  throws IOException,ServletException{


      response.getWriter().println("Hello World");

  }


}
