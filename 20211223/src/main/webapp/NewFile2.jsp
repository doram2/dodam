<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "point.Point"%>

<%
	Point p1 = new Point();
	Point p2 = new Point(10,20);
	int[] a = new int[3];
	a[0] = 10;
	a[1] = 20;
	a[2] = 30;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>point</title>
<script>
	//3단을 javascript while 문으로 출력
	var gop = 1;
	while(gop <= 9){
		document.write("3 * "+gop+" = "+3*gop+"<br/>");
		gop++;
	}
	document.write("--------------------------------------------------<br/>");
	//원하는 단과 곱을 받아와서 구구단 출력
	var startDan = Number(prompt("시작 단을 입력하세요: "));
	var endDan = Number(prompt("마지막 단을 입력하세요: "));
	var startGop = Number(prompt("시작 곱을 입력하세요: "));
	var endGop = Number(prompt("마지막 곱을 입력하세요: "));
	for(var i = startDan; i <= endDan; i++){
		for(var j = startGop; j <= endGop; j++){
			document.write(i+" * "+j+" = "+i*j+"<br/>");
		}
	}
	document.write("--------------------------------------------------<br/>");
</script>
</head>
<body>
<%
	int gop = 1;
	while(gop <= 9){%>
		3 * <%=gop %> = <%=3*gop %><br/>
<% 		gop++;
}%>

<%
	int startDan = 3;
	int endDan = 6;
	int startGop = 2;
	int endGop = 4;
	for(int i = startDan; i <= endDan; i++){
		for(int j = startGop; j <= endGop; j++){
			out.print(i+" * "+j+" = "+i*j+"<br/>");
		}
	}
%>
------------------------------------------------------------------------<br/>
<%//do-while
	int dan = startDan;
	do{
		gop = startGop;
		do{ %>
		<%=dan %> * <%=gop %> = <%=dan*gop %><br/>		
<%		gop++;
		}while(gop <= endGop);
	dan++;
	}while(dan <= endDan);
%>	
------------------------------------------------------------------------<br/>
<!-- 1단부터 9단 중 짝수단만 출력하세요. i++이용 --> 
<%
	for(dan = 1; dan <= 9; dan++){
		if(dan%2 != 0) continue;
		for(gop = 1; gop <= 9; gop++){%>
		<%=dan %> * <%=gop %> = <%=dan*gop %><br/>	
<%		}
	}%>
-------------------------------------------------------------------------<br/>

<!-- break -->
<!-- 1부터 9까지 구구단을 출력할 때 입력값 j를 만나면 구구단 중지 -->
<%
	int j = 5;
	for(dan = 1; dan <= 9; dan++){
		if(dan%2 != 0) continue;
		for(gop = 1; gop <= 9; gop++){%>
		<%=dan %> * <%=gop %> = <%=dan*gop %><br/>	
<%		}
	}%>
	p1's x = <%=p1.getX()%><br/>
	p1's Y = <%=p1.getY()%><br/>
	p2's x = <%=p2.getX()%><br/>
	p2's Y = <%=p2.getY()%><br/>
	a[0] = <%= a[0] %><br/>
	a[1] = <%= a[0] %><br/>
	a[2] = <%= a[0] %><br/>
	a[0] + a[1] = <%= a[0] + a[1] %>

<table border = 1 width = "640">
<colgroup>
	<col width = 20%>
	<col width = 50%>
	<col width = 30%>
</colgroup>
<tbody>
<tr><th>이름</th><th>주소</th><th>전화번호</th></tr>
<% for(int i = 1; i <= 10; i++){ %>
	<tr><td>김춘식</td><td>인천시 부평구</td><td>010-1234-5678</td></tr>
<% } %>
</tbody>
</table>

<%for(int i = 0; i < a.length; i++){ %>
	 a[<%=i %>] = <%=a[i]%><br/>
<% } %>
<hr/>
<%
	String location = "서울";
	switch(location){
	case "서울": out.println("02<br/>"); break;
	case "경기": out.println("031<br/>"); break;
	case "인천": out.println("032<br/>"); break;
	default: System.out.println("경인지역이 아닙니다.");
	}
%>
</body>
</html>