package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class BeforeAfterSuiteAnnotation {
	WebDriver driver;
  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Testing\\CHROMEDRIVER\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }
  @Test
  public void google() {
	  driver.get("http://www.google.co.in");
	  String googleTitle=driver.getTitle();
	  googleTitle.equalsIgnoreCase("google");
	  if(googleTitle.equalsIgnoreCase("google")) {
		  System.out.println("google search engine executed successfully");
	  }else {
		  System.out.println("executted unsuccessfull");
	  }
  }
  @Test
  public void bing() {
	  driver.get("http://www.bing.com");
	  String bingTitle=driver.getTitle();
	  bingTitle.equalsIgnoreCase("bing");
	  if(bingTitle.equalsIgnoreCase("bing")) {
		  System.out.println("bing search engine executed successfully");
	  }else {
		  System.out.println("executted unsuccessfull");
	  }
  }

  @AfterSuite
  public void afterSuite() {
  driver.close();
  }
}
