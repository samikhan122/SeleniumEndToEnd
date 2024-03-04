import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class practiceAutomationSite1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice.automationtesting.in/");

        driver.findElement(By.xpath("//a[contains(@title,'Automation Practice Site')]")).click();


        driver.findElement(By.xpath("//h3[contains(text(),'Selenium Ruby')]//parent::a")).click();
        System.out.println("The first image URL is  " + driver.getCurrentUrl());
        driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//h3[contains(text(),'Thinking in HTML')]//parent::a")).click();
        System.out.println("The second image URL is " + driver.getCurrentUrl());
        driver.navigate().back();
        driver.findElement(By.xpath("//h3[contains(text(),'Mastering JavaScript')]//parent::a")).click();
        System.out.println("The Third image URL is " + driver.getCurrentUrl());
        driver.navigate().back();

        Thread.sleep(3000);
        driver.quit();


    }
}
