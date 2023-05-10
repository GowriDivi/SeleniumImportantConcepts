package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExamples {

	public static void main(String[] args) //throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		
		WebElement dropdown1=driver.findElement(By.id("fruits"));
		Select select1=new Select(dropdown1);
		select1.selectByVisibleText("Apple");
		
		
		WebElement dropdown3=driver.findElement(By.id("lang"));
		Select select3=new Select(dropdown3);
		select3.selectByIndex(1);
		//Thread.sleep(3000);
		select3.selectByValue("py");
		//Thread.sleep(4000);
		select3.selectByVisibleText("C#");
		
		
		WebElement dropdown4=driver.findElement(By.xpath("//*[@id=\'country\']"));
		dropdown4.sendKeys("India");
		
		
		WebElement dropdown2=driver.findElement(By.id("superheros"));
		Select multiselect=new Select(dropdown2);
		multiselect.selectByIndex(1);
		multiselect.selectByIndex(2);
		multiselect.selectByIndex(3);
		multiselect.selectByIndex(4);
		multiselect.selectByIndex(5);
		multiselect.selectByIndex(6);
		
		
	}

}
