package GooglePageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChkRadioTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver  driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		WebElement age= driver.findElement(By.id("isAgeSelected"));
		if(!age.isSelected()) {
			
			age.click();
			
		}
	
		driver.findElement(By.xpath("//input[@class='cbl-element'])[2]")).click();
		
		
//		driver.get("https://demo.seleniummeasy.com/basic-radiobutton-demo.html");
//		driver.findElement(By.xpath("//input[@value='5 -15']")).click();
		
		
	
	
	}

}
