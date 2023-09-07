package TestNg;

import org.testng.annotations.Test;

public class Priority_Invocation {

	//1. TestNg main method
	@Test(priority = -1, invocationCount = 0)// invocation count = 0 means wont execute
	public void demo1() {
		System.out.println("Hi Demo1");
	}
	
	//2. TestNg main method
	@Test(invocationCount = 3, enabled = false) //wont execute -ve invocaion value or enabled = false
	public void demo2() {
		System.out.println("Hi Demo2");		
	}
	
	//3. TestNg main method
	@Test(priority = -5, invocationCount = 2)
	public void demo3() {
		System.out.println("Hi Demo3");		
	}
	
}
