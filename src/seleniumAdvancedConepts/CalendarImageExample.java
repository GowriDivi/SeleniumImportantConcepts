package seleniumAdvancedConepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarImageExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		
		WebElement calendarImage=driver.findElement(By.xpath("//*[@id='datepickers']/tbody/tr[6]/td[2]/img"));
		calendarImage.click();
		Thread.sleep(3000);
		
		WebElement nextButton=driver.findElement(By.xpath
				("//*[@id='ui-datepicker-div']/div/a[2]/span"));
		nextButton.click();
		Thread.sleep(3000);
		
		WebElement dateButton=driver.findElement(By.xpath
			("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[2]/a"));
		dateButton.click();
		Thread.sleep(3000);
		
		
	}

}
