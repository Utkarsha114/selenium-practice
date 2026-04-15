package com.example.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		// or refer https://vinothqaacademy.com/demo-site/
		
		Thread.sleep(3000);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstname.sendKeys("Utkarsha");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastname.sendKeys("C");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		address.sendKeys("Pune");
		
		WebElement email = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		email.sendKeys("utkarsha334@gmail.com");
		
		WebElement phone = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		phone.sendKeys("807978345");
		
		WebElement gender = driver.findElement(By.xpath("//input[@value='FeMale']"));
		gender.click();
		
		
		WebElement hobbies = driver. findElement(By.id("checkbox2"));
		hobbies.click();
		
		
		// language
		WebElement languages = driver.findElement(By.id("msdd"));
		languages.click();
		 
		// to display languages in console using findElements
		List<WebElement> li = driver.findElements(By.xpath("//li[@class='ng-scope']"));
		for(int i=0; i<li.size();i++) {
			System.out.println(li.get(i).getText());
		}
		
		// use equals method to access the element of a language
		// to click a particular element
		WebElement option = driver.findElement(By.xpath("//a[text()='Catalan']"));
		option.click();
		
		
		// skills
		WebElement skills = driver.findElement(By.id("Skills"));
		Select s1 = new Select(skills);
		List<WebElement> list1 = s1.getOptions();
		for(WebElement option1 : list1) 
		{
			// System.out.println(option1.getText()); 
			s1.selectByValue("Adobe Photoshop");      
		}
	
		WebElement country = driver.findElement(By.xpath("//span[@role=\"combobox\"]"));
		country.click();
		
		WebElement countrysearchbox = driver.findElement(By.xpath("//input[@type=\"search\"]"));
		countrysearchbox.sendKeys("Australia");
		
		WebElement countryname = driver.findElement(By.xpath("//span[@title=\"Australia\"]"));
		countryname.click();
		
		
		WebElement option1 = driver.findElement(By.id("yearbox"));
		option.click();
		
		WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']/option"));
		Select s2 = new Select(year);
		List<WebElement> list2 = s2.getOptions();
		for(WebElement option2 : list2) 
		{
			// System.out.println(option1.getText()); 
			s1.selectByValue("1998");      
		}
		
		
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']/option"));
		Select s3 = new Select(year);
		List<WebElement> list3 = s3.getOptions();
		for(WebElement option3 : list3) 
		{
			// System.out.println(option1.getText()); 
			s1.selectByValue("May");      
		}
		
		
		WebElement day = driver.findElement(By.xpath("//select[@id='daybox']/option"));
		Select s4 = new Select(year);
		List<WebElement> list4 = s4.getOptions();
		for(WebElement option4 : list4) 
		{
			// System.out.println(option1.getText()); 
			s1.selectByValue("12");      
		}
		
		
		
		
		

		
		
//		WebElement languages = driver. findElement(By.xpath("//li[@class='ng-scope']"));
//		
//		languages.click();
//		
//		Select s2 = new Select(languages);
//		List<WebElement> list2 = s2.getOptions();
//		for(WebElement option2 : list2) 
//		{
//			//System.out.println(option2.getText()); // gives all options in console.
//		
//			s2.selectByValue("Arabic");     //gives a specific text from website to console
//		}
//		
//		
//		WebElement skills = driver. findElement(By.xpath("//select[@id=\"Skills\"]"));
//		skills.click();
//		
//		Select s3 = new Select(skills);
//		List<WebElement> list3 = s3.getOptions();
//		for(WebElement option3 : list3) 
//		{
//			//System.out.println(option2.getText()); // gives all options in console.
//		
//			//s3.selectByValue("Adobe InDesign");    //gives a specific text from website to console
//			s3.selectByIndex(5);     
//		}
//		
//		
		
	}

}




