package com.qa.opencart.Tests.Tests;

import com.qa.openCart.Base.baseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends baseTest {

    @Test(priority = 1)
    public void LoginWithCred() {
        loginPage.doLogin("testing02@gmail.com", "alikhan0786");

    }

    @Test(priority = 2)
    public void forgotPasswordLink() {
        Assert.assertTrue(loginPage.isForgotPasswordLinkExist());
        System.out.println("Forgotten Link is present");
    }

    @Test(priority = 3)
    public void loginUrlTest() {
        String actUrl = loginPage.currentUrl();
        Assert.assertTrue(actUrl.contains("route=account/login"));
    }

    @Test(priority = 4)
    public void loginPageTitleTest() {
        String title = loginPage.getLoginPageTitle();
        Assert.assertEquals(title, "Account Login");
    }




}
