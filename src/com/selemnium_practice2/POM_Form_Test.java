package com.selemnium_practice2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import com.selemnium_practice.Browser;

public class POM_Form_Test {

	public void EnterDetails() throws EncryptedDocumentException, IOException {
		WebDriver driver = Browser.OpenBrowser("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		POM_Form pom = new POM_Form (driver);
		
		String FirstName = POM_Excelsheet.Data(0,1, "Data");
		pom.EnterName(FirstName);
		String LastName = POM_Excelsheet.Data(1, 1, "Data");
		pom.EnterLastName(LastName);
		String Email = POM_Excelsheet.Data(2, 1, "Data");
		pom.EnterEmail(Email);
		pom.ClickOnGender();
		String Mobile = POM_Excelsheet.Data(3, 1, "Data");
		pom.EnterPhoneNo(Mobile);
		String Subject = POM_Excelsheet.Data(4, 1, "Data");
    	pom.EnterSubjectName(Subject);
		pom.ClickOnHobby();
		String CurrentAdd = POM_Excelsheet.Data(5, 1, "Data");
		pom.EnterCurrenAddress(CurrentAdd);
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		POM_Form_Test test = new POM_Form_Test();
		test.EnterDetails();
	}
}
