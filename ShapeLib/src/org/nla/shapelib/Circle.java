package org.nla.shapelib;

public class Circle implements Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return this.radius * Math.PI * Math.PI;
	}

	@Override
	public double perimeter() {
		return this.radius * Math.PI * 2;
	}
}
