package com.selemnium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static WebDriver OpenBrowser(String URL) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikita\\Documents\\Selnium_Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to(URL);
		return driver;
	}
}
