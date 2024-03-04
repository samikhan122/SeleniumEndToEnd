import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DatePickerRedBus {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.redbus.in/");


        String year = "2024";
        String month = "Dec";
        String date = "15";


        driver.findElement(By.xpath("//div[@id='onwardCal']")).click();

        while (true) {
            //String monthYear = driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div[2]/div/div/div[1]/div[2]")).getText();
            String month1 = driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div[2]/div/div/div[1]/div[2]/text()[2]")).getText();
            String year2 = driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div[2]/div/div/div[1]/div[2]/div")).getText();

//            System.out.println(month1);
//            String arr[] = year2.split(" ");
//            String mon = arr[0];
//            String year1 = arr[1];
//            System.out.println(mon);
//            System.out.println(year1);

            if (month1.equalsIgnoreCase(month) && year2.equalsIgnoreCase(year)) {
                break;
            } else {
                driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]//*[name()='svg']")).click();
            }
        }

        driver.quit();
    }
}
