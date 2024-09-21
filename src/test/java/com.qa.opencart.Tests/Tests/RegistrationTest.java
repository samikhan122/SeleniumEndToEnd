package com.qa.opencart.Tests.Tests;

import com.qa.openCart.Base.baseTest;
import com.qa.openCart.Pages.RegistrationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationTest extends baseTest {


    @BeforeClass
	public void regSetup() {
		registerPage = loginPage.navigateToRegisterPage();

	}
	
	
	public String getRandomEmail() {
		return "uiautomation"+System.currentTimeMillis()+"@open.com";
	}
	
	
	@DataProvider
	public Object[][] getRegData() {
		return ExcelUtil.getTestData(AppConstants.REG_SHEET_NAME);
	}
	
	
	
	@Test(dataProvider = "getRegData")
	public void userRegisterTest(String firstname, String lastname, String telephone, String password, String subscribe) {
		Assert.assertTrue(registerPage.userRegisteration(firstname, lastname, getRandomEmail(), telephone, password, subscribe));

	}



}
