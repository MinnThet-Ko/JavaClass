package com.day3;

public class FactorialObject {

	public int factorial(int i) {
		return i==1? 1:i * factorial(i-1);
	}
}
