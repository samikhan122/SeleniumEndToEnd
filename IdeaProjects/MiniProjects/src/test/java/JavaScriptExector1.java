import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptExector1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://classic.freecrm.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement email = driver.findElement(By.xpath("//input[@type='text']")); //apiautomation
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].value='apiautomation'", email);   //two ways of doing this.
        js.executeScript("arguments[0].value=arguments[1]", email, "apiautomation");
        Thread.sleep(2000);
        driver.quit();

        //why should we not entering the data in the a type area
        // you wouldnt know if there is a bug even its disabled then javascript will inject the value in there


    }
}
