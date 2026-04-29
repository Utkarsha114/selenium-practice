package com.example.testscript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class multipleLogin2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String data[][] = {
                {"user1","pass1"},             
                {"mngr658151","YbegEpY"},      // valid user
                {"user3","pass3"},             
                {"mngr658151","YbegEpY"},      // valid user
                {"user5","pass5"}             
        };

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/V1/index.php");

        for(int i = 0; i < data.length; i++) {

        
            WebElement username = driver.findElement(By.name("uid"));
            WebElement password = driver.findElement(By.name("password"));

            // clear fields before sending new data
            username.clear();
            password.clear();

            username.sendKeys(data[i][0]);
            password.sendKeys(data[i][1]);

            driver.findElement(By.name("btnLogin")).click();

            Thread.sleep(2000);

            // handle login alert (invalid login)
            try {
                Alert al = driver.switchTo().alert();
                System.out.println("Login Alert: " + al.getText());
                al.accept();
                continue;
            } catch (NoAlertPresentException e) {
                // login success
            }

            String expectedTitle = "GTPL Bank Manager HomePage";
            String actualTitle = driver.getTitle();

            if(expectedTitle.equals(actualTitle)) {

                System.out.println("Login Success for user: " + data[i][0]);

                Actions act = new Actions(driver);
                WebElement logoutbtn = driver.findElement(By.linkText("Log out"));

                act.scrollToElement(logoutbtn).perform();

                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].click()", logoutbtn);

                // handle logout alert
                try {
                    Alert al2 = driver.switchTo().alert();
                    System.out.println("Logout Alert: " + al2.getText());
                    al2.accept();
                } catch (NoAlertPresentException e) {
                    System.out.println("No logout alert");
                }

                Thread.sleep(2000);
            }
        }

        driver.quit();
	}

}
