import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test12 {
    @Test
    public void TestScen() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://datatables.net/examples/basic_init/scroll_x");

        WebElement name = driver.findElement(By.xpath("//td[starts-with(text(),'Caesar')]"));
        if (name.getText().equals("Caesar")) {
            WebElement age = driver.findElement(By.xpath("//td[starts-with(text(),'Caesar')]//following-sibling::td[4]"));
            System.out.println(age.getText());
        }

        WebElement email = driver.findElement(By.xpath("//td[starts-with(text(),'Caesar')]//following-sibling::td[8]"));
        WebElement emailAsWhole = driver.findElement(By.xpath("//th[starts-with(text(),'E-mail')]"));
        Actions act = new Actions(driver);


        act.moveToElement(email).perform();
        System.out.println(email.getText());

        System.out.println(driver.getCurrentUrl());


        Thread.sleep(4000);
        driver.quit();


    }
}
