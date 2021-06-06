package DemoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.leafground.com/pages/Edit.html");
//driver.findElement(By.id("email")).sendKeys("text@gmail.com");
WebElement emailbox=driver.findElement(By.id("email"));
emailbox.sendKeys("text@gmail.com");

//driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input")).sendKeys("text");
WebElement appendBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
appendBox.sendKeys("selva");

//String value = driver.findElement(By.name("userame")).getAttribute("value");	
WebElement getTextBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input"));
String a=getTextBox.getAttribute("value");
System.out.println(a);

//driver.findElement(By.name("username")).clear();	
WebElement clearBox=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input"));
clearBox.clear();
	}

}
