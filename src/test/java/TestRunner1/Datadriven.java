package TestRunner1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
		features= {"Features/datadriven.feature"},
		glue= {"StepDefination1"},
		monochrome=true,
		dryRun=false,
		plugin= {"html:Files/x.html",
				"json:Files/y.json"
		}
		
		
		
		)



public class Datadriven {

}
