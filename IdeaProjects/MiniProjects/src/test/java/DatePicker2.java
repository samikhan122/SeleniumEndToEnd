import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class DatePicker2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        String date = "March-16-2026";
        String dateArr[] = date.split("-");
        String day = dateArr[1];
        String month = dateArr[0];
        String year = dateArr[2];

        System.out.println("Month is " + month);
        System.out.println("Year is " + year);
        System.out.print("Day is " + day);


        //List<WebElement> num = driver.findElements(By.xpath("//td[@data-month='11']/a[normalize-space()='4']"));
        int nums = driver.findElements(By.xpath("//td[@data-month='11']/a")).size();
        int daysToSelect = getRandomNumber(nums + 1);
        System.out.println(" The date you have chose is "+daysToSelect);

        driver.findElement(By.xpath("//td[@data-month='11']/a[normalize-space()='"+daysToSelect+"']")).click();
        Thread.sleep(4000);
        driver.quit();

    }

    public static int getRandomNumber(int upper) {
        Random random = new Random();
        int x = random.nextInt(upper);
        return x;
    }


}
