package DemoPack;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenMozilla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.gecko.driver", "D:\\Testing\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://google.com");
	
	//enter the search term
	//click the wiki link
	driver.findElement(By.name("q")).clear();
	//above CMD used for clear value of textbox
	//driver.findElements(By.name("q")).click();
	//driver.findElements(By.name("q")).sendKeys("selvaragavan"+Keys.ENTER);
    WebElement obe;
    obe=driver.findElement(By.name("q"));
    obe.sendKeys("selvaragavan"+Keys.ENTER);
	//driver.quit();
	
	
	}

}
