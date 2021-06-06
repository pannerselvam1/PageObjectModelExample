package AdvancedSeinium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class Selectable {
	static	WebDriver driver;
	Actions action=new Actions(driver);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Testing\\GECKODRIVER\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/pages/selectable.html");
		Selectable obj=new Selectable();
		obj.selectMethod();
				
	}
	
	public void selectMethod() {
	List<WebElement> selectableGrp=driver.findElements(By.xpath("//ol[@id='selectable']//li"));
	//	Actions action=new Actions(driver);
	
	int size=selectableGrp.size();
	System.out.println(size);
	action.clickAndHold(selectableGrp.get(0))
	      .clickAndHold(selectableGrp.get(1))
	      .clickAndHold(selectableGrp.get(2)).build().perform();
	}

}
