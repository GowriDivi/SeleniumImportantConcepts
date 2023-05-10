package seleniumAdvancedConepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/windows");
		
		String oldwindow=driver.getWindowHandle();//parent window
	
		WebElement home=driver.findElement(By.id("home"));
		home.click();
	
		Set<String> handles=driver.getWindowHandles();//total windows opened by the driver
		for(String newwindows:handles) {
			driver.switchTo().window(newwindows);
			
		}
		
		WebElement editbox=driver.findElement(By.
				xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[1]/app-menu/div/footer/a"));
		editbox.click();
		driver.close();
		
		driver.switchTo().window(oldwindow);
		
		WebElement multiwindow=driver.findElement(By.id("multi"));
		multiwindow.click();
		
		
		int windowscount=driver.getWindowHandles().size();
		System.out.println("No. of Windows opened:"+" "+windowscount);
		
		Set<String> newHandles=driver.getWindowHandles();
		
		for(String allwindows:newHandles) {
			if(!allwindows.equals(oldwindow)) {
				driver.switchTo().window(allwindows);
				driver.close();
			}
		}
		driver.quit();
	}

}
