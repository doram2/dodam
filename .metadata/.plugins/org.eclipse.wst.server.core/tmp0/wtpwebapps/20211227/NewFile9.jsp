<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setAttribute("req", "request에 저장된 값");
	session.setAttribute("sess", "session에 저장된 값");
	application.setAttribute("app", "application에 저장된 값");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
request에 저장한 값: <%=request.getAttribute("req") %><br/>
session에 저장한 값: <%=session.getAttribute("sess") %><br/>
application에 저장한 값: <%=application.getAttribute("app") %><br/>
</body>
</html>