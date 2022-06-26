package com.selemnium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowser_1 {
	
public static void main(String[] args) {
	
	WebDriver driver = Browser.OpenBrowser("https://javabykiran.com/playground/");
	
	Point P = new Point(300, 500);
	driver.manage().window().getPosition();
	
	driver.manage().window().maximize();
	
	WebElement Child = driver.findElement(By.xpath("//a[text()='Open Child Window']"));
	Child.click();
	
	String S = driver.getWindowHandle();
	System.out.println(S);
	
	WebElement Read = driver.findElement(By.xpath("//a[text()='Read More']"));
	Read.click();
}
}
