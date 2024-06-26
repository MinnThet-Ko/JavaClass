package com.assignment4;

public class Person {
	
	/*
	 * This is what I have read from Head First OOA&D book.
	 * I used to understand that by declaring the variables in a class private, you achieve data encapsulation.
	 * According to the book, encapsulation means breaking code apart into logical components so that,
	 * each component focuses on its functionality.
	 */
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
