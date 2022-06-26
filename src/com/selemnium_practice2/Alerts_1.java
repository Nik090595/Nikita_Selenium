package com.selemnium_practice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selemnium_practice.Browser;

public class Alerts_1 {

	public static void main(String[] args) {
		
		WebDriver driver = Browser.OpenBrowser("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement alert1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
		alert1.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Alert A = driver.switchTo().alert();
		A.accept();

		
//		WebElement alert = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
//		alert.click();
//	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		Alert a1 = driver.switchTo().alert();
//		a1.accept();//ALERT AFTER 5SECOND APPEAR
		
		
		WebElement alert2 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		alert2.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Alert a = driver.switchTo().alert();
		a.dismiss();
		
		
		WebElement alert3 = driver.findElement(By.xpath("//button[@id='promtButton']"));
		alert3.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Alert a1 = driver.switchTo().alert();
		a1.sendKeys("Nikita");
		a1.accept();
	}
}
