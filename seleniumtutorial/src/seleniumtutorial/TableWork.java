package seleniumtutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableWork {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAFISABEER\\Downloads\\new download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		
	List<WebElement> column=driver.findElements(By.tagName("th"));
	int size=column.size();
	System.out.println("Column Size="+size);
	
	List<WebElement> row=driver.findElements(By.tagName("tr"));
	int size1=row.size();
	System.out.println("Row Size="+size1);
	
	WebElement value=driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']/following :: td[1]"));
	
	String precentage=value.getText();
	
		System.out.println(precentage);
		
		
		List<WebElement> td=driver.findElements(By.xpath("//td[2]"));
		
		List<Integer> a=new ArrayList<Integer>(); 
		
		
		
	for (WebElement allelement : td) {
		String text=allelement.getText().replace("%", "");
		Integer.parseInt(text);
		a.add(Integer.parseInt(text));
	}
	System.out.println(a);
	
	int max=Collections.max(a); 
	System.out.println(max);
	
	
	String convertedstring =Integer.toString(max)+"%";
	//("//td[normalize-spacing()='30%']/following::td")
	String finalxpath ="//td[normalize-space()="+"'"+convertedstring+"'"+"]/following :: td[1]/input";
	//String finalxpath ="//td[normalize-space()="+"\""+convertedstring+"\""+"]//following::td[1]";
	////*[@id="table_id"]/tbody/tr[4]/td[3]/input   ////*[@id="table_id"]/tbody/tr[4]/td[2]
	System.out.println("finalxpath>>>"+finalxpath);
	WebElement click=driver.findElement(By.xpath(finalxpath));
	click.click();
	}
	

	
	

	
	
}
