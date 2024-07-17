<%@page import="com.yedam.vo.StudentVO"%>
<%@page import="com.yedam.mapper.StudentMapper"%>
<%@page import="com.yedam.common.DataSource"%>
<%@page import="org.apache.ibatis.session.SqlSession"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	SqlSession sqlSession = DataSource.getInstance().openSession(true);
	StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
	String sno = request.getParameter("sno"); // (주소)?sno=S2024-08 - 물음표 뒤의 값이 질의문자열(sno에 담긴 값을 반환해준다) 
	StudentVO std = mapper.selectOne(sno);
	%>
	<h3>학생 상세보기</h3>
	<table border="2">
		<tr>
			<th>학생번호</th>
			<td><%=std.getStdNo()%></td>
		</tr>
		<tr>
			<th>학생이름</th>
			<td><%=std.getStdName()%></td>
		</tr>
		<tr>
			<th>연락처</th>
			<td><%=std.getStdPhone()%></td>
		</tr>
	</table>
	<a href="../gamchiServlet">목록으로</a>
</body>
</html>