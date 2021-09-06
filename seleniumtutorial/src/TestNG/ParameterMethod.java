package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterMethod {

	@Test
	@Parameters("Name")
	public void display(String name) {
		System.out.println("Name"+name);
	}
	
}
