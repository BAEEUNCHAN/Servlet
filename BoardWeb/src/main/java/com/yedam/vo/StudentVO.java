package com.yedam.vo;

import lombok.Data;

@Data
public class StudentVO {
	private String stdNo; // std_no
	private String stdName;
	private String stdPhone;
	private String address;
	private String BirthDate; // 1999-01-01
	private String creationDate;

	public String briefShow() {

		return stdNo + " " + stdName + " " + stdPhone;
	}
}