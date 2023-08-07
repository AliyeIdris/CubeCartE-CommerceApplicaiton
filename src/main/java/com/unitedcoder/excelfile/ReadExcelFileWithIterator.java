package com.unitedcoder.excelfile;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadExcelFileWithIterator {
    public static void main(String[] args) {
        String fileName = "TestDataFolders/testData.xlsx";
        ReadExcelFileWithIterator reader = new ReadExcelFileWithIterator();
        List<String> productInfo = reader.productInfo(fileName, "ProductInfo", "sticker",0);
        System.out.println(productInfo);

    }

    public List<String> productInfo(String fileName, String sheetName, String productName,int cellNo) {
        FileInputStream inputStream;
        try {
            inputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        XSSFWorkbook workbook;
        try {
            workbook = new XSSFWorkbook(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int numberOfSheets = workbook.getNumberOfSheets();
        List<String> productInfo = new ArrayList<>();
        for (int i = 0; i < numberOfSheets; i++) {
            if (workbook.getSheetName(i).equalsIgnoreCase(sheetName)) {
                XSSFSheet sheet = workbook.getSheetAt(i);
                Iterator<Row> rowIterator = sheet.iterator();
                while (rowIterator.hasNext()) {
                    Row row = rowIterator.next();
                    Iterator<Cell> cellIterator = row.cellIterator();
                    while (cellIterator.hasNext()) {
                        Cell cell = cellIterator.next();
                        if (row.getCell(cellNo).getStringCellValue().equalsIgnoreCase(productName)) {
                            if (cell.getCellType() == CellType.STRING) {
                                productInfo.add(cell.getStringCellValue());
                            }
                            if (cell.getCellType() == CellType.NUMERIC) {
                                productInfo.add(String.valueOf(cell.getNumericCellValue()));
                            }
                        }
                    }
                }
            }
        }

        return productInfo;
    }
}
