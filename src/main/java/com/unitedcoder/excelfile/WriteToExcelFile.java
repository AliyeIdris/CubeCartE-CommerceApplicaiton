package com.unitedcoder.excelfile;

import com.unitedcoder.cubecartautomation.UiUtility;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteToExcelFile {
    public static void main(String[] args) {
        String fileName="TestDataFolders/writeExcel.xlsx";
        List<String> content= new ArrayList<>();
        content.add("TestId,TestName,TestType,Action,ExecutedAt,ExecutedBy,Note");
        content.add("1,Login,Regression,Click login button,"+ UiUtility.getCurrentDateTime()+
                        ","+UiUtility.getCurrentUserName()+","+"Login successful");
        content.add("2,Add Customer,Regression,Add Customer,"+UiUtility.getCurrentDateTime()+
                        ","+UiUtility.getCurrentUserName()+","+"Add successful");
        WriteToExcelFile write=new WriteToExcelFile();
        try {
            write.writeToExcel(fileName,"TestReport",content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeToExcel(String fileName, String sheetName, List<String> content) throws IOException {
        FileOutputStream outputStream=new FileOutputStream(fileName);
        XSSFWorkbook workbook= new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet(sheetName);
        int rowNumber=content.size();
        for(int r=0; r<rowNumber; r++){
            XSSFRow row=sheet.createRow(r);
            String[] rowContent=content.get(r).split(",");
            for(int c=0; c<rowContent.length;c++){
                XSSFCell cell=row.createCell(c);
                cell.setCellValue(rowContent[c]);
            }
        }
        workbook.write(outputStream);
        workbook.close();
    }
}
