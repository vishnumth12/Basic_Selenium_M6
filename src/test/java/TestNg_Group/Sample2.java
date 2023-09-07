package TestNg_Group;

import org.testng.annotations.Test;

public class Sample2 {

	@Test(groups="smoke")
	public void Demo1() {
		System.out.println("Hi Sample 2.1");
	}
	
	@Test()
	public void demo2() {
		System.out.println("Hi Sample 2.2");
	}
}
