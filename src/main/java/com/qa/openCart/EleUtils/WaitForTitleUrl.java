package com.qa.openCart.EleUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitForTitleUrl {
    static WebDriver driver;

    public WaitForTitleUrl(WebDriver driver) {
        WaitForTitleUrl.driver = driver;
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
        return null;

    }

    public  String waitForURLIs(String url, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

        try {
            if (wait.until(ExpectedConditions.urlToBe(url))) {
                return driver.getCurrentUrl();
            }
        } catch (Exception e) {
            System.out.println("url is not found within : " + timeOut);
        }
        return null;

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

    public static String waitForTitleIs(String title, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

        try {
            if (wait.until(ExpectedConditions.titleIs(title))) {
                return driver.getTitle();
            }
        } catch (Exception e) {
            System.out.println("title is not found within : " + timeOut);
        }
        return null;

    }

}
