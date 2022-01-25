<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%--기본객체
	request, response, application, session:로그인, 장바구니
	out: out.print(), out.write() --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- request -->
클라이언트 IP 주소: <%=request.getRemoteAddr() %><br/>
요청 메소드: <%=request.getMethod() %><br/>
프로토콜: <%=request.getProtocol() %><br/>
서버네임: <%=request.getServerName() %><br/>
서버포트: <%=request.getServerPort() %><br/>
요청 URI: <%=request.getRequestURI() %><br/>
얘네 다 합치면 URL<br/>
요청 URL: <%=request.getRequestURL() %><br/>
요청 ContextPath: <%=request.getContextPath() %><br/>
요청 쿼리스트링: <%= request.getQueryString() %><br/>
<br/>
문제: /NewFile2.jsp만 출력하시오<br/>
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
	String str1 = "인천시 부평구 일신로 14번길 23";
	String sido = "인천시 부평구";
	//문제: 시, 도를 뺀 나머지 주소를 가지고 오시오.
	out.print(str1.substring(sido.length())+1);

%>
</body>
</html>