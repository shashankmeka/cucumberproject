package StepDefination;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FreeCRMTest extends Baseclass {

	@Given("user enter url")
	public void user_enter_url() {
		Baseclass.initialization("https://ui.cogmento.com/"); //call the Baseclass
		
		System.out.println(driver.getTitle());
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")).sendKeys("shashankmeka023@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Shashank@123");
		
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//*[text()='Login']")).click();
	}

	@Then("user is on homepage")
	public void user_is_on_homepage() {
		String expectedTitle="Cogmento CRM";
		String actualTitle=driver.getTitle();
		assertEquals(actualTitle,expectedTitle);
		
	}

	@When("user click on contact page")
	public void user_click_on_contact_page() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/contacts']")).click();
	}

	@Then("user is on contact page")
	public void user_is_on_contact_page() throws InterruptedException {
		boolean logo=driver.findElement(By.xpath("//div[@class='header item']")).isDisplayed();
		System.out.println("Logo of home page is Display: "+logo);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Create']")).click();
	}

	@Then("user fillup the contact page details")
	public void user_fillup_the_contact_page_details() throws InterruptedException {
		System.out.println("Filling the details on contact page");
		Thread.sleep(4000);
		driver.findElement(By.name("first_name")).sendKeys("Shashank");
		driver.findElement(By.name("middle_name")).sendKeys("Sanjay"); 
		driver.findElement(By.name("last_name")).sendKeys("Meka");		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[3]/div[1]/div/div/div[1]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[3]/div[1]/div/div/div[2]/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
		Thread.sleep(5000);
		driver.close();
		
	}
}
