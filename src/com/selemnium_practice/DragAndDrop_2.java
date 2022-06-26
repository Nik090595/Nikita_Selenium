package com.selemnium_practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_2 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = Browser.OpenBrowser("https://javabykiran.com/playground/");
		
		Dimension d = new Dimension(200, 500);
		driver.manage().window().setSize(d);
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement Drag = driver.findElement(By.xpath("//a[text()='Drag and Drop']"));
		Drag.click();
		
		ScreenShot.getScreenShot(driver, "1st_Drag");
		
		WebElement from = driver.findElement(By.xpath("//div[text()='Contact Us']"));
		
		WebElement to = driver.findElement(By.xpath("//div[text()='Services']"));
		
		Actions builder = new Actions(driver);
		
		Action drop = builder.clickAndHold(from).moveToElement(to).release(to).build();
		drop.perform();
		
		ScreenShot.getScreenShot(driver, "2nd_Drag");
	}
}
