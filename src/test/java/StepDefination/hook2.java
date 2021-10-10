package StepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hook2 {
	@Before(order=1)
	public void setUp1() {
		System.out.println("Before Hook 1");//1	 6
	}
	
	@Before(order=2)
	public void setUp2() {
		System.out.println("Before Hook 2");//2  7
	}
	
	//scenario 2   8
	
	@After(order=1)
	public void tearDown1() {
		System.out.println("After hook 1");//5  10
	}
	
	@After(order=2)
	public void tearDown2() {
		System.out.println("After hook  2");//4  9
	}
}
