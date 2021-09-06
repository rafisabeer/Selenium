package seleniumtutorial;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac_TableNew {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAFISABEER\\Downloads\\new download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		
		//Check the vital task for the max completed progress.
        
		String allprogress;
		List<WebElement> list=driver.findElements(By.xpath("//td[2]"));
		
		
		List<Integer> convert=new ArrayList<>();
		for (WebElement webElement : list) {
			 allprogress=webElement.getText().replace("%", ""
					 );
			 allprogress.indexOf(1);
			System.out.println(allprogress+"<<<"+allprogress.indexOf(1));
		/*	convert.add(Integer.parseInt(allprogress));
			System.out.println(">>>"+Integer.parseInt(allprogress));*/
		}
		/* Integer maximum=Collections.max(convert);
		System.out.println(maximum+"<<<>>>");

				String changed=Integer.toString(maximum)+"%";
	System.out.println(changed+"String changed");
				
	//td[normalize-space()='100%']/following ::td[1]"
	
	String a="//td[normalize-space()="+"'"+changed+"'"+"]/following ::td[1]/input";
	System.out.println("xpath"+a);
	
	WebElement z=driver.findElement(By.xpath(a));
	z.click();*/

	}

}
