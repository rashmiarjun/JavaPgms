package com.autodesk.crm.testScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.autodesk.crm.POM.LoginPage;
import com.autodesk.crm.POM.VendorsPage;
import com.autodesk.crm.genericlib.FileLib;
import com.autodesk.crm.genericlib.WebDriverUtils;

public class TestVendor {

	@Test
	public void deleteVendorfilter() throws IOException {
		FileLib fl = new FileLib();
		WebDriverUtils wdu = new WebDriverUtils();
		WebDriver driver = new ChromeDriver();
		wdu.implicitlywaitForElement(driver);
		wdu.maximizeWindow(driver);
		driver.get(fl.getPropertyKeyValue("URL"));
		wdu.verification(driver, fl.getExcelData("vendors", 1, 2), "Login page");

		LoginPage lp = new LoginPage(driver);
		wdu.elementDisplayedValidation(lp.getUsername(), "Username text field");
		wdu.elementDisplayedValidation(lp.getPassword(), "password text field");
		wdu.elementDisplayedValidation(lp.getLoginButton(), "login button");
		lp.loginToApp(fl.getPropertyKeyValue("username"), fl.getPropertyKeyValue("password"));

		wdu.verification(driver, fl.getExcelData("vendors", 2, 2), "Home page");
		VendorsPage vp = new VendorsPage(driver);
		wdu.elementDisplayedValidation(vp.getMorelink(), "More module");
		vp.getMorelink().click();
		wdu.elementDisplayedValidation(vp.getVendorslink(), "Vendor module");
		vp.getVendorslink().click();
		wdu.verification(driver, fl.getExcelData("vendors", 3, 2), "Vendor page");

		wdu.elementDisplayedValidation(vp.getFiltersDropDown(), "Filter drop down");
		wdu.selectbyvisibletext(vp.getFiltersDropDown(), fl.getExcelData("vendors", 1, 3));
		wdu.allselectbyoptions(vp.getFiltersDropDown());

		wdu.elementDisplayedValidation(vp.getDeleteFilters(), "Delete filter button");
		vp.getDeleteFilters().click();
		wdu.dismissAlert(driver);

		wdu.elementDisplayedValidation(vp.getAdminsignout(), "Administrator button");
		vp.getAdminsignout().click();
		wdu.elementDisplayedValidation(vp.getSignoutlink(), "Sign out button");
		vp.getSignoutlink().click();
		driver.close();

	}
}
