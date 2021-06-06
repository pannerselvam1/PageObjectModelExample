package DemoPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		//In dropdown box there are 3 ays to select the text
		//selectByIndex,Value,VisibleText
		//1. Select dropdown text by using ID. 
		WebElement dropdown1=driver.findElement(By.id("dropdown1"));
		Select select1= new Select(dropdown1);
		select1.selectByIndex(3);
		//Thread.sleep(3000);
		//2. Select dropdown text by using VisibleText.
		WebElement dropdown2=driver.findElement(By.name("dropdown2"));
		Select select2= new Select(dropdown2);
		select2.selectByVisibleText("Selenium");
		//3. Select dropdown text by using Value.
		WebElement dropdown3=driver.findElement(By.name("dropdown3"));
		Select select3= new Select(dropdown3);
		select3.selectByValue("1");
		
		//4. Select dropdown text by using Value.
		WebElement dropdown4=driver.findElement(By.className("dropdown"));
		Select select4= new Select(dropdown4);
		List<WebElement> listOfOption=select4.getOptions();
		int size=listOfOption.size();
		for(WebElement alltext:listOfOption) {
		System.out.println(alltext.getText());
		System.out.println(alltext.getAttribute("value"));
		}
				System.out.println("number of elements in dropDown"+size);
		//5. Select dropdown text by using sendKeys.(we can also using sendkeys to select the text)
		WebElement dropdown5=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
		dropdown5.sendKeys("Loadrunner");
		
		//6. MultiSelect dropdown text by using anything you need.
		WebElement multi=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select select6=new Select(multi);
		select6.selectByIndex(1);
		select6.selectByIndex(3);
		select6.selectByIndex(4);
	}


}
