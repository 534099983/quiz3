package quiz3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import quiz3.TheTriangleClass;

public class TheTriangleClassTest {
	private static TheTriangleClass area;
	private static TheTriangleClass perimeter;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		perimeter=new TheTriangleClass(2,2,3);
		area=new TheTriangleClass(4,5,6);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testperimeter() {
		assertTrue(perimeter.getPerimeter()==7);
	}
	public void testarea() {
		assertTrue(area.getArea()==6);
	}

}
