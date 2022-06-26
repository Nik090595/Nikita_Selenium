package com.selemnium_practice;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowser_3 {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = Browser.OpenBrowser("https://support.google.com/mail/answer/56256?hl=en");
		
		WebElement Create  = driver.findElement(By.xpath("//a[text()='Create an account ']"));
		Create.click();
		driver.manage().window().maximize();
		ScreenShot.getScreenShot(driver, "CreateNewAccount");
		
		ArrayList<String> address = new ArrayList(driver.getWindowHandles());
		System.out.println("List of links " +address.size());
		
		System.out.println(address.get(0));
		System.out.println(address.get(1));
		
		driver.switchTo().window(address.get(1));
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Nikita");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Nakade");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("nik");
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}
}
