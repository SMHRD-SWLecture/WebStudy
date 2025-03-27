
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
		// 랜덤한 당첨자를 뽑아서 화면에 출력
		
		// 1. 요청 데이터 꺼내오기
		String topic = request.getParameter("topic");
		String[] randoms = request.getParameterValues("random");
		
		// 2. 요청 처리하기
		Random rd = new Random();

		String result = randoms[rd.nextInt(randoms.length)];
	%>

	주제 : <%=topic %> <br>
	당첨자 : <%=result %>
</body>
</html>