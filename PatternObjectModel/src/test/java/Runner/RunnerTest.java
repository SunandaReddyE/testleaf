package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features="src/test/java/Features/CreateLead.feature", glue="Steps")
@RunWith(Cucumber.class)
public class RunnerTest {
	
}
