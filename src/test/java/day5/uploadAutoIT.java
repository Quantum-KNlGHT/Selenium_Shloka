package day5;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class uploadAutoIT {

	@Test
	private static void test() throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//input[@id='file-upload']"))).click().perform();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\shlchowd\\Desktop\\uploadFile.exe");
		driver.findElement(By.id("file-submit")).click();

	}
}
