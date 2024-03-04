package TestCase;

import Utilities.ReadConfig;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;
import org.apache.log4j.Logger;

import java.time.Duration;

public class BaseClass {

    ReadConfig readConfig = new ReadConfig();
    //public String baseUrl = " https://demo.guru99.com/v3/index.php";
    public String baseUrl = readConfig.getApplicationURL();
    //  public String username = "mngr538571";
    public String username = readConfig.getUsername();
    // public String password = "bErYsap";
    public String password = readConfig.getPassword();

    public static WebDriver driver;

    public static Logger logger;

    @Parameters("browser")
   @BeforeSuite //before completion of the test case
    public void setUp(String br) {
        logger = Logger.getLogger("Banking");
       // PropertyConfigurator.configure("Log4j.Properties");
        BasicConfigurator.configure();

        if (br.equals("chrome")) {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        } else if (br.equals("safari")) {
            driver = new SafariDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
    }

        @AfterClass // after completion of the test case
        public void tearDown () {
            driver.quit();

        }


    }
