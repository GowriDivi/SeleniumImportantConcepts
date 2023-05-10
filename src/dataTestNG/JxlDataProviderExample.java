package dataTestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Workbook;
import jxl.Sheet;
import jxl.read.biff.BiffException;

public class JxlDataProviderExample {

	
	String[][] data=null;
	WebDriver driver;
	
	@DataProvider(name="loginData")
	public String[][] loginDataProvider() throws BiffException, IOException{
		data=getExcelData();
		return data;
	}
	
	
	public String[][] getExcelData() throws BiffException, IOException{
		
		FileInputStream excel=new FileInputStream("C:\\Users\\GOWRI\\Downloads\\DataProviderNew.xls");
		Workbook workbook=Workbook.getWorkbook(excel);
		Sheet sheet=workbook.getSheet(0);
		
		int rowCount=sheet.getRows();
		int coloumnCount=sheet.getColumns();
		
		String [][] testData=new String[rowCount-1] [coloumnCount];
		
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<coloumnCount;j++) {
				testData[i-1][j]=sheet.getCell(j, i).getContents();
			}
		}
		return testData;
	}
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
	
	}
	
	@AfterTest
	public void afterTest() {
		driver.close();
	}
	
	
	@Test(dataProvider="loginData")
	public void loginWithCorrectDetails(String name, String pass) {
		
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		WebElement nameBox=driver.findElement(By.id("username"));
		nameBox.sendKeys(name);
		
		WebElement passwordBox=driver.findElement(By.id("password"));
		passwordBox.sendKeys(pass);
		
		WebElement loginButton=driver.findElement(By.id("submit"));
		loginButton.click();
		
	
	}
}
