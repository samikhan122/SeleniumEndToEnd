package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver lriver;

    public LoginPage(WebDriver driver) {
        lriver = driver;
        PageFactory.initElements(driver, this);

    }

    By username = By.xpath("//input[@name='uid']");
    By password = By.xpath("//input[@name='password']");
    By submitButton = By.xpath("//input[@name='btnLogin']");


    public void setUsername(String usernameEntry) {
        lriver.findElement(username).sendKeys(usernameEntry);
    }

    public void setPassword(String passwordEntry) {
        lriver.findElement(password).sendKeys(passwordEntry);
    }

    public void clickOnLogin() {
        lriver.findElement(submitButton).click();
    }


}
