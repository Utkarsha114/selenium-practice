package com.example.testscript;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(" https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		try {
			
		WebElement name = driver.findElement(By.id("Name"));
		name.sendKeys("Utkarsha");
		
		}
		 
		catch (NoSuchElementException e){
			System.out.println(e);
			
		}
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("utkarsha114@gmail.com");
		
		
		
	}

}
