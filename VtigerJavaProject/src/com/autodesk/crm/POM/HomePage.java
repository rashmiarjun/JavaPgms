package com.autodesk.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(linkText = "Organizations")
	private WebElement orgLink;

	@FindBy(linkText = "Contacts")
	private WebElement contactslink;

	@FindBy(linkText = "Leads")
	private WebElement leadsLink;

	@FindBy(linkText = "Vendors")
	private WebElement vendorslink;

	@FindBy(linkText = "Invoice")
	private WebElement invoicelink;

	@FindBy(linkText = "More")
	private WebElement morelink;

	public WebElement getOrgLink() {
		return orgLink;
	}

	public WebElement getContactslink() {
		return contactslink;
	}

	public WebElement getLeadsLink() {
		return leadsLink;
	}

	public WebElement getVendorslink() {
		return vendorslink;
	}

	public WebElement getInvoicelink() {
		return invoicelink;
	}

	public WebElement getMorelink() {
		return morelink;
	}

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
