<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <!-- HTML이 보내주는 요청에 따라 JSP에서 실제로 naverPage로 응답 -->
    <%
        System.out.print("JSP 페이지 방문");
        response.sendRedirect("http://www.naver.com");
    %>
</body>
</html>