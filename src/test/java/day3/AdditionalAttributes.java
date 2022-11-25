package day3;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AdditionalAttributes {

	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.out.println("Running Before Method- Creating Browser Session");
		driver = new ChromeDriver();
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		System.out.println("Running After Method-  Browser Session Closed");

	}
	
	@Test(description = "This test will just check url is matching or not")
	public void verifyURL() {
		AssertJUnit.assertTrue(driver.getCurrentUrl().contains("index.php"));
	
	}

	@Test(description = "This test will just check title is matching or not")
	public void verifyTitle() {
		AssertJUnit.assertTrue(driver.getTitle().contains("OrangeHRM"));
		
	}

	@Test(enabled = false)
	public void verifySocialMediaCount() {
		AssertJUnit.assertEquals(driver.findElements(By.xpath("//div[@id='social-icons']//img")).size(), 5);
	
	}

	@Test(description = "This test will just password reset is present or not")
	public void verifyForgotPasswordLink() {
		AssertJUnit.assertTrue(driver.findElement(By.linkText("Forgot your password?")).isDisplayed());

	}
	
}
