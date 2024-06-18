package com.day3;

public class Palindrome {
	
	public boolean isPalindrome(String inputString) {
		return inputString.length() == 1 ? true:
				inputString.length() == 2 ? inputString.charAt(0) == inputString.charAt(inputString.length()-1):
					inputString.charAt(0) == inputString.charAt(inputString.length()-1) && isPalindrome(inputString.substring(1, inputString.length()-1));
	}

}
