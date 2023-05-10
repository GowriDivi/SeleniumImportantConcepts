package dataTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CorrectUserName {
	
	@Test
	@Parameters({"username","password"})
	public void loginWithCorrectUserName(String name, String pass) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		WebElement nameBox=driver.findElement(By.id("username"));
		nameBox.sendKeys(name);
		
		WebElement passwordBox=driver.findElement(By.id("password"));
		passwordBox.sendKeys(pass);
		
		WebElement loginButton=driver.findElement(By.id("submit"));
		loginButton.click();
		
		//driver.quit();
		
	}
	

}
