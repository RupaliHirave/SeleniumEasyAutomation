package com.tescases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputForm_SimpleFormDemo {

	public static void main(String[] args) throws InterruptedException {
		
		//Launching browser
		System.setProperty("webdriver.chrome.driver", "D:\\Automation softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/");
		
		//handling popup
		WebDriverWait wait=new WebDriverWait(driver, 15);
		WebElement closepopup=driver.findElement(By.cssSelector("#at-cv-lightbox-header #at-cv-lightbox-close"));
		wait.until(ExpectedConditions.visibilityOf(closepopup)).click();
		
		//Scroll to start practice button
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement startpractice=driver.findElement(By.cssSelector("#btn_basic_example"));
		js.executeScript("arguments[0].scrollIntoView();", startpractice);
		//click on start practice button
		startpractice.click();
		Thread.sleep(2000);
		//click on simple demo form
		driver.findElement(By.cssSelector("div.list-group a[href=\"./basic-first-form-demo.html\"]")).click();
		Thread.sleep(2000);
		//Enter massege
		driver.findElement(By.cssSelector("#user-message.form-control")).sendKeys("My name is Rupali");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='btn btn-default']")).click();
		
		System.out.println("Testcase is passed");
		
		driver.close();
		
		
		
		

	}

}
