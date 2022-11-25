package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumScript7 {

	public static void main(String[] args) throws InterruptedException {

		//SearchContext driver1=new ChromeDriver();

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
		
		List<WebElement> allSocialIcons=driver.findElements(By.xpath("//div[@id='social-icons']//a"));
		
		System.out.println("Count is "+allSocialIcons.size());
		
		for(WebElement ele:allSocialIcons)
		{	
			String href=ele.getAttribute("href");
			
			System.out.println("Href values "+href);
			
			if(href.contains("twitter"))
			{
				ele.click();
				break;
			}	
		}
		driver.quit();
		
		// We will create lib to handle multiple scenarios
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
