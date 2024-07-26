package com.yedam.mapper;

import java.util.List;

import com.yedam.common.SearchVO;
import com.yedam.vo.ReplyVO;

public interface ReplyMapper {
List<ReplyVO>selectList(int boardNo);//댓글 조회
List<ReplyVO>selectListPaging(SearchVO search); //원본 글 번호, 
int insertReply(ReplyVO rvo); // 댓글 등록
boolean deleteReply(int replyNo); //댓글 삭제
}
