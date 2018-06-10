package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_ClickLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_ClickLead";
		testDescription="Leads to be clicked";
		testNodes="Leads";
		category="Smoke";
		authors="Sunanda";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String vName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName)
		.clickCRMSFA()
		.clickLeads();
		
		
				
	}

}
