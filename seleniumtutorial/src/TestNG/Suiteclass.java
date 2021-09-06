package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Suiteclass {
	long starttime =System.currentTimeMillis();
	WebDriver driver;
	@BeforeSuite
	void display() {
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium_tutorial\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	
	
	@Test
	void google() {
		driver.get("https://www.google.com/");
	}
	@Test
	void bing() {
		
		driver.get("https://www.bing.com/");
	}
	@Test
	void yahoo() {
		driver.get("https://www.yahoo.com/");
	}
	@AfterSuite
	void close() {
		long endtime =System.currentTimeMillis();
		driver.close();
		long time=endtime-starttime;
		System.out.println("time consume"+time);
	}
}
