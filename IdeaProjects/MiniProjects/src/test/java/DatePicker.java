import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DatePicker {
    public static void main(String[] args) throws InterruptedException {
        String monthAndYear = "February 2024";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.expedia.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // driver.findElement(By.xpath("")).click();
        // WebElement month = driver.findElement(By.xpath("//span[normalize-space()='November 2023']"));
        WebElement month = driver.findElement(By.xpath("//button[starts-with(@data-stid,'uitk')]"));
        //  WebElement nextButton = driver.findElement(By.xpath("//div[starts-with(@class,'uitk-cal-controls-button uitk-cal-controls-button-inset-multi uitk-cal-controls-button-next')]"));
        month.click();
        WebElement monthAfter = driver.findElement(By.xpath("//span[starts-with(@class,'uitk-align-center uitk-month-label')]"));
        monthAfter.getText();
       // System.out.println(month.getText());
// //table[@class='ui-date`picker-calendar']/tbody/tr/td/a     //this xpath is the days of all in a calender

        Thread.sleep(4000);


        driver.quit();

    }
}





      //  https://uskbin.top
