package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTExample2 {

	WebDriver driver=null;

	@BeforeMethod
	public void login() throws InterruptedException {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ineuron-courses.vercel.app/login");
	}

	@AfterMethod
	public void logout() throws InterruptedException {
		driver.quit();
	}



	@Test(dataProvider ="data-provider")
	public void myTest(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password1']")).sendKeys(password);
		driver.findElement(By.className("submit-btn")).click();;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Sign out']")).isDisplayed());;
		driver.findElement(By.xpath("//button[normalize-space()='Sign out']")).click();
		
	}

	@DataProvider(name="data-provider")
	public Object[][] testDataGenerator() {
		Object arr[][] = new Object[4][2];

		arr[0][0] = "sample9@gmail.com";
		arr[0][1] = "Mukesh1234";
		arr[1][0] = "samplemukesh@gmail.com";
		arr[1][1] = "Mukesh1234";
		arr[2][0] = "samplemukesh1@gmail.com";
		arr[2][1] = "Mukesh1234";
		arr[3][0] = "samplemukesh2@gmail.com";
		arr[3][1] = "Mukesh1234";

		return arr;
	}

}
