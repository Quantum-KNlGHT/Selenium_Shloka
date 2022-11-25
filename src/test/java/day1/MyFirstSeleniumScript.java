package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumScript {

	public static void main(String[] args) {

		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Mukesh Otwani");
		
		String title=driver.getTitle();
		System.out.println("Title is "+title);
		String url=driver.getCurrentUrl();
		System.out.println("URL is "+url);
		//driver.quit();
		
		
	}

}
