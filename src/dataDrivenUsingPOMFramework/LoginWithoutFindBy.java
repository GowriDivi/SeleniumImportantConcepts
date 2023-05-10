package dataDrivenUsingPOMFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginWithoutFindBy {

	public static WebElement uname;
	public static WebElement pass;
	
	@FindBy(xpath="")
	public static WebElement login;
	public static WebElement urname;
	public static WebElement ucc;
	public static WebElement uemail;
	public static WebElement uphone;
	public static WebElement uaddress;
	public static WebElement update;
	
	
	@Test
	public void loginStyle() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://testphp.vulnweb.com/login.php");
		
		
		PageFactory.initElements(driver, LoginWithoutFindBy.class);
		
		
		uname.sendKeys("test");
		pass.sendKeys("test");
		login.click();
		urname.clear();
		urname.sendKeys("Gowri");
		ucc.clear();
		ucc.sendKeys("5623 1525 9596 2505");
		uemail.clear();
		uemail.sendKeys("testpractice@gmail.com");
		uphone.clear();
		uphone.sendKeys("9876543210");
		uaddress.clear();
		uaddress.sendKeys("15-V, J Block, Anna Nagar, Chennai 600 028.");
		update.click();
		Thread.sleep(3000);
		driver.close();
		
	}
}
