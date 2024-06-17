package com.day3;

public class SumOfDigits {
	
	public int sumOfDigits(int n) {
		return n<10? n: n%10 +sumOfDigits((n/10));
	}

}
