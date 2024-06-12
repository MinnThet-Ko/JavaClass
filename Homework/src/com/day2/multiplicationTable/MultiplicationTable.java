package com.day2.multiplicationTable;

public class MultiplicationTable {
	private final String outputStringFormat = "%d X %d = %-15s";
	
	public void printMultiplicationTable(int inputNumber) {
		
		
		for(int outerLoopCounter = 1; outerLoopCounter <= inputNumber; outerLoopCounter++) {
			for(int innerLoopCounter = 1; innerLoopCounter <= inputNumber; innerLoopCounter++) {
				System.out.format(outputStringFormat, outerLoopCounter, innerLoopCounter, outerLoopCounter*innerLoopCounter);				
			}
			System.err.println("");
		}
		
		
	}

}
