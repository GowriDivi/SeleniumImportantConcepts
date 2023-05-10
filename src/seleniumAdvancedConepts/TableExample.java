package seleniumAdvancedConepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://letcode.in/table");
		driver.get("https://letcode.in/advancedtable");
		
		List <WebElement> coloumns =driver.findElements(By.tagName("th"));
		int coloumnCount=coloumns.size();
		System.out.println("No of Coloumns are:"+" "+coloumnCount);
		
		
		List <WebElement> rows =driver.findElements(By.tagName("tr"));
		int rowCount=rows.size();
		System.out.println("No of Coloumns are:"+" "+ rowCount);

	}

}
