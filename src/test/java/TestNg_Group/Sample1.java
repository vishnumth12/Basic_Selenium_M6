package TestNg_Group;

import org.testng.annotations.Test;

public class Sample1 {
	
	@Test()
	public void Demo1() {
		System.out.println("Hi Sample 1.1");
	}
	
	@Test(groups="smoke")
	public void demo2() {
		System.out.println("Hi Sample 1.2");
	}
}
