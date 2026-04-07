package com.example.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScriptWebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Thread.sleep(3000);
		
		WebElement name = driver.findElement(By.xpath("	//input[@id='name'] "));
		name.sendKeys("Utkarsha");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("utkarsha@gmail.com");
		
		WebElement phone = driver.findElement(By.id("phone"));
		phone.sendKeys("123456789");
		//input[@id='phone']
	
		WebElement address = driver.findElement(By.xpath("//textarea[@id='textarea']"));
		address.sendKeys("Pune");
		
		WebElement gender = driver.findElement(By.xpath("//input[@id='female']"));
		gender.click();
		
		WebElement days = driver.findElement(By.xpath("//label[@for='sunday']"));
		days.click();
		
		WebElement country = driver. findElement(By.xpath("//select[@id=\"country\"]"));
		country.click();
		
		Select s1 = new Select(country);
		List<WebElement> list = s1.getOptions();
		for(WebElement option : list) 
		{
			// System.out.println(option.getText()); // gives all options in console.
		
			s1.selectByValue("usa");      //gives a specific text from website to console
		}
		
		
		
	
		
		//methods for select
		//s1.selectByIndex(2);
		
		s1.selectByValue("france");
		
				
		//s1.selectByVisibleText("China");
		 s1.selectByIndex(5);
		 //s1.selectByValue("usa");
		// s1.selectByVisibleText("India");
		 
		 
		 
		 //multiselect 
		 WebElement colors = driver.findElement(By.xpath("//select[@id=\"colors\"]"));
		 Select s2 = new Select(colors);
		 boolean result = s2.isMultiple();   // to check if multiple selection is allowed or not
		 System.out.println(result);   // true for colors is printed in console
		 
		 s2.selectByValue("yellow");
		 s2.selectByVisibleText("Blue");
		 
		 
		 
		 List<WebElement> list2 = s2.getOptions();
		 for(WebElement option2 : list2)
		 {
		     System.out.println(option2.getText());
		     s2.selectByValue("Blue");
		 }
		 
		 
		 
		 
		 
//		List<WebElement> list2 = s2.getOptions();
//		for(WebElement option2 : list2)
//		{
//			System.out.println(option2.getText());
//		}
	}

}


