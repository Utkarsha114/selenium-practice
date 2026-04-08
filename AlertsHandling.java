package com.example.testscript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
//		WebElement alertbtn = driver.findElement(By.xpath("//button[@id='alertBtn']"));
//		alertbtn.click();
		
		Thread.sleep(3000);
		
//		Alert al = driver.switchTo().alert();
//		System.out.println(al.getText());    //Prints alert message in console
//		
//		//al.accept(); //ok
//		al.dismiss(); //cancel
		// sendKeys is also used in alert.
		
		
		WebElement confirmbtn = driver.findElement(By.id("confirmBtn"));
		confirmbtn.click();
		
		Thread.sleep(3000);
		
		Alert confirm = driver.switchTo().alert();
		System.out.println(confirm.getText()); 
		confirm.accept();

		
		
	}

}
