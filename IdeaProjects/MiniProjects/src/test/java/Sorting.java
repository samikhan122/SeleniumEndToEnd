import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sorting {

    @Test
    public void testScen() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();


        List<Double> store = new ArrayList<>();


        List<WebElement> beforeSorting = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        for (WebElement e : beforeSorting) {
            store.add(Double.valueOf(e.getText().replace("$", "")));

        }


        WebElement filter = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        Select sc1 = new Select(filter);
        sc1.selectByValue("lohi");

        List<Double> afterSortingstore = new ArrayList<>();
        List<WebElement> afterSorting = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        //String afterSorting = driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText().replace("$","")[0];

        for (WebElement a : afterSorting) {
            afterSortingstore.add(Double.valueOf(a.getText().replace("$", "")));

        }
        Collections.sort(store);
        Assert.assertEquals(store, afterSortingstore);
        System.out.println(afterSortingstore);


        Thread.sleep(4000);
        driver.quit();



        //*[@id="inventory_container"]/div/div[1]/div[3]/button
        //*[@id="inventory_container"]/div/div[3]/div[3]/button

    }
}
