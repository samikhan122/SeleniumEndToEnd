import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class DataDrivenTesting {
    public WebDriver driver;


    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test(dataProvider = "LoginData")
    public void loginTest(String user, String pwd, String exp) {
        WebElement username = driver.findElement(By.id("Email"));
        username.clear();
        username.sendKeys(user);
        WebElement password = driver.findElement(By.id("Password"));
        password.clear();
        password.sendKeys(pwd);

        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        String act_title = "Dashboard";
        WebElement exp_title = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]"));
        if (exp.equals("Valid")) {
            if (exp_title.equals(act_title)) {
                WebElement LogoutOfPortal = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
                LogoutOfPortal.click();
                Assert.assertTrue(true);


            } else if (exp.equals("Invalid")) {
                // if (exp_title.equals(act_title)) {
                driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
                Assert.assertTrue(false);
            } else {
                Assert.assertTrue(true);
            }
        }
    }
    //}

    @DataProvider(name = "LoginData")
    public String[][] getData() {
        String loginData[][] = {
                {"admin@yourstore.com", "admin", "Valid"},
                {"admin@yourstore.com", "adm", "Invalid"},
                {"adm@yourstore.com", "adm", "Invalid"}
        };
        return loginData;
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

//admin@yourstore.com
//admin

