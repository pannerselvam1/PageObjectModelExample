package AdvancedSeinium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class AutoComplete  {
static	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\CHROMEDRIVER\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/autoComplete.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		AutoComplete obj=new AutoComplete();
//		obj.appium();
		obj.action();
	}
	public void appium() {
		WebElement searchBox=driver.findElement(By.id("tags"));
		System.out.println(searchBox.isDisplayed());
		searchBox.sendKeys("s");
		List<WebElement> searchList=driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		System.out.println(searchList.size());
		for (WebElement webElement : searchList) {
			if(webElement.getText().equals("SOAP")) {
				webElement.click();
				break;   //skip the 
			}
			
		}
	}
	public void action() throws InterruptedException {
		Actions action=new Actions(driver);
		WebElement searchBox=driver.findElement(By.id("tags"));
		System.out.println(searchBox.isDisplayed());
		searchBox.sendKeys("s");
		
		Thread.sleep(3000);
		action.keyDown(Keys.ARROW_DOWN).build().perform();

	}

}
