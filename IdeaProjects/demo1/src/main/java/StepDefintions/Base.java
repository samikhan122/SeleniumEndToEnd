package StepDefintions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {


    public WebDriver driver;

//    public Base(WebDriver driver) {
//        this.driver = driver;
//
//    }

    public void initDriver(String url) {
        WebDriver driver1 = new ChromeDriver();
        driver1.get(url);
    }
}
