package com.yedam.service;

import java.util.List;

import com.yedam.vo.BoardVO;

/*
 * MVC 패턴의 디자인에 따라서 Model영역(service(업무로직),dao:mapper).
 * 책: 4강 MVC기반 웹프로젝트참고\
 * 숙제:536p MVC에 대해서 자세히 읽고 오세요.
 */

public interface BoardService {
	List<BoardVO> boardlist();
	boolean addBoard(BoardVO board);
	boolean modifyBoard(BoardVO board);
	boolean removeBoard(int boardNo);
	BoardVO getBoard(int boardNo);
	
	
}
