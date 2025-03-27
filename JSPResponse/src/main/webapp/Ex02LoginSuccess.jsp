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
		Cookie[] cookies = request.getCookies();
		String id = null;
		
		for(Cookie c : cookies) {
			if(c.getName().equals("id")) {
				id = c.getValue();
			}
				
		}
	
	%>
	<h2> <%=id %>님 환영합니다 </h2>
	<a href = "Ex02Login.html">로그아웃</a>
</body>
</html>