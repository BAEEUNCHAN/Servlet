package com.yedam.common;

import com.yedam.service.BoardService;
import com.yedam.service.BoardServiceImpl;

public class Apptest {
	public static void main(String[] args) {
		BoardService svc = new BoardServiceImpl();
//		svc.boardlist().forEach(brd ->System.out.println(brd)); 아래랑 같은 의미
		svc.boardlist().forEach(System.out::println);
	
		System.out.println("끝");
	}
}
