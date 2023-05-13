package learningXPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

					// This coding is only to write XPATH

public class LocatingElementsRealtiveToKnownElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		//1. Locating a Parent Element
		
		WebElement parent=driver.findElement(By.xpath("//input[@id='username']/parent::*"));
		
		//2. Locating a child Element
		
		WebElement Child=driver.findElement(By.xpath("//div[@id='form']/child::div"));
		
		//3. Locating Ancestors of Known Element
		
		WebElement ancestors=driver.findElement(By.xpath("//input[@id='password']/ancestor::div"));
		
		//4. Locating Following Element
		
		WebElement following=driver.findElement(By.xpath("//input[@id='password']/following::*"));
		
		//5. Locating Preceding Element
		
		WebElement preceding=driver.findElement(By.xpath("//button[@id='submit']/preceding::input"));
		
		//6. Locating Following Sibling
		
		WebElement followingSibling=driver.findElement(By.xpath("//header[@id='site-header']/following-sibling::section"));
		
		//7. Locating Preceding Sibling
		
		WebElement precedingSibling=driver.findElement(By.xpath("//section[@id='main-container']/preceding-sibling::*"));
		
	}

}
