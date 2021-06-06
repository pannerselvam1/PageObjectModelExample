package POM_TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import POM.loginPOM;

public class login_testcase {

	//	unm:user@phptravels.com
	//	pwd:demouser
	@Test
	public void login() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://www.phptravels.net/login");
		loginPOM.maxmize(driver);
		loginPOM.username(driver).sendKeys("user@phptravels.com");
		loginPOM.password(driver).sendKeys("demouser");
		loginPOM.submit(driver).click();
		loginPOM.myProfile(driver).click();
		loginPOM.zip(driver).clear();
		loginPOM.zip(driver).sendKeys("600047");
		loginPOM.dropdown(driver).click();
		driver.switchTo().activeElement().sendKeys("India");
//		Select select=new Select(loginPOM.country(driver));
//		select.selectByValue("IN");
		/*WebElement unm=driver.findElement(By.name("username"));
		unm.sendKeys("user@phptravels.com");
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys("demouser");
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();*/
	}


}
