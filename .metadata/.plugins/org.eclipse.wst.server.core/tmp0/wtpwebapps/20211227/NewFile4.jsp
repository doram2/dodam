<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script>
	function send(){
		location.href="http://www.daum.net"; //�ڹٽ�ũ��Ʈ
	}
</script>
</head>
<body>
	<!-- response: �帧���� -->
	<a href="http://www.naver.com">���̹�</a> <!-- html -->
	<button type="button" onclick="send()">����</button>
	<%
		response.sendRedirect("http://www.nate.com");//jsp
	%>
</body>
</html>