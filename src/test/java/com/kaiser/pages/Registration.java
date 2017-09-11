package com.kaiser.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.kaiser.config.Config;
import com.kaiser.module.TestBase_Kaiser;

public class Registration extends TestBase_Kaiser{
	
	
	
	By langSubmit= By.name("continue");
	By careGiver= By.id("viewns_Z7_R8OOBB1A005010I6L4K9VD3084_:userIntentDataForm:memberIntentId:1");
	By regSubmit= By.id("viewns_Z7_R8OOBB1A005010I6L4K9VD3084_:userIntentDataForm:submit");
	By regionSelect= By.id("viewns_Z7_R8OOBB1A005010I6L4K9VD3084_:chooseRegionDataForm:region:0");
	By regionSubmit= By.id("viewns_Z7_R8OOBB1A005010I6L4K9VD3084_:chooseRegionDataForm:submit");
	By availableSubmit= By.id("viewns_Z7_R8OOBB1A005010I6L4K9VD3084_:recordsAvailableForm:submit");
	By firstName_R= By.id("viewns_Z7_R8OOBB1A005010I6L4K9VD3084_:nmaUserDataForm:firstname");
	By lastName_R= By.id("viewns_Z7_R8OOBB1A005010I6L4K9VD3084_:nmaUserDataForm:lastname");
	By month_R= By.id("viewns_Z7_R8OOBB1A005010I6L4K9VD3084_:nmaUserDataForm:monthOfBirth");
	By day_R= By.id("viewns_Z7_R8OOBB1A005010I6L4K9VD3084_:nmaUserDataForm:dayOfBirth");
	By year_R= By.id("viewns_Z7_R8OOBB1A005010I6L4K9VD3084_:nmaUserDataForm:yearOfBirth");
	By addressLine1_R= By.id("viewns_Z7_R8OOBB1A005010I6L4K9VD3084_:nmaUserDataForm:addressline1");
	By city_R= By.id("viewns_Z7_R8OOBB1A005010I6L4K9VD3084_:nmaUserDataForm:address_city");
	By state_R=By.id("viewns_Z7_R8OOBB1A005010I6L4K9VD3084_:nmaUserDataForm:address_state");
	By zip_R=By.id("viewns_Z7_R8OOBB1A005010I6L4K9VD3084_:nmaUserDataForm:address_zip");
	By dayPhone1_R= By.id("viewns_Z7_R8OOBB1A005010I6L4K9VD3084_:nmaUserDataForm:mainphone_area");
	By dayPhone2_R= By.id("viewns_Z7_R8OOBB1A005010I6L4K9VD3084_:nmaUserDataForm:mainphone_prefix");
	By dayPhone3_R=By.id("viewns_Z7_R8OOBB1A005010I6L4K9VD3084_:nmaUserDataForm:mainphone_number");
	By email_R= By.id("viewns_Z7_R8OOBB1A005010I6L4K9VD3084_:nmaUserDataForm:emailaddress");
	By confirmEmail_R= By.id("viewns_Z7_R8OOBB1A005010I6L4K9VD3084_:nmaUserDataForm:retypeEmailaddress");
	By infoSubmit= By.id("viewns_Z7_R8OOBB1A005010I6L4K9VD3084_:nmaUserDataForm:submit");
	By tcAgree= By.id("viewns_Z7_R8OOBB1A005010I6L4K9VD3084_:tcForm:tcAgree");
	By tcAgreeSubmit= By.id("viewns_Z7_R8OOBB1A005010I6L4K9VD3084_:tcForm:tcSubmit");
	By userID_R= By.id("viewns_Z7_R8OOBB1A005010I6L4K9VD3084_:userDataForm:userid");
	By userIDSubmit=By.id("viewns_Z7_R8OOBB1A005010I6L4K9VD3084_:userDataForm:submit");
	By password_R= By.id("viewns_Z7_R8OOBB1A005010I6L4K9VD3084_:userDataForm:passwordval");
	By confirmPassword_R=By.id("viewns_Z7_R8OOBB1A005010I6L4K9VD3084_:userDataForm:retypepassword");
	By passwordSubmit=By.id("viewns_Z7_R8OOBB1A005010I6L4K9VD3084_:userDataForm:savePassword");
	
	
	public Registration(WebDriver driver){
		this.driver=driver;	
	}
	
	public void languageSelection(){
		clickElement(langSubmit, driver);
	}
	
	public void careGiverSelection(){
		clickElement(careGiver, driver);
	}
	
	public void regSubmit(){
		clickElement(regSubmit, driver);
	}
	
	public void regionSelection(){
		clickElement(regionSelect, driver);
	}
	
	public void regionSubmit(){
		clickElement(regionSubmit, driver);
	}

	public void careGiverAvailableSubmit(){
		clickElement(availableSubmit, driver);
	}
	
	public void enterPersonalInfo(String firstName, String lastName, String month, String day, String year){
		sendAndClearKeys(firstName_R, driver, firstName);
		sendAndClearKeys(lastName_R, driver, lastName);
		new Select(getWebElement(driver, month_R)).selectByValue(month);
		sendAndClearKeys(day_R, driver, day);
		sendAndClearKeys(year_R, driver, year);
	}
	
	public void enterAddressInfo(String addressLine1, String city, String state, String zip, String dayPhone1, String dayPhone2, String dayPhone3, String email, String confirmEmail){
		sendAndClearKeys(addressLine1_R, driver, addressLine1);
		sendAndClearKeys(city_R, driver,city);
		new Select(getWebElement(driver, state_R)).selectByVisibleText(state);
		sendAndClearKeys(zip_R, driver,zip);
		sendAndClearKeys(dayPhone1_R, driver, dayPhone1);
		sendAndClearKeys(dayPhone2_R, driver, dayPhone2);
		sendAndClearKeys(dayPhone3_R, driver, dayPhone3);
		sendAndClearKeys(email_R, driver, email);
		sendAndClearKeys(confirmEmail_R, driver, confirmEmail);
		clickElement(infoSubmit, driver);
		
		
	}
	
	public void tcAgreement(){
		clickElement(tcAgree, driver);
		clickElement(tcAgreeSubmit, driver);
	}
	
	public void userID(String userID){
		sendAndClearKeys(userID_R, driver, userID);
		clickElement(userIDSubmit, driver);
	}
	
	public void password(String password, String confirmPassword){
		sendAndClearKeys(password_R, driver, password);
		sendAndClearKeys(confirmPassword_R, driver, confirmPassword);
		clickElement(passwordSubmit, driver);
	}
	
	
	
}
