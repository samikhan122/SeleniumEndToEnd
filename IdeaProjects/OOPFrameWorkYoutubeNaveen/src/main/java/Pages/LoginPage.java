package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {


    private By emailId = By.id("email");
    private By goButton = By.id("enterimg");
    private By titleAssertion = By.xpath("//h1[contains(text(),'Automation Demo Site ')]");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEmailId() {
        return getElement(emailId);
    }

    public void setEmailId(By emailId) {
        this.emailId = emailId;
    }

    public WebElement getGoButton() {
        return getElement(goButton);
    }

    public WebElement setGoButton(By goButton) {
        this.goButton = goButton;
    }

    public WebElement getTitleAssertion() {
        return getElement(titleAssertion);
    }

    public void setTitleAssertion(By titleAssertion) {
        this.titleAssertion = titleAssertion;
    }

    public String getLoginPageMethod() {
        return getPageTitle();
    }
    public void doLogin(String userName){
        getEmailId().sendKeys(userName);
        setGoButton(goButton).click();
    }
}
