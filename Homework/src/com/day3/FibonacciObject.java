package com.day3;

public class FibonacciObject {
	
	public int fiboanacciWithLoop(int n) {
		int previousResult = 0;
		int currentResult = 0;
		for(int i=n; i>0; i--) {
			if(i==n) {
				previousResult = 0;
				currentResult = 1;
			}else {
				int placeholder = currentResult;
				currentResult =  currentResult +previousResult;
				previousResult = placeholder;
			} 
		}
			
		return currentResult;
	}
	
	public int fibonnaci(int n) {
		
		if(n==1) {
			return 1;
		}
		
		if(n==0) {
			return 0;
		}
		return fibonnaci(n-1) + fibonnaci(n-2);
	}

}
