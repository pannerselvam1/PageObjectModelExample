package DemoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");

		WebElement firstcheckButton=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[2]/input"));
		WebElement secondcheckButton=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[3]/input"));
		boolean B1=firstcheckButton.isSelected();
		boolean B2=secondcheckButton.isSelected();
		System.out.println(B1);
		System.out.println(B2);
		
		WebElement clickAgeRange=driver.findElement(By.name("age"));
		clickAgeRange.click();
		
	}

}
