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
		System.out.println("장바구니에 추가");
		
	}

	@Override
	public void delete(Object obj) {
		System.out.println("장바구니에서 삭제");
	}

	@Override
	public void search() {
		System.out.println("장바구니 보기");		
	}
	
}
