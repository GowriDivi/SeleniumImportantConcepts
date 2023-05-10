package seleniumAdvancedConepts;

import org.openqa.selenium.By;
import java.io.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/file");
		
		
		WebElement downloadPdf=driver.findElement(By.xpath("//*[@id=\'pdf\']"));
		downloadPdf.click();
		
		File fileLocation1=new File("C:\\Users\\GOWRI\\Downloads\\");
		File[] totalfiles1=fileLocation1.listFiles();
		
		for(File file : totalfiles1) {
			if(file.getName().equals("sample.pdf"));
			System.out.println("PDF File is Downloaded...");
			break;
		}
		
		Thread.sleep(3000);
		
		WebElement downloadText=driver.findElement(By.xpath("//*[@id=\'txt\']"));
		downloadText.click();
		
		File fileLocation2=new File("C:\\Users\\GOWRI\\Downloads\\");
		File[] totalfiles2=fileLocation2.listFiles();
		
		for(File file : totalfiles2) {
			if(file.getName().equals("sample.txt"));
			System.out.println("Text File is Downloaded...");
			break;
		}
		Thread.sleep(3000);
		
		
		WebElement downloadExcel=driver.findElement(By.xpath("//*[@id=\'xls\']"));
		downloadExcel.click();
		
		File fileLocation3=new File("C:\\Users\\GOWRI\\Downloads\\");
		File[] totalfiles3=fileLocation3.listFiles();
		
		for(File file : totalfiles3) {
			if(file.getName().equals("sample.xls"));
			System.out.println("Excel File is Downloaded...");
			break;
		}
		
		
	}

}
