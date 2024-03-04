import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.time.Duration;

public class AlertPopupAndText {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new HtmlUnitDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Thread.sleep(3000);
        Alert alertWindow = driver.switchTo().alert();
        System.out.println(alertWindow.getText());
        alertWindow.sendKeys("Welcome To Automation");
        System.out.println(alertWindow.getText());
        alertWindow.accept();
        Thread.sleep(3000);


        driver.quit();


    }
}
