package com.yedam.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;
import com.yedam.service.MemberService;
import com.yedam.service.MemberServiceImpl;
import com.yedam.vo.MemberVO;

public class memberListControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		String id = req.getParameter("MemberId");
//		String pw = req.getParameter("MemberPw");
		String nm = req.getParameter("member_nm");
//		String rs = req.getParameter("Responsibility");
//		
		MemberVO mem = new MemberVO();
//		
//		mem.setMemberId(id);
//		mem.setMemberPw(pw);
		mem.setMemberNm(nm);
//		mem.setResponsibility(rs);
		
		MemberService mvc = new MemberServiceImpl();
		List<MemberVO> list =mvc.memberList("User");
		req.setAttribute("memberList", list);
//		List<MemberVO> list1 =mvc.memberList("User");
		req.setAttribute("member_nm", nm);
		req.getRequestDispatcher("admin/memberList.tiles").forward(req, resp);
	}

}