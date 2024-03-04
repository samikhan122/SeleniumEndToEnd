import org.apache.http.client.fluent.Request;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.List;

public class ExtractingAllLinksInBBC {


    public static void main(String[] args) {
        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/");
        List<WebElement> links = driver.findElements(By.xpath("//*[@id=\"orb-header\"]/div/nav[2]/ul/li/a"));
        System.out.println("Total top links in BBC home pages are : " + links.size());

        for (int i = 0; i < links.size(); i++) {
            System.out.println(links.get(i).getText() + " presence of this link is " + links.get(i).isDisplayed());
            String url = links.get(i).getAttribute("href");


            System.out.println("--------------------------------------");

            boolean result = validateResponse(url);
            softAssert.assertTrue(result, "invalid response code");
        }
        softAssert.assertAll();


        driver.quit();
    }

    public static boolean validateResponse(String url) {
        int responseCode = 0;
        try {
            responseCode = Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
            System.out.println("response code for URL : " + url + "is" + responseCode);
            if (responseCode == 200) {
                return true;

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return false;


    }


}


//*[@id="orb-header"]/div/nav[2]/ul/li/a

//div[@class='page-body']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]
