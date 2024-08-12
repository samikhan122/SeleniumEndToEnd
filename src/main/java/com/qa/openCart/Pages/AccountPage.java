package com.qa.openCart.Pages;

import com.qa.openCart.Base.baseTest;
import com.qa.openCart.Constants.AppConstants;
import com.qa.openCart.EleUtils.ElementUtils;
import com.qa.openCart.EleUtils.Wait;
import com.qa.openCart.EleUtils.WaitForTitleUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class AccountPage {
    private WebDriver driver;
    private ElementUtils eleUtil;

    // 1. Private By Locators

    private By logoutLink = By.linkText("Logout");
    private By myAccountLink = By.linkText("My Account");
    private By headers = By.cssSelector("div#content h2");
    private By search = By.name("search");
    private By searchIcon = By.cssSelector("div#search button");

    // 2. Public Page Class Const...
    public AccountPage(WebDriver driver) {
        this.driver = driver;
        eleUtil = new ElementUtils(driver);
    }

    public String getAccPageTitle() {
        String title = eleUtil.waitForTitleContains(AppConstants.ACCOUNTS_PAGE_TITLE, 5);
        System.out.println("Acc page title : " + title);
        return title;
    }

    public String getAccPageURL() {
        String url = eleUtil.waitForURLContains(AppConstants.ACC_PAGE_URL_FRACTION, 5);
        System.out.println("acc page url : " + url);
        return url;
    }

    public boolean isLogoutLinkExist() {
        return eleUtil.waitForElementVisible(logoutLink, 10).isDisplayed();
    }

    public boolean myAccountLinkExist() {
        return eleUtil.waitForElementVisible(myAccountLink, 10).isDisplayed();
    }


    public SearchResultsPage doSearch(String SearchKey) {
        System.out.println("searching for : " + SearchKey);
        eleUtil.doSendKeys(search, SearchKey);
        eleUtil.doClick(searchIcon);
        return new SearchResultsPage(driver);
    }

    public WebElement waitForElementVisible(By locator, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element;
    }


}