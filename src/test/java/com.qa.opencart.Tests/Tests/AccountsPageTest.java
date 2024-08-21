package com.qa.opencart.Tests.Tests;

import com.qa.openCart.Base.baseTest;
import com.qa.openCart.EleUtils.ElementUtils;
import com.qa.openCart.EleUtils.Wait;
import com.qa.openCart.EleUtils.WaitForTitleUrl;
import com.qa.openCart.Pages.AccountPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountsPageTest extends baseTest {


	@BeforeClass
	public void accSetup() {
		accPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test
	public void accPageTitleTest() {
		String actTitle = accPage.getAccPageTitle();
		Assert.assertEquals(actTitle, AppConstants.ACCOUNTS_PAGE_TITLE);
	}

	@Test
	public void accPageURLTest() {
		String actURL = accPage.getAccPageURL();
		Assert.assertTrue(actURL.contains(AppConstants.ACC_PAGE_URL_FRACTION));
	}

	@Test
	public void isLogoutLinkExistTest() {
		Assert.assertTrue(accPage.isLogoutLinkExist());
	}

	@Test
	public void isMyAccountLinkExistTest() {
		Assert.assertTrue(accPage.myAccountLinkExist());
	}

	@Test
	public void accPageHeadersTest() {
		List<String> actHeadersList = accPage.getAccountsPageHeadersList();
		System.out.println(actHeadersList);
	}

	@Test
	public void searchTest() {
		accPage.doSearch("macbook");
	}

}
}
