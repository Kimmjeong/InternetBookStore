package com.bookstore.entity;

public class Book { // µµ¼­

	private String title;
	private String author;
	private String publisher;
	private int price;
	private int isbn;
	private int stock;
	
	public Book(int isbn, String title, String author, String publisher, int price, int stock){
		this.title=title;
		this.author=author;
		this.publisher=publisher;
		this.price=price;
		this.isbn=isbn;
		this.stock=stock;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
