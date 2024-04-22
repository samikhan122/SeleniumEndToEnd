package com.qa.opencart.tests;

import com.qa.opencart.base.BaseTest;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Map;

public class ProductPageInfoTest extends BaseTest {
    SoftAssert softAssert;


    @BeforeClass
    public void login() {
        accPage = lg.doLogin(prop.getProperty("username"), prop.getProperty("password"));

    }



    @Test
    public void productHeaderTest() {
        searchResultsPage = accPage.doSearch("macbook");
        productInfoPage = searchResultsPage.selectProduct("MacBook Pro");
        Assert.assertEquals(productInfoPage.getProductHeader(), "MacBook Pro");
        //  String timeStamp = String.valueOf(System.currentTimeMillis());

    }

    @Test
    public void productInfoTest() {
        searchResultsPage = accPage.doSearch("macbook");
        productInfoPage = searchResultsPage.selectProduct("MacBook Pro");
        Map<String, String> productActDetailsMap = productInfoPage.getProductDetailsAsMap();
        //  softAssert.assertEquals(productActDetailsMap.get("Brand"), "Apple");
        //   softAssert.assertEquals(productActDetailsMap.get("product Code"), "Product 18");
        //  softAssert.assertEquals(productActDetailsMap.get("Availability"), "In Stock");
        // softAssert.assertEquals(productActDetailsMap.get("productprice"), "$2,000.00");
        //    softAssert.assertEquals(productActDetailsMap.get("extaxPrice"), "$2,000.00");
        // softAssert.assertAll();
    }

}
