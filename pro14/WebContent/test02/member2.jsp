<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>

<%
	request.setCharacterEncoding("UTF-8");

	// 각 내장 객체레 바인딩된 속성 값들을 gettAttribute() 메서드를 이용해 가져옴
	String id= (String)request.getAttribute("id");
	String pwd= (String)request.getAttribute("pwd");
	String name= (String)session.getAttribute("name");
	String email= (String)application.getAttribute("email");
%>

<html>

	<head>
		<meta charset=”UTF-8">
		<title>회원 정보 출력창</title>
	</head>
	
	<body>
	
		<table border="1" align="center">
		
			<tr align="center" bgcolor="#99ccff">
				<td width="20%"><b>아이디</b></td>
				<td width="20%"><b>비밀번호</b></td>
				<td width="20%"><b>이름</b></td>
				<td width="20%"><b>이메일</b></td>
			</tr>
			
			<tr align=center>
				<%-- 바인딩 시 속성 이름으로 각각의 MemberBean 속성에 접근하여 회원 정보를 출력 --%>
				<td>${ member.id }</td>
				<td>${ member.pwd }</td>
				<td>${ member.name }</td>
				<td>${ member.email }</td>
			</tr>
			
		</table>
		
	</body>

</html>