import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PrintAllLinkInAWebpage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/");
        System.out.println("The title of the landing page : " + driver.getTitle());
        List<WebElement> links = driver.findElements(By.tagName("a"));
        //tag name is very precise
        List<WebElement> AllLinksAnotherWay = driver.findElements(By.xpath("//a"));

        for (int i = 0; i < AllLinksAnotherWay.size(); i++) {
            WebElement TotalLinks = AllLinksAnotherWay.get(i);
            System.out.println(TotalLinks.getText() + "-------------" + TotalLinks.isDisplayed());




        }
        driver.quit();
    }
}
