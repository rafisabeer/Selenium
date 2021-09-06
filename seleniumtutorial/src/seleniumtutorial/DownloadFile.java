package seleniumtutorial;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAFISABEER\\Downloads\\new download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		driver.findElement(By.linkText("Download Excel")).click();
	
		
		File file= new File("C:\\Users\\RAFISABEER\\Downloads");
		File[] allfiles=file.listFiles();
		for (File file2 : allfiles) {
			file2.equals("testleaf.xlsx");
			System.out.println("file downloaded");
			break;
		}
		
		 /*File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 
		TakesScreenshot sc=(TakesScreenshot) new DownloadFile();
		sc.getScreenshotAs();*/
		
		
	}

}
