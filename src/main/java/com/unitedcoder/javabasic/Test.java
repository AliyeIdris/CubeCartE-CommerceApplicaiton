package com.unitedcoder.javabasic;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Test test=new Test();
        test.readProductInfo("TestDataFolders/ProductInfo.xlsx","ProductInfo");

    }
    public List<Product> readProductInfo(String fileName, String sheetName) {

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
        List<Product> products = new ArrayList<>();
        XSSFSheet sheet = workbook.getSheet(sheetName);
        int rowCount = sheet.getLastRowNum();
        for (int r = 1; r < rowCount; r++) {
            XSSFRow row = sheet.getRow(1);
            int cellCount = row.getLastCellNum();
            for (int c = 1; c <= cellCount; c++) {
                XSSFCell status = row.getCell(0);
                XSSFCell productName = row.getCell(1);
                XSSFCell manufacturer = row.getCell(2);
                XSSFCell condition = row.getCell(3);
                XSSFCell productCode = row.getCell(4);
                XSSFCell autoGenerateProductCode = row.getCell(5);
                XSSFCell weight = row.getCell(6);
                XSSFCell dimensionUnit = row.getCell(7);
                XSSFCell width = row.getCell(8);
                XSSFCell height = row.getCell(9);
                XSSFCell depth = row.getCell(10);
                XSSFCell includeInFeaturedProduct = row.getCell(11);
                XSSFCell includeInLatestProduct = row.getCell(12);
                XSSFCell availableForPurchase = row.getCell(13);
                XSSFCell listDate = row.getCell(14);
                XSSFCell useStockLevel = row.getCell(15);
                XSSFCell stockLevel = row.getCell(16);
                XSSFCell stockLevelWarning = row.getCell(17);
                XSSFCell upcCode = row.getCell(18);
                XSSFCell eanCode = row.getCell(19);
                XSSFCell janCode = row.getCell(20);
                XSSFCell isbnCode = row.getCell(21);
                XSSFCell gtinCode = row.getCell(22);
                XSSFCell mpnCode = row.getCell(23);
                XSSFCell googleCategory = row.getCell(cellCount);
                Product product=new Product( status.getBooleanCellValue(), productName.getStringCellValue(), manufacturer.getStringCellValue(),
                        condition.getStringCellValue(), productCode.getStringCellValue(), autoGenerateProductCode.getBooleanCellValue(),
                        weight.getNumericCellValue(), dimensionUnit.getStringCellValue(), width.getNumericCellValue(), height.getNumericCellValue(),
                        depth.getNumericCellValue(), includeInFeaturedProduct.getBooleanCellValue(), includeInLatestProduct.getBooleanCellValue(),
                        availableForPurchase.getBooleanCellValue(), listDate.getStringCellValue(), useStockLevel.getBooleanCellValue(),
                        (int)stockLevel.getNumericCellValue(), (int)stockLevelWarning.getNumericCellValue(), upcCode.getStringCellValue(),
                        eanCode.getStringCellValue(), janCode.getStringCellValue(), isbnCode.getStringCellValue(), gtinCode.getStringCellValue(),
                        mpnCode.getStringCellValue(), googleCategory.getStringCellValue()) ;
                products.add(product);

            }
            break;

        }
        System.out.println(products);
        return products;

    }
}
