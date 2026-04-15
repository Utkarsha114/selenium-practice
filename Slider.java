package com.example.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//H.w. find slider for specific value using java- https://testautomationpractice.blogspot.com/
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement slider = driver.findElement(By.xpath("//span[@ class='ui-slider-handle ui-corner-all ui-state-default'][1]"));
		
		//mouse actions are performed using actions class
		Actions act = new Actions(driver); 
		act.scrollToElement(slider).perform();
		
		Thread.sleep(3000);
		
		// scroll by
		act.clickAndHold(slider).moveByOffset(30, 0).release().perform();
		
		System.out.println("Slider works successfully");
 				
	
	}

}
