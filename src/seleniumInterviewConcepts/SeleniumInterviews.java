package seleniumInterviewConcepts;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;

import org.openqa.selenium.support.ui.FluentWait;

public class SeleniumInterviews {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		//1. Implicit Wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mens watch"+Keys.ENTER);

		//2. Explicit Wait
				WebDriverWait wait=new WebDriverWait(driver,10);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath
						("//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span")));
		
		//3. Fluent Wait
		/*
		 * FluentWait <WebDriver> wait=new FluentWait <WebDriver> (driver);
		 * wait.until((Predicate<WebDriver>) new Function <WebDriver,WebElement>(){
		 * public WebElement apply(WebDriver driver) { return
		 * driver.findElement(By.xpath
		 * ("//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span"
		 * )); }
		 * 
		 * });
		 */
				
		WebElement watch1=driver.findElement(By.xpath
				("//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span"));
		watch1.click();
		}
	}


