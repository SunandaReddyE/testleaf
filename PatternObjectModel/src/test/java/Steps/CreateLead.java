package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {
RemoteWebDriver driver;

@Given("Invoke Application")
public void StartApp() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.get("http://leaftaps.com/opentaps/control/main"); 
}

//Use regular expression for dynamic data 
@And("Enter the username as (.*)")
public void EnterUserName(String UName) {
	driver.findElementById("username").sendKeys(UName);
	
}

@And("Enter the password as (.*)")
public void EnterPassword(String passwrd) {
	driver.findElementById("password").sendKeys(passwrd);
	
}

@And("click on login button")
public void Login() {
	driver.findElementByClassName("decorativeSubmit").click();
}
@Then("verify my login is successful")
public void Loginsuccess() {
	System.out.println("Login is success");
}


@And("click on Crm/sfa link")
public void ClickCRMSFA() {
	driver.findElementByLinkText("CRM/SFA").click();
}

@And("click on Leads section")
public void ClickLead() {
	driver.findElementByLinkText("Leads").click();
}

@And("click on create lead link")
public void ClickCreateLead() {
	driver.findElementByLinkText("Create Lead").click();
}

@And("Enter the company name")
public void EnterComName() {
	driver.findElementById("createLeadForm_companyName").sendKeys("Wipro");
}

@And("Enter the first name")
public void Enterf_Name() {
	driver.findElementById("createLeadForm_firstName").sendKeys("Sunanda");
}

@And("Enter the last name")
public void Enter_LastName() {
	driver.findElementById("createLeadForm_lastName").sendKeys("Reddy");
}

}
