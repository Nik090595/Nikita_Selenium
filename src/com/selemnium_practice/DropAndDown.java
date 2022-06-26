package com.selemnium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropAndDown {

//	public static void main(String[] args) {
//	WebDriver driver = Browser.OpenBrowser("http://javabykiran.com/playground/");
//	Actions act = new Actions(driver); // object create of action class
//	List<WebElement> links = driver.findElements(By.partialLinkText("User"));
//	for(WebElement link:links) {
//		act.moveToElement(link).pause(2000).doubleClick().build().perform();//same method is used for double click.
//	}
//}
	
//	public static void main(String[] args) {
//		WebDriver driver = Browser.OpenBrowser("https://javabykiran.com/playground/");
//		Actions act = new Actions(driver);
//		List<WebElement> links = driver.findElements(By.partialLinkText("User"));
//		for(WebElement link:links) {
//			act.moveToElement(link). pause(2000).build().perform(); // same method is used for pause.
//		}
//	}
	
	
	public static void main(String[] args) {
		WebDriver driver = Browser.OpenBrowser("https://javabykiran.com/playground/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		List<WebElement> links = driver.findElements(By.partialLinkText("User"));
		for (WebElement link:links) {
			act.moveToElement(link).pause(2000).click().build().perform();
		}
	}
}
