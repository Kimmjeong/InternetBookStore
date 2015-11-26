package com.bookstore.entity;

import java.util.Scanner;

import com.bookstore.controller.MemberManager;

public class Customer { // 고객
	
	Scanner sc=new Scanner(System.in);
	
	MemberManager mem_mng=new MemberManager();
	
	private int customNum=1;
	private String name;
	private String tel;
	private String email;
	private String addr;
		
	public Customer(){};
	
	public Customer(String name, String tel, String email, String addr){
		customNum++;
		this.name = name;
		this.tel = tel;
		this.email = email;
		this.addr = addr;
	}
	
	

	public int getCustomNum() {
		return customNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String login() {

		boolean check = false;
		String id;
		String pwd;
		int i;
		int temp=0;
		String ok;
		
		while (true) {
			System.out.println("\n----------로그인-----------");
			System.out.println("기본 아이디: Hong, 비밀번호: 1111");
			System.out.print("아이디 : ");
			id= sc.nextLine();
			System.out.print("비밀번호 : ");
			pwd = sc.nextLine();
			System.out.println("-------------------------");

			for (i = 0; i < mem_mng.members.size(); i++) { // 아이디로 회원 확인
				if (id.equals(mem_mng.members.get(i).getId())) {
					check = true;
					temp=0;
					break;
				}
			}

			if (check != true) {
				System.out.println("-> 아이디가 존재하지 않습니다.\n");
				temp=1;
			} else {
				if (pwd.equals(mem_mng.members.get(i).getPwd())) {
					System.out.println("-> " + mem_mng.members.get(i).getName() + "님이 로그인하셨습니다.\n");
					temp=1;
					break;
				} else {
					System.out.println("-> 비밀번호가 일치하지 않습니다.");
					temp=1;
				}
			}
			
			if(temp==1){
				System.out.println("계속 하시겠습니까? (y/n)");
				ok=sc.nextLine();
				if(ok.equals("n"))
					return null;
					
			}
		}
		return mem_mng.members.get(i).getId();
	}

	public void join(){
		MemberManager mem_mng=new MemberManager();
		System.out.println("\n----------회원가입-----------");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id=sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd=sc.nextLine();
		System.out.print("이름 : ");
		String name=sc.nextLine();
		System.out.print("전화번호 : ");
		String tel=sc.nextLine();
		System.out.print("이메일 : ");
		String email=sc.nextLine();
		System.out.print("주소 : ");
		String addr=sc.nextLine();
		System.out.println("----------------------------");
		
		Member mem=new Member(id,pwd,name,tel,email,addr);
		
		mem_mng.add(mem);
	}

}
