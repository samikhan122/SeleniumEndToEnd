import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FlipKart {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/mens-tshirts/pr?sid=clo,ash,ank,edy&fm=neo%2Fmerchandising&iid=M_17c656ee-11e9-4241-bdcf-06767863f69b_1_372UD5BXDFYS_MC.IF56C41VGEYS&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Fashion~Men%2527s%2BTop%2BWear~Men%2527s%2BT-Shirts_IF56C41VGEYS&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L2_view-all&cid=IF56C41VGEYS");
        List<WebElement> allTShirtsByBrand = driver.findElements(By.xpath("//div[@class='_2WkVRV']"));
       // System.out.println(allTShirtsByBrand.size());
        System.out.println("---------------------------------------");
        for (WebElement e : allTShirtsByBrand) {
         //   System.out.println("Brand name is " + e.getText());
        }


        List<WebElement> allTshirtPrice = driver.findElements(By.xpath("//div[@class='_30jeq3']"));
        //System.out.println("Total Types of T-shirts Name are " + allTshirtPrice.size());
       // System.out.println("---------------------------------------");
//        for (int i = 0; i < allTshirtPrice.size(); i++) {
//            System.out.println(allTshirtPrice.get(i).getText());
            for (WebElement e : allTshirtPrice) {
               // System.out.println(e.getText());

            }


            List<WebElement> tshirtTypeOfName = driver.findElements(By.xpath("//a[@class='IRpwTa']"));
            for (WebElement e : tshirtTypeOfName) {
               // System.out.println("T-shirt names " + e.getText());

            }

            for (int i = 0; i < allTShirtsByBrand.size(); i++) {
                System.out.println(allTShirtsByBrand.get(i).getText() + "--" +tshirtTypeOfName.get(i).getText() + "--" + allTshirtPrice.get(i).getText());

            }
            driver.quit();
        }


    }

