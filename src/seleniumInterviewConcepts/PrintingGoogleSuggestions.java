package seleniumInterviewConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingGoogleSuggestions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		WebElement searchBox=driver.findElement(By.xpath("//*[@id='APjFqb']"));
		searchBox.sendKeys("vinoth");
		

		  Thread.sleep(5000);
		 
		  List <WebElement> searchSuggestions=driver.findElements(By.xpath(
		  "//ul[@role='presentation'//following::li"));
		  
		  for(WebElement webElement : searchSuggestions) {
		 
		 System.out.println(webElement.getText());
		 
		  }
	}
}

		
		 
		 

	


