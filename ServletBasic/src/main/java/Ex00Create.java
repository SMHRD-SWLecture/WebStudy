import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 우리가 만드는 모든 Servlet은 HttpServlet을 상속받음
@WebServlet("/Ex00Create")
public class Ex00Create extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// 우리가 만드는 html 생성 프로그램 -> java (객체 지향 언어)
       
    public Ex00Create() {
    	// 생성자 메소드
    	// 최초 요청 시 딱 1회만 실행
    	// 생략 가능
    	System.out.println("생성자 메소드 실행");
    }

	public void init(ServletConfig config) throws ServletException {
		// 초기화 메소드
		System.out.println("초기화 메소드 실행");
	}

	public void destroy() {
		// 객체 반환 메소드
		// 프로그램 종료 메소드
		System.out.println("destroy 메소드 실행");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 일반 자바에서 Main 메소드와 같은 역할 수행
		// 사용자의 요청을 처리, 결과를 응답하는 메소드
		// 요청이 들어올 때마다 반복적으로 실행됨
		System.out.println("service 메소드 실행");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DoGet 메소드 실행");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DoPost 메소드 실행");
	}

}