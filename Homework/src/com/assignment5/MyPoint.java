package com.assignment5;

public class MyPoint {
	private int x;
	private int y;

	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return String.format("(%d, %d)", this.x, this.y);
	}

	public double calculateDistance(int x1, int y1) {
		return Math.sqrt(Math.pow(this.x-x1,2) + Math.pow(this.y-y1,2));
	}

	public double calculateDistance(MyPoint point) {
		return Math.sqrt(Math.pow(this.x-point.getX(),2) + Math.pow(this.y-point.getY(),2));
	}
}
