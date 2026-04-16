package com.example.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DynamicWebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		// we want to find the exact company name. but data is dynamic. so we make use of key words.
		//List <WebElement> td = driver.findElements(By.xpath("//table[@class='dataTable']//tr//td//a[contains(text(),'e')]"));
		
		// we make use of parent- child elements, that gives the entire row as output (below is 1st method)
		//List <WebElement> td1 = driver.findElements(By.xpath("//table[@class='dataTable']//tr//td//a[contains(text(),'e')]/ancestor::tr"));
		
		//2nd method to access entire row
		List <WebElement> td2 = driver.findElements(By.xpath("//table[@class='dataTable']//tr[.//a[contains(text(),'H')]]"));
		
		
		for(WebElement col:td2) {
			System.out.println(col.getText());
			
		}

	}

}
