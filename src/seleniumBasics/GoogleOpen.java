package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
	public class GoogleOpen {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			WebDriver driver=new ChromeDriver(options);
			driver.get("https://www.google.co.in");
		
		}

	}



