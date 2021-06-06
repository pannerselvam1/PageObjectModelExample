package DemoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		//1. Select the language hat you know
		WebElement javaCheckBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
		WebElement VBCheckBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[2]/input"));
		WebElement CCheckBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[4]/input"));
		WebElement CppCheckBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[5]/input"));
		javaCheckBox.click();
		VBCheckBox.click();
		CCheckBox.click();
		CppCheckBox.click();

		//2. Confirm the selenium is selected
		WebElement seleniumCheckBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
		boolean seliniumselected=seleniumCheckBox.isSelected();
		if(seliniumselected) 
		{
			System.out.println("Selinium check box is checked");
		}
		else {
			System.out.println("Selinium check box is unchecked");
		}
		//3. Deselect the selected
		WebElement S1=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));
		WebElement S2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
		boolean sb1,sb2;
		if(sb1=S1.isSelected()) {
			S1.click();
		}
		if(sb2=S2.isSelected()){
			S2.click();
		}
		//4. select the all belo check box
		WebElement option1Checkbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[1]/input"));
		WebElement option2Checkbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[2]/input"));
		WebElement option3Checkbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[3]/input"));
		WebElement option4Checkbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[4]/input"));
		WebElement option5Checkbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[5]/input"));
		option1Checkbox.click();
		option2Checkbox.click();
		option3Checkbox.click();
		option4Checkbox.click();
		option5Checkbox.click();
		
		
		

	}
}
