package com.example.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicWebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		//Actions act = new Actions(driver);
		
		//List <WebElement> td = driver.findElements(By.xpath("//table[@class='dataTable']//tr//td//a[contains(text(),'e')]"));
		//List <WebElement> td1 = driver.findElements(By.xpath("//table[@class='dataTable']//tr//td//a[contains(text(),'e')]/ancestor::tr"));
		List <WebElement> td2 = driver.findElements(By.xpath("//table[@class='dataTable']//tr[.//a[contains(text(),'H')]]"));
		
		
		for(WebElement col:td2) {
			System.out.println(col.getText());
			
		}

	}

}
