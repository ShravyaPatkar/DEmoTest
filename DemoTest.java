package myproject;
/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import static org.junit.Assert.*;

import org.junit.Test;


public class DemoTest {
	@Test
	public void test_istriangle_1()
	{
		assertTrue("This is a Triangle",demo.isTriangle(3,4,5));
	}
	@Test
	public void test_istriangle_2()
	{
		assertTrue("This is a Triangle",demo.isTriangle(5,12,13));
	}
	@Test
	public void test_istriangle_3()
	{
		assertTrue("This is a Triangle",demo.isTriangle(5,13,12));
	}
	@Test
	public void test_istriangle_4()
	{
		assertTrue("This is a Triangle",demo.isTriangle(12,5,13));
	}
	@Test
	public void test_istriangle_5()
	{
		assertTrue("This is a Triangle",demo.isTriangle(12,13,5));
	}
	
	
	
	@Test
	public void test_isNOTtriangle_1()
	{
		assertFalse("This is not a Triangle",demo.isTriangle(5,7,13));
	}
	@Test
	public void test_isNOTtriangle_2()
	{
		assertFalse("This is not a Triangle",demo.isTriangle(5,13,7));
	}
	@Test
	public void test_isNOTtriangle_3()
	{
		assertFalse("This is not a Triangle",demo.isTriangle(13,5,7));
	}
	@Test
	public void test_isNOTtriangle_4()
	{
		assertFalse("This is not a Triangle",demo.isTriangle(13,7,5));
	}
	@Test
	public void test_isNOTtriangle_5()
	{
		assertFalse("This is not a Triangle",demo.isTriangle(4,9,3));
	}
	@Test
	public void test_isNOTtriangle_6()
	{
		assertFalse("This is not a Triangle",demo.isTriangle(-1,2,-1));
	}
	@Test
	public void test_isNOTtriangle_7()
	{
		assertFalse("This is not a Triangle",demo.isTriangle(0.5,0.5,1));
	}
	@Test
	public void test_isNOTtriangle_8()
	{
		assertFalse("This is not a Triangle",demo.isTriangle(0.5,1,0.5));
	}
	@Test
	public void test_isNOTtriangle_9()
	{
		assertFalse("This is not a Triangle",demo.isTriangle(1,0.5,0.5));
	}
	@Test
	public void test_isNOTtriangle_10()
	{
		assertFalse("This is not a Triangle",demo.isTriangle(1,0.5,0));
	}
	public void test_isNOTtriangle_11()
	{
		assertFalse("This is not a Triangle",demo.isTriangle(1,555555555,0));
	}
	
	/*@Test
	
	public void mainTest()
	{
		ByteArrayInputStream in=new ByteArrayInputStream("5\n12\n13\n.".getBytes());
		System.setIn(in);
		ByteArrayOutputStream out=new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String[] args= {};
		demo.main(args);
		String consoleOutput="Enter side 1:\n";
		consoleOutput +="Enter side 2:\n";
		consoleOutput +="Enter side 3:\n";
		consoleOutput +="This is a Triangle\n";
		assertEquals(consoleOutput,out.toString()); 
	}*/

}
