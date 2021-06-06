package AdvancedSeinium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "D:\\Testing\\CHROMEDRIVER\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/download.html");
	WebElement excelLink=driver.findElement(By.linkText("Download Excel"));
	excelLink.click();
	Thread.sleep(5000);
	File path=new File("C:\\Users\\ADMIN\\Downloads");
	File[] listFiles=path.listFiles();
	for (File file : listFiles) {
		if(file.getName().equals("testleaf.xlsx")) {
			System.out.println("file download successfully");
			break;
			//use break to skip 
				}
		else {
			System.out.println("file can't downloaded");	
			}

	}
	}

}