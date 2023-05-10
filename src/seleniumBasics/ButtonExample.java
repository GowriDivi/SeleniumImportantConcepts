package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;


public class ButtonExample {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		
		//1. Find the location of the button
		
		WebElement findLocation=driver.findElement(By.id("position"));
		Point xypoint=findLocation.getLocation();
		int xValue=xypoint.getX();
		int yValue=xypoint.getY();
		
		System.out.println("X Value of the Button:"+" "+xValue);
		System.out.println("Y Value of the Button:"+" "+yValue);
		System.out.println("--------------------------------------------------------------");
		
		//2. Find the color of the button
		WebElement findColor=driver.findElement(By.id("color"));
		String color=findColor.getCssValue("background-color");
		System.out.println("The Color of the Button is:"+" "+color);
		System.out.println("--------------------------------------------------------------");
		
		
		//3. Find the height & width of the button
		WebElement dimension=driver.findElement(By.xpath("/html/body/app-root/app-buttons/section[1]/div/div/div[1]/div/div/div[4]/div/button"));
		int height=dimension.getSize().getHeight();
		int width=dimension.getSize().getWidth();
		
		System.out.println("The Height of the Button is:"+" "+height);
		System.out.println("The Width of the Button is:"+" "+width);
		System.out.println("--------------------------------------------------------------");
		
		//4. Is Button is diabled
		WebElement checkfield=driver.findElement(By.id("isDisabled"));
		boolean check=checkfield.isEnabled();
		System.out.println("Is Button is Enabled?"+" "+check);
		
		
		
		//5. Click the button
		WebElement clicked=driver.findElement(By.id("home"));
		clicked.click();
		
	}

}
