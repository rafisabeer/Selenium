package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelData {

	
	
	Object [] [] data= null;
	
	@DataProvider(name="Login")
	Object[][] show() throws BiffException, IOException {
		data=LoginData();
		return data;
	}
	
	
	
	Object[][] LoginData() throws BiffException, IOException {
		
		FileInputStream file= new FileInputStream("C:\\Users\\RAFISABEER\\Desktop\\Book1.xls");
		Workbook wb= Workbook.getWorkbook(file);
		Sheet sh=wb.getSheet(0);
		int row=sh.getRows();
		int column=sh.getColumns();
		
		String[] [] a= new String[row-1][column];
		
		for(int i=1;i<row;i++) {
			for(int j=0;j<column;j++) {
			a[i-1][j] =	sh.getCell(j, i).getContents();
			}
		}
		return a;
	}
	
	
	@Test(dataProvider="Login")
	void display(String user,String password) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium_tutorial\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys(user);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		
		driver.findElement(By.id("btnLogin")).click();
		driver.quit();
	}
}
