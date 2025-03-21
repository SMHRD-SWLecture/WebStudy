import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MakeTable")
public class Ex05MakeTable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int room = Integer.parseInt(request.getParameter("room"));

		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<body>");
		out.println("<table border = '2px'>");
		out.println("<tr>");
		
		for(int i = 1; i < room + 1; i++) {
			out.println("<td>" + i + "</td>");
		}
		
		out.println("</tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}

}