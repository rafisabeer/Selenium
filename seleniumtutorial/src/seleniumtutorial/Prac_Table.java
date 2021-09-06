package seleniumtutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac_Table {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAFISABEER\\Downloads\\new download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		//objective
		//-->get the mentor nmae of learn ro interact with elements
		WebElement text=driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']/following :: td[4]"));
		String gettext=text.getText();
		System.out.println(gettext);
		
		//-->chechk the vital task for 80% progress
		List<WebElement> gettd2=driver.findElements(By.xpath("//td[2]"));
		
		List<Integer> number = new ArrayList<Integer>();

		for (WebElement allelements : gettd2) {
		String elements=allelements.getText().replace("%", "");
			number.add(Integer.parseInt(elements));
		}
		System.out.println(number);

		
		int a=Collections.max(number);
		System.out.println("max"+a);
		
	String convertedstring=	Integer.toString(a)+"%";
	String abc="//td[normalize-space()="+ "'" +convertedstring+"'" +"]/following :: td[1]/input";
	System.out.println(abc);
	driver.findElement(By.xpath(abc)).click();
	
		
	//td[normalize-space()='100%']/following :: td[1]/input
		
	/*	WebElement th1=driver.findElement(By.xpath("//th[2]"));
		WebElement a=	driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']/following :: td[2]/input"));
		WebElement b=	driver.findElement(By.xpath("//td[normalize-space()='Learn Locators']/following :: td[2]/input"));
		String title=	th1.getText();
		System.out.println(title);
		
		if(number.equals( 80 )) {
			a.click();
			b.click();
		}else {
			System.out.println("no 80% here");
		}
		*/
		
		
	
	
	}

}
