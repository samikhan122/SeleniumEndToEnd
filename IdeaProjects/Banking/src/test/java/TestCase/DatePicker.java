package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DatePicker {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.redbus.in/");

        String year = "2024";
        String month = "Dec";
        String date = "15";
        String monthYear;
        driver.findElement(By.xpath("//div[contains(@data-placeholder,'SELECT DATE')]")).click();
        while (true) {
            monthYear = driver.findElement(By.xpath("//div[text()='Nov']")).getText();
            String[] arr = monthYear.split("");

            String mon = arr[0];
            String yr = arr[1];
            if (mon.equalsIgnoreCase(month) && yr.equals(year))
                break;
            else
                driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][3]")).click();
        }
        Thread.sleep(3000);
        driver.quit();

    }
}




