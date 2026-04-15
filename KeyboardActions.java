package com.example.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// H.w. make use of ctil +A and ctrl +c.   copy name from name section and paste in email field
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vinothqaacademy.com/demo-site-keyboard-events/");
		
		WebElement searchbox = driver.findElement(By.id("vts-search"));
		searchbox.sendKeys("j");
		
		Thread.sleep(1000);
		
		// using sends keys: used perform one action at a time
		
//		 searchbox.sendKeys(Keys.ARROW_DOWN);
//		searchbox.sendKeys(Keys.ARROW_DOWN);
//		searchbox.sendKeys(Keys.ENTER); 
	
		
		
		// using action class to use multiple keys (or one key multiple times)
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
		act.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
		
		//WebElement element = driver.findElement(By.xpath("//div[@id=\"vts-box\"]//div[2]"));
		

		
//		act.keyDown(element,Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).keyDown(Keys.ENTER).
//		keyDown(Keys.ENTER).build().perform();  
		
		//act.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).keyDown(Keys.ENTER).
	//keyDown(Keys.ENTER).build().perform();   
	}

}
