package StepDefination;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;

public class hook3 {

	@BeforeStep
	public void setup(){
		System.out.println("***************BeforeStep*****************");
	}
	@AfterStep
	public void teardown(){
		System.out.println("------------------AfterStep--------------------");
	}
}
