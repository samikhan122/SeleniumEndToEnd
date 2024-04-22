package com.qa.opencart.tests;

import com.qa.opencart.Constant.AppConstant;
import com.qa.opencart.base.BaseTest;
import com.qa.opencart.utils.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class AccountPageTest extends BaseTest {

    @BeforeClass
    public void accountSetup() {
        accPage = lg.doLogin(prop.getProperty("username"), prop.getProperty("password"));
    }

    @Test
    public void accPageTitleTest() {
        String actTitle = accPage.accountPageTitleTest();
        Assert.assertEquals(actTitle, AppConstant.ACCOUNTS_PAGE_TITLE);
    }

    @Test
    public void accPageURlTest() {
        String urlTest = accPage.accountPageURlTest();
        Assert.assertTrue(urlTest.contains(AppConstant.ACC_PAGE_URL_FRACTION));
    }

    @Test
    public void isLogoutLinkExistTest() {
        accPage.isLogoutLinkExist();

    }

    @Test
    public void accPageHeaderTest() {
        List<String> acutalHeaderList = accPage.accountPageHeaderList();
        System.out.println(acutalHeaderList);

    }

    @Test
    public void searchTest() {
        accPage.doSearch(AppConstant.SEARCH_KEY);

    }

}