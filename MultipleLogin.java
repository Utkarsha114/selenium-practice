package com.example.testscript;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// script for multi-user login
		String data[][] = {
				{"user1","Pass1"},
				{"user2","Pass2"},
				{"mngr658151","YbegEpY"}
		};
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V1/index.php");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		for(int i=0; i<3; i++) // when i=1
		{
			String uname = data[i][0];
			String pwd = data[i][1];
			
			WebElement username = driver.findElement(By.cssSelector("input[name='uid']"));
			username.sendKeys(uname);
			
			WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
			 password.sendKeys(pwd);
			 
			 WebElement login = driver.findElement(By.cssSelector("input[name='btnLogin']"));
			 login.click();
			 
			 //i increment to 1 after 1st iteration
			 
			 
			 try {
				 Alert al =driver.switchTo().alert();
				 
				 System.out.println(al.getText());
				 al.accept();
			 } catch (Exception e) 
			 {
				 System.out.println(e);
			 }
			 
			 String expectedTitle = "GTPL Bank Manager HomePage";
			 
			 String actualTitle = driver.getTitle();
			 if(expectedTitle.equals(actualTitle)) {
				 System.out.println("Login Success");
			 }
			 
			 else {
				 System.out.println("Login Fail");
			 }
			 
			 WebElement logout = driver.findElement(By.cssSelector("a[href='Logout.php']"));
			 logout.click();
		}
	}

}
