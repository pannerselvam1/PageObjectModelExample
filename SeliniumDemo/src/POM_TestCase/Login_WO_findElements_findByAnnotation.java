package POM_TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POM.Login_pagefactory;

public class Login_WO_findElements_findByAnnotation {
	public static WebElement username;
	public static WebElement password;
//if we using pagefactory compulsery use "static"
	
	@Test
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		PageFactory.initElements(driver, Login_WO_findElements_findByAnnotation.class);
		username.sendKeys("user@phptravels.com");
		password.sendKeys("demouser"+Keys.ENTER);
		
		
	}

}
