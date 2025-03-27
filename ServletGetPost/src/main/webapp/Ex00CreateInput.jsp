<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <!--
        요청을 처리하는 페이지

            1. 요청 데이터에서 정수를 꺼내오기!
            2. 주제 입력받기
            3. 정수만큼 Input 태그 생성 -> 반복
    -->

    <%
        // 1. 요청 데이터 꺼내오기
        int num = Integer.parseInt(request.getParameter("num1"));


    
    
    
    %>

    <form action = "Ex00RandomWinner.jsp">
        주제 : <input type = "text" name = "topic"> <br>

        <%
            for(int i = 0; i < num; i++) {
                out.print("<input type = 'text' name = 'random'> <br>");
            }
        %>
        
        <input type = "submit">
    </form>
</body>
</html>