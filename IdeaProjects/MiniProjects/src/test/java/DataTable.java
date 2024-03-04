import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class DataTable {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
        int pagination = driver.findElements(By.xpath("//div[@id='example_paginate']/span/a")).size();

        List<String> names = new ArrayList<>();

        for (int i = 1; i <= pagination; i++) {
            String paginationSelector = "//*[@id='example_paginate']/span/a[" + i + "]";
            driver.findElement(By.xpath(paginationSelector)).click();
            List<WebElement> namesAndPosition = driver.findElements(By.xpath("//tr//td[@class='sorting_1']"));


            for (WebElement name : namesAndPosition) {
                names.add(name.getText());

            }


        }
        for (String nameq : names) {
            System.out.println(nameq);


        }
        int totalNames = names.size();
        System.out.println("Total number of Names " + totalNames);

        String displayCount = driver.findElement(By.id("example_info")).getText().split(" ")[5];
        System.out.println("Total number of entries on the UI " + displayCount);

        Assert.assertEquals(displayCount, String.valueOf(totalNames));


        Thread.sleep(2000);
        driver.quit();
    }
}
