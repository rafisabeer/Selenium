package seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","E:\\selenium_tutorial\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&dsh=S1779295381%3A1629346830372310&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		//starts-with-->  tagname[starts-with(@attribute,'value')]
		driver.findElement(By.xpath("//input [starts-with(@id,'firstName')]")).sendKeys("abc");
		//*([@attribute='value'])[index]
		driver.findElement(By.xpath("(//*[@class='whsOnd zHQkBf'])[2]")).sendKeys("eee");
		
		//text --> //*[text()='value']
		//driver.findElement(By.xpath("//*[text()='Sign in instead']")).click();

	}

}
