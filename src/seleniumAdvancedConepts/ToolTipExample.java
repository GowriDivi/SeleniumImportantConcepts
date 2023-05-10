package seleniumAdvancedConepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demoSite/practice/tooltip/forms.html");
		
		WebElement firstname=driver.findElement(By.id("firstname"));
		String text1=firstname.getAttribute("title");
		System.out.println(text1);
		
		WebElement lastname=driver.findElement(By.id("lastname"));
		String text2=lastname.getAttribute("title");
		System.out.println(text2);
		
		WebElement address=driver.findElement(By.id("address"));
		String text3=address.getAttribute("title");
		System.out.println(text3);
		
	}

}
