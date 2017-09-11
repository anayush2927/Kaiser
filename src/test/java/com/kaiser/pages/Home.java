package com.kaiser.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.kaiser.module.TestBase_Kaiser;

public class Home extends TestBase_Kaiser{
	
	By register=By.xpath("//a[text()='Register ']");
	
	public Home(WebDriver driver){
		this.driver=driver;
	}
	
	public void clickRegister(){
		//driver.manage().timeouts().pageLoadTimeout(Config.PAGE_LOAD_WAIT, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Config.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		clickElement(register, driver);
	}
}
