import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// URL Mapping : 어떠한 주소로 요청이 들어올지 url과 servlet을 mapping하는 작업
@WebServlet("/DataSend")
public class Ex02DataSend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// HTML 파일에서 보내주는 데이터를 확인할 수 있는 공간
		// 요청할 때 보내준 데이터를 꺼내올 것!

		/*
		 * 404 에러 : 요청한 Servlet 혹은 HTML 파일을 찾을 수 없는 경우
		 * - action 속성과 @WebServlet의 매핑 값이 동일한지 확인
		 * 
		 * 500 에러 : 데이터와 관련된 에러
		 * 
		 * 405 에러 : 요청 방식과 관련된 에러
		 */
		String data = request.getParameter("data");

		System.out.println("넘어온 데이터는 : " + data);

		// 넘어온 데이터 화면에 출력!
		response.setContentType("text/html; charset=UTF-8");
	}

}
