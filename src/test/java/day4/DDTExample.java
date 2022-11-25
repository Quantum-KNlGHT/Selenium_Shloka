package day4;

import org.testng.annotations.Test;

public class DDTExample {

	@Test
	public void myTest(String username, String password) {
		System.out.println("Test 1 Executed");
	}

	public Object[][] testDataGenerator() {
		Object arr[][] = new Object[2][2];

		arr[0][0] = "Selenium";
		arr[0][0] = "Grid";
		arr[0][0] = "IDE";
		arr[0][0] = "RC";

		return arr;
	}

}
