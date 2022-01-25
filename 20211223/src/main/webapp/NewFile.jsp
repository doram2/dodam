<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	for(var i = 0; i <= 9; i++){
		document.write(i+"<br/>");
	}
</script>
</head>
<body>
<%	//스프리트릿은 여러번 사용이 가능하므로 한줄씩 사용가능
	//이 안에 코드는 html코드가 아니고 java 코드
	for(int i = 0; i <= 9; i++){
		out.print(i +"<br/>");
	}
	out.print("안녕하세요"+"<br/>");
%>
<%for(int i = 0; i <= 9; i++){ %>
<%=i +"<br/>" %> <!-- %=: out.print랑 같음. 표현식 -->
<%-- jsp 주석 --%>
<%	} %>		 <!-- 세미콜론 ㄴㄴ -->
</body>
</html>