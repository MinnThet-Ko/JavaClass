package com.assignment5;

public class MyCircle {
	
	private MyPoint center;
	private double radius;
	
	public MyCircle() {
		this.center = new MyPoint();
		this.radius = 1.0;
	}
	
	public MyCircle(int x, int y, double radius) {
		this.center = new MyPoint(x,y);
		this.radius = radius;
	}
	
	public MyCircle(MyPoint center, double radius) {
		this.center = center;
		this.radius = radius;
	}

	public MyPoint getCenter() {
		return center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public int getCenterX() {
		return this.center.getX();
	}
	
	public void setCenterX(int x) {
		this.center.setX(x);
	}
	
	public int getCenterY() {
		return this.center.getY();
	}
	
	public void setCenterY(int y) {
		this.center.setY(y);
	}
	
	public void setCenterXY(int x, int y) {
		this.center.setXY(x, y);
	}
	
	public String toString() {
		return String.format("center=(%d,%d) radius=%f", this.center.getX(), this.center.getY(), this.radius);
	}
	
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
	
	public double getPrameter() {
		return 2 *  Math.PI * this.radius;
	}
	
	public double calculateDistance(MyCircle circle) {
		return this.center.calculateDistance(circle.getCenter());
	}

}
