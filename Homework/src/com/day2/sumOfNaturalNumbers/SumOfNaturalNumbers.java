package com.day2.sumOfNaturalNumbers;

public class SumOfNaturalNumbers {
	
	public int sumWithForLoop(int inputNumber) {
		
		int result = 0;
		for(int i = 0; i<inputNumber; i++) {
			result += i+1;
		}
		return result;
	}

	public int sumWithWhileLoop(int inputNumber) {
		int result = 0;
		int i = 0 ;
		while(i != inputNumber) {
			result += i+1;
			i++;
		}
		return result;
	}
}
