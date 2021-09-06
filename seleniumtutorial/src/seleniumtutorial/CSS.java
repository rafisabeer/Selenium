package seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tagname[attribute='value']
		//contains
		//css=input#email	
		//css=input[name=email]
		
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","E:\\selenium_tutorial\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&dsh=S1779295381%3A1629346830372310&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
	
	//driver.findElement(By.cssSelector("*[name='Passwd'])")).sendKeys("password");
	
	//parent / child
	//driver.findElement(By.xpath("//div[@class='aCsJod oJeWuf'][3]/div/div/input")).sendKeys("haii");
	
	// siblings
	//xpath/following-sibling :: tagname 
	driver.findElement(By.xpath("//div[@class='Xb9hP']/following-sibling :: div")).getAttribute("classss");
	
	// xpath/parent :: tagname
	String a=driver.findElement(By.xpath("//input[@name='Passwd']/parent :: div")).getAttribute("class");
	System.out.println(">>>>>"+a);
	
	}

	
	
	
	
}
