import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;

public class DataTable2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://blazedemo.com/");
        WebElement depart = driver.findElement(By.xpath("//select[@name='fromPort']"));
        WebElement destin = driver.findElement(By.xpath("//select[@name='toPort']"));

        Select sc = new Select(depart);
        sc.selectByVisibleText("Boston");


        Select sc1 = new Select(destin);
        sc1.selectByVisibleText("Rome");

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        Thread.sleep(4000);
        driver.findElement(By.xpath("//td[contains(text(),'United Airlines')]//parent::tr/td/input[@type='submit']")).click();


        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("LoruBasheer");
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("24949 Katy Ranch rd");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Katy");
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Texas");
        driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("77494");

        Select sc2 = new Select(driver.findElement(By.xpath("//select[@id='cardType']")));
        sc2.selectByValue("visa");

        driver.findElement(By.xpath("//select[@id='cardType']")).sendKeys("5275200064984569");
        driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("06");
        driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2026");
        driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Shaik Ul Haddis");
        driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
        driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();

        String confirmation = "Thank you for your purchase today!";
        Assert.assertEquals(confirmation, "Thank you for your purchase today!");

        String id = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2)")).getText();
        System.out.println("Your Confirmation id is " + id);


        String amount = driver.findElement(By.cssSelector("tbody tr:nth-child(3) td:nth-child(2)")).getText();
        System.out.println("Your purchase Amount is " + amount);


        Thread.sleep(4000);
        driver.quit();


    }
}
