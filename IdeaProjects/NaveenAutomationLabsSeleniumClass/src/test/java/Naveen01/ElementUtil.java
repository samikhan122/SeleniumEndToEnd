package Naveen01;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ElementUtil {
    WebDriver driver;

    public ElementUtil(WebDriver driver) {
        this.driver = driver;


    }

    public By getBy(String locatorType, String locatorValue) {
        By locator = null;
        switch (locatorType.trim().toLowerCase()) {
            case "id":
                locator = By.id(locatorValue);
                break;
            case "name":
                locator = By.name(locatorValue);
                break;
            case "classname":
                locator = By.className(locatorValue);
                break;
            case "xpath":
                locator = By.xpath(locatorValue);
                break;
            case "linkText":
                locator = By.linkText(locatorValue);
                break;
            case "partialLinkText":
                locator = By.partialLinkText(locatorValue);
                break;
            case "tagName":
                locator = By.tagName(locatorValue);
                break;
            default:
                break;
        }
        return locator;

    }

    public static void nullBlankCheck(String value) {
        if (value == null || value.isEmpty()) {
            throw new MyException("Element is not present in the option ");
        }


    }


    public WebElement getElementMethod(By element) {
        return driver.findElement(element);

    }

    public List<WebElement> getElements(By locator) {
        return driver.findElements(locator);
    }

    public boolean multipleElementsExsist(By locator) {
        if (getElements(locator).size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public WebElement getElement(String locatorType, String locatorValue) {
        return driver.findElement(getBy(locatorType, locatorValue));
    }

    public void sendKeys(By locator, String value) {
        getElementMethod(locator).sendKeys(value);
    }

    public void doSendKeys(String locatorType, String locatorValue, String value) {
        getElement(locatorType, locatorValue).sendKeys(value);
    }

    public void doCLick(By locator) {
        getElementMethod(locator).click();
    }

    public String doGetElementText(By locator) {
        return getElementMethod(locator).getText();
    }

    public String getRandomEmail() {
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }

    public String getRandomFirstName() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }

    public String getRandomLastName() {
        Faker faker = new Faker();
        return faker.name().lastName();
    }

    public String getPhoneNumber() {
        Faker faker = new Faker();
        return faker.numerify("###-###-####");
    }

    public WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

//    public String doGetElementText(By locator) {
//        return getElement(locator).getText();
//    }

    public String ElementGetAttribute(By locator, String attrName) {
        return getElement(locator).getAttribute(attrName);
    }

    public boolean getElementInList(By locator) {
        return getElement(locator).isDisplayed();
    }


    public boolean isElementDisplayed(By locator) {
        return getElement(locator).isDisplayed();
    }

    public ArrayList<String> getElementAsAttribute(By locator, String attName) {
        List<WebElement> eleList = getElements(locator);
        ArrayList<String> eleAttrList = new ArrayList<>();


        for (WebElement e : eleList) {
            String attvalue = e.getAttribute(attName);
            if (attvalue.length() != 0) {
                eleAttrList.add(attvalue);
            }
        }
        return eleAttrList;
    }

    public boolean isElementExist(By locator) {
        if (getElements(locator).size() == 1) {
            return true;
        }
        return false;

    }

    public int getElementCount(By locator) {
        return getElements(locator).size();
    }

    public ArrayList<String> getElementsTextList(By locator) {
        List<WebElement> eleList = getElements(locator);
        ArrayList<String> eleTextList = new ArrayList<>(); // physical capacity = 0;
        for (WebElement e : eleList) {
            String txt = e.getText();
            if (txt.length() != 0) {
                eleTextList.add(txt);

            }


        }
        return eleTextList;
    }

    public void doSearch(By searchLocator, By searchSuggestion, String searchKey, String value) throws InterruptedException {
        sendKeys(searchLocator,searchKey);

        driver.findElement(searchLocator).sendKeys(searchKey);
        Thread.sleep(3000);
        List<WebElement> suggestions = driver.findElements(searchSuggestion);
        System.out.println(suggestions.size());


        for (WebElement e : suggestions) {
            String text = e.getText();
            System.out.println(text);
            if (text.contains(value)) {
                e.click();
                break;
            }

        }

    }
}


