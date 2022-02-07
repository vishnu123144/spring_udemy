package com.udemy.springbootintensteps;

public class Book {
	
	long id;
	String author;
	String name;
	
	
	public Book(long id, String author, String name) {
		super();
		this.id = id;
		this.author = author;
		this.name = name;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
