package com.selemnium_practice2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.selemnium_practice.Browser;
import com.selemnium_practice.ExcelSheet;

public class TextBox {

	public void EnterDetailsForSubmit() throws IOException {
		WebDriver driver = Browser.OpenBrowser("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		ScreenShot.getScreenShot(driver, "Blank_Page");
		TextBox_Test T = new TextBox_Test(driver);
		String Fullname = POM_Excelsheet.Data(0, 1, "Data");
		T.EnterFullName(Fullname);
		String Email = POM_Excelsheet.Data(1, 1, "Data");
		T.EnterEmail(Email);
		String CurrentAdd = POM_Excelsheet.Data(2, 1, "Data");
		T.EnterCurrenAddress(CurrentAdd);
		String Add =POM_Excelsheet.Data(3, 1, "Data");
		T.EnterAddress(Add);
		T.ClickOnSubmit();
		ScreenShot.getScreenShot(driver, "Filled_Page");
	}
	
	public static void main(String[] args) throws IOException {
		TextBox Obj = new TextBox();
		Obj.EnterDetailsForSubmit();
	}
}
