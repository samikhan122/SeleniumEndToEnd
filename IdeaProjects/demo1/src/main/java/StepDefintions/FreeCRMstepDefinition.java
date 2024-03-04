package StepDefintions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class FreeCRMstepDefinition extends Base {
    WebDriver driver;

    @Given("launch URL")
    public void launchURL() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://classic.crmpro.com/login.cfm");

    }


    @When("page is loaded get the title")
    public void pageIsLoadedGetTheTitle() {
        System.out.println(driver.getTitle());
    }


//    @Then("enter the username and password")
//    public void enterTheUsernameAndPassword(DataTable table) {
//        List<List<String>>cred =table.cells();
//        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(cred.get(0).get(0));
//        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(cred.get(0).get(1));
//
//    }

    @And("click on login Button")
    public void clickOnLoginButton() {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Then("Quit the browser")
    public void quitTheBrowser() {
        driver.quit();
    }

    @Then("^enter the username and password$")
    public void userEnterAnd(DataTable table) {
        for (Map<String, String> data : table.asMaps(String.class, String.class)) {
            driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(data.get(data.get("username")));
            driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("password");
            driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

        }


    }
}