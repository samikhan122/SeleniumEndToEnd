import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class KeyBoardActions {
    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.facebook.com/");
//        Actions act = new Actions(driver);
//        act.sendKeys(Keys.TAB).sendKeys("1005").build().perform();
//        Thread.sleep(2000);
//        driver.quit();

        String[] alpha = {"abcd", "efgh", "ijklm"};
        List<String> apl = Arrays.asList(alpha);
        System.out.println(apl);

        System.out.println("Simily learn " + 100 + 100);
        System.out.println(100+100+"simply learn");
    }
}
