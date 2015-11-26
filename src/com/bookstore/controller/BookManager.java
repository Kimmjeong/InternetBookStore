package com.bookstore.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.bookstore.entity.Book;

public class BookManager implements IManager{

	static public ArrayList<Book> books;
	
	public BookManager(){

	}
	
	public void init(){
		books=new ArrayList<Book>();
		books.add(new Book(9788, "�̰��� �ڹٴ�", "�ſ��", "�Ѻ��̵��",30000, 100));
		books.add(new Book(1001, "����� ���̸�","����","�ѹ��е���",15000, 50));
		books.add(new Book(5000, "���̾���ȭ���� ����", "�����ó� ���̰�", "���빮��",14800, 80));
	}
	
	@Override
	public void add(Object obj) {
		books.add((Book)obj);
		
	}

	@Override
	public void delete(Object obj) {
		System.out.println("���� ����");
		
	}

	@Override
	public void search() {
		
		System.out.println("---------------------- ���� ��� --------------------------");
		
		System.out.println("ISBN\t������\t����\t���ǻ�\t����");
		System.out.println("=======================================================");
		for(int i=0;i<books.size();i++){
			System.out.printf("%d\t%s\t%s\t%s\t%d\n", books.get(i).getIsbn(), books.get(i).getTitle(), books.get(i).getAuthor(), books.get(i).getPublisher(), books.get(i).getPrice());
		}
		
		System.out.println("-------------------------------------------------------");
	}
	
}
