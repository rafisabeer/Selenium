package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObject.LoginObject;

public class OrangeHRMLogin {
	
	
@Test	
void display() {

	
	System.setProperty("webdriver.chrome.driver","E:\\selenium_tutorial\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	PageFactory.initElements(driver, LoginObject.class);
	
	LoginObject.username.sendKeys("Admin");
	LoginObject.password.sendKeys("admin123");
	LoginObject.submit.click();
	
	/*LoginObject.username(driver).sendKeys("Admin");;
	LoginObject.password(driver).sendKeys("admin123");;
	LoginObject.submit(driver).click();*/
	
	/*driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	
	driver.findElement(By.id("btnLogin")).click();*/
	
	driver.quit();
	
	

}

}
