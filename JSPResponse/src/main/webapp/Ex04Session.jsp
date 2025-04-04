<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Session을 확인해보자</h2>
    <a href="Ex04GetSession.jsp">Session 확인하러 이동하기</a>
    <%
        // Session : 서버 영역에 데이터를 저장하는 객체
        // jsp에서는 별도로 session을 생성하지 않더라도, 바로 접근 가능

        // 1. session 영역 안에 데이터를 저장
        // session.setAttribute("구분할 이름", 데이터)
        // -> 데이터는 Object이므로 어떤 자료형이든 전부 들어갈 수 있음

        session.setAttribute("test", "장영민");
        // Object value = "장영민" --> Upcasting 발생!
    
    
    %>
</body>
</html>