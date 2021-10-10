package StepDefination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTest {
	
	WebDriver driver;
	
	@Given("user open Orange HRM URL")
	public void user_open_orange_hrm_url() {
		System.setProperty("webdriver.chrome.driver","//D:\\\\\\\\\\\\\\\\Selenium videos\\\\\\\\\\\\\\\\setup\\\\\\\\\\\\\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}
	@When("User click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"/Screenshot/"+System.currentTimeMillis()+".png");
		try {
			FileUtils.copyFile(f, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("user is on home page")
	public void user_is_on_home_page() throws InterruptedException {
	System.out.println("Page Title = "+driver.getTitle());
	Thread.sleep(5000);
	driver.close();
	}

}
