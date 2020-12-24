package com.autodesk.crm.TestScript;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.autodesk.crm.GenericLib.WebDriverLib;
import com.autodesk.crm.POM.ContactsPage;
import com.autodesk.crm.POM.LoginPage;
import com.autodesk.crm.genericlib.FileLib;
import com.autodesk.crm.genericlib.WebDriverUtils;

public class TestContacts {

	@Test
	public void checkemailofcontact() throws IOException {

		FileLib fl = new FileLib();
		WebDriverLib wdu = new WebDriverException();
		WebDriver driver = new ChromeDriver();
		wdu.implicitlywaitForElement(driver);
		wdu.maximizeWindow(driver);
		driver.get(fl.getPropertyKeyValue("URL"));
		wdu.verification(driver, fl.getExcelData("contacts", 1, 3), "Login page");

		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(fl.getPropertyKeyValue("username"), fl.getPropertyKeyValue("password"));
		wdu.verification(driver, fl.getExcelData("contacts", 2, 3), "Home page");

		ContactsPage cp = new ContactsPage(driver);
		wdu.elementDisplayedValidation(cp.getContactslink(), "Contacts Module");
		cp.getContactslink().click();
		wdu.verification(driver, fl.getExcelData("contacts", 3, 3), "Contacts page");
		wdu.elementDisplayedValidation(cp.getCreateContactsButton(), "Create Contacts button");
		cp.getCreateContactsButton().click();

		wdu.verification(driver, fl.getExcelData("contacts", 4, 3), "Create Contacts page");
		wdu.elementDisplayedValidation(cp.getFirstnametextfield(), "First Name text field");
		wdu.elementDisplayedValidation(cp.getLastnametextfield(), "Last name text field");
		wdu.elementDisplayedValidation(cp.getEmailtextfield(), "Email text field");
		cp.getFirstnametextfield().sendKeys(fl.getExcelData("contacts", 2, 0));
		cp.getLastnametextfield().sendKeys(fl.getExcelData("contacts", 2, 1));
		cp.getEmailtextfield().sendKeys(fl.getExcelData("contacts", 2, 2));

		wdu.elementDisplayedValidation(cp.getClicksavebutton(), "Save button");
		cp.getClicksavebutton().click();
		wdu.elementDisplayedValidation(cp.getContactslink(), "contacts module");
		cp.getContactslink().click();
		wdu.elementDisplayedValidation(cp.getSearchfortextfield(), "Search for text field");
		cp.getSearchfortextfield().sendKeys(fl.getExcelData("contacts", 2, 2));
		wdu.elementDisplayedValidation(cp.getSearchintextfield(), "Search in drop down");
		WebElement srchelement = cp.getSearchintextfield();
		wdu.selectbyvisibletext(srchelement, "Email");
		cp.getSearchsubmit().click();

		List<WebElement> created = driver.findElements(By.xpath("//td[.='Baba ']/../td[3]"));
		int count1 = created.size();
		System.out.println(count1);
		System.out.println("Related leads are displayed -->");
		for (int i = 0; i < count1; i++) {
			WebElement text = created.get(i);
			System.out.println(text.getText());
		}
		driver.close();

	}

}
