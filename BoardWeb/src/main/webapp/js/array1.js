/**
 * array1.js
 */

//수정 버튼에 클릭 이벤트 추가.
document.getElementById('modBtn').addEventListener('click', function(e) {
	//화면상에  있는 tr을 대상으로 변경을 해야함.
	document.querySelectorAll('#list tr').forEach(function(tr) {
		//tr의 첫번째 자식요소의 innerHTML : 이름. 비교 fname의 value 같을때
		//faddress,height의 value를 tr의 두번째, 세번째 자식요소의 innerHTML에 대입.
		if (tr.children[0].innerHTML == document.querySelector('#fname').value) {
			tr.children[1].innerHTML == document.querySelector('#faddress').value;
			tr.children[2].innerHTML == document.querySelector('#height').value;

		}
	})

});


//등록 버튼에 클릭 이벤트 추가.
document.getElementById('addBtn').addEventListener('click', function(e) {
	let name = document.getElementById('fname').value;
	let address = document.getElementById('faddress').value;
	let height = document.getElementById('height').value;

	if (!name || !address || !height) {
		alert('값을 입력하세요');
		return;
	}

	let friend = { name, address, height }

	console.log(name);

	//tr만드는 부분.
	let tr = makeTr(friend);
	list.appendChild(tr);

	alert('OK');
	fname.value = '';
	faddress.value = '';
	document.getElementById('height').value = '';

})

const friends = [
	{ name: "김감치", address: "대구 수성구", height: 167 },
	{ name: "김삼치", address: "대구 중구", height: 183 },
	{ name: "김사치", address: "대구 동구", height: 178 }
]
makeList();
function makeList() {
	//<tr><td>값1</td><td>값2</td><td>값3</td><td><button>삭제</button></td></tr>
	friends.forEach(function(friend) {
		let tr = makeTr(friend);
		document.getElementById('list').appendChild(tr);
	});
}

//friend =>tr 생성
function makeTr(friend = { name: 'Kim', address: 'Seoul', height: 170 }) {
	function detailCallback(e) {
		//let tr = e.target.parentElement.parentElement;
		document.getElementById('fname').value = tr.children[0].innerHTML;
		document.getElementById('faddress').value = tr.children[1].innerHTML;
		document.getElementById('height').value = tr.children[2].innerHTML;
	}//end of detailCallback

	//tr만드는 부분.
	// 버튼 누르면 이벤트 활성화 추가.
	let tr = document.createElement('tr');
	tr.addEventListener('click', detailCallback);
	//tr.addEventListener('mouseover',detailCallback);
	for (let prop in friend) {
		let td = document.createElement('td');
		td.innerHTML = friend[prop]
		tr.appendChild(td);
	}
	//삭제버튼
	let td = document.createElement('td')
	let btn = document.createElement('button')
	btn.setAttribute('class', 'btn btn-danger');// <button class = "btn btn-danger">삭제</button>
	btn.addEventListener('click', function(e) {
		console.log(e);
		e.target.parentElement.parentElement.remove();
	})
	btn.innerHTML = '삭제';
	td.appendChild(btn);
	tr.appendChild(td);
	
	//체크박스
	td=document.createElement('td')
	let input = document.createElement('input')
	input.setAttribute('type', 'checkbox'); 
	td.appendChild(input);
	tr.appendChild(td)
	
	return tr;

}
