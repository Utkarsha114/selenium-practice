package com.example.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(2000);
		
		//driver.close();    //used to close the current window
		driver.quit();   	//used to close all windows opened by driver
		
		
		
	}

}
