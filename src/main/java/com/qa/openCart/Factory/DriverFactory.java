package com.qa.openCart.Factory;

import com.qa.openCart.Exceptions.BrowserException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class DriverFactory {

    WebDriver driver;
    Properties prop;


    public WebDriver initDriver(Properties prop) {
        String browserName = prop.getProperty("browser");
        System.out.println("Browser Name is " + browserName);
        switch (browserName.trim().toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            default:
                throw new BrowserException("Please pass the right browser. Currently using chrome browser");


        }
        //driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(prop.getProperty("url"));

        return driver;
    }

    public Properties initProp() {
        prop = new Properties();
        try {
            FileInputStream ip = new FileInputStream("./src/test/resources/config/Config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return prop;

    }
}
