package com.qa.opencart.pages;

import com.qa.opencart.utils.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductInfoPage {
    private WebDriver driver;
    private ElementUtil elementUtil;

    private Map<String, String> productMap = new HashMap<String, String>();


    public ProductInfoPage(WebDriver driver) {
        this.driver = driver;
        elementUtil = new ElementUtil(driver);
    }

    private final By ProductHeader = By.ByLinkText.tagName("h1");
    private final By images = By.cssSelector("ul.thumbnails img");
    // private final By imageCount = By.xpath("//li[@class='image-additional']");

    // private final By ImageCount2  = By.xpath("//div[@id='content']//a[@class='thumbnail']");
    private final By priceOfProduct = By.xpath("(//h1//following-sibling::ul[@class='list-unstyled'])[2]");
    private final By productMetaData = By.xpath("(//h1//following-sibling::ul[@class='list-unstyled'])[1]");


    public String getProductHeader() {
        String header = elementUtil.doGetElementText(ProductHeader);
        System.out.println(header);
        return header;
    }


    public int getProductImagesCount() {
        int totalImages = elementUtil.waitForElementsVisible(images, 2).size();
        System.out.println("Images Count for " + getProductHeader() + ": " + totalImages);
        return totalImages;
    }

    /*
    * Brand: Apple
    Product Code: Product 18
    Reward Points: 800
    Availability: In Stock
    * */
    private void getProductMetaData() {
        List<WebElement> productMetaList = elementUtil.getElements(productMetaData);
        for (WebElement e : productMetaList) {
            String text = e.getText();
            String metaKey = text.split(":")[0].trim();
            String metaValue = text.split(":")[1].trim();
            productMap.put(metaKey, metaValue);


        }
    }

    private void getProductPriceData() {
        List<WebElement> priceList = elementUtil.getElements(priceOfProduct);
        String price = priceList.get(0).getText();
        String exTacPrice = priceList.get(1).getText().split(":")[1].trim();
        productMap.put("product price", price);
        productMap.put("Ex Tax", exTacPrice);


    }

    public Map<String, String> getProductDetailsAsMap() {
        productMap.put("header", getProductHeader());
        productMap.put("product Images", String.valueOf(getProductImagesCount()));
        getProductMetaData();
        getProductPriceData();
        return productMap;
    }


}
