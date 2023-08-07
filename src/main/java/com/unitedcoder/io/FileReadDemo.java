package com.unitedcoder.io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileReadDemo {
    public static void main(String[] args) {
        //File location
        File fileToRead=new File("cubecarttestresultfolder"+File.separator
        +"LoginTestResult.txt");
        String fileContent=null;
        try {
            fileContent= FileUtils.readFileToString(fileToRead);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(fileContent);
    }
}
