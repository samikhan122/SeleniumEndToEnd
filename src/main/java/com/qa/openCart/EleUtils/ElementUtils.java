package com.qa.openCart.EleUtils;

import com.qa.openCart.Exceptions.ElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class ElementUtils {


    private WebDriver driver;
    private JavaScriptUtil jsUtil;

    private final String DEFAULT_ELEMENT_TIME_OUT_MESSAGE = "Time out... Element is not found...";
    private final String DEFAULT_ALERT_TIME_OUT_MESSAGE = "Time out... Alert is not found...";

    public ElementUtils(WebDriver driver) {
        this.driver = driver;
        jsUtil = new JavaScriptUtil(driver);
    }

    private void nullBlankCheck(String value) {
        if (value == null || value.length() == 0) {
            throw new ElementException(value + " --- value text can not be null or blank");
        }
    }

    public By getBy(String locatorType, String locatorValue) {
        By locator = null;

        switch (locatorType.toLowerCase().trim()) {
            case "id":
                locator = By.id(locatorValue);
                break;
            case "name":
                locator = By.name(locatorValue);
                break;
            case "classname":
                locator = By.className(locatorValue);
                break;
            case "xpath":
                locator = By.xpath(locatorValue);
                break;
            case "css":
                locator = By.cssSelector(locatorValue);
                break;
            case "linktext":
                locator = By.linkText(locatorValue);
                break;
            case "partiallinktext":
                locator = By.partialLinkText(locatorValue);
                break;
            case "tagname":
                locator = By.tagName(locatorValue);
                break;

            default:
                break;
        }

        return locator;

    }

    public WebElement getElement(String locatorType, String locatorValue) {
        WebElement element = driver.findElement(getBy(locatorType, locatorValue));
        return element;

    }

    public WebElement getElement(By locator) {
        WebElement element = null;

        try {
            element = driver.findElement(locator);
        } catch (NoSuchElementException e) {
            System.out.println("Element is not present on the page");
            e.printStackTrace();
        }

        return element;
    }

    public void doSendKeys(By locator, String value) {
        nullBlankCheck(value);
        getElement(locator).clear();
        getElement(locator).sendKeys(value);
    }

    public void doSendKeys(By locator, String value, int timeOut) {
        nullBlankCheck(value);
        waitForElementVisible(locator, timeOut).sendKeys(value);
    }

    public WebElement waitForElementVisible(By locator, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    public void doClick(By locator) {
        getElement(locator).click();
    }


    public String waitForTitleContains(String titleFraction, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

        try {
            if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
                return driver.getTitle();
            }
        } catch (Exception e) {
            System.out.println("title is not found within : " + timeOut);
        }
        return null;


    }

    public String waitForTitleIs(String title, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

        try {
            if (wait.until(ExpectedConditions.titleIs(title))) {
                return driver.getTitle();
            }
        } catch (Exception e) {
            System.out.println("title is not found within : " + timeOut);
        }
        return driver.getTitle();


    }

    public String waitForURLContains(String urlFraction, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

        try {
            if (wait.until(ExpectedConditions.urlContains(urlFraction))) {
                return driver.getCurrentUrl();
            }
        } catch (Exception e) {
            System.out.println("url fraction is not found within : " + timeOut);
        }
        return driver.getCurrentUrl();

    }

    public void waitForCurrentUrl(String title, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.urlContains(title));
        System.out.println(title);
    }

}
