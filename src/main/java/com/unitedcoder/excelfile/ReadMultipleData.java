package com.unitedcoder.excelfile;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;

public class ReadMultipleData {
    public static void main(String[] args) throws IOException {
        String filePath="TestDataFolders/testData.xlsx";
        FileInputStream inputStream= new FileInputStream(filePath);
        XSSFWorkbook workbook= new XSSFWorkbook(inputStream);
        XSSFSheet sheet= workbook.getSheetAt(0);
        int rowCount=sheet.getLastRowNum();
        int cellCount=sheet.getRow(1).getLastCellNum();
        for(int r=1; r<=rowCount; r++){
            XSSFRow row= sheet.getRow(r);
            for(int c=0; c<cellCount; c++){
                XSSFCell cell=row.getCell(c);
                try {
                    if (cell == null) {
                        System.out.println("Empty cell");
                    }
                    CellType cellType = Objects.requireNonNull(cell).getCellType();
                    switch (cellType) {
                        case STRING:
                            System.out.print(cell.getStringCellValue());
                            break;
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue());
                            break;
                    }
                }catch(NullPointerException e){
                    e.getMessage();
                }
                System.out.print("  |  ");
            }
            System.out.println();
        }

    }
}
