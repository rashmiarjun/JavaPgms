package com.autodesk.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorsPage {

	@FindBy(xpath = "//img[@title='Create Vendor...']")
	private WebElement createVendorButton;

	@FindBy(linkText = "Vendors")
	private WebElement vendorslink;

	@FindBy(name = "vendorname")
	private WebElement vendornametextfield;

	@FindBy(id = "phone")
	private WebElement phonetextfield;

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement clicksavebutton;

	@FindBy(id = "viewname")
	private WebElement filtersDropDown;
	
	@FindBy(linkText="Delete")
	private WebElement deleteFilters;

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminsignout;

	@FindBy(linkText = "Sign Out")
	private WebElement signoutlink;

	@FindBy(linkText = "More")
	private WebElement morelink;

	public VendorsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateVendorButton() {
		return createVendorButton;
	}

	public WebElement getVendorslink() {
		return vendorslink;
	}

	public WebElement getVendornametextfield() {
		return vendornametextfield;
	}

	public WebElement getPhonetextfield() {
		return phonetextfield;
	}

	public WebElement getClicksavebutton() {
		return clicksavebutton;
	}

	public WebElement getAdminsignout() {
		return adminsignout;
	}

	public WebElement getSignoutlink() {
		return signoutlink;
	}

	public WebElement getMorelink() {
		return morelink;
	}

	public WebElement getFiltersDropDown() {
		return filtersDropDown;
	}

	public WebElement getDeleteFilters() {
		return deleteFilters;
	}

}
