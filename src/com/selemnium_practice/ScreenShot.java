package com.selemnium_practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void getScreenShot(WebDriver driver, String Name) throws IOException {
		String Time1 = TimeStamp.TimeDate();
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\Nikita\\Documents\\Selenium_Practice\\ScreenShot\\" +Name + "_"+ Time1 +".jpg");
		FileHandler.copy(Source, Destination);
	}
}
