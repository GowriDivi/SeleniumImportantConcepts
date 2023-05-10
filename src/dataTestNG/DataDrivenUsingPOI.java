package dataTestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import java.util.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DataDrivenUsingPOI {
	
	static List <String> userNameList=new ArrayList<String>();
	static List <String> passwordList=new ArrayList<String>();
	
	
	public void readExcel() throws IOException {
	
		FileInputStream excel=new FileInputStream("C:\\Users\\GOWRI\\Downloads\\DataProvider.xlsx");
		
		Workbook workbook=new XSSFWorkbook(excel);
	    Sheet sheet=workbook.getSheetAt(0);
	    
	    Iterator <Row> rowIterator=sheet.iterator();
	    
	    while(rowIterator.hasNext()) {
	    	Row rowValue=rowIterator.next();
	    	
	    	Iterator <Cell> coloumnIterator=rowValue.iterator();
	    	
	    	int i=2;
	    	while(coloumnIterator.hasNext()) {
	    		if(i%2==0) {
	    			userNameList.add(coloumnIterator.next().getStringCellValue());
	    		}else {
	    			passwordList.add(coloumnIterator.next().getStringCellValue());
	    		}
	    		i++;
	    	}
	    }
}
	
	
	public void loginPage(String name, String pass) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		WebElement nameBox=driver.findElement(By.id("username"));
		nameBox.sendKeys(name);
		
		WebElement passwordBox=driver.findElement(By.id("password"));
		passwordBox.sendKeys(pass);
		
		WebElement loginButton=driver.findElement(By.id("submit"));
		loginButton.click();
		
		driver.close();
		
	}
	

	public void executeTest() {
		for(int i=0;i<userNameList.size();i++) {
			loginPage(userNameList.get(i),passwordList.get(i));
		}
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		DataDrivenUsingPOI UsingPOI=new DataDrivenUsingPOI();
		UsingPOI.readExcel();
		System.out.println("UserName List="+ userNameList);
		System.out.println("Password List="+ passwordList);
		UsingPOI.executeTest();
		
	}

}
