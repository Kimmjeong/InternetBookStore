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
		books.add(new Book(9788, "이것이 자바다", "신용권", "한빛미디어",30000, 100));
		books.add(new Book(1001, "라면을 끓이며","김훈","한문학동네",15000, 50));
		books.add(new Book(5000, "나미야잡화점의 기적", "히가시노 게이고", "현대문학",14800, 80));
	}
	
	@Override
	public void add(Object obj) {
		books.add((Book)obj);
		
	}

	@Override
	public void delete(Object obj) {
		System.out.println("도서 삭제");
		
	}

	@Override
	public void search() {
		
		System.out.println("---------------------- 도서 목록 --------------------------");
		
		System.out.println("ISBN\t도서명\t저자\t출판사\t가격");
		System.out.println("=======================================================");
		for(int i=0;i<books.size();i++){
			System.out.printf("%d\t%s\t%s\t%s\t%d\n", books.get(i).getIsbn(), books.get(i).getTitle(), books.get(i).getAuthor(), books.get(i).getPublisher(), books.get(i).getPrice());
		}
		
		System.out.println("-------------------------------------------------------");
	}
	
}
