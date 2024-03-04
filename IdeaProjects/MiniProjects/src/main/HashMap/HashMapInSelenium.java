package HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;

public class HashMapInSelenium {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.get("https://classic.crmpro.com/index.html");
//        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(getCredentialsMap().get("admin").split(":")[0]);
//        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(getCredentialsMap().get("admin").split(":")[1]);
//        driver.findElement(By.xpath("//input[@type='submit']")).click();
//
//        Thread.sleep(4000);


        //another way to get useranme and password in one hashMap
//        String[] userName = getCredentialsMap().get("admin").split(":");
//        String user = userName[0];
//        String pass = userName[1];
//        System.out.println(user);
//        System.out.println(pass);
        System.out.println(getUserName());


    }

    public static HashMap<String, String> getCredentialsMap() {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("admin", "samikhan123:Davita08!");
        userMap.put("customer", "samikhan123:Davita08!");
        userMap.put("delivery", "samikhan123:Davita08!");
        userMap.put("distributor", "samikhan123:Davita08!");
        userMap.put("seller", "samikhan123:Davita08!");
        userMap.put("seller", "samikhan123:Davita08!");
        //userMap.put()


        return userMap;
    }


    public static String getUserName() {
        String userName = getCredentialsMap().get("admin").split(":")[0];
        return userName;

    }

    public void close() {
        driver.quit();
    }
}
