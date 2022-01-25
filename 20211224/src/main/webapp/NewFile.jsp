<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, java.util.List"%>
<%@ page import="java.io.*, java.util.Calendar" %>
<%
	Calendar cal = Calendar.getInstance();
	List<String> list = new ArrayList<String>();
	list.add("김춘식");
	list.add("김일이");
	list.add("김이삼");
	list.add("김삼사");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>지시문</title>
</head>
<body>
오늘 날짜:
<%= cal.get(Calendar.YEAR) %>년
<%= cal.get(Calendar.MONTH)+1 %>월
<%= cal.get(Calendar.DATE) %>일<br/>
<%
	for(String s : list){
		out.print(s + "<br/>");
	}
%>
</body>
</html>