package org.nla.shapelib;

public class Square implements Shape {

	private double width;

	public Square(double width) {
		this.width = width;
	}

	@Override
	public double area() {
		return this.width * this.width;
	}

	@Override
	public double perimeter() {
		return 4 * this.width;
	}
}
