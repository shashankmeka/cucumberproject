package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {

	public static WebDriver driver;
	
	public static void initialization(String url) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Software Testing\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	}
	
	
	
	
}
