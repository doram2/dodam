<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%--�⺻��ü
	request, response, application, session:�α���, ��ٱ���
	out: out.print(), out.write() --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- request -->
Ŭ���̾�Ʈ IP �ּ�: <%=request.getRemoteAddr() %><br/>
��û �޼ҵ�: <%=request.getMethod() %><br/>
��������: <%=request.getProtocol() %><br/>
��������: <%=request.getServerName() %><br/>
������Ʈ: <%=request.getServerPort() %><br/>
��û URI: <%=request.getRequestURI() %><br/>
��� �� ��ġ�� URL<br/>
��û URL: <%=request.getRequestURL() %><br/>
��û ContextPath: <%=request.getContextPath() %><br/>
��û ������Ʈ��: <%= request.getQueryString() %><br/>
<br/>
����: /NewFile2.jsp�� ����Ͻÿ�<br/>
<%= request.getRequestURI().substring(request.getContextPath().length()) %>
<br/>
<%
	String stridx = "abcd";
	String str = "abcdefghi";
	out.print(str.substring(4, 4+2)+"<br/>");
	out.print(str.substring(stridx.length())+"<br/>");
	out.print(str.substring(4)+"<br/>");
%>
<%
	String str1 = "��õ�� ���� �Ͻŷ� 14���� 23";
	String sido = "��õ�� ����";
	//����: ��, ���� �� ������ �ּҸ� ������ ���ÿ�.
	out.print(str1.substring(sido.length())+1);

%>
</body>
</html>