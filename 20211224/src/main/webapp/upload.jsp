<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.oreilly.servlet.MultipartRequest,
                   com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@ page import="java.io.*" %>
<%
	String savePath = application.getRealPath("upload"); //upload폴더의 절대경로를 가져옴
	//out.print(savePath); //저장경로
	int sizeLimit = 1024*1024*5; //5mb
	//전송받은 파일을 저장
	MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8", new DefaultFileRenamePolicy()); 
	File file = multi.getFile("upFile");
	String fileName = file.getName(); //이름 으더옴
	long fileSize = file.length(); //파일크기
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>upload.jsp</title>
</head>
<body>
이름: <%=multi.getParameter("userName")%><br/>
파일명: <%=fileName %><br/>
사이즈: <%=fileSize %>
원본 파일명: <%=multi.getOriginalFileName("upFile")%>
</body>
</html>