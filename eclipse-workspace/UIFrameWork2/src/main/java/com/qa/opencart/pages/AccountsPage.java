package com.qa.opencart.pages;

import com.qa.opencart.utils.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AccountsPage {
    private WebDriver driver;
    private ElementUtil elementUtil;


    public AccountsPage(WebDriver driver) {
        this.driver = driver;
        elementUtil = new ElementUtil(driver);


    }

    private By myAccountPage = By.linkText("My Account");
    private By Logout = By.linkText("Logout");
    private By header = By.cssSelector("div#content h2");
    private By search = By.name("search");
    private By searchLogo = By.xpath("//span[@class='input-group-btn']//button[@type='button']");


    public String accountPageTitleTest() {
        String title = elementUtil.waitForTitleIs("My Account", 5);
        System.out.println("Acc Page title is " + title);
        return title;

    }

    public String accountPageURlTest() {
        String url = elementUtil.waitForUrlContains("route=account/account", 5);
        System.out.println("Account page URL " + url);
        return url;
    }

    public boolean isLogoutLinkExist() {
        return elementUtil.waitForElementVisible(Logout, 10).isDisplayed();
    }

    public boolean myAccountLinkExist() {
        return elementUtil.waitForElementVisible(myAccountPage, 5).isDisplayed();
    }


    public List<String> accountPageHeaderList() {
        List<WebElement> headers = elementUtil.getElements(header);
        List<String> headerList = new ArrayList<>();
        for (WebElement e : headers) {
            String headList = e.getText();
            headerList.add(headList);

        }
        return headerList;
    }

    public SearchResultsPage doSearch(String searchKey) {
            elementUtil.waitForElementsVisible(search,2);
            System.out.println("Searching for : " + searchKey);
            elementUtil.sendKeys(search, searchKey);
            elementUtil.doCLick(searchLogo);
            return new SearchResultsPage(driver);

    }


}