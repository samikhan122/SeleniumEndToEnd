package com.qa.openCart.EleUtils;

import com.qa.openCart.Exceptions.ElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wait {
    WebDriver driver;


    public Wait(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    public WebElement waitTillElementPresent(By loc, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(loc));

    }

    public void setText(By loc, int timeout, String input) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOfElementLocated(loc)).sendKeys(input);
    }

    public void clickOnElement(By loc, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.visibilityOfElementLocated(loc)).click();
        } catch (ElementException e) {
            throw new ElementException("Element is not Found");
        }
    }

    public void waitForElementVisible(By loc, int timeout) {
        try {


            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
        } catch (ElementException e) {
            throw new ElementException("Element is not visible");
        }
    }
}
