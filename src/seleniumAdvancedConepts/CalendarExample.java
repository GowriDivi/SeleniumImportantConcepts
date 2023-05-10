package seleniumAdvancedConepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		WebElement inputbox1=driver.findElement
				(By.xpath("//*[@id='first_date_picker']"));
		Thread.sleep(3000);
		inputbox1.sendKeys("05/15/2023"+Keys.ENTER);
		
		WebElement inputbox2=driver.findElement(By.xpath("//*[@id='second_date_picker']"));
		inputbox2.sendKeys("03/17/2023"+Keys.ENTER);

		
		/*WebElement inputbox=driver.findElement(By.xpath
				("//*[@id='datetimePicker711defd4-498e-439e-8d36-167f65f880ca']/div[1]"));
		inputbox.click();*/
		/*WebElement nextButton=driver.findElement(By.xpath
				("//*[@id='datetimePicker5d5b8202-f0b3-43c4-87c7-ab56346d16ff']/div[2]/div[2]/div[1]/div[2]/div[1]/button[2]/svg/polyline"));
		nextButton.click();
		
		WebElement dateButton=driver.findElement(By.xpath
			("//*[@id='datetimePicker5d5b8202-f0b3-43c4-87c7-ab56346d16ff']/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[16]/button"));
		dateButton.click();*/
		
		
	}

}