package AdvancedSeinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tooltip {
static	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "D:\\Testing\\GECKODRIVER\\geckodriver.exe");
driver=new FirefoxDriver();
driver.navigate().to("http://www.leafground.com/pages/tooltip.html");
tooltip obj=new tooltip();
obj.toolTipText();
	}
	public void toolTipText() {
		WebElement text=driver.findElement(By.id("age"));
		String T1=text.getAttribute("title");
		System.out.println(T1);
	}

}
