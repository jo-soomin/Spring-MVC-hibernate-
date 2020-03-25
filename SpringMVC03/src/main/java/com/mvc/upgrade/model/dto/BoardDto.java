package com.mvc.upgrade.model.dto;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

public class BoardDto {
	private int myno;
	
	@NotEmpty(message = "이름 필수 입력 입니다.")
	private String myname;
	
	@NotEmpty(message = "제목 필수 입력 입니다.")
	private String mytitle;
	
	@NotEmpty(message = "내용 필수 입력 입니다.")
	private String mycontent;
	
	private Date mydate;
	
	public BoardDto() {
		
	}
	
	

	public BoardDto(String myname, String mytitle, String mycontent) {
		this.myname = myname;
		this.mytitle = mytitle;
		this.mycontent = mycontent;
	}


	public BoardDto(int myno, String myname, String mytitle, String mycontent, Date mydate) {
		this.myno = myno;
		this.myname = myname;
		this.mytitle = mytitle;
		this.mycontent = mycontent;
		this.mydate = mydate;
	}

	public int getMyno() {
		return myno;
	}

	public void setMyno(int myno) {
		this.myno = myno;
	}

	public String getMyname() {
		return myname;
	}

	public void setMyname(String myname) {
		this.myname = myname;
	}

	public String getMytitle() {
		return mytitle;
	}

	public void setMytitle(String mytitle) {
		this.mytitle = mytitle;
	}

	public String getMycontent() {
		return mycontent;
	}

	public void setMycontent(String mycontent) {
		this.mycontent = mycontent;
	}

	public Date getMydate() {
		return mydate;
	}

	public void setMydate(Date mydate) {
		this.mydate = mydate;
	}
	
	

}
