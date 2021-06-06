package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_pagefactory {
    public static void beforeLogin(WebDriver driver) {
    	driver.navigate().to("https://www.phptravels.net/login");
    }
    public static void maximize(WebDriver driver) {
    	driver.manage().window().maximize();
    }
	@FindBy(name="username")
	 public static WebElement username;
     @FindBy(name="password")
	 public static WebElement password;
     @FindBy(xpath = "//button[@type='submit']")
     public static WebElement submit;
     @FindBy(xpath = "//a[@href='#profile']")
     public static WebElement myprofile;
     @FindBy(name="city")
     public static WebElement city; 
     @FindBy(name="state")
     public static WebElement State;
}
