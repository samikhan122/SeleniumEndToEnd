package com.qa.opencart.tests;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.qa.opencart.Constant.AppConstant;
import com.qa.opencart.base.BaseTest;
import com.qa.opencart.errors.AppError;
import com.qa.opencart.pages.LoginPage;
import org.apache.commons.compress.utils.OsgiUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Properties;

public class LoginPageTest extends BaseTest {


    @Test
    public void loginPageTitleTest() {
        String title = lg.getLoginPageTitle();
        System.out.println("Title is " + title);
        Assert.assertEquals(title, AppConstant.LOGIN_PAGE_TITLE, AppError.TITLE_NOT_FOUND);

    }

   @Test
    public void loginPageURlTest() {
        String getPageURl = lg.getLoginPageURl();
        System.out.println(getPageURl);
        Assert.assertTrue(getPageURl.contains(AppConstant.LOGIN_PAGE_URL_FRACTION), AppError.URL_NOT_FOUND);
    }

    @Test
    public void forgotPWDlinkExsist() {
        Assert.assertTrue(lg.forgotPasswordLinkExist());
    }

   @Test
    public void loginTest() {
        String title = lg.getLoginPageTitle();
        accPage = lg.doLogin(prop.get("username"),prop.get("password"));
        System.out.println(title);
        Assert.assertEquals(title, AppConstant.LOGIN_PAGE_TITLE);
    }


}
