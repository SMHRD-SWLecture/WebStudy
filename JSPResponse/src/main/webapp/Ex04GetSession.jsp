<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>Session 확인하는 페이지</h1>

    <!-- session.getAttribute() 사용 시 주의사항
        : return type : Object 자료형
        : String -> 내부적으로 toString() 메소드가 자동으로 호출되므로 문제 없이 화면에 출력
        : but. 내가 설계한 나만의 자료형을 값으로 넣었다면 반드시 다운캐스팅을 해줘야 함
    -->
    <%=session.getAttribute("test") %>
</body>
</html>