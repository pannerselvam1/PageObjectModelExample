package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecution {

	@Test
	public void bing() {
	System.setProperty("webdriver.chrome.driver", "D:\\Testing\\CHROMEDRIVER\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.bing.com");
	}
	@Test
	public void google() {
	System.setProperty("webdriver.chrome.driver", "D:\\Testing\\CHROMEDRIVER\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	}
}
