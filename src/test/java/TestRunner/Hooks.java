package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "Features/hooks.feature" }, 
		glue = { "StepDefination" }, monochrome = true,
		// to check mapping between feature file and step defination file
		dryRun = false, 
		plugin = { "html:Files/abc.html","junit:Files/mumbai.xml"
				
		})

public class Hooks {

}
