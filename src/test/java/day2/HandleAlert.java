package day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		
		
		Alert alt=	driver.switchTo().alert();
		
		String msg=alt.getText();
		
		if(msg.contains("Please enter a valid user name1"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		
		
		alt.accept();
		
		driver.findElement(By.name("login")).sendKeys("mukesh@rediffmail.com");
		
		driver.quit();
		
		

	}

}
