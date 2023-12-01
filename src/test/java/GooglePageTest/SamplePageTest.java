package GooglePageTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamplePageTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
	WebElement src=	driver.findElement(By.name("q"));
//	WebElement src=	driver.findElement(By.xpath("q"));
		
		
		
src.sendKeys("Java Tutorial");
Thread.sleep(2000);
List<WebElement> listitems = driver.findElements(By.xpath("//ul[@role='listbox']//li//descendent::div[@class='[pcTkSc']"));
System.out.println("total items: "+ listitems.size());
for(int i=0;i<listitems.size();i++) {
	
	System.out.println(listitems.get(i).getText());
   if(listitems.get(i).getText().equalsIgnoreCase("java tutorial pdf")) {
	   
	   
	   listitems.get(i).click();
	   
	   break;
   }	
	
//src.sendKeys(Keys.ENTER);
}
	}
}

