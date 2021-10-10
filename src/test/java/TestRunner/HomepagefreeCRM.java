package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Features/FreeCRM.feature"},
		glue= {"StepDefination"},
		monochrome=true,
		
		dryRun=false,
				plugin= {"html:Files/a.html",
						"json:Files/b.json",
						"junit:Files/c.xml",
						"pretty:Files/d.txt"
		}
		
		)
public class HomepagefreeCRM {

}
