package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features="src/test/java/Features/ScenarioOutline.feature", glue="Steps",monochrome=true,tags="@smoke")
@RunWith(Cucumber.class)
public class LeadCreationExecution {
	
}
