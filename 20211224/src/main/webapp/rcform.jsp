<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
	String[] cp = request.getParameterValues("cp");
	String emailCk = request.getParameter("emailCk");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>rcform.jsp</title>
</head>
<body>
<% for(int i=0;i<cp.length;i++){
	%>
    <%=cp[i] %> &nbsp;&nbsp;
<%} %>
<br/>
이메일 수신여부: 
<%
	switch(emailCk){
	case "Y": out.print("이메일을 수신합니다.");break;
	case "N": out.print("이메일을 수신하지 않습니다.");break;
	}
%>
</body>
</html>