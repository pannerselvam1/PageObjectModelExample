package DemoPack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");

		//1. click the alert box
		WebElement alertBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertBox.click();
//		alert interface 
		Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		//2. click the cancel button in confirmation box
		WebElement confirmationBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		confirmationBox.click();
		Alert alert2=driver.switchTo().alert();
		Thread.sleep(3000);
		alert2.dismiss();
		//3. click the prompt button
		WebElement promptButton=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		promptButton.click();
		Alert alert3=driver.switchTo().alert();
		String text=alert3.getText();
				alert3.sendKeys("Never Giveup");
		System.out.println(text);
		Thread.sleep(3000);
	 alert3.accept();
	}

}
