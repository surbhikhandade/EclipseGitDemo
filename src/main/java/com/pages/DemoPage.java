package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoPage {
	
	public DemoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public	WebDriver driver = null;
	
	@FindBy(xpath = "//img[@src='pages/images/jbk.png']")
	public WebElement Logo;
	
	
	public boolean verifyLoginPage_title() {

		String title = driver.getTitle();
		System.out.println("Page Title is : " + title);
		String expectedtitle = "JavaByKiran | Log in";

		if (title.equals(expectedtitle)) {
			System.out.println("LoginPage Title is matched");
			return true;
		} else {
			System.out.println("LoginPage Title is Not Matched");
			return false;

		}
	}

}
