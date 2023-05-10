package learnExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ExtentReportExample {
	
	WebDriver driver;
	ExtentReports extentReport;
	//ExtentHtmlReporter htmlReporter;
	ExtentTest testcase;
	
	@Test
	public void openGoogle() {
		testcase=extentReport.createTest("Verifying Google Title");
		testcase.log(Status.INFO, "Navigating to Google");
		
		driver.get("http://www.google.co.in");
		String title=driver.getTitle();
		
		//testcase.log(Status.INFO, "Actual title:"+title);
		//testcase.log(Status.INFO, "Expected title:"+"Google");
		//testcase.log(Status.INFO, "Verification of Actual and Expected title");
		
		if(title.equals("Google")) {
			testcase.log(Status.PASS, "Actaual and Expected title are equal!");
		}
		else {
			testcase.log(Status.FAIL, "Actual and expected title are not equal!");
		}
	}
	
		@BeforeSuite
		public void launchBrowser() {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			extentReport=new ExtentReports();
			//htmlReporter=new ExtentHtmlReporter("ExtentReport.html");
			//extentReport.attachReporter(htmlReporter);
			
			driver=new ChromeDriver();
		}
		
		@AfterSuite
		public void closeBrowser() {
			driver.close();
		}
	
	
	
	
	
	

}
