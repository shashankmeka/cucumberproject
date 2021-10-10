package StepDefination;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Takescreenshot {

		
		
		public static String CaptureScreenShotWithTestStepName(WebDriver driver, String testStepsName)
		{
			try{
				// down casting WebDriver to use getScreenshotAs method.
				TakesScreenshot ts= (TakesScreenshot)driver;
				
				// capturing screen shot as output type file
				File screenshotSRC= ts.getScreenshotAs(OutputType.FILE);
				
				// Defining path and extension of image
				String path=System.getProperty("user.dir")+"/Screenshot/"+testStepsName+System.currentTimeMillis()+".png";
				
				// copying file from temp folder to desired location
				File screenshotDest= new File(path);
				
				FileUtils.copyFile(screenshotSRC, screenshotDest);
				return path;
				
			}catch(Exception e)
			{
				System.out.println("Some exception occured." + e.getMessage());
				return "";
			}
		}
		

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","//D:\\\\Selenium videos\\\\setup\\\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
		
			driver.get("http://makeseleniumeasy.com/");
			
			Takescreenshot.CaptureScreenShotWithTestStepName(driver, "URL Loading");
			
			

		}
}
