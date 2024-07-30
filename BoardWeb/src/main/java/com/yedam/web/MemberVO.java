package com.yedam.web;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberVO implements Serializable{
	private int memberNo;
	private String memberName;
	private int point;
	

}
