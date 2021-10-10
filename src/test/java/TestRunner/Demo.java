package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Features/Demo.feature"},
		glue= {"StepDefination"},
		monochrome=true,
		dryRun=false,
		tags = "not@Regrationtesting"
		
		
		)
public class Demo {

}
