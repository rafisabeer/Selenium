package TestNG;

import org.testng.annotations.Test;

public class DependiesManagement {

	@Test
	public void sslc() {
		System.out.println("10th fail");
	}
	@Test(enabled=true)
	public void higher_secondary() {
		System.out.println("12th pass");
	}
	@Test(dependsOnMethods="higher_secondary")
	public void college() {
		System.out.println("enters into college");
	}
}
