package com.assignment5;

public class TestAuthor {
	
	public static void main(String[] args) {
		Author testAuthor = new Author("Lemony Snicket", "lemony@somewhere.com", 'm');
		System.out.println(testAuthor);
		testAuthor.setEmail("lemony@nowhere.com");
		System.out.println(testAuthor);
	}

}
