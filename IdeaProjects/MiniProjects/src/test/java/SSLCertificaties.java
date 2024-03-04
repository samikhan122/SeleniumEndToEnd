import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertificaties {
    public static void main(String[] args) throws InterruptedException {
        //global profile
        DesiredCapabilities ds = new DesiredCapabilities();
        ds.setAcceptInsecureCerts(true);
        ds.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);


        ChromeOptions cms = new ChromeOptions();
        cms.merge(ds);
        WebDriver driver = new ChromeDriver(cms);
        driver.get("https://expired.badssl.com/");
        Thread.sleep(5000);
        driver.quit();

    }
}
