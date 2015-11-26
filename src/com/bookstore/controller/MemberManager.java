package com.bookstore.controller;

import java.util.ArrayList;

import com.bookstore.entity.Member;

public class MemberManager implements IManager {

	static public ArrayList<Member> members;

	public void init() {
		members = new ArrayList<>();
		members.add(new Member("Hong", "1111", "홍길동", "010-1111-2222", "hong@naver.com", "서울"));
		members.add(new Member("Kim", "1111", "김철수", "010-2222-3333", "kim@naver.com", "대구"));
		members.add(new Member("Park", "1111", "박영희", "010-3333-4444", "park@daum.net", "부산"));
		members.add(new Member("Yoon", "2222", "윤동주", "070-9999-9889", "yoon@daum.net", "서울"));
	}

	@Override
	public void add(Object obj) {
		members.add((Member) obj);
	}

	@Override
	public void delete(Object obj) {
		System.out.println("회원 삭제");
	}

	@Override
	public void search() {
		System.out.println("---------------------- 회원 목록 --------------------------");

		System.out.println("아이디\t이름\t전화번호\t\t이메일\t\t주소");
		System.out.println("=======================================================");
		for (int i = 0; i < members.size(); i++) {
			System.out.printf("%s\t%s\t%s\t%s\t%s\n", members.get(i).getId(), members.get(i).getName(), members.get(i).getTel(), members.get(i).getEmail(), members.get(i).getAddr());
		}

		System.out.println("-------------------------------------------------------");
	}

	// 회원 정보 조회
	public void search(Member mem) {

		System.out.println("아이디: " + mem.getId());
		System.out.println("이름: " + mem.getName());
		System.out.println("전화번호: " + mem.getTel());
		System.out.println("이메일: " + mem.getEmail());
		System.out.println("주소: " + mem.getAddr());
	}

	// 회원 정보 수정
	public void memInfoUpdate(Member member) {
		System.out.println("회원 정보 수정");
	}

	// 포인트 조회
	public void pointCheck(Member member) {

		System.out.println("현재 보유 포인트 : " + member.getPoint());
	}

	// 배송 현황 조회
	public void deliveryState() {
		System.out.println("배송 현황 조회");
	}
}
