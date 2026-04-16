package com.example.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vinothqaacademy.com/multiple-windows/");
		Actions act = new Actions(driver); //constructor. new keyword means a class. so actions is a class. driver is element of web.
		
	
		
		// double click using mouse
		
		WebElement btn = driver.findElement(By.xpath("//button[@id='doubleBtn']"));
		act.doubleClick(btn).perform();
		
		Thread.sleep(1000);
		
		String dbl_stats = driver.findElement(By.xpath("//span[@id='doubleStatus']")).getText();
		System.out.println(dbl_stats);
		
		
		
		// right click using mouse
		
		WebElement right_click = driver.findElement(By.xpath("//button[@id='rightBtn']"));
		act.contextClick(right_click).perform();
		
		// click on edit option
		//driver.findElement(By.xpath())
		
		Thread.sleep(1000);
		
		String right_stats = driver.findElement(By.xpath("//span[@id='rightStatus']")).getText();
		System.out.println(right_stats);
		
		
		
		//drag and drop using mouse
		
		
		
		WebElement drag = driver.findElement(By.id("dragItem"));
		WebElement drop = driver.findElement(By.id("dropZone"));
		act.dragAndDrop(drag, drop).perform();
		
		String drag_drop_status = driver.findElement(By.id("dragStatus")).getText();
		System.out.println(drag_drop_status); 
		
		
		Thread.sleep(1000);
		
		// toolTip using mouse 
		WebElement mousehover = driver.findElement(By.id("tooltipTarget"));
		act.moveToElement(mousehover).perform();
		
		Thread.sleep(1000);
		
		// slider using mouse
		WebElement slider = driver.findElement(By.id("handle_max"));
		
		String startvalue = driver.findElement(By.id("sliderValueText")).getText();
		System.out.println(startvalue);
		
		act.clickAndHold(slider).pause(5). moveByOffset(0, 10).release().perform();      // 0, 50 are pixels to move the slider.
		// means first click then move and then release.  then perform this action
		
		String stopvalue = driver.findElement(By.id("sliderStatus")).getText();
		System.out.println(stopvalue);
		
		
		// pause, 
		
	}

}
