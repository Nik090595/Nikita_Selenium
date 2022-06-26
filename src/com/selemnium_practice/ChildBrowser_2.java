package com.selemnium_practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowser_2 {

	public static void main(String[] args) {
		
		WebDriver driver = Browser.OpenBrowser("https://zerodha.com/");
		
		WebElement Product = driver.findElement(By.xpath("(//a[text()='Products'])[1]"));
		Product.click();
		
		
		Set<String> address = driver.getWindowHandles();
		Iterator<String> i = address.iterator();
		
		while(i.hasNext()) {
			String window = i.next();
			driver.switchTo().window(window);
			
			String actualTitle = driver.getTitle();
			String expectedTitle = "Practice Page";
			
			if(actualTitle.equals(expectedTitle)) {
				WebElement radio = driver.findElement(By.xpath("//input[@value ='Radio1']"));
        		radio.click();
			}
		}
	}
}
