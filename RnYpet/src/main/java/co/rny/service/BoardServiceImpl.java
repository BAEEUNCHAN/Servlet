package co.rny.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.rny.common.DataSource;
import co.rny.mapper.BoardMapper;
import co.rny.vo.BoardVO;

public class BoardServiceImpl implements BoardService {
	SqlSession sqlSession = //
			DataSource.getInstance().openSession(true);
	BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);

	@Override
	public List<BoardVO> boardList() {
		return mapper.boardList();
	}
}
