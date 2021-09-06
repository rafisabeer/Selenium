package seleniumtutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstClass {

	public static void main(String[] args) {
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","E:\\selenium_tutorial\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.navigate();-->just go for that URL
		driver.get("https://www.google.com/");
		System.out.println("Tab name-->"+driver.getTitle());  
		System.out.println("currentURL"+driver.getCurrentUrl());
		//System.out.println("page source"+driver.getPageSource());
		driver.navigate().to("https://touch.facebook.com/?_rdr"); //navigate to next url
		driver.navigate().back();
		//driver.navigate().forward();
		driver.close(); //current url
		driver.quit();  //all active session il close
	}
}


