package com.qa.opencart.pages;


import com.qa.opencart.utils.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class LoginPage {
    //no testNg Class
    //1. private By locator
    // 2. page class constructor
    //3. public page action method
    //4. never right assert in this class
    //classic example of encapsulation

    private WebDriver driver;
    private ElementUtil elementUtil;
    private By emailId = By.id("input-email");
    private By password = By.id("input-password");
    private By login = By.xpath("//input[@value='Login']");
    private By forgottenPassword = By.linkText("Forgotten Password");
    private By registerLink = By.linkText("Register");
    Properties prop;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        elementUtil = new ElementUtil(driver);
    }

    public String getLoginPageTitle() {
        String title = driver.getTitle();
        return elementUtil.waitForTitleContains(title, 5);
    }

    public boolean forgotPasswordLinkExist() {
        return driver.findElement(forgottenPassword).isDisplayed();
    }

    public AccountsPage doLogin(Object userName, Object password01) {
        System.out.println("User Cred :  " + userName + " " + password01);
        elementUtil.sendKeys(emailId, (String) userName);
        elementUtil.sendKeys(password, (String) password01);
        elementUtil.doCLick(login);
        return new AccountsPage(driver);
    }

    public String getLoginPageURl() {
        String url2 = elementUtil.waitForUrlContains("https://naveenautomationlabs.com/opencart/index.php?route=account/login", 5);
        System.out.println("Current URL is  " + url2);
        return url2;
    }
    public RegistrationPage navigateToRegistrationPage() {
        elementUtil.waitForElementVisible(registerLink, 10).click();
        return new RegistrationPage(driver);
    }



}
