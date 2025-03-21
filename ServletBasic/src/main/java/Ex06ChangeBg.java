import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ChangeBg") 
public class Ex06ChangeBg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 사용자의 요청 데이터 꺼내오기
		String color = request.getParameter("color");

		// 2. Print -> 넘어온 데이터가 어떠한 형태로 넘어오는지 console 창에 찍어보기!
		System.out.println(color);
		// 색상 코드 형태로 데이터가 넘어옴!

		// 3. 요청 처리 -> 배경 색을 변경해서 화면에 출력
		// 3-1. 출력 도구 가지고 오기
		PrintWriter out = response.getWriter();

		out.println("<html>");
		// <body bgcolor = #ff8c82 >
		out.println("<body bgcolor =" + color + ">");
		out.println("</body>");
		out.println("</html>");
		
		
		
		
	}

}
