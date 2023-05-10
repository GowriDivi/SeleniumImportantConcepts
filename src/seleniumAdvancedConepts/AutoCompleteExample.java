package seleniumAdvancedConepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/AutoComplete.html");
		
		WebElement inputbox=driver.findElement(By.xpath("//*[@id=\'searchbox\']"));
		inputbox.sendKeys("I");
		
		Thread.sleep(3000);
		List <WebElement> optionsList=driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		
		for(WebElement webelement : optionsList) {
			if(webelement.getText().equals("India")) {
				webelement.click();
				break;
			}
		}
	}

}
