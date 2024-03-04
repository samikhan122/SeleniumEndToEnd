package InterfaceWebdriverArhcitecture;

public class AmazonTest {
    public static void main(String[] args) {


        // ChromeDriver driver = new ChromeDriver();
        //Firefox driver = new Firefox();
        SafariDriver driver = new SafariDriver();
        driver.get("https:www.amazon.com");
        String title = driver.getTitle();
        System.out.println(title);
        String url = driver.getURL();
        System.out.println(url);
        driver.sendKeys("admin", "admin");
        driver.click("loginButton");
        driver.close();

    }
}
