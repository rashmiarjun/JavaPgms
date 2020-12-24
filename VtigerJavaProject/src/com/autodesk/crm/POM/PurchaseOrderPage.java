package com.autodesk.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseOrderPage {
	
	@FindBy(name = "subject")
	private WebElement subjectTextField;
	
	@FindBy(xpath = "(//img[@title='Select'])[1]")
	private WebElement vendorNameTextField;
	
	@FindBy(name = "bill_street")
	private WebElement billingTextField;

	@FindBy(xpath = "//input[contains(@onclick,'copyAddressRight')]")
	private WebElement copyBillingAddressRadioBtn;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[2]")
	private WebElement clicksavebutton;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminsignout;

	@FindBy(linkText = "Sign Out")
	private WebElement signoutlink;
	
	public PurchaseOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSubjectTextField() {
		return subjectTextField;
	}

	public WebElement getVendorNameTextField() {
		return vendorNameTextField;
	}

	public WebElement getBillingTextField() {
		return billingTextField;
	}

	public WebElement getCopyBillingAddressRadioBtn() {
		return copyBillingAddressRadioBtn;
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
	
	
	
}
