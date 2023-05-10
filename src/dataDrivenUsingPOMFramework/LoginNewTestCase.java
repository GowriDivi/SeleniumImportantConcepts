package dataDrivenUsingPOMFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginNewTestCase {
	
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://testphp.vulnweb.com/login.php");
	
	
	PageFactory.initElements(driver, UsingPageFactory.class);
	
	
	UsingPageFactory.username.sendKeys("test");
	UsingPageFactory.password.sendKeys("test");
	UsingPageFactory.loginButton.click();
	
	UsingPageFactory.name.clear();
	UsingPageFactory.name.sendKeys("Gowri");
	UsingPageFactory.creditCarNo.clear();
	UsingPageFactory.creditCarNo.sendKeys("5623 1525 9596 2505");
	UsingPageFactory.email.clear();
	UsingPageFactory.email.sendKeys("testpractice@gmail.com");
	UsingPageFactory.phoneNO.clear();
	UsingPageFactory.phoneNO.sendKeys("9876543210");
	UsingPageFactory.address.clear();
	UsingPageFactory.address.sendKeys("15-V, J Block, Anna Nagar, Chennai 600 028.");
	UsingPageFactory.updateButton.click();
	
	Thread.sleep(3000);
	
	driver.close();
	
	}
	
}
