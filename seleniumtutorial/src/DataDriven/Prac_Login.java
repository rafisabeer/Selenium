package DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Prac_Login {

	
	String[][] data= {
			{"Admin","admin123"},
			{"Admin1","admin123"},
			{"Admin","admin12"},
			{"Admin1","admin1231"}
			
	};
	
	@DataProvider(name="login")
	String[][] logindata() {
		System.out.println("entered here");
		//display(user, password);
		return data;
	}
	
	
	
	
	@Test(dataProvider="login")
	void display(String user,String password) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium_tutorial\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys(user);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		
		driver.findElement(By.id("btnLogin")).click();
		driver.quit();
	}
	
	
	
	
}
