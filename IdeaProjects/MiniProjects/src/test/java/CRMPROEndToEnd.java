import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class CRMPROEndToEnd {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://classic.crmpro.com/login.cfm");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(getUsername("trueLogin"));
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(getPassword("trueLogin"));
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.switchTo().frame(1);
        driver.findElement(By.xpath("//a[normalize-space()='Calendar']")).click();
        List<WebElement> calDays = driver.findElements(By.xpath("//td[@align='Center']/table/tbody/tr//td[@align='left']"));
        Random ran = new Random();
        ////td[normalize-space()='8'] this is for a spefic day.
        for (WebElement e : calDays) {
            System.out.println(e.getText());
        }


        ////td[@align='Center']/table/tbody/tr//td[@align='left'] // this is the calender day to be visibile

        Thread.sleep(4000);
        driver.quit();
    }


    public static HashMap<String, String> usernameAndPassword() {
        HashMap<String, String> user = new HashMap<>();
        user.put("trueLogin", "samikhan123:Davita08!");
        return user;
    }


    public static String getUsername(String role) {
        String credentials = usernameAndPassword().get(role);
        return credentials.split(":")[0];

    }

    public static String getPassword(String role) {
        String credentials = usernameAndPassword().get(role);
        return credentials.split(":")[1];


    }



}
