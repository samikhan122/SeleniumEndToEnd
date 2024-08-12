package com.qa.openCart.Base;

import com.qa.openCart.EleUtils.ElementUtils;
import com.qa.openCart.Factory.DriverFactory;
import com.qa.openCart.Pages.AccountPage;
import com.qa.openCart.Pages.LoginPage;
import com.qa.openCart.Pages.RegistrationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.Properties;

public class baseTest {
    WebDriver driver;

    Properties prop;

    public RegistrationPage rg;
    public AccountPage ap;

    ElementUtils etl;
    AccountPage acc;


    protected LoginPage loginPage;
    DriverFactory df;

    @BeforeTest
    public void setUp() {
        df = new DriverFactory();
        prop = df.initProp();
        prop.getProperty("browser");
        driver = df.initDriver(prop);
        rg = new RegistrationPage(driver);
        loginPage = new LoginPage(driver);
        acc = new AccountPage(driver);
        ap = new AccountPage(driver);


    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }


}
