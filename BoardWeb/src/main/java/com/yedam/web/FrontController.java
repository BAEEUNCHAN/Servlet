package com.yedam.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;
import com.yedam.control.ActionControl;
import com.yedam.control.AddboardControl;
import com.yedam.control.BoardListControl;
import com.yedam.control.LogoutControl;
import com.yedam.control.ScriptControl;
import com.yedam.control.StudentListControl;
import com.yedam.control.loginControl;
import com.yedam.control.memberListControl;

/*
 * FrontController 역할은 사용자의 모든 요청을 처리
 * 서블릿.a.do, sample.do
 * 객체 생성 -> init -> service ->destroy.
 */
public class FrontController extends HttpServlet {
	Map<String, Control> map;

	public FrontController() {
		map = new HashMap<>();

	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		map.put("/boardList.do", new BoardListControl());
		// 글등록 구현: 등록화면(boardForm) + DB등록(addboard.do) -> 글목록페이지이동.
		map.put("/boardForm.do", new BoardForm());
		map.put("/addBoard.do", new AddboardControl());
		// 학생목록
		map.put("/stdList.do", new StudentListControl());
		// 글 상세내역
		map.put("/board.do", new Board());
		// 글 삭제기능
		map.put("/removeForm.do", new removeBoard());
		map.put("/deleteBoard.do", new DeleteBoard());
		// 글 수정기능
		map.put("/modifyBoard.do", new modifyBoard());
		map.put("/updateBoard.do", new UpdateBoard());
		// 태그연습
		map.put("/action.do", new ActionControl());
		// 로그인
		map.put("/loginForm.do", new loginForm());
		map.put("/login.do", new loginControl());
		// 로그아웃
		map.put("/logout.do", new LogoutControl());
		//관리자가 사용하는 기능들..ex)회원목록
		map.put("/memberList.do", new memberListControl());
		//자바스크립트 연습하는 페이지 호출
		map.put("/javascript.do", new ScriptControl());
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// boardList.do - 목록.addBoard.do - 등록.
		String uri = req.getRequestURI(); // URL(http://localhost/BoardWeb/boardList.do) vs URI (BoardWeb/boardList.do)
		String context = req.getContextPath(); // 프로젝트 명.
		String path = uri.substring(context.length()); // "/boardList.do"

		System.out.println(path);
		Control sub = map.get(path);
		sub.exec(req, resp);

	}
}
