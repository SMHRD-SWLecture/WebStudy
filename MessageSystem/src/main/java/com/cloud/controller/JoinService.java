package com.cloud.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cloud.db.MemberDAO;
import com.cloud.model.MemberVO;

@WebServlet("/JoinService")
public class JoinService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1. 한글 인코딩 잡아주기
		request.setCharacterEncoding("UTF-8");

		// 2. 요청 데이터 꺼내오기 -> 4개
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");

		// 3. console 출력 확인
		// System.out.println(email + "," + pw + "," + tel + "," + address);

		// 3. 데이터를 하나로 묶어주기
		MemberVO member = new MemberVO(email, pw, tel, address);

		// 4. DAO 생성하기
		MemberDAO dao = new MemberDAO();

		// 5. DAO 안에 있는 회원가입 메소드 사용하기
		int row = dao.join(member);

		// 6. 회원가입 성공 시 join_success.jsp 페이지로 이동
		if(row > 0) {
			// join_success.jsp 페이지로 email 데이터 보내주기
			request.setAttribute("email", email);
			// request 영역 > 응답이 되돌아오기 전까지만 유효한 범위


			// forward 이동방식 : 요청 1번 응답 1번 >> url 변화 X
			// >> 마지막에 이동하는 페이지에서 request 영역이 유효함

			// (1) 요청데이터를 유지하면서 페이지를 이동할 수 있는 도구 꺼내오기
			RequestDispatcher rd = request.getRequestDispatcher("join_success.jsp");
			// (2) 도구 사용하기
			rd.forward(request, response);

			// response.sendRedirect("join_success.jsp");
			// Redirect 이동방식 : 요청 2번 응답 2번 >> url 변화
			// >> request 영역이 유효하지 않음
		}

		// 7. 실패 시 main.jsp로 이동
		else {
			response.sendRedirect("main.jsp");
		}

	}

}
