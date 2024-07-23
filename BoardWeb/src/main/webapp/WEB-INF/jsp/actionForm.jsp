<%@page import="com.yedam.vo.StudentVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="mytag" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>actionForm.jsp</title>
</head>
<body>
	<h3>액션태그연습</h3>
	<%
	request.setAttribute("myName","김감치");
	StudentVO student = new StudentVO();
	student.setStdNo("100");
	student.setStdName("김감치");
	request.setAttribute("student",student);
	String msg = "hell";
%>


	<mytag:set var ="msg" value="Hell"></mytag:set>
	<mytag:set var ="age" value="44"></mytag:set>
	

	<h3>Jsp Standard Tag Library & Expression Language</h3>
	<p>${10 + 4 }</p>
	<p>${10 > 20 }</p>
	<p>${'hello' +='world'}</p>
	<p>내 이름은 ${myName}</p>
	<p>학생정보 ${student}</p>
	<p>학생의 이름은 ${student.stdName}, 학번은 ${student.stdNo}</p>
	<p>Msg 값은 ${msg}</p>
	<p>${age >= 20? '어른' : '안어른' } </p>
	<mytag:if test="${age >= 20  }">
	<p> 어른입니다.</p>
	</mytag:if>
	<mytag:choose>
	<mytag:when test="${age>=20}">
	<p>어른</p>
	</mytag:when>
	<mytag:otherwise>
	<p>안 어른</p>
	</mytag:otherwise>
	</mytag:choose>
	<mytag:forEach var= "i" begin="1" end="10" step="2">
	<p>${i }</p>
	</mytag:forEach>
	<p>구구단 4단 출력</p>
	<mytag:forEach var="n" begin="1" end="9">
	<p>4* ${n } = ${4*n}</p>
	</mytag:forEach>
	
	
	
	
	
	
	
</body>
</html>