<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
Session ID: <%=session.getId() %><br/>
Creation Time: <%=new Date(session.getCreationTime())%><br/>
마지막 접속시간: <%=new Date(session.getLastAccessedTime()) %><br/>
유지시간: <!-- session.getMaxInactiveInterval() 이거 1800--><br/>
<%session.setMaxInactiveInterval(10); %><!-- 10초후에 접속끊김 -->
새로 접속 여부: <%=session.isNew() %><br/> <!-- true: 새로접속 / false: 접속된 상태-->
<!--  session종료:  session.invalidate(); -->
<%
	session.setAttribute("result","session에 저장한 값");
%>
session에 저장한 값: <%=session.getAttribute("result") %>
</body>
</html>