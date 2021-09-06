package seleniumtutorial;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForLoop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium_tutorial\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goindigo.in/");
		
		driver.manage().window().maximize();
		WebElement from=driver.findElement(By.name("or-src"));
		from.click();
		driver.findElement(By.xpath("//*[@class='form-control or-src-city']")).sendKeys("Chennai");
		
		List<WebElement> list=driver.findElements(By.xpath("//*[@class='airport-city']"));
		int size=list.size();
		System.out.println(size);

		WebDriverWait wait = new WebDriverWait(driver, 20);
		for(int i=0;i<list.size();i++) {
			 wait.until(ExpectedConditions.visibilityOf(list.get(i)));
			 System.out.println("city>>>"+list.get(i).getText());
			if(list.get(i).getText().contains("Chennai")) {
				System.out.println("haii");
				WebElement needclick = list.get(i);
				System.out.println(">>>>>>vjffcfhkfy"+needclick.getText()+"<<<<<");
				needclick.click();
				
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    System.out.print("End after 30 seconds");
				break;
			}else {
				System.out.println("not here");
			}
		}
		
		
		
		/*for (WebElement webElement : list) {
			String alllist=webElement.getText();
			System.out.println(">>>>>>"+alllist);
		if(alllist.contains("Mumbai")){
			
			
			//Actions action = new Actions((WebDriver) list);
		}

		}	*/
		/*	*/
		
	}

}
