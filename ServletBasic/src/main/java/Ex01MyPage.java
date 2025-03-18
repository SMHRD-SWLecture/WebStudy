import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex01MyPage")
public class Ex01MyPage extends HttpServlet {
   private static final long serialVersionUID = 1L;

   
   protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // service 메서드 : Java의 Main 메서드 역할 
      // 요청을 처리하고 응답하는 역할을 수행하는 메서드 
	   
      // 1. request : 사용자가 요청했을 때, 요청에 대한 정보를 담고 있는 객체 
      // ex) 요청이 들어온 주소, 요청할 때 넘겨준 데이터(id, pw) 
	   
      // 요청을 한 사람의 ip주소를 반환하는 메서드 
      String client_ip = request.getRemoteAddr();
      
      System.out.println(client_ip);
      
      // 2. response 객체 : 사용자에게 응답할 떄 사용하는 객체 
      // 웹에 출력하기 위한 웹 출력용 도구가 필요!
      
      response.setContentType("text/html; charset=UTF-8");
      
      PrintWriter out = response.getWriter();
      
      // out.print() -> 화면에 출력하려는 내용을 String 형태로 출력
      out.print("안녕하세요!");
      out.print("<h1> yeongmin의 페이지 </h1>");
   }
   
}