/**
 * removeText.jsp
 */

//버튼 누르면 내용 체인지 이벤트 발생

document.querySelector('body>input input [type="text"]')//
	.addEventListener('change', changeFnc)

function changeFnc(e) {
	console.log(e.target.checked)
	console.log(document.querySelectorAll('body>input input [type="text"]').length)
	document.querySelectorAll('body>input input [type="text"]')
		.forEach(function(item) {
			item.checked = e.target.checked

		})
}// changeFnc 끝.