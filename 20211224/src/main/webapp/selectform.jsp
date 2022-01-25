<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String edu = request.getParameter("edu");
	String country = request.getParameter("country");
	String[] like = request.getParameterValues("like");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
학력: <%=edu %><br/>
나라: <%=country %><br/>
관심분야: 
<%
	for(String s : like){
		out.print(s+" ");
	}
%>
</body>
</html>