package AdvancedSeinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.chrome.driver", "D:\\Testing\\CHROMEDRIVER\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("http://www.leafground.com/pages/drop.html");
	
WebElement source=driver.findElement(By.id("draggable"));
WebElement destination=driver.findElement(By.id("droppable"));
Actions actions=new Actions(driver);
//actions.clickAndHold(source).moveToElement(destination).build().perform();
actions.dragAndDrop(source, destination).build().perform();
	}

}
