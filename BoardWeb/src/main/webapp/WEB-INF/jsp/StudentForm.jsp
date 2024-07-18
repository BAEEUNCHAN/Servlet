<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>studentForm.jsp</title>
</head>
<body>
<h3>감치정보등록화면</h3>
<!--JSP/STUDENTform.jsp-->
<form action="../StudentAddServ">
<table border="2">
<tr>
     <th>감치번호</th>
     <td><input type="text" name="sno" id="" name:=""></td>
</tr>
<tr>
    <th>이름</th>
    <td><input type="text" name="sname" id="" name:=""></td>
</tr>
<tr>
    <th>연락처</th>
    <td><input type="text" name="sphone" id="" name:=""></td>
</tr>
<tr>
    <th>생년월일</th>
    <td><input type="date" name="sbirth" id="" name:=""></td>
</tr>
<tr>
    <td colspan="2" align="center">
        <button type="submit">저장</button>
    </td>
</tr>
</table>
</form>
</body>
</html>