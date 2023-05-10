package seleniumAdvancedConepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImagesAndLinksExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOWRI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/broken");
		
		
		/*WebElement broken=driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/img[2]"));
		
		if(broken.getAttribute("naturalwidth").equals("0")) {
			System.out.println("Image is broken");
		}
		else {
			System.out.println("Image is not broken");
			
		}*/
		
		WebElement validLink1=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/a[2]"));
		validLink1.click();
		driver.navigate().back();        //*[@id="app"]/div/div/div[2]/div[2]/div[2]/a[1]<a href="http://demoqa.com">Click Here for Valid Link</a>
		
	}

}
