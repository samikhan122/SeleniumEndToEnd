package com.qa.opencart.tests;

import com.qa.opencart.Constant.AppConstant;
import com.qa.opencart.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class searchResultsTest extends BaseTest {


    @BeforeClass
    public void searchResultSetup() {
        accPage = lg.doLogin(prop.getProperty("username"), prop.getProperty("password"));


    }

    @Test
    public void searchResultsTests01() {
        searchResultsPage = accPage.doSearch(AppConstant.SEARCH_KEY);
        Assert.assertEquals(searchResultsPage.getSearchProductCount(), 3);


    }

    @DataProvider
    public Object[][] getProductCountData() {
        return new Object[][]{
                {"macbook","MacBook Pro", 4},
                {"imac","iMac",3},
                {"samsung","Samsung Galaxy Tab 10.1", 7}
        };
    }

    @Test(dataProvider = "getProductCountData")
    public void productImageCount(String searchKey,String value, int productCount) {
        searchResultsPage = accPage.doSearch(searchKey);
        productInfoPage = searchResultsPage.selectProduct(value);
        //productInfoPage is used because the searchResultPage has the productInfoPage
        Assert.assertEquals(productInfoPage.getProductImagesCount(), productCount);

    }
}
