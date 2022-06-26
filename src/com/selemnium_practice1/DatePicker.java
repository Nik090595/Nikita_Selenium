package com.selemnium_practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selemnium_practice.Browser;

public class DatePicker {

	public static void main(String[] args) {
		
		String ExpectedDate = "10-October-2022";
		String ExpMonth = ExpectedDate.split("-")[1];
		String ExpYear = ExpectedDate.split("-")[2];
		String ExpDate = ExpectedDate.split("-")[0];
		System.out.println(ExpMonth+"-"+ExpYear); //ExpDate+"-"+
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikita\\Documents\\Selnium_Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.goibibo.com/flights/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		
		WebElement Datebutton = driver.findElement(By.xpath("//span[@class='sc-kfPuZi dprjVP fswDownArrow']"));
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.elementToBeClickable(Datebutton));
		Datebutton.click();
		System.out.println("1");
		String ADate = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
		System.out.println("2");
		WebElement Next;
//		WebElement Next = driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
//		Next.click();
		System.out.println("3");
		
		while((!ADate.equals(ExpMonth))||(!ADate.equals(ExpYear))) {
			Next = driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
			Next.click();
			ADate = driver.findElement(By.xpath("(//div[@class='DayPicker-Month'])[1]")).getText();
		}
		
		//div[@aria-label='Mon Oct 03 2022']
		//List <WebElement> Date = (List<WebElement>) driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
//		for(WebElement e :Date) {
//			if(e.getText().trim().equals(ExpectedDate));
//			e.click();
//			break;
//		}
	}
}
