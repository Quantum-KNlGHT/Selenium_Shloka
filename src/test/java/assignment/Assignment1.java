package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");

		Thread.sleep(2000);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//b[normalize-space()='Admin']"))).perform();
		act.moveToElement(driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"))).perform();
		driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']")).click();

		driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']")).sendKeys("Shloka");
		act.moveToElement(driver.findElement(By.xpath("//select[@id='searchSystemUser_userType']"))).perform();

		driver.findElement(By.xpath("//input[@name='btnAdd']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='systemUser[employeeName][empName]']")).sendKeys("Mukesh Otwani");
		driver.findElement(By.xpath("//input[@name='systemUser[userName]']")).sendKeys("Shloka");
		driver.findElement(By.xpath("//input[@name='systemUser[password]']")).sendKeys("Shloka@123");
		driver.findElement(By.xpath("//input[@name='systemUser[confirmPassword]']")).sendKeys("Shloka@123");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='btnSave']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Shloka");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Shloka@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

		
		Thread.sleep(3000);
		driver.quit();
	}

}
