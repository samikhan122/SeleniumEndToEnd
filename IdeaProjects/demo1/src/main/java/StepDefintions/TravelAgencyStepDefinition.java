package StepDefintions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.*;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Map;


public class TravelAgencyStepDefinition {
    WebDriver driver;

    @Before
    public void setup() {
        System.out.println("Launching ChromeBrowser");
        System.out.println("Entering in the URL For The ChromeBrowser");
    }

    @After
    public void tearDown() {
        System.out.println("Closing the Browser");

    }


    @Given("Visit the URl")
    public void visit_the_u_rl(DataTable table) {
        List<List<String>> url = table.cells();
        driver = new ChromeDriver();
        driver.get(table.cells().get(0).get(0));

    }

    @When("select the departure city and destination city")
    public void select_the_departure_city_and_destination_city() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement sc1 = driver.findElement(By.xpath("//select[@name='fromPort']"));
        Select from = new Select(sc1);
        from.selectByValue("Paris");
        WebElement sc2 = driver.findElement(By.xpath("//select[@name='toPort']"));
        Select dest = new Select(sc2);
        dest.selectByValue("New York");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }

    @Then("Chose the respective flight")
    public void chose_the_respective_flight() throws InterruptedException {
        Thread.sleep(4000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement chooseThisFlight = driver.findElement(By.xpath("//td[normalize-space()='$765.32']//ancestor::tr/td[1]"));
        chooseThisFlight.click();
    }

//    @Then("enter in the card details")
//    public void enter_in_the_card_details(DataTable table) throws InterruptedException {
//        List<List<String>> cardDetails = table.cells();
//        Thread.sleep(4000);
//        //driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys(table.cells().get(0).get(0));
//        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys(cardDetails.get(0).get(0));
//        //driver.findElement(By.id("address")).sendKeys(table.cells().get(0).get(1));
//        driver.findElement(By.id("address")).sendKeys(cardDetails.get(0).get(1));
//        //driver.findElement(By.id("city")).sendKeys(table.cells().get(0).get(2));
//        driver.findElement(By.id("city")).sendKeys(cardDetails.get(0).get(2));
//       // driver.findElement(By.id("state")).sendKeys(table.cells().get(0).get(3));
//        driver.findElement(By.id("state")).sendKeys(cardDetails.get(0).get(3));
//       // driver.findElement(By.id("zipCode")).sendKeys(table.cells().get(0).get(4));
//        driver.findElement(By.id("zipCode")).sendKeys(table.cells().get(0).get(4));
//        WebElement scCardType = driver.findElement(By.id("cardType"));
//        Select cardType = new Select(scCardType);
//        cardType.selectByVisibleText("American Express");
//        driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys(table.cells().get(0).get(5));
//        driver.findElement(By.id("creditCardMonth")).sendKeys(table.cells().get(0).get(6));
//        driver.findElement(By.id("creditCardYear")).sendKeys(table.cells().get(0).get(7));
//        driver.findElement(By.id("nameOnCard")).sendKeys(table.cells().get(0).get(8));
//        driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
//
//    }

    @Then("enter in the card details")
    public void enter_in_the_card_details(DataTable table) throws InterruptedException {
        for (Map<String, String> data : table.asMaps(String.class, String.class))
            Thread.sleep(4000);
//        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys(data.get(0).get(0));
//        driver.findElement(By.id("address")).sendKeys(cardDetails.get(0).get(1));
//        driver.findElement(By.id("city")).sendKeys(cardDetails.get(0).get(2));
//        driver.findElement(By.id("state")).sendKeys(cardDetails.get(0).get(3));
        driver.findElement(By.id("zipCode")).sendKeys(table.cells().get(0).get(4));
        WebElement scCardType = driver.findElement(By.id("cardType"));
        Select cardType = new Select(scCardType);
        cardType.selectByVisibleText("American Express");
        driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys(table.cells().get(0).get(5));
        driver.findElement(By.id("creditCardMonth")).sendKeys(table.cells().get(0).get(6));
        driver.findElement(By.id("creditCardYear")).sendKeys(table.cells().get(0).get(7));
        driver.findElement(By.id("nameOnCard")).sendKeys(table.cells().get(0).get(8));
        driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();

    }


    @Then("assert the title for the confirmation page")
    public void assert_the_title_for_the_confirmation_page() {
        String textElement = driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']")).getText();
        String text = "Thank you for your purchase today!";

        Assert.assertEquals(text, textElement);
    }

    @Then("capture the id and display on the console")
    public void capture_the_id_and_display_on_the_console() {
        String confrimationId = driver.findElement(By.xpath("//tbody//tr//td[2]")).getText();
        System.out.println("Confirmation id is " + confrimationId);
        String amountSpentToBuyTicket = driver.findElement(By.xpath("//tbody//tr[3]//td[2]")).getText();
        System.out.println("Amount spend on this ticket " + amountSpentToBuyTicket);

    }

    @When("Click back to homepage")
    public void click_back_to_homepage() throws InterruptedException {
        driver.findElement(By.xpath("//a[normalize-space()='Travel The World']")).click();
        Thread.sleep(4000);
        driver.quit();
    }

}
