package com.assignment5;

public class TestBook {
	public static void main(String[] args) {
		Author testAuthor = new Author("Lemony Snicket", "lemony@somewhere.com", 'm');
		System.out.println(testAuthor);
		
		Book asoue1 =  new Book("The Bad Beginning", testAuthor, 39.45, 10);
		System.out.println(asoue1);
		
		Book trss1 = new Book("The Shadow Queen", new Author("C.J Redwine", "redwine@somewhere.com", 'f'), 40.00);
		trss1.setQtyInStock(20);
		System.out.println(trss1);
	}
}
