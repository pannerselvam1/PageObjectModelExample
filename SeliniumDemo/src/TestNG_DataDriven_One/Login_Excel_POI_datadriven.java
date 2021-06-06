package TestNG_DataDriven_One;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Login_Excel_POI_datadriven {
  WebDriver driver;
	@Test
  public void mainFunction() throws IOException {
	  FileInputStream path=new FileInputStream("D:\\Testing\\OrangeHRM.xlsx");
	 XSSFWorkbook book=new XSSFWorkbook(path);
	 XSSFSheet sheet=book.getSheetAt(0);	   
	 System.out.println(sheet.getLastRowNum());
	 XSSFRow row=sheet.getRow(0);
	 System.out.println(row.getLastCellNum());
	 
		 
	 
	 for(int i=0;i<=sheet.getLastRowNum();i++) {
		for(int j=0;j<=row.getLastCellNum();j++) {
			try {
			System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			System.out.println(sheet.getRow(i).getCell(j+1).getStringCellValue());
			
			
   		WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
   		username.clear();
   		username.sendKeys(sheet.getRow(i).getCell(j).getStringCellValue());
   		System.out.println(username.isDisplayed());
   		WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
   		password.sendKeys(sheet.getRow(i).getCell(j+1).getStringCellValue());
   		System.out.println(password.isDisplayed());
   		WebElement login=driver.findElement(By.xpath("//input[@id='btnLogin']"));
   		System.out.println(login.isDisplayed());
   		login.click();	
   		WebElement logo=driver.findElement(By.xpath("//img[@alt='OrangeHRM']"));
		if(logo.isDisplayed()) {
			System.out.println("successfully loged");   
		 		driver.navigate().back();
		}else {
			System.out.println("unsuccessfully loged");
			driver.get("https://opensource-demo.orangehrmlive.com/");
		}		
			}
			catch(Exception e) {
				WebElement error=driver.findElement(By.xpath("//span[@id='spanMessage']"));
				System.out.println(error.isDisplayed());
				System.out.println(error.getText());		
			 }
			break;
		}		
		}		
	
  }	
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Testing\\CHROMEDRIVER\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
