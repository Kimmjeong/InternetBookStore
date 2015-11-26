package com.bookstore.entity;

import java.util.ArrayList;

public class BookCategory { // 도서 분류

	private String category;
	private ArrayList<Book> bookList;
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public ArrayList<Book> getBookList() {
		return bookList;
	}
	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}
	
	
}