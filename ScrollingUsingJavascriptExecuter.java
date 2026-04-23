package com.example.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUsingJavascriptExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		
		
		// sendKeys using JSExecuter
		WebElement name = driver.findElement(By.cssSelector("#name"));
		//name.sendKeys("Pooja");
		// OR
		js.executeScript("arguments[0].value='pooja';",name);
		// value is taken from html. it is used in form
		
		// 4 types are used in JSExecutor
		//scrollBYPixels
		//scrolltoView
		//scrollByscript
		//scrollByElement

	}

}
