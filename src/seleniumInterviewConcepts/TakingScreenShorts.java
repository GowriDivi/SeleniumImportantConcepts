package seleniumInterviewConcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.Rectangle;
import java.io.IOException;

import javax.imageio.ImageIO;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenShorts {

	public static void main(String[] args) throws IOException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		
		WebElement calendarImage=driver.findElement(By.xpath("//*[@id='datepickers']/tbody/tr[6]/td[2]/img"));
		calendarImage.click();
		
		WebElement dateButton=driver.findElement(By.xpath
				("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[2]/a"));
			dateButton.click();

			/*
			 * TakesScreenshot screenshot=(TakesScreenshot) driver; File
			 * sourceFile=screenshot.getScreenshotAs(OutputType.FILE); File file=new
			 * File("D://screenshot1.png"); FileHandler.copy(sourceFile, file);
			 * 
			 */
			
		
			Robot robot=new Robot();
			Rectangle rectangle=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			BufferedImage source=robot.createScreenCapture(rectangle);
			
			File destinationFile=new File("D://vinoth.png");
			ImageIO.write(source, "png", destinationFile);
		
		
	}

}
