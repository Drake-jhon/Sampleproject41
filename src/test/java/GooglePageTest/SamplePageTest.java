package GooglePageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamplePageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	WebElement src=	driver.findElement(By.name("q"));
//	WebElement src=	driver.findElement(By.xpath("q"));
		
		
		
src.sendKeys("Java Tutorial");
src.sendKeys(Keys.ENTER);
	}

}
