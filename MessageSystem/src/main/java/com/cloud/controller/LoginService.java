package com.cloud.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cloud.db.MemberDAO;
import com.cloud.model.MemberVO;

@WebServlet("/LoginService")
public class LoginService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1. 한글 인코딩 잡아주기
		request.setCharacterEncoding("UTF-8");		
		
		// 2. 요청 데이터 꺼내오기 --> 2개
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");

		// 3. 요청 데이터들을 하나로 묶어주기
		MemberVO mvo = new MemberVO();
		mvo.setEmail(email);
		mvo.setPw(pw);

		// 4. DAO 생성
		MemberDAO dao = new MemberDAO();

		// 5. DAO가 가지고 있는 기능 중에 login 기능 사용
		dao.login(mvo);

		// 6. 로그인 성공 시, session 영역 안쪽에 로그인한 사용자 정보를 저장

		// 7. main.jsp redirect 방식으로 이동
	}

}
