package dataDrivenUsingPOMFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UsingPOMFramework {
	
	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.name("uname"));
	}

	
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.name("pass"));
	}
	
	public static WebElement login(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='content']/div[1]/form/table/tbody/tr[3]/td/input"));
	}
	
	public static WebElement name(WebDriver driver) {
		return driver.findElement(By.name("urname"));
	}

	public static WebElement creditCardNo(WebDriver driver) {
		return driver.findElement(By.name("ucc"));

	}
	
	public static WebElement email(WebDriver driver) {
		return driver.findElement(By.name("uemail"));
	}
	
	public static WebElement phoneNO(WebDriver driver) {
		return driver.findElement(By.name("uphone"));
	}
	
	public static WebElement address(WebDriver driver) {
		return driver.findElement(By.name("uaddress"));
	}
	
	public static WebElement update(WebDriver driver) {
		return driver.findElement(By.name("update"));
	}
}
