package dataDrivenUsingPOMFramework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UsingPageFactory {
	
	@FindBy(how=How.NAME, using="uname")
	public static WebElement username;
	
	@FindBy(name="pass")
	public static  WebElement password;
	
	@FindBy(xpath="//*[@id='content']/div[1]/form/table/tbody/tr[3]/td/input")
	public static WebElement loginButton;
	
	@FindBy(name="urname")
	public static WebElement name;
	
	@FindBy(name="ucc")
	public static WebElement creditCarNo;
	
	@FindBy(name="uemail")
	public static WebElement email;
	
	@FindBy(name="uphone")
	public static WebElement phoneNO;
	
	@FindBy(name="uaddress")
	public static WebElement address;
	
	@FindBy(name="update")
	public static WebElement updateButton;
	
	
}
