package seleniumtutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {

		
		
		boolean staleElement = true; 
		
	
		try {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium_tutorial\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']")).click();
		//Thread.sleep(2000);
		WebElement from=driver.findElement(By.xpath("//*[@class='fsw_inputField lineHeight36 latoBlack font30']"));
		from.click();
		//Thread.sleep(2000);
		//driver.findElement(By.className("font14 appendBottom5 blackText")).click();
		driver.findElement(By.xpath("//*[@class='react-autosuggest__container react-autosuggest__container--open']/input")).sendKeys("Mumbai");
		//react-autosuggest__suggestions-list
		//react-autosuggest__container react-autosuggest__container--open
		//staleElement = false;
		List<WebElement> list=driver.findElements(By.xpath("//*[@class='font14 appendBottom5 blackText']"));
		//Thread.sleep(6000);
		//driver.wait(5000);
		for(int i=0;i<=list.size();i++) {
			String all=list.get(i).getText();
			System.out.println("city>>>"+all);
			if(list.equals("Mumbai, India")) {
				list.get(i).click();
				break;
			}
		}
		}catch (StaleElementReferenceException elementReferenceException) {
			//System.out.println(elementReferenceException);
			staleElement = true;
		
	}
	/*	for (WebElement webElement : list) {
			String alltext= webElement.getText();
			System.out.println(alltext+"<<<<<");
			
			if(alltext.contains("chennai")) {
				webElement.click();
			}
			
		}*/
		
	}

}
