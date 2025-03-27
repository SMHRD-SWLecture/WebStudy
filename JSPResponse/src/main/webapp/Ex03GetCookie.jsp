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
	// 1. 쿠키 생성
	Cookie cookie = new Cookie("first", "smhrd");
	
	// 2. 쿠키 만료 기간 설정
	cookie.setMaxAge(60*60*24*365);
	
	// 3. 전달
	response.addCookie(cookie);
	%>

</body>
</html>