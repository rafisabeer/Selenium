package seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac_xpath {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium_tutorial\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_AccountFlyout_signout%26signIn%3D1%26useRedirectOnSuccess%3D1&prevRID=QBHMHX5V3H1JS975PXEB&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	//NORMAL XPATH
	driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("rafi");
	// PARENT TO CHILD XPATH
	driver.findElement(By.xpath("//div[@class='a-fixed-left-grid-col a-col-right']/input")).sendKeys("94434946646");
	//SIBLINGS (siblings to siblings)
	driver.findElement(By.xpath("//div[@class='a-section a-spacing-base ap_email_fields']/following-sibling :: div/div/input")).sendKeys("passowrd");	
	//Parent find(child to parent)
	driver.findElement(By.xpath("//*[@id='ap_email']/parent :: div/input")).sendKeys("aa@gmail.com");
	//child find(parent to child)
	driver.findElement(By.xpath("//div[@class='a-row a-spacing-base']/child ::input ")).sendKeys("rafi");
	
	
	}
	
}
