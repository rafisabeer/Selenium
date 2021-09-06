package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginObject {

	
	
	@FindBy(how=How.ID,using="txtUsername")
	 public static WebElement username;
	
	@FindBy(id="txtUsername")
	 public static WebElement password;
	
	@FindBy(id="btnLogin")
	 public static WebElement submit;
	
	/*//username, password, submit
	static public WebElement username(WebDriver driver) {
		return driver.findElement(By.id("txtUsername"));
	}
	
	static public WebElement password(WebDriver driver) {
		return driver.findElement(By.id("txtPassword"));
	}
	
	static public WebElement submit(WebDriver driver) {
		return driver.findElement(By.id("btnLogin"));
	}*/
}
