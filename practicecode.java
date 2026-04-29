package com.example.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practicecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.globalsqa.com/demo-site/#google_vignette");
//		
//		Actions al = new Actions(driver);
//		al.scrollByAmount(0, 500).perform();
//		// al.scrollToElement("Practice / Demo Site");
//		
//		WebElement ele = driver.findElement(By.xpath("//a[text()='SelectElements']")); 
//		ele.click();
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Actions al = new Actions(driver);
		
		WebElement visitors = driver.findElement(By.xpath("//h2[text()='Visitors']"));
		al.moveToElement(visitors).perform();
		
		
		
		

	}

}
