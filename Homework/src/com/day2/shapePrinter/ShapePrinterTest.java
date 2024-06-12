package com.day2.shapePrinter;

public class ShapePrinterTest {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(false, false, true, 5, 3);
		
		ShapePrinter trianglePrinter = new TrianglePrinter(triangle);
		trianglePrinter.printShapeWithStars();
		trianglePrinter.printShapeWithNumbers();
	}

}
