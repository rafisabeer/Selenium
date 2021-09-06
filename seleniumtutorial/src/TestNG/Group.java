package TestNG;

import org.testng.annotations.Test;

public class Group {

	
	@Test(groups="apple")
	public void apple1() {
		System.out.println("iphone 11");
	}
	@Test(groups="apple")
	public void apple2() {
		System.out.println("iphone 11");
	}
	@Test(groups="lenovo")
	public void lenovo1() {
		System.out.println("lenovo 11");
	}
	@Test(groups="lenovo")
	public void lenovo2() {
		System.out.println("lenovo 11");
	}
	@Test(groups="moto")
	public void moto1() {
		System.out.println("moto 11");
	}
	@Test(groups="moto")
	public void moto2() {
		System.out.println("moto 11");
	}
	
	
	
}
