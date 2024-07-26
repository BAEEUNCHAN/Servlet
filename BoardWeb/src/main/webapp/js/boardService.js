/**
 * boardService
 * 목록,등록,삭제 기능을 정의
 */
const svc = {
	//목록.
	replyList (param = {bno,page}, loadCallback) {
		const xhtp = new XMLHttpRequest();
		xhtp.open('get', 'replyList.do?bno=' +param.bno+'&page='+param.page);
		xhtp.send();
		xhtp.onload = loadCallback
		//function 끝
	}, // replyList 끝 
	//등록.
	addReply(param = { bno, replyer, content }, loadCallback) {
		const xhtp = new XMLHttpRequest();
		xhtp.open('get', 'addReply.do?bno=' + param.bno + '&content=' + param.content + '&replyer=' + param.replyer);
		xhtp.send();
		xhtp.onload = loadCallback
	}, //addReply 끝
	//삭제
	delReply(rno = 1, loadCallback) {
		const xhtp = new XMLHttpRequest();
		xhtp.open('get', 'removeReply.do?rvo=' + rno);
		xhtp.send();
		xhtp.onload = loadCallback

	}

} // svc 끝