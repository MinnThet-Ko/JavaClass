package com.lms.models;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Member> memberList;
	private List<Book> bookList;

	public Library() {
		this.memberList = new ArrayList<>();
		this.bookList = new ArrayList<>();
	}

	public void addBook(Book book) {
		this.bookList.add(book);
	}

	public void addMember(Member member) {
		this.memberList.add(member);
	}

	
	//The following methods are not complete yet.
	//But they will be working for the moment.
	public void burrowBook(Member member, Book book) {
		member.burrowBook(book);
		this.bookList.get(this.bookList.indexOf(book)).burrow();
	}

	public void returnBook(Member member, Book book) {
		member.returnBook(book);
		this.bookList.get(this.bookList.indexOf(book)).returnBook();;
	}

	public Book findBook(String title) {
		for(Book book:this.bookList) {
			if(book.getTitle().equals(title)) {
				return book;
			}
		}
		return null;
	}

	public Member findMember(int memberID) {
		for(Member member:this.memberList) {
			if(member.getMemberID() == memberID) {
				return member;
			}
		}
		return null;
	}

	public void displayBooks() {
		this.bookList.forEach((book) -> System.out.println(book.toString()) );
	}

	public void displayMembers() {
		this.memberList.forEach((member) -> System.out.println(member.toString()));
	}
	
	
	//This is just a lazy way to create member ID.
	public int getMemberCount() {
		return this.memberList.size();
	}
}
