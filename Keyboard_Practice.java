package com.example.testscript;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 WebElement name = driver.findElement(By.xpath("//input[@id=\"name\"]"));
			name.sendKeys("ABC");
			Thread.sleep(2000);
			
			Actions act =new Actions(driver);
			//copy
			act.click(name).keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
			 Thread.sleep(2000);
			 //paste
			 WebElement mail = driver.findElement(By.xpath("//input[@id=\"email\"]"));
			 act.click(mail).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
			 Thread.sleep(2000);
			 
			 
			 //cut
			 act.click(mail).keyDown(Keys.CONTROL).sendKeys("a").sendKeys("x").keyUp(Keys.CONTROL).build().perform();
			 Thread.sleep(2000);
			 //paste
			 WebElement phone = driver.findElement(By.xpath("//input[@id=\"phone\"]"));
			 act.click(phone).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}

}