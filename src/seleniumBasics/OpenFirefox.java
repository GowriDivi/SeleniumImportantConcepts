package seleniumBasics;

import org.openqa.selenium.WebDriver;



import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","‪C:\\Users\\GOWRI\\Downloads\\geckodriver-v0.33.0-win64 (1)\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.in");
	}

}

