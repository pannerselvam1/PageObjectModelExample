package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class loginPOM {

public static void maxmize(WebDriver driver) {
	driver.manage().window().maximize();
}


public static WebElement username(WebDriver driver) {
		return driver.findElement(By.name("username"));
	}
    public static WebElement password(WebDriver driver) {
    	return driver.findElement(By.name("password"));
    }
    public static WebElement submit(WebDriver driver) {
    	return driver.findElement(By.xpath("//button[@type='submit']"));
    }
    public static WebElement myProfile(WebDriver driver) {
    	return driver.findElement(By.xpath("//a[@href='#profile']"));
    }
    public static WebElement zip(WebDriver driver) {
    	
    	return driver.findElement(By.name("zip"));
    }
    public static WebElement dropdown(WebDriver driver) {
    	return	driver.findElement(By.xpath("//a[@class='chosen-single']")); 
    		   	
    }
    public static WebElement country(WebDriver driver) {
    	return	driver.findElement(By.xpath("//select[@class='chosen-the-basic form-control form-bg-light']")); 
    		   	
    }
    
}
