package day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));

		driver.get("https://jqueryui.com/droppable/");
		
		// Using index
		//driver.switchTo().frame(0);
		
		// Using name or id
		//driver.switchTo().frame("");
		
		// using WebElement
		WebElement child_frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	
		driver.switchTo().frame(child_frame);
		
		WebElement src=driver.findElement(By.id("draggable"));

		WebElement destination=driver.findElement(By.id("droppable"));

		Actions act=new Actions(driver);
		
		act.dragAndDrop(src, destination).perform();
		
		
	}

}
