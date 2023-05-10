package dataDrivenUsingPOMFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCases {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://testphp.vulnweb.com/login.php");
		
		UsingPOMFramework.username(driver).sendKeys("test");
		UsingPOMFramework.password(driver).sendKeys("test");
		UsingPOMFramework.login(driver).click();
		UsingPOMFramework.name(driver).clear();
		UsingPOMFramework.name(driver).sendKeys("Gowri");
		UsingPOMFramework.creditCardNo(driver).clear();
		UsingPOMFramework.creditCardNo(driver).sendKeys("5623 1525 9596 2505");
		UsingPOMFramework.email(driver).clear();
		UsingPOMFramework.email(driver).sendKeys("testpractice@gmail.com");
		UsingPOMFramework.phoneNO(driver).clear();
		UsingPOMFramework.phoneNO(driver).sendKeys("9876543210");
		UsingPOMFramework.address(driver).clear();
		UsingPOMFramework.address(driver).sendKeys("25, J Block, Anna Nagar, Chennai 600 028.");
		UsingPOMFramework.update(driver).click();
		
		driver.close();
	}

}
