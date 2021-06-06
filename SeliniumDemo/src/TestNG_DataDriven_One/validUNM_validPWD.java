package TestNG_DataDriven_One;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validUNM_validPWD {
	WebDriver driver;
	@Test
	public void test1() {
		// TODO Auto-generated method stub
    	try {
    		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\CHROMEDRIVER\\chromedriver.exe");
    		 driver=new ChromeDriver();
    		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
    		WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
    		username.sendKeys("Admin");
    		System.out.println(username.isDisplayed());
    		WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
    		password.sendKeys("admin123");
    		System.out.println(password.isDisplayed());
    		WebElement login=driver.findElement(By.xpath("//input[@id='btnLogin']"));
    		System.out.println(login.isDisplayed());
    		login.click();	
    	}catch(Exception e) {
    		WebElement error=driver.findElement(By.xpath("//span[@id='spanMessage']"));
    		System.out.println(error.isDisplayed());
    		System.out.println(error.getText());
    	}


WebElement logo=driver.findElement(By.xpath("//img[@alt='OrangeHRM']"));
if(logo.isDisplayed()) {
	System.out.println("successfully loged");
	
}else {
	System.out.println("unsuccessfully loged");
}
	}
}