import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetPost")
public class Ex02GetPost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Post 방식으로 요청했을 때 주의할 점!
		// 꼭 데이터를 꺼내오기 전에 encoding 해줘야 함!

		request.setCharacterEncoding("UTF-8");

		// 1. 요청 데이터 꺼내오기
		String name = request.getParameter("name");
		System.out.println(name);
	
	}

}
