package com.unitedcoder.excelfile;

import com.unitedcoder.cubecartautomation.LoginUser;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ExcelUtility {

    public String readFromExcel(String fileName, String sheetName, int rowNumber, int cellNumber) {
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
        XSSFSheet sheet = workbook.getSheet(sheetName);
        XSSFRow row = sheet.getRow(rowNumber);

        String cellValue = "";
        if (row == null) {
            System.out.println("Empty row!!!");
        } else {
            XSSFCell cell = row.getCell(cellNumber);
            try {
                if (cell == null) {
                    System.out.println("Empty cell!!");
                }
                CellType cellType = Objects.requireNonNull(cell).getCellType();
                switch (cellType) {
                    case NUMERIC:
                        cellValue = String.valueOf(cell.getNumericCellValue());
                        break;
                    case STRING:
                        cellValue = cell.getStringCellValue();
                        break;
                }
            } catch (NullPointerException e) {
                e.getMessage();
            }

        }
        return cellValue;
    }

    public List<LoginUser> readMultipleUsers(String fileName, String sheetName) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        XSSFWorkbook workbook = null;
        try {
            workbook = new XSSFWorkbook(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        XSSFSheet sheet = workbook.getSheet(sheetName);
        List<LoginUser> loginUsers = new ArrayList<>();
        int rowCount = sheet.getLastRowNum();
        for (int r = 1; r <= rowCount; r++) {
            XSSFRow row = sheet.getRow(r);
            XSSFCell userName = row.getCell(0);
            XSSFCell password = row.getCell(1);
            LoginUser loginUser = new LoginUser(userName.getStringCellValue(), password.getStringCellValue());
            loginUsers.add(loginUser);
        }
        return loginUsers;

    }
}
