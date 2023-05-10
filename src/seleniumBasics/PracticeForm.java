package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeForm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		
		
		WebElement firstname=driver.findElement(By.xpath("//*[@id=\'RESULT_TextField-1\']"));
		firstname.sendKeys("VINOTH");
		
		WebElement lastname=driver.findElement(By.xpath("//*[@id=\'RESULT_TextField-2\']"));
		lastname.sendKeys("KUMAR");
		
		WebElement phone=driver.findElement(By.xpath("//*[@id=\'RESULT_TextField-3\']"));
		phone.sendKeys("8012895675");
		
		WebElement country=driver.findElement(By.xpath("//*[@id=\'RESULT_TextField-4\']"));
		country.sendKeys("India");
		
		WebElement city=driver.findElement(By.xpath("//*[@id=\'RESULT_TextField-5\']"));
		city.sendKeys("Karaikal");
		
		WebElement email=driver.findElement(By.xpath("//*[@id=\'RESULT_TextField-6\']"));
		email.sendKeys("gowri@gmail.com");
		
		WebElement gender=driver.findElement(By.xpath("//*[@id=\'q26\']/table/tbody/tr[1]/td/label"));
		gender.click();
		
		
		WebElement wed=driver.findElement(By.xpath("//*[@id=\'q15\']/table/tbody/tr[4]/td/label"));
		wed.click();
		
		WebElement thur=driver.findElement(By.xpath("//*[@id=\'q15\']/table/tbody/tr[5]/td/label"));
		thur.click();
		
		
		WebElement fri=driver.findElement(By.xpath("//*[@id=\'q15\']/table/tbody/tr[6]/td/label"));
		fri.click();
		
		WebElement sat=driver.findElement(By.xpath("//*[@id=\'q15\']/table/tbody/tr[7]/td/label"));
		sat.click();
		
		WebElement contactTime=driver.findElement(By.xpath("//*[@id=\'RESULT_RadioButton-9\']"));
		Select s1=new Select(contactTime);
		s1.selectByIndex(3);
		
		
		WebElement link=driver.findElement(By.xpath("//*[@id=\'q22\']/div/a"));
		link.click();
		
	}

}
