package com.day2.shapePrinter;

public class Triangle extends Shape{
	
	private boolean isUpsideDown;
	private boolean isEquilateral;
	private boolean isRight;
	private int outerLimit;
	
	public Triangle(boolean isUpsideDown, boolean isEquilateral, boolean isRight, int size, int sides) {
		super();
		super.setSize(size);
		super.setSides(sides);
		this.isUpsideDown = isUpsideDown;
		this.isEquilateral = isEquilateral;
		this.isRight = isRight;
		this.outerLimit = isUpsideDown ? size : 0;

	}

	public boolean isUpsideDown() {
		return isUpsideDown;
	}

	public void setUpsideDown(boolean isUpsideDown) {
		this.isUpsideDown = isUpsideDown;
	}

	public boolean isEquilateral() {
		return isEquilateral;
	}

	public void setEquilateral(boolean isEquilateral) {
		this.isEquilateral = isEquilateral;
	}

	public boolean isRight() {
		return isRight;
	}

	public void setRight(boolean isRight) {
		this.isRight = isRight;
	}

	public int getOuterLimit() {
		return outerLimit;
	}

	public void setOuterLimit(int outerLimit) {
		this.outerLimit = outerLimit;
	}
}
