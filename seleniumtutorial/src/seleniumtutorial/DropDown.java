package seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium_tutorial\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
	driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@value='AGR']")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("D");
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//a[@value='DEL']")).click();
	}

}
