package com.day3;

public class StringReverser {
	
	public String reverseString(String n) {
		return n.length() == 1 ? n: n.charAt(n.length()-1) + reverseString(n.substring(0, n.length()-1));
	}
}
