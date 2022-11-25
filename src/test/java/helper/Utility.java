package helper;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	public static void captureScreenshot(WebDriver driver) {
		try {
			FileHandler.copy(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), new File("./Mukesh.png"));
		} catch (IOException e) {
			System.out.println("Failed " + e.getMessage());
		}
	}
	
	public static void captureScreenshotWithTimeStamp(WebDriver driver) {
		try {
			FileHandler.copy(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), 
					
					new File("./ "+captureDateTime()+".png"));
			
		} catch (IOException e) {
			System.out.println("Failed " + e.getMessage());
		}
	}
	

	public static void captureScreenshotOld(WebDriver driver) {
		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File("./Mukesh.png");

		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			System.out.println("Failed " + e.getMessage());
		}
	}
		
		public static String captureDateTime()
		{
			Date d=new Date();
			
			SimpleDateFormat mydateFormat=new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
			System.out.println(mydateFormat.format(d));
			return mydateFormat.format(d);
			

			
		}
		
		
	

}
