package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextboxExamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/edit");
		
		
		//1. Enter Your Name in the TextBox.
		WebElement enterName=driver.findElement(By.id("fullName"));
		enterName.sendKeys("Vinoth Kumar");
		
		
		//2. Append new text to the existing text.
		WebElement appendText=driver.findElement(By.id("join"));
		appendText.sendKeys("   Lover");
		
		
		//3. Get the value of text in the text box.
		WebElement getText=driver.findElement(By.id("getMe"));
		String value=getText.getAttribute("value");
		System.out.println("The Value is:"+" "+value);
		
		
		//4. Clear the text in the text box.
		WebElement clearText=driver.findElement(By.xpath("/html/body/app-root/app-input/section[1]/div/div/div[1]/div/div/div[4]/div/input"));	
		clearText.clear();
	
		
		//5. Confirm edit field is disabled.
		WebElement checkField=driver.findElement(By.id("noEdit"));
		boolean check=checkField.isEnabled();
		System.out.println("The Field is Enabled?"+" "+check);
		
		
		/*6. Confirm text is read only.
		WebElement read=driver.findElement(By.name("dontwrite"));
	    String find=read.getAttribute("value");
	    System.out.println("Note:"+" "+find);*/
		
	}

}
