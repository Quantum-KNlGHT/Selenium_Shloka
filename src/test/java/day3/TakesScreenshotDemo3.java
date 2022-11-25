package day3;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import helper.Utility;

public class TakesScreenshotDemo3 {

	public static void main(String[] args) throws IOException {

		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://google.com");
		
		Utility.captureScreenshotWithTimeStamp(driver);
		
		File scr=driver.findElement(By.name("q")).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(scr, new File("./GoogleSearch.png"));
		
		driver.quit();
		
	}

}
