
// UI 화면 입니다.
package com.booksotre.ui;

import java.util.Scanner;

import com.bookstore.controller.BookManager;
import com.bookstore.controller.CartManager;
import com.bookstore.controller.MemberManager;
import com.bookstore.controller.OrderManager;
import com.bookstore.entity.Book;
import com.bookstore.entity.Customer;
import com.bookstore.entity.Member;
import com.bookstore.main.InternetBookStore;

public class BookStoreUI {

	static public String logid = null;
	
	Scanner sc = new Scanner(System.in);
	
	BookManager book_mng=new BookManager();
	MemberManager mem_mng=new MemberManager();
	OrderManager ord_mng=new OrderManager();
	CartManager c_mng=new CartManager();

	// 메인메뉴 선택하기
	public int mainMenuSelect() {

		int select;

		System.out.println();
		System.out.println("[Main Service]");
		System.out.println("*************************");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 마이페이지");
		System.out.println("4. 검색");
		System.out.println("5. 전체 도서 보기");
		System.out.println("6. 주문");
		System.out.println("7. 관리자모드");
		System.out.println("0. 나가기");
		System.out.println("*************************");
		System.out.println("이용할 서비스를 선택해주십시오.");
		System.out.printf("-> ");

		while (true) {
			select = sc.nextInt();
			if (select >= 0 && select <= 7) {
				return select;
			} else
				System.out.println("다시 입력해주세요.");
		}
	}
	
	// 관리자메뉴 선택하기
	public int adminMenuSelect() {

		int select;

		System.out.println();
		System.out.println("[Admin Service]");
		System.out.println("*************************");
		System.out.println("1. 도서 등록");
		System.out.println("2. 재고 추가");
		System.out.println("3. 재고 확인");
		System.out.println("4. 매출 확인");
		System.out.println("5. 전체 회원 보기");
		System.out.println("0. 나가기");
		System.out.println("*************************");
		System.out.println("이용할 서비스를 선택해주십시오.");
		System.out.printf("-> ");

		while (true) {
			select = sc.nextInt();
			if (select >= 0 && select <= 5) {
				return select;
			} else
				System.out.println("다시 입력해주세요.");
		}
	}

	// 관리자 메뉴
	public void adminMenu(int select) {

		BookManager book_mng=new BookManager();
		
		switch (select) {
		case 1: //
			System.out.println("\n----------도서 등록-----------");
			Book book = null;
			Scanner sc = new Scanner(System.in);
			
			System.out.print("도서번호 : ");
			int isbn=sc.nextInt();
			System.out.print("도서명 : ");
			String title=sc.next();
			System.out.print("저자 : ");
			String author=sc.next();
			System.out.print("출판사 : ");
			String publisher=sc.next();
			System.out.print("가격 : ");
			int price=sc.nextInt();
			System.out.print("재고량: ");
			int stock=sc.nextInt();
			
			book=new Book(isbn, title, author, publisher, price,stock); // 도서 정보 등록
			
			book_mng.add(book);
			System.out.println("----------------------------");
			break;
		case 2:
			System.out.println("\n----------재고 추가-----------");
			System.out.println("----------------------------");
			break;
		case 3:
			System.out.println("재고량 확인");
			break;
		case 4:
			System.out.println("매출 확인");
			break;
		case 5:
			mem_mng.search();
			break;
		case 0: // 나가기
			System.out.println();
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
			break;
		default:
			System.out.println();
			System.out.println("올바르지 않은 입력입니다.");
			break;
		}

	}

	// 마이페이지 : 회원 메뉴 선택하기
	public void mypage() {

		int select;

		Member mem = null;
		int i;
		for (i = 0; i < mem_mng.members.size(); i++) { // 아이디로 회원 확인
			if (logid.equals(mem_mng.members.get(i).getId())) {
				mem = mem_mng.members.get(i);
				break;
			}
		}

		System.out.println();
		System.out.println("[" + mem.getName() + "님의 Mypage]");
		System.out.println("*************************");
		System.out.println("1. 회원 정보 조회");
		System.out.println("2. 장바구니 목록보기");
		System.out.println("3. 구매 목록 보기");
		System.out.println("4. 포인트 조회");
		System.out.println("5. 배송 현황 조회");
		System.out.println("0. 나가기");
		System.out.println("*************************");
		System.out.println("이용할 서비스를 선택해주십시오.");
		System.out.printf("-> ");

		while (true) {
			select = sc.nextInt();
			if (select >= 0 && select <= 5) {
				break;
			} else
				System.out.println("다시 입력해주세요.");
		}

		switch (select) {
		case 1: //
			System.out.println("-----------회원 정보 조회----------");
			mem_mng.search(mem);
			System.out.println("-----------------------------");
			break;
		case 2: // 장바구니 목록 보기
			c_mng.search();
			break;
		case 3: // 구매 목록 보기
			ord_mng.search();
			break;
		case 4: // 포인트 조회
			mem_mng.pointCheck(mem);
			break;
		case 5:// 배송 현황 조회
			mem_mng.deliveryState();
			break;
		case 0: // 나가기
			System.out.println();
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
			break;
		default:
			System.out.println();
			System.out.println("올바르지 않은 입력입니다.");
			break;
		}

	}

	public void mainMenu(){
		
		book_mng.init();
		mem_mng.init();
		
		Customer custom=new Customer();
		
		BookStoreUI bsui = new BookStoreUI();
		
		System.out.println("▶ 어서오십시오! 인터넷 서점입니다 .\n");
		
		while(true){
			switch(bsui.mainMenuSelect()){
				case 1: //회원가입
					custom.join();
					break;
				case 2: //로그인
					// 회원로그인
					logid=custom.login();
					break;
				case 3: // 마이페이지
					if(logid!=null){
						bsui.mypage();
					}
					else{
						System.out.println();
						System.out.println("로그인 해주세요.");
					}
					break;
				case 4: //검색
					System.out.println();
					System.out.println("검색");
					break;
				case 5: //전체 도서 보기
					if(book_mng.books.size()>0){
						book_mng.search();			
					}else{
						System.out.println();
						System.out.println("도서 목록이 없습니다.");
					}
					break;
				case 6: //주문하기
					System.out.println();
					System.out.println("주문하기");
					break;
				case 7: //관리자모드
					bsui.adminMenu(bsui.adminMenuSelect());
					break;
				case 0: // 나가기
					System.out.println();
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					break;
				default:
					System.out.println();
					System.out.println("올바르지 않은 입력입니다.");
					break;
			}
		}
		
	}

}