package com.day3;

public class Day3_Main {

	public static void main(String[] args) {
		//Factorial
		FactorialObject fo = new FactorialObject();
		System.out.println("Factoral of 5:"+fo.factorial(5));
		
		//Sum of natural numbers
		SoNNObject sonn = new SoNNObject();
		System.out.println("Sum of natural numbers to 5:"+sonn.sumOfNaturalNumbers(5));
		
		//Fibonnaci sequence
		FibonacciObject fibObj = new FibonacciObject();
		System.out.println("Fibnnaci of 6: "+fibObj.fibonnaci(6));
		
		
		//Sum of digits
		SumOfDigits sod = new SumOfDigits();
		System.out.println("Sum of digits:"+sod.sumOfDigits(123));
		
		//Reverse string
		StringReverser sr = new StringReverser();
		System.out.println(sr.reverseString("hello"));
	}

}
