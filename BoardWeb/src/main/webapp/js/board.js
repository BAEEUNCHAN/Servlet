/**
 * board.js
 */
console.log("아무메세지" + bno);
let page = 1; // 아래쪽에서 댓글의 페이지를 지정.

//댓글 등록 버튼에 클릭 이벤트 등록.
document.getElementById('addReply').addEventListener('click', function() {

	let content = document.getElementById('content').value
	if (!replyer || !content) {
		alert('필수입력 항목을 확인하세요')
		return
	}
	let replyer = 'user01';
	let parm = { bno, replyer, content }
	console.log('ffffffff', parm)
	svc.addReply(parm, function() {
		//등록완료 => 화면에 등록된 글 추가
		console.log(this.responseText);
	});
});
//댓글 목록 출력
svc.replyList({ bno, page }, function() {
	let result = JSON.parse(this.response);
	result.forEach(reply => {
		replyList.appendChild(makeRow(reply));

	});
});

//reply => row 생성.
function makeRow(reply = {}) {
	console.log(reply);
	let cloned = document.querySelector('div.reply>div.content li').cloneNode(true);
	cloned.setAttribute('data-rno', reply.replyNo);
	cloned.style.display = 'block'; //<li style={}></li>
	cloned.querySelector('span:nth-of-type(1)').innerText = reply.replyNo;
	cloned.querySelector('span:nth-of-type(2)').innerText = reply.replyContent;
	cloned.querySelector('span:nth-of-type(3)').innerText = reply.replyer;
	cloned.querySelector('span>button').addEventListener('click', deleteReplyFnc)
	return cloned;
}

//댓글 삭제 이벤트 핸들러
function deleteReplyFnc(e) {
	let rno = e.target.parentElement.parentElement.dataset.rno;
	svc.delReply(rno, function(e) {
		let result = JSON.parse(this.response);
		if (result.retCode == 'Success') {
			alert('삭제완료');
			document.querySelector('li[data-rno="' + rno + '"]').remove();
		} else {
			alert('삭제실패');
		}
	})
}
//paging 영역의 a 태그를 클릭하면
document.querySelectorAll('div.reply ul.pagination a').forEach(item => {
	item.addEventListener('click', function(e) {
		page = item.innerHTML;
		svc.replyList({ bno, page }, function() {
			// 기존 목록을 삭제
			replyList.querySelectorAll('li').forEach((li, idx) => {
				if (idx != 0) {
					li.remove();
				}
			let result = JSON.parse(this.response);
			result.forEach(reply => {
				replyList.appendChild(makeRow(reply));
			})

			});
		});

	});
});
