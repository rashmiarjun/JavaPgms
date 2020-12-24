package com.autodesk.crm.testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.autodesk.crm.POM.LeadsPage;
import com.autodesk.crm.POM.LoginPage;
import com.autodesk.crm.genericlib.FileLib;
import com.autodesk.crm.genericlib.WebDriverUtils;

public class TestLeads {

	@Test
	public void deleteleads() throws IOException {

		FileLib fl = new FileLib();
		WebDriverUtils wdu = new WebDriverUtils();
		WebDriver driver = new ChromeDriver();
		wdu.implicitlywaitForElement(driver);
		wdu.maximizeWindow(driver);
		driver.get(fl.getPropertyKeyValue("URL"));

		wdu.verification(driver, fl.getExcelData("leads", 1, 3), "Login page");
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(fl.getPropertyKeyValue("username"), fl.getPropertyKeyValue("password"));

		wdu.verification(driver, fl.getExcelData("leads", 2, 3), "Home page");
		LeadsPage ldp = new LeadsPage(driver);
		wdu.elementDisplayedValidation(ldp.getLeadsLink(), "Leads Module");
		ldp.getLeadsLink().click();
		wdu.verification(driver, fl.getExcelData("leads", 3, 3), "Leads page");
		wdu.elementDisplayedValidation(ldp.getCreateLeadsButton(), "Create Leads button");
		ldp.getCreateLeadsButton().click();
		wdu.verification(driver, fl.getExcelData("leads", 4, 3), "Create Leads page");

		wdu.elementDisplayedValidation(ldp.getFirstnametextfield(), "First Name text field");
		wdu.elementDisplayedValidation(ldp.getLastnametextfield(), "Last Name text field");
		wdu.elementDisplayedValidation(ldp.getCompanytextfield(), "Company text field");
		ldp.getFirstnametextfield().sendKeys(fl.getExcelData("leads", 4, 0));
		ldp.getLastnametextfield().sendKeys(fl.getExcelData("leads", 4, 1));
		ldp.getCompanytextfield().sendKeys(fl.getExcelData("leads", 4, 2));

		wdu.elementDisplayedValidation(ldp.getClicksavebutton(), "Save Button");
		ldp.getClicksavebutton().click();
		wdu.elementDisplayedValidation(ldp.getLeadsLink(), "Leads Module");
		ldp.getLeadsLink().click();
		wdu.verification(driver, fl.getExcelData("leads", 3, 3), "Leads page");

		driver.findElement(By.linkText("monisha")).click();
		wdu.elementDisplayedValidation(ldp.getDeletelead(), "Delete Button");
		ldp.getDeletelead().click();
		wdu.acceptAlert(driver);
		driver.close();
	}

}
