import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class WaitsInWebdriverExplicitOrImplicit {
   // static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
        WebDriver driver = new HtmlUnitDriver();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        try {
            Properties prop = new Properties();
            FileInputStream fs = new FileInputStream("src/config.properties");
            prop.load(fs);
            driver.get(prop.getProperty("url2"));



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value) {
        new WebDriverWait(driver, Duration.ofSeconds(timeout));
        element.sendKeys(value);

        //for sendkeys
    }

    //this is the explicit wait to look into follow this syntax
    // and the method Expected Conditions is what we need to get the options from.
    public static void sendKeys2(WebDriver driver, WebElement element, int timeout, String value) {
        new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(value);
    }
}
