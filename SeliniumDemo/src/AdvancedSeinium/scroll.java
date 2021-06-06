package AdvancedSeinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class scroll {
	public WebDriver driver= new ChromeDriver();

	public JavascriptExecutor executor=(JavascriptExecutor)driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\CHROMEDRIVER\\chromedriver.exe");	
		scroll obj=new scroll();
		obj.scrollDown();
		Thread.sleep(5000);
		obj.scrollUP();
		Thread.sleep(5000);
		obj.bottomPage();
		Thread.sleep(5000);
		obj.TopPage();
		Thread.sleep(5000);
		obj.ScrollWithPosition();
		
	}
	public void scrollDown(){
		driver.get("http://www.leafground.com/");
		executor.executeScript("window.scroll(0,250)", "");
	}
	
	public void scrollUP(){
		executor.executeScript("window.scroll(0,-250)", "");
	}
	public void bottomPage() {
		executor.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
	}
	public void TopPage() {
		executor.executeScript("window.scrollTo(0,0)", "");
	}
	public void ScrollWithPosition() {
		WebElement ToolTip=driver.findElement(By.xpath("//a[@href='pages/tooltip.html']"));
		executor.executeScript("arguments[0].scrollIntoView(true)", ToolTip);
		ToolTip.click();
		WebDriverWait wait= new WebDriverWait(driver, 5);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("age")));
		WebElement tipName = driver.findElement(By.id("age"));
		System.out.println(tipName.isDisplayed());
		String TipName=tipName.getAttribute("title");
		System.out.println("the tip name is:"+TipName);	
	}
}