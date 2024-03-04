package StepDefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class nopCommerceStepdefs {

    WebDriver driver;
    public static String nopCommerceURl = "https://demo.nopcommerce.com/";


    //WebDriver driver;
    public nopCommerceStepdefs(WebDriver driver) {
        this.driver = driver;
    }

    @Given("user will be on loginPage")
    public void userWillBeOnLoginPage() {
      driver.get("https://demo.nopcommerce.com/");
    }


    @Then("user registers userName and Password")
    public void userRegistersUserNameAndPassword() {


    }

    @When("title will be diplayed from the UI to Console")
    public void titleWillBeDiplayedFromTheUIToConsole() {
        System.out.println(driver.getTitle());
    }

    @And("after success will close the browser")
    public void afterSuccessWillCloseTheBrowser() {
        driver.quit();
    }
}
