package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LeadCreation_MutlipleData {
RemoteWebDriver driver;

@Given("Start Application")
public void StartApication() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.get("http://leaftaps.com/opentaps/control/main"); 
}

//Use regular expression for dynamic data 
@And("Enter the usrname as (.*)")
public void EnterUsr_Nme(String UName) {
	driver.findElementById("username").sendKeys(UName);
	
}

@And("Enter the pssword as (.*)")
public void Enter_Pssword(String passwrd) {
	driver.findElementById("password").sendKeys(passwrd);
	
}

@And("click on lgin button")
public void Loginapp() {
	driver.findElementByClassName("decorativeSubmit").click();
}

@And("clck on Crm/sfa link")
public void Clk_CRMSFA() {
	driver.findElementByLinkText("CRM/SFA").click();
}

@And("clck on Leads section")
public void Clk_Lead() {
	driver.findElementByLinkText("Leads").click();
}

@And("clck on create lead link")
public void ClickCeate_Lead() {
	driver.findElementByLinkText("Create Lead").click();
}

@And("Enter the company name as (.*)")
public void Enter_CmName(String compname) {
	driver.findElementById("createLeadForm_companyName").sendKeys(compname);
}

@And("Enter the first name as (.*)")
public void Enter_fi_Name(String firstname) {
	driver.findElementById("createLeadForm_firstName").sendKeys(firstname);
}

@And("Enter the last name as (.*)")
public void Enter_Lst_Name(String lastname) {
	driver.findElementById("createLeadForm_lastName").sendKeys(lastname);
}

}
