import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class fileUploadTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://html.com/input-type-file/");
        driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("/Users/alikhan/Desktop/username.csv");
        Thread.sleep(4000);



        long s = 1000000L;
        System.out.println(s);
        System.out.println("I love \"java\"");

        driver.quit();
    }
}
