package com.yedam.service;

import java.util.List;

import com.yedam.vo.MemberVO;
import com.yedam.vo.StudentVO;

public interface MemberService {
	MemberVO loginCheck(String id, String pw);
	List<MemberVO> memberList(String mem, String orderBy);
	//학생목록을 가져오는 메소드 생성.
	List<StudentVO> studentList();
	boolean removeStudent(String sno);
	boolean addStudent(StudentVO svo);

}
