package day5;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumGridDemo2 {
	WebDriver driver;
	WebDriverWait wait = null;

	@Parameters({ "browserName", "browerVersion", "os", "osVersion" })
	@BeforeMethod
	public void setup(String browserName, String browserVersion, String os, String osVersion) {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", browserName);
		capabilities.setCapability("browserVersion", browserVersion);
		capabilities.setCapability("os", os);
		capabilities.setCapability("osVersion", osVersion);

		URL url = null;
		try {
			url = new URL("https://shlokachowdhury_FDi13X:z3Qfzpp7JeNj7KAEXxp1@hub-cloud.browserstack.com/wd/hub");
		} catch (MalformedURLException e) {

			e.printStackTrace();
		}
//		driver = new EdgeDriver();
		driver = new RemoteWebDriver(url, capabilities);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void test13() {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		boolean check = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[normalize-space()='Dashboard']")))
				.getText().contains("Dashboard");
		Assert.assertTrue(check);

	}
}