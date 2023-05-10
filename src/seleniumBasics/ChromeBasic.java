package seleniumBasics;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeBasic {


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String u=driver.getCurrentUrl();
		
		if(u.equals("https://www.google.com")) {
			System.out.println("Test case Passed!!!");
		}
		
		else {
			System.out.println("Test Case Failed...");
		}
	}

}

	
