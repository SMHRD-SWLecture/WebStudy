import java.io.IOException;
import java.io.PrintWriter;
import java.security.Principal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Ex01Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1. 사용자의 요청 정보에서 ID, PW 꺼내오기!
		String user_id = request.getParameter("id");
		String user_pw = request.getParameter("pw");

		// 2. 사용자의 요청을 처리 -> ID, PW를 비교해서 회원인지 판별
		String id = "smart";
		String pw = "123";

		// 3.
		// 로그인에 성공했다면 -> "smart님 환영합니다." 출력
		// 로그인에 실패했다면 -> "ID 또는 PW가 일치하지 않습니다." 출력

		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();

		if(user_id.equals(id) && user_pw.equals(pw)) {
			out.println("smart님 환영합니다");
		}
		else {
			out.println("ID 또는 PW가 일치하지 않습니다");
		}
	
	}

}
