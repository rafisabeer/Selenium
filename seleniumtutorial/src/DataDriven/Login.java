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

public class Login {
	
	
	
String[][] data=null;
	
	
	@DataProvider(name="logindata")
	public String[][] datalogin() throws BiffException, IOException {
		
		System.out.println("entered here");
		data=display();
		return data;
	}
	
	String[][] display() throws BiffException, IOException {
			FileInputStream file= new FileInputStream("C:\\Users\\RAFISABEER\\Desktop\\Book1.xls");
			
			Workbook workbook=Workbook.getWorkbook(file);
			Sheet sheet=workbook.getSheet(0);
			int row=sheet.getRows();
			int columns=sheet.getColumns();
			String testdata [][] = new String[row-1][2];
			
			
			for(int i=1;i<row;i++) {
				for(int j=0;j<columns;j++) {
					testdata [i-1][j] = sheet.getCell(j, i).getContents();
				 System.out.println(i+""+j);
				}
				
			}
			
		
		return testdata;
		
	}
	

	@Test(dataProvider="logindata")
	void display(String user,String password) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAFISABEER\\Downloads\\new download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys(user);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		
		driver.findElement(By.id("btnLogin")).click();
		
		driver.quit();
		
		
	}

	
	
}
