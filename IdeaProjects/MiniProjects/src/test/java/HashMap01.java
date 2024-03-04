import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://classic.crmpro.com/login.cfm");
        System.out.println(getCredentialsMap().get("trueLogin"));

        String credentials_login = getCredentialsMap().get("trueLogin");
        //driver.findElement(By.xpath("//input[@name='username']")).sendKeys(credentials_login.split(":")[0]);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(getUserName("trueLogin"));
        //driver.findElement(By.xpath("//input[@name='password']")).sendKeys(credentials_login.split(":")[1]);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(getPassword("trueLogin"));
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        Thread.sleep(4000);
        driver.quit();

    }


    public static HashMap<String, String> getCredentialsMap() {
        HashMap<String, String> userName = new HashMap<>();
        userName.put("customer", "alikhan:Davita08!");
        userName.put("admin", "shabaz:alikhan0786");
        userName.put("trueLogin", "samikhan123:Davita08!");
        return userName;
    }


    public static String getUserName(String role) {
        String credentials = getCredentialsMap().get(role);
        return credentials.split(":")[0];

    }

    public static String getPassword(String role) {
        String credentials = getCredentialsMap().get(role);
        return credentials.split(":")[1];
    }

}
