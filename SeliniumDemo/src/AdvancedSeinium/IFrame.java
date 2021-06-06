package AdvancedSeinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Testing\\CHROMEDRIVER\\chromedriver.exe");
		driver=new ChromeDriver();	
		driver.navigate().to("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
	
		IFrame obj=new IFrame();
		obj.framehandling();
		obj.framehandling1();
		obj.framecount();

	
	}
	public void framehandling() {
//1. handling frame-it's in seperate html in html
		driver.switchTo().frame(0);
		WebElement button1=driver.findElement(By.id("Click"));
		System.out.println(button1.isDisplayed());
		button1.click();
		Boolean f1=button1.isEnabled();
		System.out.println(f1);
		if(f1) {
			System.out.println("frame 1 is selected");
			System.out.println(button1.getText());
		}
		
	}
	public void framehandling1() {
//2. handling Nestedframe-html in html in html		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement button2=driver.findElement(By.id("Click1"));
		button2.click();
		boolean f2 =button2.isEnabled();
		if(f2) {
			System.out.println("frame2 is selected");
			System.out.println(button2.getText());
		}
	}
//3. Find total number of frames
	public void framecount() {
		driver.switchTo().defaultContent();
		List<WebElement> frame3=driver.findElements(By.tagName("iframe"));
//	add	util list
		int frameCount=frame3.size();
		System.out.println(frameCount);
	}
}