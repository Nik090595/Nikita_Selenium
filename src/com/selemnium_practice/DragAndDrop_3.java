package com.selemnium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_3 {

	public static void main(String[] args) {
		
		WebDriver driver = Browser.OpenBrowser("https://javabykiran.com/playground/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Drag and Drop']")).click();
		WebElement from = driver.findElement(By.xpath("//div[text()='Contact Us']"));
		WebElement to = driver.findElement(By.xpath("//div[text()='Services']"));
		Actions A = new Actions(driver);
		A.dragAndDrop(from, to).build().perform();
		
		if(driver.findElement(By.xpath("//div[text()='Contact Us']")).isDisplayed()) {
			System.out.println("Drag and Drop is Done");
		}else {
			System.out.println("Drag and Drop is not Done");
		}
	}
}
