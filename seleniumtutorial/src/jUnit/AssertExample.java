package jUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class AssertExample {
// JUNIT USING ASSERT
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium_tutorial\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/reg/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjI5ODA1MDkxLCJjYWxsc2l0ZV9pZCI6MzYzOTY5MDQ0ODc4OTI4fQ%3D%3D");
		
		Assert.assertEquals("https://en-gb.facebook.com/reg/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjI5ODA1MDkxLCJjYWxsc2l0ZV9pZCI6MzYzOTY5MDQ0ODc4OTI4fQ%3D%3D",
				"https://en-gb.facebook.com/reg/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjI5ODA1MDkxLCJjYWxsc2l0ZV9pZCI6MzYzOTY5MDQ0ODc4OTI4fQ%3D%3D");
		org.junit.Assert.assertEquals("https://en-gb.facebook.com/reg/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjI5ODA1MDkxLCJjYWxsc2l0ZV9pZCI6MzYzOTY5MDQ0ODc4OTI4fQ%3D%3D", 
				"https://en-gb.facebook.com/reg/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjI5ODA1MDkxLCJjYWxsc2l0ZV9pZCI6MzYzOTY5MDQ0ODc4OTI4fQ%3D%3D");
		
	
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("rafi");
		//contains-->doubt-->no such element: Unable to locate element
		//driver.findElement(By.xpath("//*[contains(@class,'_58mg _5dba _2ph-')]")).sendKeys("rafi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("sabeer");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("rsabeer@vdfs.com");	
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("123456789");
//dropdown-->		
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='day']")));
		dropdown.selectByVisibleText("25");
		//Assert.assertTrue(dropdown.);
		Select dropdownmonth = new Select(driver.findElement(By.xpath("//*[@id='month']")));
		dropdownmonth.selectByIndex(7);
		Select dropdownyear = new Select(driver.findElement(By.xpath("//*[@name='birthday_year']")));
		dropdownyear.selectByValue("1994");
//radio button
		WebElement radiobuttongender = driver.findElement(By.xpath("//input[@value='2']"));
		//Boolean statement=	radiobuttongender.isSelected();
		//System.out.println("clicked"+statement);
		radiobuttongender.click();
		Assert.assertFalse(radiobuttongender.isSelected());
	}

}
