package com.example.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
//		WebElement statictable = driver.findElement(By.xpath("//h2[text()='Static Web Table']"));
//		act.scrollToElement(statictable).perform();
//		
//		// find elements of first row
//		List<WebElement> row_1 = driver.findElements(By.xpath("//table[@name='BookTable']//tr[2]//td"));
//		System.out.println(row_1.size());
//		
//		for(int i=0; i<row_1.size();i++) {
//			System.out.println(row_1.get(i).getText());
//		}
//		
//		
//		
//		
//		// find data of the first column
//		List<WebElement> column_1 = driver.findElements(By.xpath("//table[@name='BookTable']//tr//td[1]"));
//		System.out.println(column_1.size());
//		
//		for(int i=0; i<column_1.size();i++) {
//			System.out.println(column_1.get(i).getText());
//		}
//		//table[@name='BookTable']//tr//td[1]
		
		
		
		//Dynamic web elements
		
		WebElement dynamictable = driver.findElement(By.xpath(" //h2[text()= 'Dynamic Web Table']"));
		act.scrollToElement(dynamictable).perform();
		
		List <WebElement> td = driver.findElements(By.xpath("//table[@id=\"taskTable\"]//tbody//tr[td[contains(text(),'Chrome')]]"));
		for (WebElement col:td) {
			System.out.println(col.getText());
		}
	}

}
