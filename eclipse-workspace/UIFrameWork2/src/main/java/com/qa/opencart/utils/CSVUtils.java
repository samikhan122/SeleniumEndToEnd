package com.qa.opencart.utils;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CSVUtils {
    public static final String csvPath = "./src/test/java/com/qa/opencart/TestData/";
    public static List<String[]> rows;


    public static Object[][] csvData(String csvName) throws IOException, CsvException {
        String csvFile = csvPath + csvName + ".csv";

        CSVReader reader;
        try {
            reader = new CSVReader(new FileReader(csvFile));
            rows = reader.readAll();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        Object[][] data = new Object[rows.size()][];

        for (int i = 0; i < rows.size(); i++) {
            data[i] = rows.get(i);
        }
        return data;

    }


}
