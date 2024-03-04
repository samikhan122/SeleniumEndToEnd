import freemarker.template.utility.DateUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.Date;

// https://www.youtube.com/watch?v=i_s1KoPlbWY&list=PLL34mf651faPB-LyEP0-a7Avp_RHO0Lsm&index=57
//need to mvn (common IO )

public class ScreenShots {
   // static ScreenShots sc1;
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        try {
            File sc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sc, new File("src/" +  ScreenShots.DateUtilMethod()+ ".png"));
        } catch (Exception e) {
            System.out.println("File is having an issue please check");
        }
        driver.quit();
    }

    //create a method that can give the updated date


    public static String DateUtilMethod() {
        Date currentDate = new Date();
        String updatedCurrentDate = currentDate.toString().replace(" ", "-").replace(":", "-");
        return updatedCurrentDate;
    }

}
