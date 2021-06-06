package DemoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
WebDriver driver=new ChromeDriver();		
driver.get("http://www.leafground.com/pages/Button.html");	

//2. Find position(x,y) of the button
WebElement positionButton=driver.findElement(By.id("position"));
Point point=positionButton.getLocation();
int Xvalue=point.getX();
int Yvalue=point.getY();
System.out.println("the value of X coordinates:"+Xvalue);
System.out.println("the value of Y coordinates:"+Yvalue);

//3. Find color of the button
WebElement colorButton= driver.findElement(By.id("color"));
String color=colorButton.getCssValue("background-color");
System.out.println("color of the button is"+color);

//4. Find size of the button
WebElement sizeButton= driver.findElement(By.id("size"));
int height =sizeButton.getSize().getHeight();
int width =sizeButton.getSize().getWidth();
System.out.println("The height of the button is "+height);
System.out.println("The width of the button is "+width);

//1. Go to web welement
WebElement homeButton = driver.findElement(By.id("home"));
homeButton.click();
	}
	
}
