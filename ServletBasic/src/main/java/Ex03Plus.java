import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Plus")
public class Ex03Plus extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//  1. 사용자의 요청 데이터에서 숫자 꺼내오기
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));

		// 2. 사용자의 요청 처리하기
		int result = num1 + num2;

		// 3. 화면에 출력 해주기
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<body>");
		out.println(num1 + " + " + num2 + " = " + result);
		out.println("</body>");
		out.println("</html>");
	}

}
