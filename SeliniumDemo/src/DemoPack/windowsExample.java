package DemoPack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\Testing\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		//save the parent window
		String parentWindow=driver.getWindowHandle();

		WebElement firstButton=driver.findElement(By.id("home"));
		firstButton.click();
		Set<String> allWindows1=driver.getWindowHandles();
		for (String newWindow : allWindows1) {
			driver.switchTo().window(newWindow);
		}
		WebElement editButton=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		editButton.click();
		driver.close();
		//control back to the parent window
		driver.switchTo().window(parentWindow);
		//2. Fined the number of opened Window
		WebElement secondButton=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		secondButton.click();
		int a=allWindows1.size();
		System.out.println("No. of window opened:"+a);
		
		WebElement thirdButton=driver.findElement(By.id("color"));
		thirdButton.click();
		Set<String> allWindows2=driver.getWindowHandles();
		for (String newWindow2 : allWindows2) {
			if (newWindow2!=parentWindow) {
				driver.switchTo().window(newWindow2);
				Thread.sleep(3000);
				driver.close();
				
				
			}
		}
		
		
		
		
		
	}

}