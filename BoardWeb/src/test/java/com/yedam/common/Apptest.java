package com.yedam.common;

import com.yedam.service.MemberService;
import com.yedam.service.MemberServiceImpl;

public class Apptest {
	public static void main(String[] args) {
MemberService svc = new MemberServiceImpl();
svc.memberList("Admin", "member_nm").forEach(System.out::println);
	
		System.out.println("끝");
	}
}
