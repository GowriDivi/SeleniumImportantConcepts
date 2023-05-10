package seleniumAdvancedConepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RefreshAndMaximize {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		
		
		WebElement calendarImage=driver.findElement(By.xpath("//*[@id='datepickers']/tbody/tr[6]/td[2]/img"));
		calendarImage.click();
		
		WebElement dateButton=driver.findElement(By.xpath
				("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[2]/a"));
			dateButton.click();
			
			//1. when using driver.getCurrentUrl()
			//driver.get(driver.getCurrentUrl());

			//2. When using refresh command
			//driver.navigate().refresh();
			
			//3. Using F5 key
			
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		
		WebElement calendarImage1=driver.findElement(By.xpath("//*[@id='datepickers']/tbody/tr[6]/td[2]/img"));
		calendarImage1.click();
		
		WebElement dateButton1=driver.findElement(By.xpath
				("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[2]/a"));
			dateButton1.click();
			
		//1. maximize() in selenium
			driver.manage().window().maximize();

		//2. Dimension and window setsize
		/*
		 * Dimension dimension=new Dimension(1366, 768);
		 * driver.manage().window().setSize(dimension);
		 */
			
		//3.chromeoptions -> start maximized
		/*
		 * ChromeOptions chromeoptions=new ChromeOptions();
		 * chromeoptions.addArguments("--start.maximized"); WebDriver driver=new
		 * ChromeDriver(chromeoptions);
		 */
	}
}
