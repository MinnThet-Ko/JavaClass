package com.assignment4;

public class Counter {
	private static int COUNT = 0;
	
	public Counter() {
		increaseCount();
	}
	public static void increaseCount() {
		COUNT += 1;
	}
	
	public static void decreaseCount() {
		COUNT -= 1;
	}
	public static int getCOUNT() {
		return COUNT;
	}
	public static void setCOUNT(int cOUNT) {
		COUNT = cOUNT;
	}
}
