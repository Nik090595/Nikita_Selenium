package com.selemnium_practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_1 {

//	public static void main(String[] args) throws IOException {
//		
//		WebDriver driver = Browser.OpenBrowser("https://javabykiran.com/playground/");
//		driver.manage().window().maximize();
//		Actions act = new Actions(driver);
//		WebElement drag = driver.findElement(By.xpath("//a[text()='Drag and Drop']"));
//		drag.click();
//		ScreenShot.getScreenShot(driver, "BeforeActionPerforming");
//		WebElement fromElement = driver.findElement(By.xpath("//div[text()='Home ']")); //drag and drop operation needs to be performed.
//		WebElement toElement = driver.findElement(By.xpath("//div[text()='Contact Us']"));//drag and drop operation to be dropped.
//		Actions builder = new Actions (driver);//Creating object of Actions class to build composite actions
//		Action DropAndDown = builder.clickAndHold(fromElement).moveToElement(toElement).release().build();//Building a drag and drop action
//		DropAndDown.perform();
//		ScreenShot.getScreenShot(driver, "AfterActionPerforming");
//	}
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = Browser.OpenBrowser("https://javabykiran.com/playground/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement  Down = driver.findElement(By.xpath("//a[text()='Drag and Drop']"));
		Down.click();
		
		ScreenShot.getScreenShot(driver, "BeforeACTION");
		
		WebElement from = driver.findElement(By.xpath("//div[text()='UI/UX Design']"));
		
		WebElement to = driver.findElement(By.xpath("//div[text()='About Us']"));
		
		Actions builder = new Actions(driver);
		
		Action dragAnddrop = builder.clickAndHold(from).moveToElement(to).release(to).build();
		dragAnddrop.perform();
		
		ScreenShot.getScreenShot(driver, "afterACTION");
	
	}
}
