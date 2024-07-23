<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h3>회원목록관리(memberList.jsp)</h3>
<table class="table">
	<thead>
		<tr>
			<th scope="col">#</th>
			<th scope="col"><a href="memberList.do?order=${member_nm }">아이디</a></th>
			<th scope="col">비밀번호</th>
			<th scope="col">이름</th>
			<th scope="col">권한</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="member" items="${memberList }" varStatus="stat">
			<tr>
			<th scope="row">${stat.count }</th>
			<td>${member.memberId }</td>
			<td>${member.memberPw }</td>
			<td>${member.memberNm}</td>
			<td>${member.responsibility }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>