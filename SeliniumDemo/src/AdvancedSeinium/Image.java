package AdvancedSeinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image {
	
static	WebDriver driver=new ChromeDriver();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\CHROMEDRIVER\\chromedriver.exe");
driver.navigate().to("http://www.leafground.com/pages/Image.html");
driver.manage().window().maximize();
Image obj=new Image();
obj.homeImage();
obj.brokenImage();
}
	public void homeImage() {
		WebElement homeImage=driver.findElement(By.xpath("//label[@for='home']/following::img"));
		homeImage.click();
		driver.navigate().back();
	}
	public void brokenImage() {
		WebElement brokenImage=driver.findElement(By.xpath("//label[@for='position']/following::img"));
		String brokenImageText=brokenImage.getAttribute("naturalWidth");
		
		if(brokenImageText.equals("0")) {
			System.out.println("image is broken");
		}else {
			System.out.println("image is not broken");
		}
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
	}

	
}
