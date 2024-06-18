package com.day3;

public class StringToInt {
	
	public int stringToInt(String inputString) {
		return (int) (inputString.length() == 1? (int)(inputString.charAt(0) - '0') *1: 
			(inputString.charAt(0) - '0')*Math.pow(10, inputString.length()-1)+stringToInt(inputString.substring(1)));
	}

}
