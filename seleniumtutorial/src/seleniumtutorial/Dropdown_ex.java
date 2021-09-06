package seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_ex {

	public static void main(String[] args) {
	
			
			System.setProperty("webdriver.chrome.driver", "E:\\selenium_tutorial\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	
	driver.findElement(By.className("css-1wa3eu0-placeholder")).click();

/*Select select = new Select(driver.findElement(By.className("css-1wa3eu0-placeholder")));*/

	
	}

}
