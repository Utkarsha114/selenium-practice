package com.example.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//connect to chrome browser
		//WebDriver driver = new ChromeDriver();
		
		//connect to firefox browser
		WebDriver driver = new FirefoxDriver();
		
		//connect to Edge browser
		//WebDriver driver = new EdgeDriver();
		
		
		//methods to manage the browser
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.manage().window().fullscreen();
		
		//open url
		driver.get("https://pc.scasf.com/");
		
		//practice navigation commands here (lect 2)
		

		
	}

}
