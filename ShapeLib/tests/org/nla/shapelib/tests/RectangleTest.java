package org.nla.shapelib.tests;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.nla.shapelib.Rectangle;
import org.nla.shapelib.Shape;

public class RectangleTest {

	@Test
	public void testRectangleArea() {
		final double width = 5.0;
		final double length = 10.0;
		Shape rectangle = new Rectangle(length, width);
		final double expectedArea = width * length;
		assertThat(rectangle.area(), equalTo(expectedArea));
	}

	@Test
	public void testRectanglePerimeter() {
		final double width = 5.0;
		final double length = 10.0;
		Shape rectangle = new Rectangle(length, width);
		final double expectedPerimeter = 2 * (width + length);
		assertThat(rectangle.perimeter(), equalTo(expectedPerimeter));
	}

}
