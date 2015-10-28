package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.NormalPoint;
import main.Route;

public class TestRouteClass {

	public static final double PRECISION = 0.1;
	NormalPoint empty;
	NormalPoint p1;
	NormalPoint p2;
	NormalPoint p3;

	// This will run just ONCE per testcase
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	// The @Before and @After methods will be run before and after every test
	// case, so will probably be run multiple times during a test run.
	@Before
	public void setUp() throws Exception {
		empty = new NormalPoint();
		p1 = new NormalPoint(-2, -3);
		p2 = new NormalPoint(-4, 4);
		p3 = new NormalPoint(0, 4);
	}

	@Test
	public void getLength() throws Exception {

		Route newRoute = new Route();
		newRoute.create_route();
		// route length test with zero points.
		assertEquals("Length must be zero ", 0, newRoute.get_length(), PRECISION);

		newRoute.add_point(p1.getX(), p1.getY(), 0);
		// Test with 1 point
		assertEquals("Length must be zero ", 0, newRoute.get_length(), PRECISION);
		newRoute.add_point(p2.getX(), p2.getY(), 1); // 7.28
		// Test with 2 points
		assertEquals("Length must be 7.28 ", 7.28, newRoute.get_length(), PRECISION);
		newRoute.add_point(p3.getX(), p3.getY(), 2); // +4 = 11.28
		// Test with 3 points
		assertEquals("Length must be 11.28 ", 11.28, newRoute.get_length(), PRECISION);

	}

	/**
	 * Tests that removing point from route works.
	 */
	@Test
	public void removeFromIndex() throws Exception {

		Route newRoute = new Route();
		newRoute.create_route();
		newRoute.add_point(p1.getX(), p1.getY(), 0);
		newRoute.add_point(p2.getX(), p2.getY(), 1); // 7.28
		newRoute.add_point(p3.getX(), p3.getY(), 2); // +4 = 11.28
		assertEquals("Size of array must be 3", 3, newRoute.getList().size(), PRECISION);
		// remove last point from route.
		newRoute.remove_point(2);
		assertEquals("Size of array must be 2", 2, newRoute.getList().size(), PRECISION);

	}
}
