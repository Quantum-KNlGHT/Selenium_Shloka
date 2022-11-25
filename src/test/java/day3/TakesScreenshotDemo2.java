package day3;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshotDemo2 {

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");

		try 
		{
			FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("./Mukesh.png"));
		} catch (IOException e) 
		{
			System.out.println("Failed "+e.getMessage());
		}
		
	}

}
