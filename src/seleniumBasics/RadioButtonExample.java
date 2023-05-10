package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/radio");
		
		WebElement first=driver.findElement(By.xpath("//*[@id=\'yes\']"));
		first.click();
		
		WebElement foo=driver.findElement(By.xpath("//*[@id=\'foo\']"));
		boolean foo1=foo.isSelected();
		System.out.println("foo is selected?"+" "+foo1);
		
		WebElement bar=driver.findElement(By.
				xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[4]/div/label[2]"));
				
		boolean bar1=bar.isSelected();
		System.out.println("Bar is selected?"+" "+bar1);
		
		
		WebElement maybe=driver.findElement(By.xpath
				("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[5]/div/label[3]"));
		boolean check=maybe.isDisplayed();
		System.out.println("May be Button is Disabled?"+" "+check);
		

	}

}


