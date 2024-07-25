/**
 * json2.js
 */
document.querySelector('#show').remove();
document.querySelector('div.container-fluid>div:nth-of-type(2)').remove();
document.querySelector('div.container-fluid>table').remove();
// 등록이벤트.
document.querySelector('#addBtn').addEventListener('click', addRowFnc);
function addRowFnc(e) {
	let sno = document.querySelector('#sno').value
	let sname = document.querySelector('#sname').value
	let phone = document.querySelector('#phone').value

	let addHtp = new XMLHttpRequest();
	addHtp.open('get', 'addStudent.do?sno=' + sno + '&sname=' + sname + '&phone=' + phone)
	addHtp.send();
	addHtp.onload = function(e) {
		console.log(addHtp.response);
		let result = JSON.parse(addHtp.response);
		if (result.retCode == 'Success') {
			let tr = makeRow(result.retVal)
			document.getElementById('stdList').appendChild(tr);

		}
	}
}




// Asynchronous Javascript And Xml (AJAX)

let students
let xhtp = new XMLHttpRequest();
xhtp.open('get', 'studentJson.do');// 특정 페이지 요청
xhtp.send();
xhtp.onload = function(e) {
	console.log(xhtp.response)

	let json = xhtp.response;

	students = JSON.parse(json);
	console.log(students);
	initList();

}


//document.querySelector('#searchGender').addEventListener('change', function(e) {
//initList();

//})
function initList() {
	let target = document.getElementById('stdList');
	target.innerHTML = '';
	students.forEach(emp => {
		target.appendChild(makeRow(emp));

	})
};


// 사원정보 => row 생성
function makeRow(emp = {}) {
	let fields = ['stdNo', 'stdName', 'address', 'stdPhone'];
	console.log(fields);
	let tr = document.createElement('tr');
	tr.setAttribute('data-sno', emp.stdNo);
	fields.forEach(field => {
		let td = document.createElement('td');
		td.innerHTML = emp[field];
		tr.appendChild(td)
	})
	//삭제버튼
	let td = document.createElement('td')
	let btn = document.createElement('button')
	btn.setAttribute('class', 'btn btn-danger');// <button class = "btn btn-danger">삭제</button>
	btn.addEventListener('click', deleteRowFnc);
	btn.innerHTML = '삭제';
	td.appendChild(btn);
	tr.appendChild(td);

	return tr;
}
function deleteRowFnc(e) {
	console.log(e.target.parentElement.parentElement.firstChild.innerText);
	let sno = e.target.parentElement.parentElement.firstChild.innerText;
	sno = e.target.parentElement.parentElement.dataset.sno;         //getAttribute("data-sno")
	const delHtp = new XMLHttpRequest();
	delHtp.open('get', 'removeStudent.do?sno=' + sno);
	delHtp.send();
	delHtp.onload = function() {
		let result = JSON.parse(delHtp.responseText); // {"retCode":"Success"}
		if (result.retCode == 'Success') {
			alert("성공!");
			console.log(e.target.parentElement.parentElment)
		} else if (result.retCode == 'Fail') {
			alert("관리자에게 문의하세요.")

		}
	}
}
