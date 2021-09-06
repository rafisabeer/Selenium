package seleniumtutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium_tutorial\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver,10);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Alert.html");
		
	WebElement e=	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
	wait.until(ExpectedConditions.visibilityOf(e));
	e.click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();
		driver.switchTo().alert().dismiss();		
		
	}

}
