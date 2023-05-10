package seleniumAdvancedConepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExample {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://letcode.in/sortable");
			Thread.sleep(3000);

			/*WebElement simplelistButton=driver.findElement(By.xpath("//*[@id='Simple List']"));
			simplelistButton.click();
			Thread.sleep(3000);*/
			
			List<WebElement> elements = driver.findElements(By.xpath("//*[@id='cdk-drop-list-0']/li"));
			int size=elements.size();
			System.out.println("Elements in the list are:"+size);
			
			/*WebElement fromElement=elements.get(6);
			WebElement toElement=elements.get(0);
			
			Actions actions=new Actions(driver);
			
			actions.clickAndHold(fromElement);
			actions.moveToElement(toElement);
			Thread.sleep(3000);
			actions.release(toElement);
			actions.build().perform();*/
			
			
			
	}
}
