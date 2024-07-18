<%@page import="com.yedam.vo.BoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="../includes/header.jsp"%>

<title>board List.jsp</title>
</head>
<body>
	<h3>게시글 목록(boardList.jsp)</h3>
	<table border="2">
		<thead>
			<tr>
				<th>글번호</th>
				<th>제 목</th>
				<th>작성자</th>
				<th>작성일자</th>
			</tr>
		</thead>
		<%
		String name = (String) request.getAttribute("myName");
		List<BoardVO> list = (List<BoardVO>) request.getAttribute("boardList");
		%>
		<tbody>
			<%
			for (BoardVO board : list) {
			%>
			<tr>
				<td><%=board.getBoardNo()%></td>
				<td><%=board.getTitle()%></td>
				<td><%=board.getWriter()%></td>
				<td><%=board.getWriteDate()%></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
<%@ include file="../includes/footer.jsp"%>