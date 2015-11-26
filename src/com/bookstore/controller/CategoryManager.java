package com.bookstore.controller;

import java.util.ArrayList;

import com.bookstore.entity.BookCategory;

public class CategoryManager implements IManager{

	private ArrayList<BookCategory> categoryList;

	public ArrayList<BookCategory> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(ArrayList<BookCategory> categoryList) {
		this.categoryList = categoryList;
	}

	@Override
	public void add(Object obj) {
		System.out.println("ī�װ� �߰�");
	}

	@Override
	public void delete(Object obj) {
		System.out.println("ī�װ� ����");
	}

	@Override
	public void search() {
		System.out.println("ī�װ� �˻�");
	}
	
	
}
