package co.rny.common;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.rny.service.BoardService;
import co.rny.service.BoardServiceImpl;
import co.rny.vo.BoardVO;

public class BoardListControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	BoardService bvc = new BoardServiceImpl();
	List<BoardVO> list = bvc.boardList();
	req.setAttribute("boardList", list);
	
	req.getRequestDispatcher("board/boardList.tiles")//
	.forward(req, resp); // 페이지 재지정.
	
		

	
	}

}
