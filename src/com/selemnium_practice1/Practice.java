package com.selemnium_practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selemnium_practice.Browser;

public class Practice {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikita\\Documents\\Selnium_Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.goibibo.com/flights/");
		driver.manage().window().maximize();
		
		WebElement DateArrow = driver.findElement(By.xpath("//span[@class='sc-kfPuZi dprjVP fswDownArrow']"));
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.elementToBeClickable(DateArrow));
		DateArrow.click();
		
		while(!driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText().contains("June 2022")) 
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
		
		WebElement DepatureMonth = driver.findElement(By.xpath("//div[text()='June 2022']"));
		DepatureMonth.click();
		WebElement DepatureDate = driver.findElement(By.xpath("(//p[text()='7'])[1]"));
		DepatureDate.click();
		
		
		
		
		WebElement DepatureDone = driver.findElement(By.xpath("//span[text()='Done']"));
		DepatureDone.click();
		
		WebElement ReturnDatePicker = driver.findElement(By.xpath("//span[text()='Return']"));
		ReturnDatePicker.click();
		while(!driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[2]")).getText().contains("July 2022")) {
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
		WebElement ReturnMonth = driver.findElement(By.xpath("//div[text()='July 2022']"));
		ReturnMonth.click();
		WebElement ReturnDate = driver.findElement(By.xpath("//div[@aria-label='Wed Jul 06 2022']"));
		ReturnDate.click();
//		WebElement ReturnDone = driver.findElement(By.xpath("//span[text()='Done']"));
//		ReturnDone.click();
	}
	}
	
	