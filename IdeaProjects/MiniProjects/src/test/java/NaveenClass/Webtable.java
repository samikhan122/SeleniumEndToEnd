package NaveenClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        String name = driver.findElement(By.xpath("//a[contains(text(),'Jasmine.Morgan')]")).getText();
        System.out.println(name);
        driver.findElement(By.xpath("//a[contains(text(),'Jasmine.Morgan')]/ancestor::tr/td//input[@id='ohrmList_chkSelectRecord_16']")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
