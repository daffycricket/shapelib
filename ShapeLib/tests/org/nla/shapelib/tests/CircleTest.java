package org.nla.shapelib.tests;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.nla.shapelib.Circle;
import org.nla.shapelib.Shape;

public class CircleTest {

	@Test
	public void testCircleArea() {
		final double radius = 5.0;
		Shape circle = new Circle(radius);
		final double expectedArea = radius * Math.PI * Math.PI;
		assertThat(circle.area(), equalTo(expectedArea));
	}

	@Test
	public void testCirclePerimeter() {
		final double radius = 5.0;
		Shape circle = new Circle(radius);
		final double expectedPerimeter = 2 * radius * Math.PI;
		assertThat(circle.perimeter(), equalTo(expectedPerimeter));
	}

}
