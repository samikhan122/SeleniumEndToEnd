package com.qa.opencart.tests;

import com.opencsv.exceptions.CsvException;
import com.qa.opencart.base.BaseTest;
import com.qa.opencart.utils.CSVUtils;
import com.qa.opencart.utils.ExcelUtils;
import com.qa.opencart.utils.StringUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class RegistrationPageTest extends BaseTest {

        @BeforeClass
        public void regSetUp() {
            registrationPage = lg.navigateToRegistrationPage();
        }

        @DataProvider
        public Object[][] getUserResTest() {
            return new Object[][]{
                    {"Ravki", "Kumar", "Ravki1123@gmail.com", "3453565454", "alikhan0786", "no"},
                    {"Shakti", "kapoor", "Shakti123@gmail.com", "345334343445", "alikhan0786", "yes"}

            };
        }

        @DataProvider
        public Object[][] getUserResTestDataFromExcel() {
            return ExcelUtils.getTestData("RegistrationInformation");

        }

    @DataProvider
    public Object[][] getUserResTestDataFromCSV() throws IOException, CsvException {
        return CSVUtils.csvData("Register");

    }



        @Test(dataProvider = "getUserResTestDataFromCSV")
        public void userRegistrationPage(String firstName, String lastName, String phoneNum, String password, String subscribe) {
            Assert.assertTrue(registrationPage.userRegister(firstName, lastName, StringUtils.getRandomEmail(), phoneNum, password, subscribe));
        }


    }

