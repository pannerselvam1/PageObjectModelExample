package DemoPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenChrome {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Seinium Demo");
		//to open a browser in selinium
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("browser opened");
		driver.get("http://google.com");
		System.out.println("google website opened");
		
	}


}
