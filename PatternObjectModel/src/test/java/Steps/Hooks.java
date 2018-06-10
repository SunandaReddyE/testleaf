package Steps;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods {
@Before
public void BeforeScenario(Scenario sc, String browserName) {
	startResult();
	startTestModule(sc.getName(), sc.getId());  //sc.getName() displays the testcase name
	test = startTestCase(sc.getName());
	test.assignCategory(category);
	test.assignAuthor(authors);
	startApp(browserName);		

	
//System.out.println(sc.getId());
//System.out.println(sc.getName());

}

@After
public void AfterScenario(Scenario sc) {

	
	closeAllBrowsers();
	endResult();
	
	
//System.out.println(sc.getStatus());
//System.out.println(sc.isFailed());

}
}