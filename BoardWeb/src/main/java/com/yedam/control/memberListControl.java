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

		String orderBy = req.getParameter("order");
		orderBy = orderBy == null ? "member_nm" : orderBy ;
		req.setAttribute("member_nm", orderBy);

		String res = req.getParameter("res");
		res = res == null ? "User" : res ;
		
		MemberService mvc = new MemberServiceImpl();
		List<MemberVO> list = mvc.memberList(res,orderBy);
		req.setAttribute("memberList", list);

		req.getRequestDispatcher("admin/memberList.tiles").forward(req, resp);
	}

}