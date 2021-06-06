package TestNG_DataDriven_One;

import org.testng 	.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Login_DataProvider {
	WebDriver driver;
	String[][] data= {
		       { "Admin", "admin123" },
		       { "Admin1", "admin123" },
		       { "Admin", "admin1234" },
		       { "admin1", "admin1234" },
		    };
	@Test(dataProvider = "dp")
  public void f(String uname, String pword) {
		try {
    		WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
    		username.clear();
    		username.sendKeys(uname);
    		System.out.println(username.isDisplayed());
    		WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
    		password.sendKeys(pword);
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
    		
    	}catch(Exception e) {
    		WebElement error=driver.findElement(By.xpath("//span[@id='spanMessage']"));
    		System.out.println(error.isDisplayed());
    		System.out.println(error.getText());
    	}
		
  }

  @DataProvider
  public String[][] dp() {
	  return data;
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Testing\\CHROMEDRIVER\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
