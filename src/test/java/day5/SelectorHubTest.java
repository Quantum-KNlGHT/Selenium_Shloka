package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelectorHubTest {
	
	@Test
	public void test() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.cssSelector("#userName"));
		SearchContext shadow=ele.getShadowRoot();
		shadow.findElement(By.id("kils")).sendKeys("Admin");
		
	}

}


