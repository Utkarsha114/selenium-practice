package com.example.testscript;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class loginLogout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demo.guru99.com/V1/index.php");
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
					
					WebElement username = driver.findElement(By.cssSelector("input[name='uid']"));
					username.sendKeys("mngr658151");
					
					WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
					 password.sendKeys("YbegEpY");
					 
					 WebElement login = driver.findElement(By.cssSelector("input[name='btnLogin']"));
					 login.click();
					 
					 
					 // ElementClickInterceptedException- Another element is blocking the click
					 // Solution- javaScript executer js driver -> interface is used.
					 // here js script is run using selenium
					 // Why to run?  -> when we cannot interact with the element with normal selenium code
					 
					 WebElement logoutbtn = driver.findElement(By.cssSelector("a[href='Logout.php']"));
					// logoutbtn.click();  -> used normally. but here elemnt is overlapping, so we use javascriptExecuter
					 
					 // browser object is created and typecast is used
					 // when we use new ? (H.W.: find answer)
					 
					 // arguments[0] -> fixed keyword. 
					 // if another elemnts (e.g.: 2 elemnts together click, or click logout button twice, then arguments[1])
					 JavascriptExecutor js = (JavascriptExecutor) driver;
					 js.executeScript("arguments[0].click()",logoutbtn);
				}

	}


