package seleniumtutorial;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Prac_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAFISABEER\\Downloads\\new download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//implicity wait-->
		//driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
	//	driver.findElement(By.xpath("//*[@id='alertbtnnkjh']")).click();
		//Thread.sleep(3000);
		//explicity wait-->
		WebDriverWait explicity= new WebDriverWait(driver, 8);
		explicity.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='alertbtn']")));
		driver.findElement(By.xpath("//*[@id='alertbtn']")).click();
		driver.switchTo().alert().accept();
		/*driver.findElement(By.xpath("//*[@id='confirmbtn']")).click();
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().dismiss();*/
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		WebElement we= wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver t) {
				return null;
				
			}
		});
		
		
	}

}
