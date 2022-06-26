package com.selemnium_practice2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selemnium_practice.Browser;

public class WebTables {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = Browser.OpenBrowser("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Nikita");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Nakade");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("nik@gmail.com");
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("26");
		driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("85000");
		driver.findElement(By.xpath("//input[@id='department']")).sendKeys("Quality Control");
		ScreenShot.getScreenShot(driver, "Page");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		WebElement search = driver.findElement(By.xpath("//input[@id='searchBox']"));
		search.sendKeys("Nikita");
		search.sendKeys(Keys.ENTER);
	}
}
