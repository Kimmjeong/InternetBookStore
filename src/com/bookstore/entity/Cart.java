package com.bookstore.entity;

public class Cart { // 장바구니

	private Customer customer;
	private Book book;
	
	public Cart(Customer customer, Book book){
		this.customer=customer;
		this.book=book;
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
