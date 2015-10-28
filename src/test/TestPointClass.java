package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import main.*;

/**
 * @author Matu
 *
 */
public class TestPointClass {

	public static final double PRECISION = 0.1;
	NormalPoint empty;
	NormalPoint p1;
	NormalPoint p2;

	/**
	 * @throws java.lang.Exception
	 */
	// This will run just ONCE per testcase
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	// The @Before and @After methods will be run before and after every test
	// case, so will probably be run multiple times during a test run.
	@Before
	public void setUp() throws Exception {
		empty = new NormalPoint();
		p1 = new NormalPoint(10, 10);
		p2 = new NormalPoint(10, 20);

	}

	/** test Point.translate() **/
	@Test
	public void testTranslate() throws Exception {
		setUp();
		double x = 30;
		double y = 20;
		empty.translate(x, y);
		assertEquals("x must be 30 ", x, empty.getX(), PRECISION);
		assertEquals("y must be 20 ", y, empty.getY(), PRECISION);

	}

	/**
	 * test Point.rho() method
	 * 
	 * @throws Exception
	 **/
	@Test
	public void testRho() throws Exception {
		/** sqrt(10^2+10^2) => 14.142135 **/
		assertEquals("p1 rho method must be ", 14.14, p1.rho(), PRECISION);

	}

	/**
	 * test Point.tehta() method
	 * 
	 * @throws Exception
	 **/
	@Test
	public void testTehta() throws Exception {
		/**  **/
		NormalPoint testPoint = new NormalPoint(4, 8);
		assertEquals("Tehta test method: ", 1.107, testPoint.tehta(), PRECISION);
		/** undefined **/
		assertEquals(" Tehta empty method", 0, empty.tehta(), PRECISION);
	}

	/** test distance method when two points are at same point **/
	@Test
	public void testDistance() throws Exception {
		NormalPoint testPoint = new NormalPoint(10, 10);

		assertEquals("Same points", 0, testPoint.distance(p1), PRECISION);

		/** points(-2,3) and (-4,4) > d=SQRT((x2-x1)^2+(y2-y1)^2)=>7.28 **/
		NormalPoint one = new NormalPoint(-2, -3);
		NormalPoint two = new NormalPoint(-4, 4);
		assertEquals("Distance of two points", 7.28, one.distance(two), PRECISION);
	}

	/** test vectorTo method **/
	@Test
	public void testVectorTo() throws Exception {
		p1.vectorTo(p2);
		assertNotNull("Vectorto meetod: ", p1.vectorTo(p2));
		// this calls objects equals method
		// assertSame("Vectorto meetod: ", new Point(0,10), p1.vectorTo(p2));
	}

	/** test scale method **/
	@Test
	public void testScale() throws Exception {
		double factor = 2;
		// 10,20
		p2.scale(factor);

		assertEquals("Factoring by two (x)", 20, p2.getX(), PRECISION);
		assertEquals("Factoring by two (y)", 40, p2.getY(), PRECISION);

	}

	/** test centre_rotate method **/
	@Test
	public void testCentre_rotate() throws Exception {
		// Pi = 180 degrees, but centre_rotate takes inside a radian not degrees
		double angle = Math.PI;
		// 10,20
		// http://math.stackexchange.com/questions/346672/2d-rotation-of-point-about-origin
		p2.centre_rotate(angle);

		assertEquals("center rotate (x)", -10, p2.getX(), PRECISION);
		assertEquals("center rotate (y)", -20, p2.getY(), PRECISION);

	}

	/** test rotate method **/
	@Test
	public void testRotate() throws Exception {
		// Pi = 180 degrees, but rotate takes inside a radian not degrees
		// Pi / 2 => 90 degrees
		double angle = Math.PI / 2;
		// p1 = 10,10
		p1.rotate(p2, angle);

		assertEquals("center rotate (x)", 20, p1.getX(), PRECISION);
		assertEquals("center rotate (y)", 20, p1.getY(), PRECISION);

	}

}
