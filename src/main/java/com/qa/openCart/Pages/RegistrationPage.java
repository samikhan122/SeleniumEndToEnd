package com.qa.openCart.Pages;

import com.github.javafaker.Faker;
import com.qa.openCart.EleUtils.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class RegistrationPage {

    By dropDownToSignIn = By.xpath("//span[@class='caret']");
    By registerLink = By.xpath("//a[contains(text(),'Register')]");
    By firstName = By.xpath("//input[@name='firstname']");
    By lastName = By.xpath("//input[@name='lastname']");
    By email = By.xpath("//input[@name='email']");
    By telephone = By.xpath("//input[@name='telephone']");
    By password = By.xpath("//input[@name='password']");
    By confirm = By.xpath("//input[@name='confirm']");
    By subscribe = By.xpath("(//input[@name='newsletter'])[1]");
    By agreePolicy = By.xpath("//input[@name='agree']");
    By submit = By.xpath("//input[@type='submit']");


    private final WebDriver driver;
    Wait wt;
    Faker faker;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        wt = new Wait(driver);
        faker = new Faker();


    }

    public void ClickOnIcon() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(dropDownToSignIn).click();
        driver.findElement(registerLink).click();
    }

    public String fillInRegistrationAndGetCurrentPageTitle() {
        String firstN = faker.name().firstName();
        String LirstN = faker.name().lastName();
        String tele = faker.bothify("###-###-####");
        String email1 = faker.name().lastName() + "@gmail.com";
        String pass = "automationTestingisFun";
        wt.waitTillElementPresent(firstName, 5).sendKeys(firstN);
        wt.setText(lastName, 5, LirstN);
        wt.setText(email, 5, email1);
        wt.setText(telephone, 5, tele);
        wt.setText(password, 5, pass);
        wt.setText(confirm, 5, pass);
        wt.clickOnElement(subscribe, 5);
        wt.clickOnElement(agreePolicy, 5);
        wt.clickOnElement(submit, 5);
        return driver.getTitle();


    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public String getPageTitleRegistrationPage() {
        return driver.getTitle();
    }

}

