package com.autodesk.crm.testScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.autodesk.crm.POM.LoginPage;
import com.autodesk.crm.POM.OrganizationsPage;
import com.autodesk.crm.genericlib.FileLib;
import com.autodesk.crm.genericlib.WebDriverUtils;

public class TestOrganizations {

	@Test
	public void createorgassignedtouser() throws IOException {

		FileLib fl = new FileLib();
		WebDriverUtils wdu = new WebDriverUtils();
		WebDriver driver = new ChromeDriver();
		wdu.implicitlywaitForElement(driver);
		wdu.maximizeWindow(driver);
		driver.get(fl.getPropertyKeyValue("URL"));
		wdu.verification(driver, fl.getExcelData("org", 1, 4), "Login page");

		LoginPage lp = new LoginPage(driver);
		wdu.elementDisplayedValidation(lp.getUsername(), "Username text field");
		wdu.elementDisplayedValidation(lp.getPassword(), "Password text field");
		wdu.elementDisplayedValidation(lp.getLoginButton(), "Login Button");
		lp.loginToApp(fl.getPropertyKeyValue("username"), fl.getPropertyKeyValue("password"));

		wdu.verification(driver, fl.getExcelData("org", 2, 4), "Home page");
		OrganizationsPage op = new OrganizationsPage(driver);
		wdu.elementDisplayedValidation(op.getOrgLink(), "Create Organization Symbol");
		op.getOrgLink().click();
		wdu.verification(driver, fl.getExcelData("org", 3, 4), "Organization page");
		op.getCreateOrgButton().click();
		wdu.verification(driver, fl.getExcelData("org", 3, 4), "Create Organization page");

		wdu.elementDisplayedValidation(op.getOrgNameTextfield(), "Organization Name text field");
		op.getOrgNameTextfield().sendKeys(fl.getExcelData("org", 2, 0));
		wdu.elementDisplayedValidation(op.getWebsiteTextField(), "Website text field");
		op.getWebsiteTextField().sendKeys(fl.getExcelData("org", 2, 1));
//		wdu.elementDisplayedValidation(op.getTickersymblTextfield(), "Ticker Symbol text field");
//		op.getTickersymblTextfield().sendKeys(fl.getExcelData("org", 2, 2));
		wdu.elementDisplayedValidation(op.getRatingDropDown(), "rating drop down box");
		wdu.selectbyvalue(op.getRatingDropDown(), fl.getExcelData("org", 2, 3));
//		System.out.println(op.getTickererrormsg().getText());
		try {
			op.getAssignedToGroupRadioButton().click();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			wdu.selectbyvisibletext(op.getAssignedTodropdown(), "Gaurav sharma");
		}
		wdu.allselectbyoptions(op.getAssignedTodropdown());
		driver.close();
	}
}