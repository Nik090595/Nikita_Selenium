package com.selemnium_practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selemnium_practice.Browser;

public class CheckBox {

	public static void main(String[] args) {
	WebDriver driver = Browser.OpenBrowser("https://demoqa.com/checkbox");
	
	WebElement box = driver.findElement(By.xpath("//button[@title='Toggle']"));
	box.click();
	WebElement checkbox = driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
	checkbox.click();
}
}
