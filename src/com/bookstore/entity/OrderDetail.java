package com.bookstore.entity;

public class OrderDetail { // 주문 사항

	int amount;
	private Customer customer;
	private Book book;
	
	public OrderDetail(int amount, Customer customer, Book book){
		this.amount=amount;
		this.customer=customer;
		this.book=book;
	}

	
	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	
}
