package DemoPack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshotUsingSeliniumFilehandler {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Testing\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/pages/Alert.html");
		//take screenshot
		TakesScreenshot TSS=(TakesScreenshot) driver;
		File source=TSS.getScreenshotAs(OutputType.FILE);

		//using selenium file handler
		File destination=new File("D:\\Testing\\Screenshotes\\sample.png");
		FileHandler.copy(source, destination);
//		its does not work..if alert box is open...
//		that time we will going to Robot class (java.awt)

	}

}
