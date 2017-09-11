package com.kaiser.module.test;

import org.testng.annotations.Test;

import com.kaiser.config.Config;
import com.kaiser.module.TestBase_Kaiser;

public class KaiserTest extends TestBase_Kaiser {
	private String firstName=Config.FIRST_NAME;
	private String lastName=Config.LAST_NAME;
	private String month=Config.MONTH;
	private String day=Config.DAY;
	private String year=Config.YEAR;
	private String addressLine1=Config.ADDRESS_LINE_1;
	private String city=Config.CITY;
	private String state=Config.STATE;
	private String zip=Config.ZIP;
	private String dayPhone1=Config.DAY_PHONE_1;
	private String dayPhone2=Config.DAY_PHONE_2;
	private String dayPhone3=Config.DAY_PHONE_3;
	private String email=Config.EMAIL;
	private String confirmEmail=Config.CONFIRM_EMAIL;
	private String userID=Config.USER_ID;
	private String password=Config.PASSWORD;
	private String confirmPassword=Config.CONFIRM_PASSWORD;
	
	
	@Test
	public void testKaiser(){
		home.clickRegister();
		registration.languageSelection();
		registration.careGiverSelection();
		registration.regSubmit();
		registration.regionSelection();
		registration.regionSubmit();
		registration.careGiverAvailableSubmit();
		registration.enterPersonalInfo(firstName,lastName,month, day,year);
		registration.enterAddressInfo(addressLine1, city, state, zip, dayPhone1, dayPhone2, dayPhone3, email, confirmEmail);
		registration.tcAgreement();
		registration.userID(userID);
		registration.password(password, confirmPassword);
		
		
		
	}
}
