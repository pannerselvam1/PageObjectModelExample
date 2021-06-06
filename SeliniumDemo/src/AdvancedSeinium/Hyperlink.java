package AdvancedSeinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlink {
	static	WebDriver driver=new ChromeDriver();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\CHROMEDRIVER\\chromedriver.exe");
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		Hyperlink obj=new Hyperlink();
		obj.linkOne();
	}
public static void linkOne() {
	WebElement linkOne=driver.findElement(By.linkText("Go to Home Page"));
	System.out.println(linkOne.isDisplayed());
	linkOne.click();
	driver.navigate().back();
}
}
