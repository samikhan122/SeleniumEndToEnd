package com.qa.openCart.Pages;

import com.qa.openCart.EleUtils.ElementUtils;
import com.qa.openCart.EleUtils.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    Wait wt;
    ElementUtils etl;

    private By email = By.xpath("//input[@name='email']");
    private By password = By.xpath("//input[@name='password']");
    private By login = By.xpath("//input[@value='Login']");
    private By frgtPwd = By.xpath("//div[@class='form-group']//a[contains(text(),'Forgotten Password')]");

    private By dropDownToSignIn = By.xpath("//span[@class='caret']");
    private By loginIcon = By.xpath("//a[contains(text(),'Login')]");
    private By carrot = By.xpath("//a[contains(@title,'My Account')]");
    private By frgtPassword = By.xpath("//div[@class='list-group']//a[contains(text(),'Forgotten Password')]");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wt = new Wait(driver);
        etl = new ElementUtils(driver);
    }


    public String doLogin(String username, String password1) {
        wt.clickOnElement(carrot, 5);
        wt.clickOnElement(loginIcon, 5);
        wt.clickOnElement(dropDownToSignIn, 5);
        System.out.println("UserName is " + username + "Password is " + password1);
        wt.setText(email, 5, username);
        wt.setText(password, 5, password1);
        return driver.getTitle();
    }

    public boolean isForgotPasswordLinkExist() {
        return wt.waitTillElementPresent(frgtPwd, 5).isDisplayed();


    }

    public String getLoginPageTitle() {
        String title = etl.waitForTitleIs("Account Login", 5);
        System.out.println("Login title is " + title);
        return title;
    }

//    public String getLoginPageUrl() {
//        etl.waitForCurrentUrl("route=account/account", 5);
//        System.out.println("Current url is " + url);
//        return url;
//    }
    public String currentUrl() {
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;

    }


}
