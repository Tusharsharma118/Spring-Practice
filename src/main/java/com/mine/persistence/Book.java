package com.mine.persistence;


public class Book {
	private String id;
	private String title;
	private String author;
	
	
	public Book() {
		
	}
	
	public Book(String id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String giveKeywords() {
		return this.id+" "+this.title+" "+this.getAuthor()+" "+this.getTitle();
	}
	
	


}
