package com.bookstore.controller;

import java.util.ArrayList;

import com.bookstore.entity.Cart;


public class CartManager implements IManager{

	private ArrayList<Cart> cartList;

	public CartManager() {
		cartList=new ArrayList<>();
	}
	
	public ArrayList<Cart> getCartList() {
		return cartList;
	}

	public void setCartList(ArrayList<Cart> cartList) {
		this.cartList = cartList;
	}

	@Override
	public void add(Object obj) {
		System.out.println("��ٱ��Ͽ� �߰�");
		
	}

	@Override
	public void delete(Object obj) {
		System.out.println("��ٱ��Ͽ��� ����");
	}

	@Override
	public void search() {
		System.out.println("��ٱ��� ����");		
	}
	
}
