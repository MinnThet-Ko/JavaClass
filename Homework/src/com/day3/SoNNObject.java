package com.day3;

public class SoNNObject {
	
	public int sumOfNaturalNumbers(int n) {
		return n ==1? 1:n+sumOfNaturalNumbers(n-1);
	}

}
