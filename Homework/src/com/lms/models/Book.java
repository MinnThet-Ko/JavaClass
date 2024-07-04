package com.lms.models;

public class Book {
	
	private String title;
	private String author;
	private String ISBN;
	private boolean isAvailable;
	
	public Book(String title, String author, String ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.isAvailable = true;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public boolean isAvailable() {
		return this.isAvailable;
	}
	
	public void burrow() {
		this.isAvailable = false;
	}
	
	public void returnBook() {
		this.isAvailable = true;
	}
	
	public String toString() {
		return String.format("Title: %s \n Author: %s \n ISBN: %s \n", this.author, this.author, this.ISBN);
				
	}

}