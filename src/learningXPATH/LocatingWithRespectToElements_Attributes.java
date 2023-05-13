package learningXPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingWithRespectToElements_Attributes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		
		//1. Locating element with known Attribute
		
		WebElement firstname=driver.findElement(By.xpath("//*[@id='RESULT_TextField-1']"));
		firstname.sendKeys("VINOTH");
		
		
		//2.Locating element with known Element & Attribute
		
		WebElement lastname=driver.findElement(By.xpath("//*[@id='RESULT_TextField-2']"));
		lastname.sendKeys("KUMAR");
		
		//5. Locating element with Multiple Attributes
		
				WebElement city=driver.findElement(By.xpath("//*[@type='text'][@name='RESULT_TextField-5'][@id='RESULT_TextField-5']"));
				city.sendKeys("Chennai");
		
		
		//3. Locating element with known Visible Text
		
		WebElement firstLink=driver.findElement(By.xpath("//a[text()='Software Testing Tutorials']"));
		firstLink.click();
		
		//4. Locating element when part of the Visible Text is known
		
		/*
		 * WebElement secondLink=driver.findElement(By.
		 * xpath("//a[contains(text(),'Software Testing ')]")); secondLink.click();
		 */
		
		//6. Locating element when starting Visible Test is known
		
		WebElement seleniumWithJava=driver.findElement(By.xpath("//*[starts-with(text(),'Selenium')]"));
		seleniumWithJava.click();
		
		//7. Locating elements with Dynamic Attribute Values
		
		WebElement newLink=driver.findElement(By.xpath("//a[contains(@href,'Manual')]"));
		newLink.click();

	}

}
