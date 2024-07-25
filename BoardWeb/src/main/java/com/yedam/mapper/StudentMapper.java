package com.yedam.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.vo.MemberVO;
import com.yedam.vo.StudentVO;

public interface StudentMapper {
	List<StudentVO> studentList();

	// insert, update, delete => 변경 처리된 건수 반환값으로 지정.
	int insetStudent(StudentVO svo);

	int updateStudent(StudentVO svo); // 학생번호기준 -> 연락처 변경

	int deleteStudent(String stdNo);

	StudentVO selectOne(String sno);

	// 로그인체크.
	MemberVO selectMember(@Param("id") String id, @Param("pw") String pw);

	// 회원목록 확인(관리자)
	List<MemberVO> memberList(@Param("mem") String mem, @Param("order") String orderBy);

}
