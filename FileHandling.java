package com.example.testscript;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement heading = driver.findElement(By.xpath("//h2[text()='Upload Files']"));
		
		Actions act =new Actions(driver);
		act.scrollToElement(heading).perform();
		
		WebElement choosefile = driver.findElement(By.id("singleFileInput"));
		
		choosefile.sendKeys("C:\\Users\\Nabla Infotech");
		
		
		// Take screenshot 
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File f1 = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\Nabla Infotech\\Pictures\\Screenshots\\selenium_ss.jpg");
		
		FileHandler.copy(f1, dest);
		
		System.out.println("Screenshot captured");
		
		
	}

}
