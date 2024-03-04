import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadProperties {
    static WebDriver driver;

    //how to read properties file.
    public static void main(String[] args) {
      Properties prop = new Properties();
        try {
            FileInputStream fs = new FileInputStream("src/config.properties");
            prop.load(fs);
            System.out.println(prop.getProperty("browser"));
            String browserName = prop.getProperty("browser");
            if (browserName.equals("chrome")) {
                driver = new ChromeDriver();
                driver.get(prop.getProperty("url"));
                Thread.sleep(3000);
            } else {
                if (browserName.equals("safari")) {
                    driver = new SafariDriver();
                } else {
                    System.out.println("No Browser Value is given");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I am in the finally block");
            driver.quit();
        }

    }
}
