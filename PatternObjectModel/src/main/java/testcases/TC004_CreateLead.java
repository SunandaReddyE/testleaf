package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_ClickLead";
		testDescription="Leads to be clicked";
		testNodes="Leads";
		category="Smoke";
		authors="Sunanda";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void CreateLead(String uName,String pwd,String vName,String cmpName,String f_name,String L_Name,String phone,String vf_name) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName)
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.typeCompanyName(cmpName)
		.typeFirstName(f_name)
		.typeLastName(L_Name)
		.typePhone(phone)
		.clickCreateLeadButton()
		.verifyFirstName(f_name);
		
		
		
		
		
		
				
	}

}
