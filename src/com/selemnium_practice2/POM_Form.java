package com.selemnium_practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Form {

	@FindBy (xpath ="//input[@id='firstName']") private WebElement firstName;
	@FindBy (xpath ="//input[@id='lastName']") private WebElement lastName;
	@FindBy(xpath ="//input[@id='userEmail']") private WebElement mail;
	@FindBy (xpath ="//label[@for='gender-radio-2']") private WebElement gender;
	@FindBy(xpath ="//input[@id='userNumber']") private WebElement number;
	@FindBy(xpath = "//div[@class='subjects-auto-complete_value-container subjects-auto-complete_value-container--is-multi css-1hwfws3']") private WebElement sub;
	@FindBy(xpath ="//div[@class='subjects-auto-complete__control css-yk16xz-control']")private WebElement sub1;
	@FindBy(xpath ="//label[@for='hobbies-checkbox-3']") private WebElement Hobby;
	@FindBy(xpath ="//textarea[@placeholder='Current Address']") private WebElement address;
	
	WebDriver driver;
	
	public POM_Form(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void EnterName(String FirstName) {
		firstName.sendKeys(FirstName);
	}
	
	public void EnterLastName(String LastName) {
		lastName.sendKeys(LastName);
	}
	
	public void EnterEmail(String Email) {
		mail.sendKeys(Email);
	}
	
	public void ClickOnGender() {
		gender.isSelected();
	}
	
	public void EnterPhoneNo (String Mobile) {
		number.sendKeys(Mobile);
	}
	
	public void EnterSubjectName (String Subject) {
//		sub.click();
//		sub.clear();
//		sub1.click();
//		sub1.sendKeys(Subject);
	}
	
	public void ClickOnHobby () {
		Hobby.click();
	}
	
	public void EnterCurrenAddress (String CurrentAdd) {
		address.sendKeys(CurrentAdd);
	}

}
