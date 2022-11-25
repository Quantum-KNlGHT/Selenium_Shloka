package day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassExamples {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		
	
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement child_frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	
		driver.switchTo().frame(child_frame);
		
		Actions act=new Actions(driver);
		
		// will perform right click
		act.contextClick();
		
		// double click
		act.doubleClick();
		
		// will perform keyboard events
		act.keyUp(Keys.ADD);
		act.keyDown(Keys.ADD);
		
		// can perform keyboard events as well as type
		act.sendKeys("");
		
		
		
	}

}
