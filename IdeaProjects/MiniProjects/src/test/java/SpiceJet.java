import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SpiceJet {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String date = "12-17-2023";
        WebElement from = driver.findElement(By.xpath("//div[text()='From']"));
        from.sendKeys("Col");
        WebElement to = driver.findElement(By.xpath("//input[@value='Select Destination']"));
        to.sendKeys("Agartala");
        WebElement datefrom = driver.findElement(By.xpath("//div[normalize-space()='From']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']"));
        //WebElement dateTo = driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']"));

        selectDayByJS(driver,datefrom,date);

        Thread.sleep(4000);
        driver.quit();
    }


    public static void selectDayByJS(WebDriver driver, WebElement element, String dateVal) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arugments[0].setAttribute('value'," + dateVal + "');", element);
    }
}

