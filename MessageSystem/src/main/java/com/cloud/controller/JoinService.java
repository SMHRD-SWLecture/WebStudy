package com.cloud.controller;

import java.io.IOException;
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
		dao.join(member);

	}

}
