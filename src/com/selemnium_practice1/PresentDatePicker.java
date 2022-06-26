package com.selemnium_practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PresentDatePicker {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikita\\Documents\\Selnium_Software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.goibibo.com/flights/");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
	WebElement Datebutton = driver.findElement(By.xpath("//span[@class='sc-kfPuZi dprjVP fswDownArrow']"));
	WebDriverWait wait = new WebDriverWait(driver, 3000);
	wait.until(ExpectedConditions.elementToBeClickable(Datebutton));
	Datebutton.click();
	
	List<WebElement> dateList= driver.findElements(By.className("fsw__date"));
	int count = dateList.size();
	
	for(int i =0; i<count;i++) {
		String text = driver.findElements(By.className("fsw__date")).get(i).getText();
		//System.out.println("Text is " +text);
		if(text.equalsIgnoreCase("29")) {
			driver.findElements(By.className("fsw__date")).get(i).click();
			break;
		}
	}
	
	WebElement Done = driver.findElement(By.xpath("//span[text()='Done']"));
	Done.click();
}
}
