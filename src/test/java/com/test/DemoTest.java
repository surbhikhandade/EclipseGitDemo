package com.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.pages.DemoPage;


public class DemoTest {
	
	public WebDriver driver = null;
		
	
		 	@Test
			public void verifyLogin() {
				System.setProperty("webdriver.chrome.driver","D/chromedriver.exe");
				System.out.println("Open Chrome Driver");
				driver = new ChromeDriver();
				driver.get("file:///D:/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
				 driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
				 driver.findElement(By.id("password")).sendKeys("123456");
				 driver.findElement(By.xpath("//button")).click();
				 if(driver.getTitle().contains("Dashboard"))
					 driver.findElement(By.linkText("LOGOUT")).click();
				  Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
			}
		  
		 
		  
	}


