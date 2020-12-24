package com.autodesk.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoicePage {

	@FindBy(linkText = "More")
	private WebElement morelink;

	@FindBy(linkText = "Invoice")
	private WebElement invoicelink;

	@FindBy(xpath = "//img[@title='Create Invoice...']")
	private WebElement createInvoiceButton;

	@FindBy(name = "subject")
	private WebElement subjectTextField;

	@FindBy(xpath = "(//img[@title='Select'])[3]")
	private WebElement orgTextField;

	@FindBy(name = "bill_street")
	private WebElement billingTextField;

	@FindBy(xpath = "//input[contains(@onclick,'copyAddressRight')]")
	private WebElement copyBillingAddressRadioBtn;

	@FindBy(id = "qty1")
	private WebElement quantityField;

	@FindBy(id = "searchIcon1")
	private WebElement addItems;

	@FindBy(xpath = "//img[@title='Select']")
	private WebElement orgNameField;
	
	@FindBy(name="invoicestatus")
	private WebElement selectStatus;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement clicksavebutton;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[2]")
	private WebElement click2ndsavebutton;
	
	@FindBy(xpath="//b[.='Item Details']")
	private WebElement scrollToIteamDetails;
	
	@FindBy(name = "search_text")
	private WebElement searchfortextfield;
	
	@FindBy(id = "bas_searchfield")
	private WebElement searchintextfield;
	
	@FindBy(name = "submit")
	private WebElement searchsubmit;
	
	@FindBy(xpath="//img[@title='Last Viewed']")
	private WebElement lastViewedLink;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminsignout;

	@FindBy(linkText = "Sign Out")
	private WebElement signoutlink;
	
	@FindBy(id="viewname")
	private WebElement selectFilters;

	public InvoicePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getMorelink() {
		return morelink;
	}

	public WebElement getInvoicelink() {
		return invoicelink;
	}

	public WebElement getCreateInvoiceButton() {
		return createInvoiceButton;
	}

	public WebElement getSubjectTextField() {
		return subjectTextField;
	}

	public WebElement getOrgTextField() {
		return orgTextField;
	}

	public WebElement getBillingTextField() {
		return billingTextField;
	}

	public WebElement getCopyBillingAddressRadioBtn() {
		return copyBillingAddressRadioBtn;
	}

	public WebElement getQuantityField() {
		return quantityField;
	}

	public WebElement getAddItems() {
		return addItems;
	}

	public WebElement getOrgNameField() {
		return orgNameField;
	}

	public WebElement getClicksavebutton() {
		return clicksavebutton;
	}

	public WebElement getSelectStatus() {
		return selectStatus;
	}

	public WebElement getClick2ndsavebutton() {
		return click2ndsavebutton;
	}

	public WebElement getScrollToIteamDetails() {
		return scrollToIteamDetails;
	}

	public WebElement getSearchfortextfield() {
		return searchfortextfield;
	}

	public WebElement getSearchintextfield() {
		return searchintextfield;
	}

	public WebElement getSearchsubmit() {
		return searchsubmit;
	}

	public WebElement getAdminsignout() {
		return adminsignout;
	}

	public WebElement getSignoutlink() {
		return signoutlink;
	}

	public WebElement getSelectFilters() {
		return selectFilters;
	}

	public WebElement getLastViewedLink() {
		return lastViewedLink;
	}

}
