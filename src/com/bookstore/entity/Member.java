package com.bookstore.entity;

public class Member extends Customer{ // È¸¿ø
	
	private String id;
	private String pwd;
	private int point;

	public Member(String id, String pwd, String name, String tel, String email, String addr){
		super(name, tel, email, addr);
		this.id=id;
		this.pwd=pwd;
		this.point=0;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	
	

}
