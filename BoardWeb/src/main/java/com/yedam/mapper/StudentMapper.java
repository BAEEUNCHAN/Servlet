package com.yedam.mapper;

import java.util.List;

import com.yedam.vo.StudentVO;

public interface StudentMapper {
	List<StudentVO> studentList();
	//insert, update, delete => 변경 처리된 건수 반환값으로 지정.
	int insetStudent(StudentVO svo);
	int updateStudent(StudentVO svo); // 학생번호기준 -> 연락처 변경
	int deleteStudent(StudentVO svo);
	StudentVO selectOne(String sno);
	
	

}
