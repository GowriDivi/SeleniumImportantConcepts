package seleniumAdvancedConepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.Toolkit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class UploadExample {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://letcode.in/file");
			
	WebElement UploadButton=driver.findElement(By.
			xpath("/html/body/app-root/app-filemanagement/section[1]/div/div/div[1]/div/div[1]/div/div/label/span/span[2]"));		

	UploadButton.click();
	
	String file="C:\\Users\\GOWRI\\Desktop\\2023 DESKTOP\\Gowri resume new 2023.pdf";
	StringSelection selection=new StringSelection(file);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
	Thread.sleep(3000);
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_ENTER);	
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	
	}

}
