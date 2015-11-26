package com.bookstore.controller;

import java.util.ArrayList;
import java.util.Date;

import com.bookstore.entity.OrderDetail;

public class OrderManager implements IManager{ // 주문 내역

	private ArrayList<OrderDetail> orders;
	private Date orderDate;
	
	public ArrayList<OrderDetail> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<OrderDetail> orders) {
		this.orders = orders;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public OrderManager() {
		orders=new ArrayList<>();
	}
	
	@Override
	public void add(Object obj) {
		System.out.println("주문 추가");
		
	}

	@Override
	public void delete(Object obj) {
		System.out.println("주문 취소");
	}

	@Override
	public void search() {
		System.out.println("주문 조회");		
	}
	
	public void calPrice(OrderDetail order){
		System.out.println("주문 총 금액 조회");
	}

}
