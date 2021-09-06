package TestNG;

import org.testng.annotations.Test;

public class SampleCase {
	@Test(groups="Computer")
	void Computer() {
		System.out.println("computer");
	}@Test(groups="mobile")
	void Mobile() {
		System.out.println("mobile");
	}@Test(groups="laptop")
	void Laptop() {
		System.out.println("laptop");
	}
	@Test(groups="Computer")
	void Computertwo() {
		System.out.println("computer");
	}@Test(groups="mobile")
	void Mobiletwo() {
		System.out.println("mobile");
	}@Test(groups="laptop")
	void Laptoptwo() {
		System.out.println("laptop");
	}
	
}
