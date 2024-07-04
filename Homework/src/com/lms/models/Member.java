package com.lms.models;

import java.util.ArrayList;
import java.util.List;

public class Member {
	
	private String name;
	private int memberID;
	private List<Book> burrowedBooks;
	
	public Member(String name, int memberID) {
		this.name = name;
		this.memberID = memberID;
		this.burrowedBooks = new ArrayList<>();
	}
	
	public String getName() {
		return this.name;
	}
	
	//Needed memberID gettter method
	public int getMemberID() {
		return this.memberID;
	}
	
	public void burrowBook(Book book) {
		this.burrowedBooks.add(book);
	}
	
	public void returnBook(Book book) {
		this.burrowedBooks.remove(this.burrowedBooks.indexOf(book));
	}
	
	public String toString() {
		return String.format("Name: %s \n Burrowed books: %d", this.name, this.burrowedBooks.size());
	}
	

}
