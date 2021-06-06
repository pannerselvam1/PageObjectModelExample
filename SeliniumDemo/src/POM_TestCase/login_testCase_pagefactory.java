package POM_TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POM.Login_pagefactory;

public class login_testCase_pagefactory {
@Test
	public void login() {
	WebDriver driver=new ChromeDriver();
	Login_pagefactory.maximize(driver);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	PageFactory.initElements(driver, Login_pagefactory.class);
	Login_pagefactory.beforeLogin(driver);
	Login_pagefactory.username.sendKeys("user@phptravels.com");
		Login_pagefactory.password.sendKeys("demouser");
		Login_pagefactory.submit.click();
		Login_pagefactory.myprofile.click();
		Login_pagefactory.city.sendKeys("chennai");
	Login_pagefactory.State.sendKeys("TamilNadu");
	}
	
	
}
