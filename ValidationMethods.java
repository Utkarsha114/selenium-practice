package com.example.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ValidationMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 500).perform();
		
		
		// for radio button
		WebElement gender = driver.findElement(By.xpath("//label[@for='female']"));
		//gender.isSelected(); 
		
		Thread.sleep(2000);
		
		if(gender.isDisplayed()) {
			gender.click();
		}
		
		/* OR  use this
			  boolean result = button.isEnabled();
			  if(result == true) {
			  	button.click();
			  }
		 */
		else {
			System.out.println("Radio button not working");
		}
		
		
		
		
		
		
		
		
		// for checkbox
		// take the xpath of button on which the action is to be performed. And not the text.
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='tuesday']"));
		checkbox.click();    // find the xpath for the checkbox button to be selected. then click on the button
		
		if(checkbox.isSelected()) {    //now the checkbox is selected. if loop is true. so message is printed in console. 
			//checkbox.click();
			System.out.println("checkbox is selected");
		}
		
		// if we do not click the checkbox then else loop is executed
		else {
			System.out.println(checkbox.isSelected());
		}
	}

}
