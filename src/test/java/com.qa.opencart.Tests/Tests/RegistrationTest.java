package com.qa.opencart.Tests.Tests;

import com.qa.openCart.Base.baseTest;
import com.qa.openCart.Pages.RegistrationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationTest extends baseTest {


    @Test
    public void fillInRegistration() throws InterruptedException {
        rg.ClickOnIcon();
        String urlAfter = rg.fillInRegistrationAndGetCurrentPageTitle();
        String url = rg.getCurrentUrl();
        System.out.println(urlAfter);
        System.out.println(url);
        Assert.assertEquals(urlAfter, "Your Account Has Been Created!");
        Assert.assertTrue(url.contains("?route=account/success"));
    }


}
