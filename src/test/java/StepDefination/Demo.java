package StepDefination;

import io.cucumber.java.en.Given;

public class Demo {
	
	@Given("user enter valid data")
	public void user_enter_valid_data() {
		System.out.println(" User enter valid data");//1 3 5

	}

	@Given("user is on contactPage")
	public void user_is_on_contact_page() {
		System.out.println("user is on contactPage");//2
	}

	@Given("user is on DealsPage")
	public void user_is_on_deals_page() {
		System.out.println("user is on DealsPage");//4
	}

	@Given("user is on conpaniesPage")
	public void user_is_on_conpanies_page() {
		System.out.println("user is on CompaniesPage");//6
	}
	
	

}
