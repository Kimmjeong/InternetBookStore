package com.bookstore.controller;

import java.util.ArrayList;

import com.bookstore.entity.Member;

public class MemberManager implements IManager {

	static public ArrayList<Member> members;

	public void init() {
		members = new ArrayList<>();
		members.add(new Member("Hong", "1111", "ȫ�浿", "010-1111-2222", "hong@naver.com", "����"));
		members.add(new Member("Kim", "1111", "��ö��", "010-2222-3333", "kim@naver.com", "�뱸"));
		members.add(new Member("Park", "1111", "�ڿ���", "010-3333-4444", "park@daum.net", "�λ�"));
		members.add(new Member("Yoon", "2222", "������", "070-9999-9889", "yoon@daum.net", "����"));
	}

	@Override
	public void add(Object obj) {
		members.add((Member) obj);
	}

	@Override
	public void delete(Object obj) {
		System.out.println("ȸ�� ����");
	}

	@Override
	public void search() {
		System.out.println("---------------------- ȸ�� ��� --------------------------");

		System.out.println("���̵�\t�̸�\t��ȭ��ȣ\t\t�̸���\t\t�ּ�");
		System.out.println("=======================================================");
		for (int i = 0; i < members.size(); i++) {
			System.out.printf("%s\t%s\t%s\t%s\t%s\n", members.get(i).getId(), members.get(i).getName(), members.get(i).getTel(), members.get(i).getEmail(), members.get(i).getAddr());
		}

		System.out.println("-------------------------------------------------------");
	}

	// ȸ�� ���� ��ȸ
	public void search(Member mem) {

		System.out.println("���̵�: " + mem.getId());
		System.out.println("�̸�: " + mem.getName());
		System.out.println("��ȭ��ȣ: " + mem.getTel());
		System.out.println("�̸���: " + mem.getEmail());
		System.out.println("�ּ�: " + mem.getAddr());
	}

	// ȸ�� ���� ����
	public void memInfoUpdate(Member member) {
		System.out.println("ȸ�� ���� ����");
	}

	// ����Ʈ ��ȸ
	public void pointCheck(Member member) {

		System.out.println("���� ���� ����Ʈ : " + member.getPoint());
	}

	// ��� ��Ȳ ��ȸ
	public void deliveryState() {
		System.out.println("��� ��Ȳ ��ȸ");
	}
}
