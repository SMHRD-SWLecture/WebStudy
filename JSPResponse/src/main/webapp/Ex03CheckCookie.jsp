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
		// 1. 쿠키 꺼내오기
		Cookie[] Cookies = request.getCookies();
	
		for(Cookie c : Cookies) {
			out.print(c.getName() + ":" + c.getValue());
		}
	%>
	
</body>
</html>