package InterfaceWebdriverArhcitecture;

public interface Webdriver extends SearchContext {

    public void get(String url);

    public String getTitle();

    public String getURL();

    public void click(String eleName);


    public void sendKeys(String eleName, String value);

    public void close();

}
