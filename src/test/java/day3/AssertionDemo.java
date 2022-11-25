package day3;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(12, 12);
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(12, 12,"Count Mismatched");
	}
	
	@Test
	public void test3()
	{
		AssertJUnit.assertTrue(true);
	}
	
	@Test
	public void test4()
	{
		AssertJUnit.assertFalse(false);
	}
	
	@Test
	public void test5()
	{
		String actual="Email already registered";
		String expected="Email already registered";
		AssertJUnit.assertTrue(actual.equalsIgnoreCase(expected));
		AssertJUnit.assertEquals(actual, expected);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
