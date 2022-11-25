package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumScript2 {

	public static void main(String[] args) {

		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		WebElement username=driver.findElement(By.name("username"));
		
		username.sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
		
		String url=driver.getCurrentUrl();
		
		if(url.contains("dashboard"))
		{
			System.out.println("Login done");
		}
		else
		{
			System.out.println("Login failed");
		}
		
		
		
	}

}
