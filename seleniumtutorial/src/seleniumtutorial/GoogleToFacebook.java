package seleniumtutorial;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleToFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAFISABEER\\Downloads\\new download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		//driver.navigate().to("https://en-gb.facebook.com/");
		//*[@id="rso"]/div[1]/div/div/div/div/div/div[1]/a/h3
		driver.findElement(By.name("q")).sendKeys("fb"+Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/div/div/div[1]/a/h3")).click();
		//driver.findElement(By.xpath("//*[@id='pageFooter']/ul/li[1]")).click();
		//driver.get("https://en-gb.facebook.com/");
		//driver.get("https://en-gb.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C355887219764%7Ce%7Ccreate%20new%20fb%20account%7C&placement&creative=355887219764&keyword=create%20new%20fb%20account&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066386563%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-320674383834%26loc_physical_ms%3D9061941%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIzpmzt8zL8gIVPZlmAh0KXQ_jEAAYASAAEgJtrvD_BwE");

		driver.findElement(By.xpath("//div[@class='_6ltg']/child :: a")).click();

		String oldwindow=	driver.getWindowHandle();
		
		Set<String> allwindow=driver.getWindowHandles();
		for (String newwindow : allwindow) {
			driver.switchTo().window(newwindow);
		}
		
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("rafi");
	}

}
