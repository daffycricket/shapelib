package org.nla.shapelib;

public class Rectangle implements Shape {

	private double width;

	private double length;

	public Rectangle(double length, double width) {
		this.width = width;
		this.length = length;
	}

	@Override
	public double area() {
		return this.width * this.length;
	}

	@Override
	public double perimeter() {
		return 2 * (this.width + this.length);
	}
}
