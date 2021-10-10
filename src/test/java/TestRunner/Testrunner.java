package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//Run this class as cucumber class
@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"Features/login.feature"},
		glue= {"StepDefination"},
		monochrome=true,
		dryRun=false
		
		)
public class Testrunner {

}
