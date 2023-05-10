package seleniumInterviewConcepts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadingPropertyFile {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=null;
		
		FileInputStream stream=new FileInputStream("config.properties");
		Properties properties=new Properties();
		properties.load(stream);
		
		String browser=properties.getProperty("Browser");
		String location=properties.getProperty("DriverLocation");
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", location);
			
		    driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", location);
					
			 driver=new FirefoxDriver();
		}
		
		else {
			System.setProperty("webdriver.edge.driver", location);
			
			 driver=new EdgeDriver();
			
		}
		
		driver.get("https://www.google.co.in");
		
	}

}
