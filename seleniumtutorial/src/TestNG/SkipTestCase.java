package TestNG;

import org.testng.annotations.Test;

public class SkipTestCase {

	@Test(priority=0)
	public void start() {
		System.out.println("Start the engine");
	}
	@Test(priority=1)
	public void firstgear() {
		System.out.println("first gear");
	}
	@Test(priority=2,enabled=false)
	public void music() {
		System.out.println("music on");
	}
	@Test(priority=3)
	public void secondgear() {
		System.out.println("second gear");
	}
	@Test(priority=4)
	public void thirdgear() {
		System.out.println("third gear");
	}
	
	
	
}
