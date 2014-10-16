package org.nla.shapelib.tests;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.nla.shapelib.Square;

public class SquareTests {

	@Test
	public void testSquareArea() {
		final double width = 5.0;
		Square square = new Square(width);
		final double expectedArea = width * width;
		assertThat(square.area(), equalTo(expectedArea));
	}

	@Test
	public void testSquarePerimeter() {
		final double width = 5.0;
		Square square = new Square(5.0);
		final double expectedPerimeter = 4 * width;
		assertThat(square.perimeter(), equalTo(expectedPerimeter));
	}
}