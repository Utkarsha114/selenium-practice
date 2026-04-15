package com.example.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollTypes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		
		//scroll down
		act.scrollByAmount(0, 500).perform();
		
		Thread.sleep(3000);
		
		//scroll up
		act.scrollByAmount(0, -300).perform();
		
		//scroll right
		act.scrollByAmount(300, 0).perform();
		System.out.println("scroll right");
		
		Thread.sleep(3000);
		
		
		//scroll left
		act.scrollByAmount(-200, 0).perform();
		System.out.println("scroll left");
	}

}
