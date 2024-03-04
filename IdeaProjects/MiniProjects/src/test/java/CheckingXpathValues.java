import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckingXpathValues {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//button[normalize-space()='change time']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String finalText = driver.findElement(By.xpath("//p[starts-with(text(),'logged in successfully')]")).getText();
        String s[] = finalText.split(":");
        for (String i : s) {
            System.out.println(i);
        }
        Thread.sleep(2000);
        driver.quit();


    }


    public static void sendKeys(WebDriver driver, WebElement element, Duration timeout, String value) {
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(value);
    }
}

