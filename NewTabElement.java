package com.example.testscript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewTabElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vinothqaacademy.com/multiple-windows/");
		
		Thread.sleep(3000);
		
		System.out.println("Main Window:" + driver.getTitle());
		
		String parentWindow = driver.getWindowHandle();
		
		Actions act = new Actions(driver);
		
		WebElement newTab = driver.findElement(By.id("button1"));
		act.scrollToElement(newTab).perform();
		
		newTab.click();
		Thread.sleep(3000);
		
		// to switch to child window
		Set <String> allwindows = driver.getWindowHandles();
		for(String childWindow : allwindows)
		{
			if(!parentWindow.equals(childWindow)) 
			{
				driver.switchTo().window(childWindow);
				
				System.out.println("New Tab:" + driver.getTitle());
			}
		}
		
		// we are still in the child window. 
		System.out.println("Current Tab:" + driver.getTitle());
		
		// to switch to parent window again, we use switchTo() again
		driver.switchTo().window(parentWindow);
		System.out.println("Current Tab:" + driver.getTitle());

	}

}
