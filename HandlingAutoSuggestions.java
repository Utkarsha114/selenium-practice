package com.example.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement searchbox = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		searchbox.sendKeys("Pune");
		
		
		WebElement searchbutton = driver.findElement(By.xpath("//input[@type='submit']"));
		searchbutton.click();
		
		Thread.sleep(3000);
		
		List <WebElement> suggestions = driver.findElements(By.xpath("//div[@class='wikipedia-search-results']//div//a"));    //this is known as parent child access. 
		System.out.println(suggestions.size());
		
		for(WebElement sug:suggestions) {
			System.out.println(sug.getText());
			
			if(sug.getText().equals("Pune Warriors India")) {
				sug.click();
			}
		}
	
		
	
	
	}

}
