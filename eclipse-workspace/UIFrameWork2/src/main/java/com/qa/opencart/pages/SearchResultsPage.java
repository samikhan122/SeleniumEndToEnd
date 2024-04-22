package com.qa.opencart.pages;

import com.qa.opencart.utils.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SearchResultsPage {
    private final WebDriver driver;
    private final ElementUtil elementUtil;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        elementUtil = new ElementUtil(driver);
    }

    private final By searchProduct = By.cssSelector("div.product-thumb");
    private final By macbookSelect = By.linkText("MacBook Pro");

    public int getSearchProductCount() {
        return elementUtil.waitForElementsVisible(searchProduct, 1).size();

    }

    public ProductInfoPage selectProduct(String productName) {
        System.out.println("Searching for the product " + productName);
        elementUtil.waitForElementVisible(By.linkText(productName), 4).click();
        return new ProductInfoPage(driver);
    }


}

