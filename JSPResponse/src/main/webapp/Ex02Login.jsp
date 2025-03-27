<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%
        // 로그인 기능을 수행하는 JSP 파일

        // 1. 요청 데이터 꺼내오기
        String id = request.getParameter("id");
        String pw = request.getParameter("pw");

        // 2. 요청 처리;
        if(id.equals("smart") && pw.equals("123")){
        	
        	// 쿠키 생성
        	Cookie cookie = new Cookie("id", id);
        	
        	// 유효기간 설정
        	cookie.setMaxAge(60*60);
        	
        	// 쿠키 전달
        	response.addCookie(cookie);
        	
            // 로그인 성공 -> Ex02LoginSuccess.jsp
            response.sendRedirect("Ex02LoginSuccess.jsp");
        }
        else {
            // 로그인 실패 -> Ex02LoginFail.jsp
            response.sendRedirect("Ex02LoginFail.jsp");
        }
    %>
</body>
</html>