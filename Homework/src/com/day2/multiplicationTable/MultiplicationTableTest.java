package com.day2.multiplicationTable;

import java.util.Scanner;


public class MultiplicationTableTest {

	public static void main(String[] args) {
		MultiplicationTable multiTable = new MultiplicationTable();
		Scanner inputScanner = new Scanner(System.in);
		int inputNumber;
		String continueFlag = "y";
		while(continueFlag.equals("y")) {
			System.out.println("Enter a number:");
			inputNumber = inputScanner.nextInt();
			multiTable.printMultiplicationTable(inputNumber);			
			System.out.println("Do you want to continue?(y/n)");
			continueFlag = inputScanner.next().toLowerCase();
		}
		inputScanner.close();

	}

}
