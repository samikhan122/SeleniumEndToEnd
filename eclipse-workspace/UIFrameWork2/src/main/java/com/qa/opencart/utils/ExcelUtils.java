package com.qa.opencart.utils;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils {


        private static String TEST_DATA_SHEET_PATH = "./src/test/resources/SheetTestData.xlsx";
        private static Workbook book;
        private static Sheet sheet;

        public static Object[][] getTestData(String sheetName) {
            System.out.println("Reading test data from " + sheetName);
            Object[][] data = null;
            try {
                FileInputStream fs = new FileInputStream(TEST_DATA_SHEET_PATH);
                book = WorkbookFactory.create(fs);
                sheet = book.getSheet(sheetName);
                data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
                for (int i = 0; i < sheet.getLastRowNum(); i++) {
                    for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
                        assert true;
                        data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
                    }
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            return data;
        }

    }



