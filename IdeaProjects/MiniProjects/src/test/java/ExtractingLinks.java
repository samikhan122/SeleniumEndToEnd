import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ExtractingLinks {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/");
        System.out.println("The title of the landing page : " + driver.getTitle());
        List<WebElement> links = driver.findElements(By.tagName("a"));
        //tag name is very precise
        List<WebElement> AllLinksAnotherWay = driver.findElements(By.xpath("//a"));
        //number of links in this webpage
        System.out.println("All links of this page " + AllLinksAnotherWay.size());
        WebElement anyLink = AllLinksAnotherWay.get(101);// to call out the 100 link in a webpage
        System.out.println("Name or text of a particular link is: " + anyLink.getText());
        //determine the href attribute assoicated with a particular link
        System.out.println("url associated with this link is : " + anyLink.getAttribute("href"));
        //determine the position of this link
        //System.out.println("x cordinate if : " + anyLink.getLocation().x + " and y-location is : " + anyLink.getLocation().y);
        //click on that link
        //anyLink.click();
        //System.out.println("Title of the culture page is : " + driver.getTitle());
        //driver.navigate().back();




        driver.quit();

    }
}
