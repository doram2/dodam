<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setAttribute("req", "request�� ����� ��");
	session.setAttribute("sess", "session�� ����� ��");
	application.setAttribute("app", "application�� ����� ��");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
request�� ������ ��: <%=request.getAttribute("req") %><br/>
session�� ������ ��: <%=session.getAttribute("sess") %><br/>
application�� ������ ��: <%=application.getAttribute("app") %><br/>
</body>
</html>