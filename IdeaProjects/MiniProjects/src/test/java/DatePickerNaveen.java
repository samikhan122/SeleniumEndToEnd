import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DatePickerNaveen {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy
                (By.xpath("//div[@class='ui-datepicker-title']")));

        selectDate("26", "june", "2024");


        Thread.sleep(4000);
        driver.quit();
    }

    public static String[] getMonthYear(String monthYearValue) {
        return monthYearValue.split(" ");
    }

    public static void selectDate(String exday, String exmonth, String exyear) {
        String monthYearValue = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();

        while (!(getMonthYear(monthYearValue)[0].equalsIgnoreCase(exmonth) && getMonthYear(monthYearValue)[1].equals(exyear))) {
            driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
            monthYearValue = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
            // month = monthYear.split(" ")[0].trim();
            //year = monthYear.split(" ")[1].trim();
        }
        WebElement clickonDate = driver.findElement(By.xpath("//a[normalize-space()=" + exday + "]"));
        clickonDate.click();
        System.out.println("from the value you have chosen " + exmonth + " " + exyear);

    }


}
