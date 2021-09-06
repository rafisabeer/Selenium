package seleniumtutorial;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac_windows {

	public static void main(String[] args) {
		

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAFISABEER\\Downloads\\new download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.findElement(By.id("home")).click();
		String oldwindow=	driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button")).click();
		driver.findElement(By.id("color")).click();
		int openedwindow=driver.getWindowHandles().size();
		System.out.println("openeed window"+openedwindow);
		
		Set<String> allwindow=	driver.getWindowHandles();
		for (String currentwindow : allwindow) {
			if(!currentwindow.equalsIgnoreCase(oldwindow)) {
				driver.switchTo().window(currentwindow);
				driver.close();
			}
		}
		
		
		
	}

}
