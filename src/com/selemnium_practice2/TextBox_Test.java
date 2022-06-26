package com.selemnium_practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBox_Test {

	@FindBy (xpath ="//input[@id='userName']") private WebElement FullName;
	@FindBy (xpath ="//input[@id='userEmail']") private WebElement mail;
	@FindBy (xpath ="//textarea[@id='currentAddress']") private WebElement address;
	@FindBy (xpath ="//textarea[@id='permanentAddress']") private WebElement add;
	@FindBy (xpath ="//button[@id='submit']") private WebElement submit;
	
	public TextBox_Test (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void EnterFullName(String Fullname) {
	FullName.sendKeys(Fullname);
	}
	
	public void EnterEmail(String Email) {
		mail.sendKeys(Email);
	}
	
	public void EnterCurrenAddress (String CurrentAdd) {
		address.sendKeys(CurrentAdd);
	}
	
	public void EnterAddress(String Add) {
		add.sendKeys(Add);
	}
	
	public void ClickOnSubmit() {
		submit.click();
	}
}
