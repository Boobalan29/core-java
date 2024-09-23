package com.example.Library1.EntityLayer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="bookdetails")
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private	int id;
	@Column
private	String bookname;
private	String publisher;
private	int price;
	
	public Books() {
		super();
		// TODO Auto-generated constructor stub																																						
	}
	
	

	public Books(int id, String bookname, String publisher, int price) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.publisher = publisher;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
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
	}
