package com.bookstore.entity;

import java.util.Scanner;

import com.bookstore.controller.MemberManager;

public class Customer { // ��
	
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
			System.out.println("\n----------�α���-----------");
			System.out.println("�⺻ ���̵�: Hong, ��й�ȣ: 1111");
			System.out.print("���̵� : ");
			id= sc.nextLine();
			System.out.print("��й�ȣ : ");
			pwd = sc.nextLine();
			System.out.println("-------------------------");

			for (i = 0; i < mem_mng.members.size(); i++) { // ���̵�� ȸ�� Ȯ��
				if (id.equals(mem_mng.members.get(i).getId())) {
					check = true;
					temp=0;
					break;
				}
			}

			if (check != true) {
				System.out.println("-> ���̵� �������� �ʽ��ϴ�.\n");
				temp=1;
			} else {
				if (pwd.equals(mem_mng.members.get(i).getPwd())) {
					System.out.println("-> " + mem_mng.members.get(i).getName() + "���� �α����ϼ̽��ϴ�.\n");
					temp=1;
					break;
				} else {
					System.out.println("-> ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					temp=1;
				}
			}
			
			if(temp==1){
				System.out.println("��� �Ͻðڽ��ϱ�? (y/n)");
				ok=sc.nextLine();
				if(ok.equals("n"))
					return null;
					
			}
		}
		return mem_mng.members.get(i).getId();
	}

	public void join(){
		MemberManager mem_mng=new MemberManager();
		System.out.println("\n----------ȸ������-----------");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̵� : ");
		String id=sc.nextLine();
		System.out.print("��й�ȣ : ");
		String pwd=sc.nextLine();
		System.out.print("�̸� : ");
		String name=sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String tel=sc.nextLine();
		System.out.print("�̸��� : ");
		String email=sc.nextLine();
		System.out.print("�ּ� : ");
		String addr=sc.nextLine();
		System.out.println("----------------------------");
		
		Member mem=new Member(id,pwd,name,tel,email,addr);
		
		mem_mng.add(mem);
	}

}
