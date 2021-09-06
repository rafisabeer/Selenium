package seleniumtutorial;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws  InterruptedException,AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAFISABEER\\Downloads\\new download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
	WebElement uploadbutton=driver.findElement(By.name("upfile"));
	uploadbutton.click();
	Thread.sleep(3000);
//C:\Users\RAFISABEER\Downloads\testleaf.xlsx		
		
		String path = "C:\\Users\\RAFISABEER\\Downloads\\testleaf.xlsx	";
		StringSelection selection= new StringSelection(path);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
		
		Robot rb= new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_ENTER);
		
	}

}
