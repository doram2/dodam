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
������ ���ӽð�: <%=new Date(session.getLastAccessedTime()) %><br/>
�����ð�: <!-- session.getMaxInactiveInterval() �̰� 1800--><br/>
<%session.setMaxInactiveInterval(10); %><!-- 10���Ŀ� ���Ӳ��� -->
���� ���� ����: <%=session.isNew() %><br/> <!-- true: �������� / false: ���ӵ� ����-->
<!--  session����:  session.invalidate(); -->
<%
	session.setAttribute("result","session�� ������ ��");
%>
session�� ������ ��: <%=session.getAttribute("result") %>
</body>
</html>