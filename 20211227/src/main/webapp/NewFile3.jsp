<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("EUC-KR");
	String search = request.getParameter("search");
	request.setAttribute("subject","jsp�� �������α׷��Դϴ�.");
	//						�Ӽ���			�Ӽ���
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
�˻��������Դϴ�.<br/>
<form action="NewFile3.jsp" method="post" name="frm">
	�˻�: <input type="search" name="search" value="<%=search%>"/> <!-- �޾ƿ� �� ����ض� -->
	<input type="submit" value="�˻�"/>
	<br/>
	�˻����: <%=request.getAttribute("subject") %> <!-- �Ӽ��� -->
</form>
</body>
</html>