package day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTExampleXL {

	WebDriver driver=null;

	@BeforeMethod
	public void login() throws InterruptedException {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ineuron-courses.vercel.app/login");
	}

	@AfterMethod
	public void logout() throws InterruptedException {
		driver.quit();
	}



	@Test(dataProvider ="data-provider")
	public void myTest(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password1']")).sendKeys(password);
		driver.findElement(By.className("submit-btn")).click();;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Sign out']")).isDisplayed());;
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[normalize-space()='Sign out']")).click();
		
	}

	@DataProvider(name="data-provider")
	public Object[][] testData() {

		File src=new File("./Testdata/SapientTestData.xlsx");

		try {
			XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(src));

			int row=wb.getSheet("Sheet1").getPhysicalNumberOfRows();
			int col=wb.getSheet("Sheet1").getRow(0).getPhysicalNumberOfCells();
			
			Object arr[][]=new Object[row][col];

			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					arr[i][j]=wb.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
					System.out.println(arr[i][j]);
				}
			}
			return arr;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return null;
		
		 


	}

}
