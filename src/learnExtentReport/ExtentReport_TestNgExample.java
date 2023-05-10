package learnExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport_TestNgExample {
	
	WebDriver driver;
	ExtentReports extentReport;
	ExtentSparkReporter sparkReporter;
	ExtentTest testcase;
	
	@Test
	public void openGoogle() {
		testcase=extentReport.createTest("Verifying Google Title");
		//testcase.log(Status.INFO, "Navigating to Google");
		driver.get("https:www.google.co.in");
		String title=driver.getTitle();
		
		if(title.equals("Google")) {
			System.out.println("Test Passed!");
		}
		else {
			System.out.println("Test Failed!");
		}
	}
	
	@Test
	public void openBing() {
		testcase=extentReport.createTest("Verifying Bing Title");
		driver.get("https:www.bing.com");
		String title=driver.getTitle();
		
		if(title.equals("Bing")) {
			System.out.println("Test Passed!");
		}
		else {
			System.out.println("Test Failed!");
		}
	}
	
	@Test
	public void openWikipedia() {
		testcase=extentReport.createTest("Verifying Wikipedia Title");
		driver.get("https:www.wikipedia.com");
		String title=driver.getTitle();
		
		if(title.equals("Wikipedia")) {
			System.out.println("Test Passed!");
		}
		else {
			System.out.println("Test Failed!");
		}
	}
	
		@BeforeSuite
		public void openBrowser() {
			extentReport=new ExtentReports();
			sparkReporter=new ExtentSparkReporter("ExtentReport.html");
			extentReport.attachReporter(sparkReporter);
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			driver=new ChromeDriver();
		}
		
		@AfterSuite
		public void closeBrowser() {
			driver.close();
		
	}
}