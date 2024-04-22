package com.qa.opencart.tests;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CSVReaderTesting {
    @DataProvider
    public Object[][] csvData() throws IOException, CsvException {
        String csvFile = "./src/test/java/com/qa/opencart/TestData/Register.csv";

        CSVReader reader = new CSVReader(new FileReader(csvFile));

        List<String[]> rows = reader.readAll();
        reader.close();
        Object[][] data = new Object[rows.size()][];

        for (int i = 0; i < rows.size(); i++) {
            data[i] = rows.get(i);
        }
        return data;

    }

    @Test(dataProvider = "csvData")
    public void testData(String param1, String param2, String param3,String param4,String param5) {
        System.out.println("Param 1 : " + param1 + " param 2" + param2 + " param 3:" + param3+ " Param 4 : "+param4+" param 5: "+param5);

    }
}
