package StepDefination;

import io.cucumber.java.en.Then;

public class hook {
	
	@Then("enter purchase somethings")
	public void enter_purchase_somethings() {
		System.out.println("enter purchase somethings");
	}
	
	@Then("user do the payment")
	public void user_do_the_payment() {
		System.out.println("user do the payment");
	}
	
	@Then("Payment done")
	public void payment_done() {
		System.out.println("Payment done");
	}
	
	@Then("give receipt to user")
	public void give_receipt_to_user() {
		System.out.println("give receipt to user");
	}


}
