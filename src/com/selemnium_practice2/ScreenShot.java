package com.selemnium_practice2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void getScreenShot(WebDriver driver, String Filename) throws IOException {
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\Nikita\\Documents\\Selenium_Practice\\ScreenShot\\"+Filename+".jpg");
		FileHandler.copy(Source, Destination);
	}
}
