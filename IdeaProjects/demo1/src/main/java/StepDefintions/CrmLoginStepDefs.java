package StepDefintions;

import dev.failsafe.internal.util.Durations;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.datafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class CrmLoginStepDefs {


    public static class loginStepDefintion {
        WebDriver driver;

        @Given("^user on login page$")
        public void userOnLoginPage() {
            driver = new ChromeDriver();
            driver.get("https://demo.nopcommerce.com/");

        }


        @When("user gets title of the FREE CRM")
        public void user_gets_title_of_the_free_crm() {
            System.out.println(driver.getCurrentUrl());
        }


        @Then("user register {string} and {string}")
        public void userRegisterAnd(String email, String password) {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
            driver.findElement(By.xpath("//input[@id='gender-male']")).click();
            driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Ali");
            driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("khan");
            driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
            driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
            driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(password);
            driver.findElement(By.xpath("//button[normalize-space()='Register']")).click();
        }



        @Then("user clicks on login button")
        public void user_clicks_on_login_button() {
            driver.findElement(By.xpath("//a[normalize-space()='Continue']")).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
        }

        @Then("user enter{string},{string}")
        public void user_enter(String email, String password) {
            driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
            driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
            driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

        }

        @And("quit the browser")
        public void quitTheBrowser() throws InterruptedException {
            Thread.sleep(4000);
            driver.quit();
        }


    }

}
