package seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGmaillocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","E:\\selenium_tutorial\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&dsh=S1779295381%3A1629346830372310&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.id("firstName")).sendKeys("abc");
		//chrome-->$x("xpath") --> tag name * or input,div,span like that
		driver.findElement(By.xpath("//*[contains(@id,'lastName')]")).sendKeys("dvfd");
		driver.findElement(By.name("Username")).sendKeys("abababaa.aahkg");
		driver.findElement(By.name("Passwd")).sendKeys("123456789");
		//driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("123456789");
		driver.findElement(By.xpath("//*[@name='ConfirmPasswd' or @type='password']")).sendKeys("123456789");
		
		
		
		
		//XPATH
		//*contains[@attribute,'value']-->contains some short name
		//*[@attribute='value']--->xpath or tagname[@attribute='value'] ex ://input[@name='ConfirmPasswd']
		//*[@attribute='value' or @attribute='value']
		//*[@attribute='value' and @attribute='value']
		
		driver.findElement(By.xpath("//*[contains(@class,'whsOnd')]")).sendKeys("dvfd");
	/*driver.findElement(By.className("VfPpkd-vQzf8d")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("password")).sendKeys("123465798");
	driver.findElement(By.className("VfPpkd-vQzf8d")).click();*/
	
	
	}

}
