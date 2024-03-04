package TestCase;

import PageObjects.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test; 

public class TC_LoginTest_001 extends BaseClass {
        WebDriver driver;
    @Test
    public void LoginTest() {
        driver.get(baseUrl);
        logger.info("URL is Open");

        LoginPage lp = new LoginPage(driver);
        lp.setUsername(username);
        lp.setPassword(password);
        logger.info("Entered Credentials");


        lp.clickOnLogin();
        logger.info("Clicked On Submit and logged in Successfully");

        if (driver.getTitle().equals("Welcome To Manager's Page of Guru99 Bank")) {
            Assert.assertTrue(true);
        } else {
            Assert.assertFalse(false);
        }

    }


}
