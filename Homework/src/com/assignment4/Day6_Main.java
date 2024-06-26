package com.assignment4;

public class Day6_Main {

	public static void main(String[] args) {
		// Count test
		Counter counter1 = new Counter();
		Counter counter2 = new Counter();
		Counter counter3 = new Counter();
		Counter counter4 = new Counter();
		System.out.println(counter4.getCOUNT());
		
		// Shape inheritance
		Shape circle = new Circle();
		circle.draw();
		Shape square = new Shape();
		square.draw();
	}

}
