<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("EUC-KR");
	String search = request.getParameter("search");
	request.setAttribute("subject","jsp는 서버프로그램입니다.");
	//						속성명			속성값
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
검색페이지입니다.<br/>
<form action="NewFile3.jsp" method="post" name="frm">
	검색: <input type="search" name="search" value="<%=search%>"/> <!-- 받아온 값 출력해라 -->
	<input type="submit" value="검색"/>
	<br/>
	검색결과: <%=request.getAttribute("subject") %> <!-- 속성값 -->
</form>
</body>
</html>