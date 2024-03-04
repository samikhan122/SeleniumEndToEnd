package InterfaceWebdriverArhcitecture;

public class ChromeDriver implements Webdriver {
    public ChromeDriver() {
        System.out.println("Chrome is Launched");
    }

    @Override
    public void get(String url) {
        System.out.println("Opening the URL in Chrome");
    }

    @Override
    public String getTitle() {
        return "amazon";
    }

    @Override
    public String getURL() {
        return "https:www.amazon.com";
    }

    @Override
    public void click(String eleName) {
        System.out.println("String eleName click" + eleName);
    }

    @Override
    public void sendKeys(String eleName, String value) {
        System.out.println("click on the element" + eleName);
    }

    @Override
    public void close() {
        System.out.println("browser is closed ");
    }

    //SearchContext is the main interface
    @Override
    public void findElement(String eleName) {
        System.out.println("find element on the page");
    }

    @Override
    public void findElements() {
        System.out.println("Find Elements on the webpage");
    }
}
