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

public class LastTry {

String [][] data= { };
	
@DataProvider(name="logindata")
String[][] input() throws BiffException, IOException {
	
	data=show();
	return data;
}
String[][] show() throws BiffException, IOException {
	FileInputStream file= new FileInputStream("C:\\Users\\RAFISABEER\\Desktop\\Book1.xls");
	Workbook wb= Workbook.getWorkbook(file);
	Sheet sh= wb.getSheet(0);
	int rows=sh.getRows();
	int columns=sh.getColumns();
	
	String[][] data= new String[rows-1][columns];
	
	for(int i=1;i<rows;i++) {
	
		for(int j=0;j<columns;j++) {
			
			data[i-1][j] =sh.getCell(j, i-1).getContents();
		}
	}
return data;
}
	@Test(dataProvider="logindata")
	void display(String user,String password) {
		System.setProperty("webdriver.chrome.driver","E:\\\\selenium_tutorial\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys(user);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		
		driver.findElement(By.id("btnLogin")).click();
		
		driver.quit();
		
		
	}
}
