package com.qa.opencart.pages;

import com.qa.opencart.Constant.AppConstant;
import com.qa.opencart.utils.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    private WebDriver driver;
    private final ElementUtil elementUtils;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        elementUtils = new ElementUtil(driver);


    }

    private By firstName = By.name("firstname");
    private By lastName = By.name("lastname");
    private By email = By.name("email");
    private By telephone = By.name("telephone");
    private By password = By.name("password");
    private By confirmPassword = By.name("confirm");
    private By agree = By.name("agree");
    private By continueLink = By.xpath("//input[@type='submit']");
    private By subScribeYes = By.xpath("(//label[@class='radio-inline'])[1]");
    private By subScribeNo = By.xpath("(//label[@class='radio-inline'])[2]");
    private By successMsg = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    private By registerLink = By.xpath("(//a[contains(text(),'Register')])[2]");
    private By continueAfterRegister = By.xpath("//a[contains(text(),'Continue')]");
    private By logOutAfterRegister = By.xpath("//div[@class='list-group']//a[contains(text(),'Logout')]");


    public boolean userRegister(String firstName, String lastName, String email, String telephone, String password, String subscribe) {
        elementUtils.waitForElementVisible(this.firstName, 10).sendKeys(firstName);
        elementUtils.sendKeys(this.lastName, lastName);
        elementUtils.sendKeys(this.email, email);
        elementUtils.sendKeys(this.telephone, telephone);
        elementUtils.sendKeys(this.password, password);
        elementUtils.sendKeys(this.confirmPassword, password);


        if (subscribe.equalsIgnoreCase("yes")) {
            elementUtils.doCLick(subScribeYes);
        } else {
            elementUtils.doCLick(subScribeNo);

        }
        elementUtils.doCLick(agree);
        elementUtils.doCLick(continueLink);
        String registrationSuccessMsg = elementUtils.waitForElementVisible(successMsg, 5).getText();

        System.out.println(registrationSuccessMsg);
        if (registrationSuccessMsg.equals(AppConstant.USER_REG_SUCCESS_MESSAGE)) {
            elementUtils.doCLick(logOutAfterRegister);
            elementUtils.doCLick(registerLink);
            return true;
        } else {
            return false;
        }


    }


}



