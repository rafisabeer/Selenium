package seleniumtutorial;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandler {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAFISABEER\\Downloads\\new download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		Thread.sleep(3000);
		driver.findElement(By.id("home")).click();
		String oldwindow =driver.getWindowHandle();
		System.out.println(oldwindow);		
		
		Set<String> currentwindow=driver.getWindowHandles();
		for (String s : currentwindow) {
			driver.switchTo().window(s);
		}
		driver.close();
		driver.switchTo().window(oldwindow);
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();
		driver.findElement(By.id("color")).click();
		Thread.sleep(2000);
		for (String allwindow : currentwindow) {
			if(!allwindow.equals(oldwindow)) {
				driver.switchTo().window(allwindow);
				driver.close();
			}
		
		
		}
		
	}

}
