package TestNG;

import org.testng.annotations.Test;

public class Prac_Dependenties {

	@Test(enabled=false)
	void Firststround() {
		System.out.println("First Round");
	}
	@Test (dependsOnMethods="Firstround")
	void secondround() {
		System.out.println("Second Round");
	}
	@Test
	void thirdround() {
		System.out.println("Third Round");
	}
	
	
}
