package day3;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class MyFirstTestNGTest2 
{
	@Test(priority = 2)
	public void login()
	{
		System.out.println("Login Done");
	}
	
	@Test
	public void createAccount()
	{
		System.out.println("Account Created");
	}
	
	@Test
	public void deleteAccount()
	{
		System.out.println("Account Deleted");
	}
	
	@Test(priority = 1)
	public void logOutFromApplication()
	{
		System.out.println("Logout Done");
	}
	

}
