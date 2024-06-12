package com.day2.sumOfNaturalNumbers;

import java.util.Scanner;

public class SumTest {

	public static void main(String[] args) {
		SumOfNaturalNumbers sumObj = new SumOfNaturalNumbers();
		Scanner inputScanner = new Scanner(System.in);
		int inputNumber;
		String continueFlag = "y";
		while(continueFlag.equals("y")) {
			System.out.println("Enter a number:");
			inputNumber = inputScanner.nextInt();
			System.out.format("Sum with for loop: %d \n", sumObj.sumWithForLoop(inputNumber));
			System.out.format("Sum with while loop: %d \n", sumObj.sumWithWhileLoop(inputNumber));
			
			System.out.println("Do you want to continue?(y/n)");
			continueFlag = inputScanner.next().toLowerCase();
		}
		inputScanner.close();
	}

}
