<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 요기는 html/index.jsp -->
<h3>practice</h3>

<div id="student">
	<table class="table">
		<tr>
			<th>학생번호</th>
			<td><input type="text" class="form-control" id="sno"></td>
		</tr>
		<tr>
			<th>이름</th>
			<td><input type="text" class="form-control" id="sname"></td>
		</tr>
		<tr>
			<th>연락처</th>
			<td><input type="text" class="form-control" id="phone"></td>
		</tr>

		<tr>
			<td colspan="2" align="center">
				<button id="addBtn" class="btn btn-primary">등록</button>
			</td>
		</tr>
	</table>
	
	<hr />
	<table class="table">
		<thead>
			<tr>
				<th>학생번호</th>
				<th>이름</th>
				<th>주소</th>
				<th>연락처</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody id="stdList">
		</tbody>
	</table>
</div>

<div id="show">
	<select class="form-control" id="searchGender">
		<option value="All">선택하세요</option>
		<option value="Female">여성</option>
		<option value="Male">남성</option>

	</select>
	<table class="table">
		<thead>
			<tr>
				<th>사원번호</th>
				<th>이름</th>
				<th>성</th>
				<th>급여</th>
		<tbody id="empList"></tbody>
		<!-- 사원번호 fname,lname,salary -->
	</table>
</div>
<div>
	<table class="table">
		<tr>
			<th>이름</th>
			<td><input type="text" class="form-control" id="fname"></td>
		</tr>
		<tr>
			<th>주소</th>
			<td><input type="text" class="form-control" id="faddress"></td>
		</tr>
		<tr>
			<th>신장</th>
			<td><input type="text" class="form-control" id="height"></td>
		</tr>

		<tr>
			<td colspan="2" align="center">
				<button id="addBtn" class="btn btn-primary">등록</button>
				<button id="modBtn" class="btn btn-secondary">수정</button>
				<button id="delBtn" class="btn btn-wq">삭제</button> <!--  <button id="checkbox" class="btn btn-secondary">체크</button>-->
		</tr>

	</table>
</div>
<table class="table table-hover">
	<thead>
		<tr>
			<th>친구이름</th>
			<th>주소</th>
			<th>신장</th>
			<th>삭제</th>
			<th><input type="checkbox" class="btn btn-secondary"></th>
		</tr>
	</thead>
	<tbody id="list">
		<tr>
			<!--  <td>값1</td>
			<td>값2</td>
			<td>값3</td>-->
		</tr>
	</tbody>
</table>


<script src=js/json4.js></script>