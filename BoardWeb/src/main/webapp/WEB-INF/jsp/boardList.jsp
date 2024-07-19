<%@page import="com.yedam.common.SearchVO"%>
<%@page import="com.yedam.common.PageDTO"%>
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
	<!-- 검색기능 -->
	<div class="center">
		<form action="boardList.do">
			<div class="row">
				<div class="col-sm-4">
					<!-- select 목록 -->
					<select name="searchCondition" class="form-control">
						<option value="">선택</option>
						<option value="T">제목</option>
						<option value="W">작성자</option>
						<option value="TW">제목 & 작성자</option>
					</select>
				</div>
				<div class="col-sm-6">
				<input type="text" name="keyword" class="form-control">
				</div>
				<div class="col-sm-2">
				<input type ="submit" value="조회" class = "btn btn-primary">
				</div>
			</div>
		</form>
	</div>
	<table class="table">
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
		PageDTO paging = (PageDTO) request.getAttribute("paging"); 
		SearchVO search = (SearchVO) request.getAttribute("page1"); 
		%>
		<tbody>
			<%
			for (BoardVO board : list) {
			%>
			<tr>
				<td><%=board.getBoardNo()%></td>
				<td><a href=board.do?bno=<%=board.getBoardNo()%>><%=board.getTitle()%></a></td>
				<td><%=board.getWriter()%></td>
				<td><%=board.getWriteDate()%></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
	<p><%=paging%></p>
	<!-- 페이징 -->
	<nav aria-label="Page navigation example">
		<ul class="pagination justify-content-center">
			<!-- PREV 페이지 존재 -->
			<%
			if (paging.isPrev()) {
			%>
			<li class="page-item"><a class="page-link"
				href="boardList.do?page=<%=paging.getStartpage() - 1%>"
				aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
			</a></li>
			<%
			}
			%>
			<!-- 페이지 갯수만큼 링크생성 -->
			<%
			for (int p = paging.getStartpage(); p <= paging.getEndPage(); p++) {
				//paging.getpage() = p 같으면

				if (paging.getPage() == p) {
			%>
			<li class="page-item active" aria-current="page"><span
				class="page-link"><%=p%></span></li>
			<%
			} else {
			%>
			<li class="page-item"><a class="page-link"
				href="boardList.do?page=<%=p%>searchCondition=<%=search.getSearchCondition() %>&keyword=<%=search.getKeyword()%>"><%=p %></a></li>
			<%
			}
			}
			%>
			<!-- NEXT 페이지 존재 -->
			<%
			if (paging.isNext()) {
			%>
			<li class="page-item"><a class="page-link"
				href="boardList.do?page=<%=paging.getEndPage() + 1%>"
				aria-label="Next"> <span aria-hidden="true">&raquo;</span>
			</a></li>
			<%
			}
			%>
		</ul>
	</nav>
	<!-- 페이징 -->
	<%@ include file="../includes/footer.jsp"%>