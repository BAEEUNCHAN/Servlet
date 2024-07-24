<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h3>회원목록관리(memberList.jsp)</h3>
<ul class="nav nav-underline">
<c:choose>
<c:when test="${res == Admin}">
  <li class="nav-item">
    <a class="nav-link active" aria-current="page" href="memberList.do?order=member_nm&res=Admin">관리자</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="memberList.do?order=member_nm&res=User">사용자</a>
  </li>
</c:when>
</c:choose>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">아이디</th>
				<th scope="col">비밀번호</th>
				<th scope="col"><a
					href="memberList.do?order=member_nm">이름</a></th>
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