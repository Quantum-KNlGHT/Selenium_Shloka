package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumScript3 {

	public static void main(String[] args) {


		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/login");
	
		WebElement username=driver.findElement(By.name("email1"));
		
		username.sendKeys("SapientTraining@gmail.com");
		
		driver.findElement(By.id("password1")).sendKeys("Abcd@1234");
		
		driver.findElement(By.className("submit-btn")).click();
		
	
		
		
	}

}
