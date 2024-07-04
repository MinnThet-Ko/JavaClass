package com.lms.models;

import java.util.Scanner;

/*
 * This code will do the bare minimum for now.
 * I'll updated it later.
 * */
public class LibraryManagementSystem {
	
	private final Scanner SCANNER = new Scanner(System.in);

	public static void main(String[] args) {
		Library library = new Library();
		Scanner scanner = new Scanner(System.in);
		int choice = -1;
		while (choice != 5) {
			System.out.println("Please enter a number.");
			System.out.println("1. Add books");
			System.out.println("2. Add members");
			System.out.println("3. Burrow book");
			System.out.println("4. Return book");
			System.out.println("5. Exit");
			choice = Integer.parseInt(scanner.nextLine()); 
			
			switch(choice){
				case 1:
					System.out.println("Enter book title:");
					String bookName = scanner.nextLine();
					
					System.out.println("Enter author:");
					String author = scanner.nextLine();
					
					System.out.println("Enter ISBN number");
					String isbn = scanner.nextLine();
					
					library.addBook(new Book(bookName, author, isbn));
					break;
				case 2:
					System.out.println("Enter name:");
					String name = scanner.nextLine();
					library.addMember(new Member(name, library.getMemberCount()+1));
					break;
				case 3:
					library.displayBooks();
					System.out.println("Enter book title:");
					Book bookToBurrow = library.findBook(scanner.nextLine());
					System.out.println("Enter member ID:");
					Member burrowingMember = library.findMember(scanner.nextInt());
					library.burrowBook(burrowingMember, bookToBurrow);
					break;
					
				case 4:
					library.displayBooks();
					System.out.println("Enter book title:");
					Book bookToReturn = library.findBook(scanner.nextLine());
					System.out.println("Enter member ID:");
					Member returningMember = library.findMember(scanner.nextInt());
					library.returnBook(returningMember, bookToReturn);
					break;
					
			}
		}
		
		scanner.close();
	}

}
