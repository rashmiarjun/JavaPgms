package com.autodesk.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage {

	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createOrgButton;
	
	@FindBy(linkText = "Organizations")
	private WebElement orgLink;

	@FindBy(name = "accountname")
	private WebElement orgNameTextfield;

	@FindBy(name = "website")
	private WebElement websiteTextField;

	@FindBy(id = "tickersymbol")
	private WebElement tickersymblTextfield;

	@FindBy(xpath = "//font[contains(.,'Information on This text field')]")
	private WebElement tickererrormsg;

	@FindBy(xpath = "//img[@title='Select']")
	private WebElement memberOfField;

	@FindBy(name = "rating")
	private WebElement ratingDropDown;

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement clickOnSaveButton;

	@FindBy(xpath = "(//input[@title='Cancel [Alt+X]'])[1]")
	private WebElement clickCancelButton;
	
	@FindBy(xpath = "(//input[@title='Delete [Alt+D]'])[1]")
	private WebElement deleteorg;

	@FindBy(name = "//input[@value='U']")
	private WebElement assignedToUserRadioButton;

	@FindBy(name = "//input[@value='T']")
	private WebElement assignedToGroupRadioButton;

	@FindBy(name = "assigned_user_id")
	private WebElement assignedTodropdown;

	@FindBy(xpath = "//input[contains(@onclick,'copyAddressLeft')]")
	private WebElement copyShippingAddressRadioBtn;

	public WebElement getCreateOrgButton() {
		return createOrgButton;
	}

	public WebElement getOrgLink() {
		return orgLink;
	}

	public WebElement getOrgNameTextfield() {
		return orgNameTextfield;
	}

	public WebElement getWebsiteTextField() {
		return websiteTextField;
	}

	public WebElement getTickersymblTextfield() {
		return tickersymblTextfield;
	}

	public WebElement getTickererrormsg() {
		return tickererrormsg;
	}

	public WebElement getMemberOfField() {
		return memberOfField;
	}

	public WebElement getRatingDropDown() {
		return ratingDropDown;
	}

	public WebElement getClickOnSaveButton() {
		return clickOnSaveButton;
	}

	public WebElement getClickCancelButton() {
		return clickCancelButton;
	}

	public WebElement getAssignedToUserRadioButton() {
		return assignedToUserRadioButton;
	}

	public WebElement getAssignedToGroupRadioButton() {
		return assignedToGroupRadioButton;
	}

	public WebElement getAssignedTodropdown() {
		return assignedTodropdown;
	}

	public WebElement getCopyShippingAddressRadioBtn() {
		return copyShippingAddressRadioBtn;
	}

	public OrganizationsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getDeleteorg() {
		return deleteorg;
	}

}
