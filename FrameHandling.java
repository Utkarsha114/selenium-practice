package com.example.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");

		Thread.sleep(2000);
		WebElement frame =driver.findElement(By.xpath("//li[@id=\"iFrame\"]"));
		frame.click();
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.scrollByAmount(0,500).perform();
		
		WebElement Switch_To_frame = driver.findElement(By.xpath(" "));
		WebElement SOT = driver.findElement(By.xpath("//img[@alt='Selenium Online Training']"));
		act.moveToElement(SOT).click().build().perform();
		SOT.click();
		
		
	}

}
