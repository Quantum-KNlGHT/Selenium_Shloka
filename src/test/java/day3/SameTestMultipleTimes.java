package day3;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class SameTestMultipleTimes {
	
	
	@Test(invocationCount = 10)
	public void createUser()
	{
		Faker fake=new Faker();
		String name=fake.name().firstName();
		System.out.println("Create user "+name);
	}

}
