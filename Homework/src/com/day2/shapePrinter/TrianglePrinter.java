package com.day2.shapePrinter;

public class TrianglePrinter implements ShapePrinter {

	private Triangle triangle;

	public TrianglePrinter(Triangle triangle) {
		this.triangle = triangle;
	}

	public Triangle getTriangle() {
		return triangle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}

	@Override
	public void printShapeWithStars() {
		// Print right triangle
		if (!this.triangle.isUpsideDown() && this.triangle.isRight()) {
			for (int i = 1; i <= this.triangle.getSize(); i++) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.print("\n");
			}
		}

		// Print upside-down right triangle
		if (this.triangle.isUpsideDown() && this.triangle.isRight()) {
			for (int i = this.triangle.getSize(); i >= 1; i--) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.print("\n");
			}
		}

	}

	@Override
	public void printShapeWithNumbers() {
		// Print right triangle
		if (!this.triangle.isUpsideDown() && this.triangle.isRight()) {
			for (int i = 1; i <= this.triangle.getSize(); i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				System.out.print("\n");
			}
		}

		// Print upside-down right triangle
		if (this.triangle.isUpsideDown() && this.triangle.isRight()) {
			for (int i = this.triangle.getSize(); i >= 1; i--) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				System.out.print("\n");
			}
		}
		
		// Print equilateral triangle 
		if(!this.triangle.isUpsideDown() && this.triangle.isEquilateral()) {
			for (int i = 0; i <= this.triangle.getSize(); i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				System.out.print("\n");
			}
		}

	}

	@Override
	public void printHallowShape() {
		// TODO Auto-generated method stub

	}

}
