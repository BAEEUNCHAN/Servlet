package com.yedam.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;
import com.yedam.common.PageDTO;
import com.yedam.common.SearchVO;
import com.yedam.service.BoardService;
import com.yedam.service.BoardServiceImpl;
import com.yedam.vo.BoardVO;

public class BoardListControl implements Control {
	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String page = req.getParameter("page");
		page = page == null ? "1" : page;
		String sc = req.getParameter("searchCondition");
		String kw = req.getParameter("keyword");
		SearchVO search = new SearchVO();
		search.setKeyword(kw);
		search.setPage(Integer.parseInt(page));
		search.setSearchCondition(sc);
		
		req.setAttribute("myName", "김감치");
		BoardService svc = new BoardServiceImpl();
		List<BoardVO> list =svc.boardlist(search); // 서비스 - 매퍼 
		req.setAttribute("boardList", list);
		
		//paging
		int totalCnt = svc.totalCount(search);
		PageDTO pageDTO = new PageDTO(Integer.parseInt(page),totalCnt);
		req.setAttribute("paging", pageDTO);
		
		req.setAttribute("page1", search);
		
		req.getRequestDispatcher("board/boardList.tiles")//
				.forward(req, resp); // 페이지 재지정.

	}
}
