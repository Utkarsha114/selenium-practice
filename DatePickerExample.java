package com.example.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DatePickerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 900).perform();
		
		//date picker 1
		WebElement date1 = driver.findElement(By.id("datepicker"));
		date1.click();
		
		WebElement prev_arrow = driver.findElement(By.xpath("//span[text()='Prev']"));
		prev_arrow.click();
		
		WebElement day = driver.findElement(By.xpath("//a[text()='15']"));
		day.click();
		
		//date picker 2
		WebElement date2 = driver.findElement(By.id("txtDate"));
		date2.click();
		
		WebElement year = driver.findElement(By.xpath("//option[text()='2021']"));
		year.click();
		
		WebElement date = driver.findElement(By.xpath("//option[text()='2021']"));
		year.click();
	
		
	}

}
