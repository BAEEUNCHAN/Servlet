<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <style>
    #show {
      background: yellow;
      width: 400px;
      height: 205px;
    }

    #show span {
      display: inline-block;
      width: 90px;
      border: 1px solid green;
      background: pink;
      margin: 1px;
    }
  </style>
</head>

<body>
  <input type="text" id="keyword">
  <br>
  <div id="show">
    <span>Lorem</span>
    <span>ipsum</span>
    <span>dolor</span>
    <span>sit,</span>
    <span>amet</span>
    <span>consectetur</span>
    <span>adipisicing</span>
    <span>elit.</span>
    <span>Maxime,</span>
    <span>dicta</span>
    <span>officia</span>
    <span>similique</span>
    <span>ratione</span>
    <span>id</span>
    <span>labore</span>
    <span>tempora</span>
    <span>iure</span>
    <span>harum</span>
    <span>provident,</span>
    <span>deleniti</span>
    <span>odio</span>
    <span>esse</span>
    <span>officiis</span>
    <span>illo</span>
    <span>eos</span>
    <span>illum</span>
    <span>quae</span>
    <span>veritatis</span>
    <span>vero</span>
    <span>doloribus.</span>
  </div>
  <br>

  <script>
//버튼 누르면 내용 체인지 이벤트 발생
  document.querySelector("#keyword")//
  	.addEventListener('change', changeFnc)

  function changeFnc(e) {
  	document.querySelectorAll("#keyword")
  		.forEach(function(span) {
  			console.log(span);
  			//span.innerHTML = 
  		})
  }// changeFnc 끝.
  </script>
</body>

</html>