package StepDefination;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactPage extends Baseclass{

	@Given("user enter free CRM url")
	public void user_enter_free_crm_url() throws InterruptedException {
	Baseclass.initialization("https://ui.cogmento.com/"); //call the Base class
		
		//driver.get("https://ui.cogmento.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")).sendKeys("shashankmeka023@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Shashank@123");
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		Thread.sleep(3000);
	}

	@Then("user is on home page of free CRM")
	public void user_is_on_home_page_of_free_crm() throws InterruptedException {
	}

	@Then("verify user is on home page or not")
	public void verify_user_is_on_home_page_or_not() {
		String expectedTitle="Cogmento CRM";
		String actualTitle=driver.getTitle();
		assertEquals(actualTitle,expectedTitle);
	}

	@When("user click on contact link")
	public void user_click_on_contact_link() throws InterruptedException {
		driver.findElement(By.xpath("//a[@href='/contacts']")).click();
		boolean logo=driver.findElement(By.xpath("//div[@class='header item']")).isDisplayed();
		System.out.println("Logo of home page is Display: "+logo);
		Thread.sleep(3000);
	}

	@When("user click on deals link")
	public void user_click_on_deals_link() {
	}

	@Then("user is on deals page")
	public void user_is_on_deals_page() {
	}

	@Then("user click on create button of deals page")
	public void user_click_on_create_button_of_deals_page() {
	}

	@Then("user enter title of create new deal")
	public void user_enter_title_of_create_new_deal() {
	}

	@When("user click on access public button")
	public void user_click_on_access_public_button() {
	}

	@Then("we can select drop down name")
	public void we_can_select_drop_down_name() {
	}

}
