
// UI ȭ�� �Դϴ�.
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

	// ���θ޴� �����ϱ�
	public int mainMenuSelect() {

		int select;

		System.out.println();
		System.out.println("[Main Service]");
		System.out.println("*************************");
		System.out.println("1. ȸ������");
		System.out.println("2. �α���");
		System.out.println("3. ����������");
		System.out.println("4. �˻�");
		System.out.println("5. ��ü ���� ����");
		System.out.println("6. �ֹ�");
		System.out.println("7. �����ڸ��");
		System.out.println("0. ������");
		System.out.println("*************************");
		System.out.println("�̿��� ���񽺸� �������ֽʽÿ�.");
		System.out.printf("-> ");

		while (true) {
			select = sc.nextInt();
			if (select >= 0 && select <= 7) {
				return select;
			} else
				System.out.println("�ٽ� �Է����ּ���.");
		}
	}
	
	// �����ڸ޴� �����ϱ�
	public int adminMenuSelect() {

		int select;

		System.out.println();
		System.out.println("[Admin Service]");
		System.out.println("*************************");
		System.out.println("1. ���� ���");
		System.out.println("2. ��� �߰�");
		System.out.println("3. ��� Ȯ��");
		System.out.println("4. ���� Ȯ��");
		System.out.println("5. ��ü ȸ�� ����");
		System.out.println("0. ������");
		System.out.println("*************************");
		System.out.println("�̿��� ���񽺸� �������ֽʽÿ�.");
		System.out.printf("-> ");

		while (true) {
			select = sc.nextInt();
			if (select >= 0 && select <= 5) {
				return select;
			} else
				System.out.println("�ٽ� �Է����ּ���.");
		}
	}

	// ������ �޴�
	public void adminMenu(int select) {

		BookManager book_mng=new BookManager();
		
		switch (select) {
		case 1: //
			System.out.println("\n----------���� ���-----------");
			Book book = null;
			Scanner sc = new Scanner(System.in);
			
			System.out.print("������ȣ : ");
			int isbn=sc.nextInt();
			System.out.print("������ : ");
			String title=sc.next();
			System.out.print("���� : ");
			String author=sc.next();
			System.out.print("���ǻ� : ");
			String publisher=sc.next();
			System.out.print("���� : ");
			int price=sc.nextInt();
			System.out.print("���: ");
			int stock=sc.nextInt();
			
			book=new Book(isbn, title, author, publisher, price,stock); // ���� ���� ���
			
			book_mng.add(book);
			System.out.println("----------------------------");
			break;
		case 2:
			System.out.println("\n----------��� �߰�-----------");
			System.out.println("----------------------------");
			break;
		case 3:
			System.out.println("��� Ȯ��");
			break;
		case 4:
			System.out.println("���� Ȯ��");
			break;
		case 5:
			mem_mng.search();
			break;
		case 0: // ������
			System.out.println();
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
			break;
		default:
			System.out.println();
			System.out.println("�ùٸ��� ���� �Է��Դϴ�.");
			break;
		}

	}

	// ���������� : ȸ�� �޴� �����ϱ�
	public void mypage() {

		int select;

		Member mem = null;
		int i;
		for (i = 0; i < mem_mng.members.size(); i++) { // ���̵�� ȸ�� Ȯ��
			if (logid.equals(mem_mng.members.get(i).getId())) {
				mem = mem_mng.members.get(i);
				break;
			}
		}

		System.out.println();
		System.out.println("[" + mem.getName() + "���� Mypage]");
		System.out.println("*************************");
		System.out.println("1. ȸ�� ���� ��ȸ");
		System.out.println("2. ��ٱ��� ��Ϻ���");
		System.out.println("3. ���� ��� ����");
		System.out.println("4. ����Ʈ ��ȸ");
		System.out.println("5. ��� ��Ȳ ��ȸ");
		System.out.println("0. ������");
		System.out.println("*************************");
		System.out.println("�̿��� ���񽺸� �������ֽʽÿ�.");
		System.out.printf("-> ");

		while (true) {
			select = sc.nextInt();
			if (select >= 0 && select <= 5) {
				break;
			} else
				System.out.println("�ٽ� �Է����ּ���.");
		}

		switch (select) {
		case 1: //
			System.out.println("-----------ȸ�� ���� ��ȸ----------");
			mem_mng.search(mem);
			System.out.println("-----------------------------");
			break;
		case 2: // ��ٱ��� ��� ����
			c_mng.search();
			break;
		case 3: // ���� ��� ����
			ord_mng.search();
			break;
		case 4: // ����Ʈ ��ȸ
			mem_mng.pointCheck(mem);
			break;
		case 5:// ��� ��Ȳ ��ȸ
			mem_mng.deliveryState();
			break;
		case 0: // ������
			System.out.println();
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
			break;
		default:
			System.out.println();
			System.out.println("�ùٸ��� ���� �Է��Դϴ�.");
			break;
		}

	}

	public void mainMenu(){
		
		book_mng.init();
		mem_mng.init();
		
		Customer custom=new Customer();
		
		BookStoreUI bsui = new BookStoreUI();
		
		System.out.println("�� ����ʽÿ�! ���ͳ� �����Դϴ� .\n");
		
		while(true){
			switch(bsui.mainMenuSelect()){
				case 1: //ȸ������
					custom.join();
					break;
				case 2: //�α���
					// ȸ���α���
					logid=custom.login();
					break;
				case 3: // ����������
					if(logid!=null){
						bsui.mypage();
					}
					else{
						System.out.println();
						System.out.println("�α��� ���ּ���.");
					}
					break;
				case 4: //�˻�
					System.out.println();
					System.out.println("�˻�");
					break;
				case 5: //��ü ���� ����
					if(book_mng.books.size()>0){
						book_mng.search();			
					}else{
						System.out.println();
						System.out.println("���� ����� �����ϴ�.");
					}
					break;
				case 6: //�ֹ��ϱ�
					System.out.println();
					System.out.println("�ֹ��ϱ�");
					break;
				case 7: //�����ڸ��
					bsui.adminMenu(bsui.adminMenuSelect());
					break;
				case 0: // ������
					System.out.println();
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
					break;
				default:
					System.out.println();
					System.out.println("�ùٸ��� ���� �Է��Դϴ�.");
					break;
			}
		}
		
	}

}