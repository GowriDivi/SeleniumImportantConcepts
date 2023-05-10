package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxExample {

	public static void main(String[] args)  {
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/alert");
		
		WebElement alertbox=driver.findElement(By.id("accept"));
		alertbox.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		
		WebElement confirmAlert=driver.findElement(By.id("confirm"));
		confirmAlert.click();
		Alert confirm=driver.switchTo().alert();
		confirm.dismiss();

		
		WebElement promptAlert=driver.findElement(By.id("prompt"));
		promptAlert.click();
		Alert prompt=driver.switchTo().alert();
		prompt.sendKeys("Vinoth Gowri");
		prompt.accept();
		
		
		WebElement modernAlert=driver.findElement(By.xpath("//*[@id=\'modern\']"));
		modernAlert.click();
	}

}
