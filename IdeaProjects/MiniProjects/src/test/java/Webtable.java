import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");


        //*[@id="customers"]/tbody/tr[2]/td[1]
        //*[@id="customers"]/tbody/tr[3]/td[1]
        //*[@id="customers"]/tbody/tr[5]/td[1]
        String beforeXpath = " //*[@id='customers']/tbody/tr[";
        String afterXpath = "]/td[1]";

        for (int i = 2; i <= 7; i++) {
            String actualXpath = beforeXpath + i + afterXpath;
            WebElement element = driver.findElement(By.xpath(actualXpath));
            System.out.println(element.getText());
            if(element.getText().equals("Island Trading")){
                System.out.println("Company name " + element.getText() + " is found " + "at " + i);
                break;
            }
        }

        Thread.sleep(3000);
        driver.quit();

    }
}
