package GooglePageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        driver.get("https://automationbookstore.dev/");
        String strPlaceholder = driver.findElement(By.id("searchBar")).getAttribute("placeholder");
        System.out.println(strPlaceholder);
        WebElement closecon = driver.findElement(By.cssSelector(" a[title = 'Clear Text']"));
        System.out.println(closecon.isDisplayed());
        if(closecon.isDisplayed()) {
        	closecon.click();
        }
	
	}

}
