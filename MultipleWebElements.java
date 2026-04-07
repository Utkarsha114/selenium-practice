package com.example.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		List <WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		
		for(WebElement link : allLinks) {
			System.out.println(link.getText());
			
			if(link.getText().equals("मराठी")) {
				link.click();
			}
		}

	}

}
