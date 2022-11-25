package day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindow2 {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));

		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
	
		//driver.switchTo().window("Mukesh");
		
		String parent=driver.getWindowHandle();
		
		System.out.println("parent window handle is "+parent);
		
		List<WebElement> allSocialMediaLinks=driver.findElements(By.xpath("//div[@id='social-icons']//img"));
		
		for(WebElement ele:allSocialMediaLinks)
		{
			ele.click();
		}
		
		Set<String> allWindows=driver.getWindowHandles();
		
		List<String> socialMediaList=new ArrayList<String>(allWindows);
		
		String first=socialMediaList.get(0);
		
		String second=socialMediaList.get(1);
		
		String third=socialMediaList.get(2);
		
		String fourth=socialMediaList.get(3);
		
		Thread.sleep(3000);
		
		driver.switchTo().window(third);
		
		System.out.println("Title is "+driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.switchTo().window(parent);
		
		Thread.sleep(3000);
		
		System.out.println("Title is "+driver.getTitle());
		
		driver.switchTo().window(fourth);
		
		System.out.println("Title is "+driver.getTitle());
		
		
		
		

	}

}
